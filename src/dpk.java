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

public record dpk(it<dmq> b) {
   public static final MapCodec<dpk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(iv.b(ke.aN, Lifecycle.stable(), dmq.a).fieldOf("dimensions").forGetter(dpk::d)).apply($$0, $$0.stable(dpk::new))
   );
   private static final Set<ahf<dmq>> c = ImmutableSet.of(dmq.b, dmq.c, dmq.d);
   private static final int d = c.size();

   public dpk(it<dmq> b) {
      dmq $$1 = b.a(dmq.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<ahf<dmq>> a(Stream<ahf<dmq>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dpk a(iu $$0, dld $$1) {
      it<dmp> $$2 = $$0.d(ke.ay);
      it<dmq> $$3 = a($$2, this.b, $$1);
      return new dpk($$3);
   }

   public static it<dmq> a(it<dmp> $$0, it<dmq> $$1, dld $$2) {
      dmq $$3 = $$1.a(dmq.b);
      ih<dmp> $$4 = (ih<dmp>)($$3 == null ? $$0.f(dmn.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static it<dmq> a(it<dmq> $$0, ih<dmp> $$1, dld $$2) {
      jc<dmq> $$3 = new ip<>(ke.aN, Lifecycle.experimental());
      $$3.a(dmq.b, new dmq($$1, $$2), Lifecycle.stable());

      for (Entry<ahf<dmq>, dmq> $$4 : $$0.g()) {
         ahf<dmq> $$5 = $$4.getKey();
         if ($$5 != dmq.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dld a() {
      dmq $$0 = this.b.a(dmq.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dmq> a(ahf<dmq> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<ahf<cto>> b() {
      return this.d().g().stream().map(Entry::getKey).map(ke::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dog;
   }

   private static egp.a b(it<dmq> $$0) {
      return $$0.d(dmq.b).map($$0x -> {
         dld $$1 = $$0x.b();
         if ($$1 instanceof dog) {
            return egp.a.c;
         } else {
            return $$1 instanceof dok ? egp.a.b : egp.a.a;
         }
      }).orElse(egp.a.a);
   }

   static Lifecycle a(ahf<dmq> $$0, dmq $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ahf<dmq> $$0, dmq $$1) {
      if ($$0 == dmq.b) {
         return a($$1);
      } else if ($$0 == dmq.c) {
         return b($$1);
      } else {
         return $$0 == dmq.d ? c($$1) : false;
      }
   }

   private static boolean a(dmq $$0) {
      ih<dmp> $$1 = $$0.a();
      if (!$$1.a(dmn.a) && !$$1.a(dmn.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof cva $$2 && !$$2.a(cvc.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dmq $$0) {
      return $$0.a().a(dmn.b) && $$0.b() instanceof dos $$1 && $$1.a(dou.f) && $$1.c() instanceof cva $$2 && $$2.a(cvc.a);
   }

   private static boolean c(dmq $$0) {
      return $$0.a().a(dmn.c) && $$0.b() instanceof dos $$1 && $$1.a(dou.g) && $$1.c() instanceof cve;
   }

   public dpk.b a(it<dmq> $$0) {
      Stream<ahf<dmq>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(ahf<dmq> a, dmq b) {

         Lifecycle c() {
            return dpk.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      jc<dmq> $$4 = new ip<>(ke.aN, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      it<dmq> $$5 = $$4.l();
      egp.a $$6 = b($$5);
      return new dpk.b($$5.l(), $$6);
   }

   public it<dmq> d() {
      return this.b;
   }

   public static record b(it<dmq> a, egp.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public iu.b b() {
         return new iu.c(List.of(this.a)).d();
      }

      public it<dmq> c() {
         return this.a;
      }

      public egp.a d() {
         return this.b;
      }
   }
}
