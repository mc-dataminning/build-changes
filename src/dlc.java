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

public record dlc(hs<dii> b) {
   public static final MapCodec<dlc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hu.b(jd.aI, Lifecycle.stable(), dii.a).fieldOf("dimensions").forGetter(dlc::d)).apply($$0, $$0.stable(dlc::new))
   );
   private static final Set<aeo<dii>> c = ImmutableSet.of(dii.b, dii.c, dii.d);
   private static final int d = c.size();

   public dlc(hs<dii> b) {
      dii $$1 = b.a(dii.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<aeo<dii>> a(Stream<aeo<dii>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dlc a(ht $$0, dgv $$1) {
      hs<dih> $$2 = $$0.d(jd.au);
      hs<dii> $$3 = a($$2, this.b, $$1);
      return new dlc($$3);
   }

   public static hs<dii> a(hs<dih> $$0, hs<dii> $$1, dgv $$2) {
      dii $$3 = $$1.a(dii.b);
      hf<dih> $$4 = (hf<dih>)($$3 == null ? $$0.f(dif.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static hs<dii> a(hs<dii> $$0, hf<dih> $$1, dgv $$2) {
      ib<dii> $$3 = new hn<>(jd.aI, Lifecycle.experimental());
      $$3.a(dii.b, new dii($$1, $$2), Lifecycle.stable());

      for (Entry<aeo<dii>, dii> $$4 : $$0.g()) {
         aeo<dii> $$5 = $$4.getKey();
         if ($$5 != dii.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dgv a() {
      dii $$0 = this.b.a(dii.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dii> a(aeo<dii> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<aeo<cpk>> b() {
      return this.d().g().stream().map(Entry::getKey).map(jd::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof djy;
   }

   private static ebz.a b(hs<dii> $$0) {
      return $$0.d(dii.b).map($$0x -> {
         dgv $$1 = $$0x.b();
         if ($$1 instanceof djy) {
            return ebz.a.c;
         } else {
            return $$1 instanceof dkc ? ebz.a.b : ebz.a.a;
         }
      }).orElse(ebz.a.a);
   }

   static Lifecycle a(aeo<dii> $$0, dii $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aeo<dii> $$0, dii $$1) {
      if ($$0 == dii.b) {
         return a($$1);
      } else if ($$0 == dii.c) {
         return b($$1);
      } else {
         return $$0 == dii.d ? c($$1) : false;
      }
   }

   private static boolean a(dii $$0) {
      hf<dih> $$1 = $$0.a();
      if (!$$1.a(dif.a) && !$$1.a(dif.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof cqv $$2 && !$$2.a(cqx.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dii $$0) {
      return $$0.a().a(dif.b) && $$0.b() instanceof dkk $$1 && $$1.a(dkm.f) && $$1.c() instanceof cqv $$2 && $$2.a(cqx.a);
   }

   private static boolean c(dii $$0) {
      return $$0.a().a(dif.c) && $$0.b() instanceof dkk $$1 && $$1.a(dkm.g) && $$1.c() instanceof cqz;
   }

   public dlc.b a(hs<dii> $$0) {
      Stream<aeo<dii>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(aeo<dii> a, dii b) {

         Lifecycle c() {
            return dlc.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ib<dii> $$4 = new hn<>(jd.aI, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      hs<dii> $$5 = $$4.l();
      ebz.a $$6 = b($$5);
      return new dlc.b($$5.l(), $$6);
   }

   public hs<dii> d() {
      return this.b;
   }

   public static record b(hs<dii> a, ebz.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public ht.b b() {
         return new ht.c(List.of(this.a)).c();
      }

      public hs<dii> c() {
         return this.a;
      }

      public ebz.a d() {
         return this.b;
      }
   }
}
