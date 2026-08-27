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

public record dld(hr<dij> b) {
   public static final MapCodec<dld> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ht.b(jc.aI, Lifecycle.stable(), dij.a).fieldOf("dimensions").forGetter(dld::d)).apply($$0, $$0.stable(dld::new))
   );
   private static final Set<aeq<dij>> c = ImmutableSet.of(dij.b, dij.c, dij.d);
   private static final int d = c.size();

   public dld(hr<dij> b) {
      dij $$1 = b.a(dij.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<aeq<dij>> a(Stream<aeq<dij>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dld a(hs $$0, dgw $$1) {
      hr<dii> $$2 = $$0.d(jc.au);
      hr<dij> $$3 = a($$2, this.b, $$1);
      return new dld($$3);
   }

   public static hr<dij> a(hr<dii> $$0, hr<dij> $$1, dgw $$2) {
      dij $$3 = $$1.a(dij.b);
      he<dii> $$4 = (he<dii>)($$3 == null ? $$0.f(dig.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static hr<dij> a(hr<dij> $$0, he<dii> $$1, dgw $$2) {
      ia<dij> $$3 = new hm<>(jc.aI, Lifecycle.experimental());
      $$3.a(dij.b, new dij($$1, $$2), Lifecycle.stable());

      for (Entry<aeq<dij>, dij> $$4 : $$0.g()) {
         aeq<dij> $$5 = $$4.getKey();
         if ($$5 != dij.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dgw a() {
      dij $$0 = this.b.a(dij.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dij> a(aeq<dij> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<aeq<cpl>> b() {
      return this.d().g().stream().map(Entry::getKey).map(jc::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof djz;
   }

   private static eca.a b(hr<dij> $$0) {
      return $$0.d(dij.b).map($$0x -> {
         dgw $$1 = $$0x.b();
         if ($$1 instanceof djz) {
            return eca.a.c;
         } else {
            return $$1 instanceof dkd ? eca.a.b : eca.a.a;
         }
      }).orElse(eca.a.a);
   }

   static Lifecycle a(aeq<dij> $$0, dij $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aeq<dij> $$0, dij $$1) {
      if ($$0 == dij.b) {
         return a($$1);
      } else if ($$0 == dij.c) {
         return b($$1);
      } else {
         return $$0 == dij.d ? c($$1) : false;
      }
   }

   private static boolean a(dij $$0) {
      he<dii> $$1 = $$0.a();
      if (!$$1.a(dig.a) && !$$1.a(dig.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof cqw $$2 && !$$2.a(cqy.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dij $$0) {
      return $$0.a().a(dig.b) && $$0.b() instanceof dkl $$1 && $$1.a(dkn.f) && $$1.c() instanceof cqw $$2 && $$2.a(cqy.a);
   }

   private static boolean c(dij $$0) {
      return $$0.a().a(dig.c) && $$0.b() instanceof dkl $$1 && $$1.a(dkn.g) && $$1.c() instanceof cra;
   }

   public dld.b a(hr<dij> $$0) {
      Stream<aeq<dij>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(aeq<dij> a, dij b) {

         Lifecycle c() {
            return dld.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ia<dij> $$4 = new hm<>(jc.aI, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      hr<dij> $$5 = $$4.l();
      eca.a $$6 = b($$5);
      return new dld.b($$5.l(), $$6);
   }

   public hr<dij> d() {
      return this.b;
   }

   public static record b(hr<dij> a, eca.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public hs.b b() {
         return new hs.c(List.of(this.a)).c();
      }

      public hr<dij> c() {
         return this.a;
      }

      public eca.a d() {
         return this.b;
      }
   }
}
