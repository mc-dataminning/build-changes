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

public record dpl(it<dmr> b) {
   public static final MapCodec<dpl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(iv.b(ke.aN, Lifecycle.stable(), dmr.a).fieldOf("dimensions").forGetter(dpl::d)).apply($$0, $$0.stable(dpl::new))
   );
   private static final Set<ahf<dmr>> c = ImmutableSet.of(dmr.b, dmr.c, dmr.d);
   private static final int d = c.size();

   public dpl(it<dmr> b) {
      dmr $$1 = b.a(dmr.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<ahf<dmr>> a(Stream<ahf<dmr>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dpl a(iu $$0, dle $$1) {
      it<dmq> $$2 = $$0.d(ke.ay);
      it<dmr> $$3 = a($$2, this.b, $$1);
      return new dpl($$3);
   }

   public static it<dmr> a(it<dmq> $$0, it<dmr> $$1, dle $$2) {
      dmr $$3 = $$1.a(dmr.b);
      ih<dmq> $$4 = (ih<dmq>)($$3 == null ? $$0.f(dmo.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static it<dmr> a(it<dmr> $$0, ih<dmq> $$1, dle $$2) {
      jc<dmr> $$3 = new ip<>(ke.aN, Lifecycle.experimental());
      $$3.a(dmr.b, new dmr($$1, $$2), Lifecycle.stable());

      for (Entry<ahf<dmr>, dmr> $$4 : $$0.g()) {
         ahf<dmr> $$5 = $$4.getKey();
         if ($$5 != dmr.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dle a() {
      dmr $$0 = this.b.a(dmr.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dmr> a(ahf<dmr> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<ahf<ctp>> b() {
      return this.d().g().stream().map(Entry::getKey).map(ke::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof doh;
   }

   private static egq.a b(it<dmr> $$0) {
      return $$0.d(dmr.b).map($$0x -> {
         dle $$1 = $$0x.b();
         if ($$1 instanceof doh) {
            return egq.a.c;
         } else {
            return $$1 instanceof dol ? egq.a.b : egq.a.a;
         }
      }).orElse(egq.a.a);
   }

   static Lifecycle a(ahf<dmr> $$0, dmr $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ahf<dmr> $$0, dmr $$1) {
      if ($$0 == dmr.b) {
         return a($$1);
      } else if ($$0 == dmr.c) {
         return b($$1);
      } else {
         return $$0 == dmr.d ? c($$1) : false;
      }
   }

   private static boolean a(dmr $$0) {
      ih<dmq> $$1 = $$0.a();
      if (!$$1.a(dmo.a) && !$$1.a(dmo.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof cvb $$2 && !$$2.a(cvd.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dmr $$0) {
      return $$0.a().a(dmo.b) && $$0.b() instanceof dot $$1 && $$1.a(dov.f) && $$1.c() instanceof cvb $$2 && $$2.a(cvd.a);
   }

   private static boolean c(dmr $$0) {
      return $$0.a().a(dmo.c) && $$0.b() instanceof dot $$1 && $$1.a(dov.g) && $$1.c() instanceof cvf;
   }

   public dpl.b a(it<dmr> $$0) {
      Stream<ahf<dmr>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(ahf<dmr> a, dmr b) {

         Lifecycle c() {
            return dpl.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      jc<dmr> $$4 = new ip<>(ke.aN, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      it<dmr> $$5 = $$4.l();
      egq.a $$6 = b($$5);
      return new dpl.b($$5.l(), $$6);
   }

   public it<dmr> d() {
      return this.b;
   }

   public static record b(it<dmr> a, egq.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public iu.b b() {
         return new iu.c(List.of(this.a)).d();
      }

      public it<dmr> c() {
         return this.a;
      }

      public egq.a d() {
         return this.b;
      }
   }
}
