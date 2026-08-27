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

public record dpe(it<dmk> b) {
   public static final MapCodec<dpe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(iv.b(ke.aN, Lifecycle.stable(), dmk.a).fieldOf("dimensions").forGetter(dpe::d)).apply($$0, $$0.stable(dpe::new))
   );
   private static final Set<ahc<dmk>> c = ImmutableSet.of(dmk.b, dmk.c, dmk.d);
   private static final int d = c.size();

   public dpe(it<dmk> b) {
      dmk $$1 = b.a(dmk.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<ahc<dmk>> a(Stream<ahc<dmk>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dpe a(iu $$0, dkx $$1) {
      it<dmj> $$2 = $$0.d(ke.ay);
      it<dmk> $$3 = a($$2, this.b, $$1);
      return new dpe($$3);
   }

   public static it<dmk> a(it<dmj> $$0, it<dmk> $$1, dkx $$2) {
      dmk $$3 = $$1.a(dmk.b);
      ih<dmj> $$4 = (ih<dmj>)($$3 == null ? $$0.f(dmh.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static it<dmk> a(it<dmk> $$0, ih<dmj> $$1, dkx $$2) {
      jc<dmk> $$3 = new ip<>(ke.aN, Lifecycle.experimental());
      $$3.a(dmk.b, new dmk($$1, $$2), Lifecycle.stable());

      for (Entry<ahc<dmk>, dmk> $$4 : $$0.g()) {
         ahc<dmk> $$5 = $$4.getKey();
         if ($$5 != dmk.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dkx a() {
      dmk $$0 = this.b.a(dmk.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dmk> a(ahc<dmk> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<ahc<cti>> b() {
      return this.d().g().stream().map(Entry::getKey).map(ke::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof doa;
   }

   private static egj.a b(it<dmk> $$0) {
      return $$0.d(dmk.b).map($$0x -> {
         dkx $$1 = $$0x.b();
         if ($$1 instanceof doa) {
            return egj.a.c;
         } else {
            return $$1 instanceof doe ? egj.a.b : egj.a.a;
         }
      }).orElse(egj.a.a);
   }

   static Lifecycle a(ahc<dmk> $$0, dmk $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ahc<dmk> $$0, dmk $$1) {
      if ($$0 == dmk.b) {
         return a($$1);
      } else if ($$0 == dmk.c) {
         return b($$1);
      } else {
         return $$0 == dmk.d ? c($$1) : false;
      }
   }

   private static boolean a(dmk $$0) {
      ih<dmj> $$1 = $$0.a();
      if (!$$1.a(dmh.a) && !$$1.a(dmh.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof cuu $$2 && !$$2.a(cuw.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dmk $$0) {
      return $$0.a().a(dmh.b) && $$0.b() instanceof dom $$1 && $$1.a(doo.f) && $$1.c() instanceof cuu $$2 && $$2.a(cuw.a);
   }

   private static boolean c(dmk $$0) {
      return $$0.a().a(dmh.c) && $$0.b() instanceof dom $$1 && $$1.a(doo.g) && $$1.c() instanceof cuy;
   }

   public dpe.b a(it<dmk> $$0) {
      Stream<ahc<dmk>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(ahc<dmk> a, dmk b) {

         Lifecycle c() {
            return dpe.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      jc<dmk> $$4 = new ip<>(ke.aN, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      it<dmk> $$5 = $$4.l();
      egj.a $$6 = b($$5);
      return new dpe.b($$5.l(), $$6);
   }

   public it<dmk> d() {
      return this.b;
   }

   public static record b(it<dmk> a, egj.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public iu.b b() {
         return new iu.c(List.of(this.a)).d();
      }

      public it<dmk> c() {
         return this.a;
      }

      public egj.a d() {
         return this.b;
      }
   }
}
