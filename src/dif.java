import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record dif(hr<dfl> b) {
   public static final MapCodec<dif> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ht.b(jc.aI, Lifecycle.stable(), dfl.a).fieldOf("dimensions").forGetter(dif::d)).apply($$0, $$0.stable(dif::new))
   );
   private static final Set<acp<dfl>> c = ImmutableSet.of(dfl.b, dfl.c, dfl.d);
   private static final int d = c.size();

   public dif(hr<dfl> b) {
      dfl $$1 = b.a(dfl.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<acp<dfl>> a(Stream<acp<dfl>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dif a(hs $$0, ddy $$1) {
      hr<dfk> $$2 = $$0.d(jc.au);
      hr<dfl> $$3 = a($$2, this.b, $$1);
      return new dif($$3);
   }

   public static hr<dfl> a(hr<dfk> $$0, hr<dfl> $$1, ddy $$2) {
      dfl $$3 = $$1.a(dfl.b);
      he<dfk> $$4 = (he<dfk>)($$3 == null ? $$0.f(dfi.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static hr<dfl> a(hr<dfl> $$0, he<dfk> $$1, ddy $$2) {
      ia<dfl> $$3 = new hm<>(jc.aI, Lifecycle.experimental());
      $$3.a(dfl.b, new dfl($$1, $$2), Lifecycle.stable());

      for (Entry<acp<dfl>, dfl> $$4 : $$0.g()) {
         acp<dfl> $$5 = $$4.getKey();
         if ($$5 != dfl.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public ddy a() {
      dfl $$0 = this.b.a(dfl.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dfl> a(acp<dfl> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<acp<cmm>> b() {
      return this.d().g().stream().map(Entry::getKey).map(jc::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dhb;
   }

   private static dzc.a b(hr<dfl> $$0) {
      return $$0.d(dfl.b).map($$0x -> {
         ddy $$1 = $$0x.b();
         if ($$1 instanceof dhb) {
            return dzc.a.c;
         } else {
            return $$1 instanceof dhf ? dzc.a.b : dzc.a.a;
         }
      }).orElse(dzc.a.a);
   }

   static Lifecycle a(acp<dfl> $$0, dfl $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(acp<dfl> $$0, dfl $$1) {
      if ($$0 == dfl.b) {
         return a($$1);
      } else if ($$0 == dfl.c) {
         return b($$1);
      } else {
         return $$0 == dfl.d ? c($$1) : false;
      }
   }

   private static boolean a(dfl $$0) {
      he<dfk> $$1 = $$0.a();
      if (!$$1.a(dfi.a) && !$$1.a(dfi.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof cnx $$2 && !$$2.a(cnz.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dfl $$0) {
      return $$0.a().a(dfi.b) && $$0.b() instanceof dhn $$1 && $$1.a(dhp.f) && $$1.c() instanceof cnx $$2 && $$2.a(cnz.a);
   }

   private static boolean c(dfl $$0) {
      return $$0.a().a(dfi.c) && $$0.b() instanceof dhn $$1 && $$1.a(dhp.g) && $$1.c() instanceof cob;
   }

   public dif.b a(hr<dfl> $$0) {
      Stream<acp<dfl>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(acp<dfl> a, dfl b) {

         Lifecycle c() {
            return dif.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ia<dfl> $$4 = new hm<>(jc.aI, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      hr<dfl> $$5 = $$4.l();
      dzc.a $$6 = b($$5);
      return new dif.b($$5.l(), $$6);
   }

   public hr<dfl> d() {
      return this.b;
   }

   public static record b(hr<dfl> a, dzc.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public hs.b b() {
         return new hs.c(List.of(this.a)).c();
      }

      public hr<dfl> c() {
         return this.a;
      }

      public dzc.a d() {
         return this.b;
      }
   }
}
