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

public record dsl(ix<dpr> b) {
   public static final MapCodec<dsl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(iz.a(ki.aO, Lifecycle.stable(), dpr.a).fieldOf("dimensions").forGetter(dsl::d)).apply($$0, $$0.stable(dsl::new))
   );
   private static final Set<ajb<dpr>> c = ImmutableSet.of(dpr.b, dpr.c, dpr.d);
   private static final int d = c.size();

   public dsl(ix<dpr> b) {
      dpr $$1 = b.a(dpr.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<ajb<dpr>> a(Stream<ajb<dpr>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dsl a(iy $$0, dob $$1) {
      ix<dpq> $$2 = $$0.d(ki.az);
      ix<dpr> $$3 = a($$2, this.b, $$1);
      return new dsl($$3);
   }

   public static ix<dpr> a(ix<dpq> $$0, ix<dpr> $$1, dob $$2) {
      dpr $$3 = $$1.a(dpr.b);
      il<dpq> $$4 = (il<dpq>)($$3 == null ? $$0.f(dpo.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static ix<dpr> a(ix<dpr> $$0, il<dpq> $$1, dob $$2) {
      jg<dpr> $$3 = new it<>(ki.aO, Lifecycle.experimental());
      $$3.a(dpr.b, new dpr($$1, $$2), Lifecycle.stable());

      for (Entry<ajb<dpr>, dpr> $$4 : $$0.g()) {
         ajb<dpr> $$5 = $$4.getKey();
         if ($$5 != dpr.b) {
            $$3.a($$5, $$4.getValue(), $$0.f($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dob a() {
      dpr $$0 = this.b.a(dpr.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dpr> a(ajb<dpr> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<ajb<cwe>> b() {
      return this.d().g().stream().map(Entry::getKey).map(ki::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof drh;
   }

   private static ejs.a b(ix<dpr> $$0) {
      return $$0.d(dpr.b).map($$0x -> {
         dob $$1 = $$0x.b();
         if ($$1 instanceof drh) {
            return ejs.a.c;
         } else {
            return $$1 instanceof drl ? ejs.a.b : ejs.a.a;
         }
      }).orElse(ejs.a.a);
   }

   static Lifecycle a(ajb<dpr> $$0, dpr $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ajb<dpr> $$0, dpr $$1) {
      if ($$0 == dpr.b) {
         return a($$1);
      } else if ($$0 == dpr.c) {
         return b($$1);
      } else {
         return $$0 == dpr.d ? c($$1) : false;
      }
   }

   private static boolean a(dpr $$0) {
      il<dpq> $$1 = $$0.a();
      if (!$$1.a(dpo.a) && !$$1.a(dpo.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof cxq $$2 && !$$2.a(cxs.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dpr $$0) {
      return $$0.a().a(dpo.b) && $$0.b() instanceof drt $$1 && $$1.a(drv.f) && $$1.c() instanceof cxq $$2 && $$2.a(cxs.a);
   }

   private static boolean c(dpr $$0) {
      return $$0.a().a(dpo.c) && $$0.b() instanceof drt $$1 && $$1.a(drv.g) && $$1.c() instanceof cxu;
   }

   public dsl.b a(ix<dpr> $$0) {
      Stream<ajb<dpr>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(ajb<dpr> a, dpr b) {

         Lifecycle c() {
            return dsl.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      jg<dpr> $$4 = new it<>(ki.aO, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      ix<dpr> $$5 = $$4.l();
      ejs.a $$6 = b($$5);
      return new dsl.b($$5.l(), $$6);
   }

   public ix<dpr> d() {
      return this.b;
   }

   public static record b(ix<dpr> a, ejs.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public iy.b b() {
         return new iy.c(List.of(this.a)).d();
      }

      public ix<dpr> c() {
         return this.a;
      }

      public ejs.a d() {
         return this.b;
      }
   }
}
