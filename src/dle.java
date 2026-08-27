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

public record dle(hr<dik> b) {
   public static final MapCodec<dle> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ht.b(jc.aI, Lifecycle.stable(), dik.a).fieldOf("dimensions").forGetter(dle::d)).apply($$0, $$0.stable(dle::new))
   );
   private static final Set<aeq<dik>> c = ImmutableSet.of(dik.b, dik.c, dik.d);
   private static final int d = c.size();

   public dle(hr<dik> b) {
      dik $$1 = b.a(dik.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<aeq<dik>> a(Stream<aeq<dik>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dle a(hs $$0, dgx $$1) {
      hr<dij> $$2 = $$0.d(jc.au);
      hr<dik> $$3 = a($$2, this.b, $$1);
      return new dle($$3);
   }

   public static hr<dik> a(hr<dij> $$0, hr<dik> $$1, dgx $$2) {
      dik $$3 = $$1.a(dik.b);
      he<dij> $$4 = (he<dij>)($$3 == null ? $$0.f(dih.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static hr<dik> a(hr<dik> $$0, he<dij> $$1, dgx $$2) {
      ia<dik> $$3 = new hm<>(jc.aI, Lifecycle.experimental());
      $$3.a(dik.b, new dik($$1, $$2), Lifecycle.stable());

      for (Entry<aeq<dik>, dik> $$4 : $$0.g()) {
         aeq<dik> $$5 = $$4.getKey();
         if ($$5 != dik.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dgx a() {
      dik $$0 = this.b.a(dik.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dik> a(aeq<dik> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<aeq<cpm>> b() {
      return this.d().g().stream().map(Entry::getKey).map(jc::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dka;
   }

   private static ecb.a b(hr<dik> $$0) {
      return $$0.d(dik.b).map($$0x -> {
         dgx $$1 = $$0x.b();
         if ($$1 instanceof dka) {
            return ecb.a.c;
         } else {
            return $$1 instanceof dke ? ecb.a.b : ecb.a.a;
         }
      }).orElse(ecb.a.a);
   }

   static Lifecycle a(aeq<dik> $$0, dik $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aeq<dik> $$0, dik $$1) {
      if ($$0 == dik.b) {
         return a($$1);
      } else if ($$0 == dik.c) {
         return b($$1);
      } else {
         return $$0 == dik.d ? c($$1) : false;
      }
   }

   private static boolean a(dik $$0) {
      he<dij> $$1 = $$0.a();
      if (!$$1.a(dih.a) && !$$1.a(dih.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof cqx $$2 && !$$2.a(cqz.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dik $$0) {
      return $$0.a().a(dih.b) && $$0.b() instanceof dkm $$1 && $$1.a(dko.f) && $$1.c() instanceof cqx $$2 && $$2.a(cqz.a);
   }

   private static boolean c(dik $$0) {
      return $$0.a().a(dih.c) && $$0.b() instanceof dkm $$1 && $$1.a(dko.g) && $$1.c() instanceof crb;
   }

   public dle.b a(hr<dik> $$0) {
      Stream<aeq<dik>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(aeq<dik> a, dik b) {

         Lifecycle c() {
            return dle.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ia<dik> $$4 = new hm<>(jc.aI, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      hr<dik> $$5 = $$4.l();
      ecb.a $$6 = b($$5);
      return new dle.b($$5.l(), $$6);
   }

   public hr<dik> d() {
      return this.b;
   }

   public static record b(hr<dik> a, ecb.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public hs.b b() {
         return new hs.c(List.of(this.a)).c();
      }

      public hr<dik> c() {
         return this.a;
      }

      public ecb.a d() {
         return this.b;
      }
   }
}
