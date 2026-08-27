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

public record dot(ir<dlz> b) {
   public static final MapCodec<dot> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(it.b(kc.aM, Lifecycle.stable(), dlz.a).fieldOf("dimensions").forGetter(dot::d)).apply($$0, $$0.stable(dot::new))
   );
   private static final Set<ags<dlz>> c = ImmutableSet.of(dlz.b, dlz.c, dlz.d);
   private static final int d = c.size();

   public dot(ir<dlz> b) {
      dlz $$1 = b.a(dlz.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<ags<dlz>> a(Stream<ags<dlz>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dot a(is $$0, dkm $$1) {
      ir<dly> $$2 = $$0.d(kc.ax);
      ir<dlz> $$3 = a($$2, this.b, $$1);
      return new dot($$3);
   }

   public static ir<dlz> a(ir<dly> $$0, ir<dlz> $$1, dkm $$2) {
      dlz $$3 = $$1.a(dlz.b);
      ie<dly> $$4 = (ie<dly>)($$3 == null ? $$0.f(dlw.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static ir<dlz> a(ir<dlz> $$0, ie<dly> $$1, dkm $$2) {
      ja<dlz> $$3 = new in<>(kc.aM, Lifecycle.experimental());
      $$3.a(dlz.b, new dlz($$1, $$2), Lifecycle.stable());

      for (Entry<ags<dlz>, dlz> $$4 : $$0.g()) {
         ags<dlz> $$5 = $$4.getKey();
         if ($$5 != dlz.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dkm a() {
      dlz $$0 = this.b.a(dlz.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dlz> a(ags<dlz> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<ags<csy>> b() {
      return this.d().g().stream().map(Entry::getKey).map(kc::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dnp;
   }

   private static efy.a b(ir<dlz> $$0) {
      return $$0.d(dlz.b).map($$0x -> {
         dkm $$1 = $$0x.b();
         if ($$1 instanceof dnp) {
            return efy.a.c;
         } else {
            return $$1 instanceof dnt ? efy.a.b : efy.a.a;
         }
      }).orElse(efy.a.a);
   }

   static Lifecycle a(ags<dlz> $$0, dlz $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ags<dlz> $$0, dlz $$1) {
      if ($$0 == dlz.b) {
         return a($$1);
      } else if ($$0 == dlz.c) {
         return b($$1);
      } else {
         return $$0 == dlz.d ? c($$1) : false;
      }
   }

   private static boolean a(dlz $$0) {
      ie<dly> $$1 = $$0.a();
      if (!$$1.a(dlw.a) && !$$1.a(dlw.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof cuk $$2 && !$$2.a(cum.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dlz $$0) {
      return $$0.a().a(dlw.b) && $$0.b() instanceof dob $$1 && $$1.a(dod.f) && $$1.c() instanceof cuk $$2 && $$2.a(cum.a);
   }

   private static boolean c(dlz $$0) {
      return $$0.a().a(dlw.c) && $$0.b() instanceof dob $$1 && $$1.a(dod.g) && $$1.c() instanceof cuo;
   }

   public dot.b a(ir<dlz> $$0) {
      Stream<ags<dlz>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(ags<dlz> a, dlz b) {

         Lifecycle c() {
            return dot.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ja<dlz> $$4 = new in<>(kc.aM, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      ir<dlz> $$5 = $$4.l();
      efy.a $$6 = b($$5);
      return new dot.b($$5.l(), $$6);
   }

   public ir<dlz> d() {
      return this.b;
   }

   public static record b(ir<dlz> a, efy.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public is.b b() {
         return new is.c(List.of(this.a)).d();
      }

      public ir<dlz> c() {
         return this.a;
      }

      public efy.a d() {
         return this.b;
      }
   }
}
