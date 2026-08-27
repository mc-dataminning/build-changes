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

public record dli(ht<dio> b) {
   public static final MapCodec<dli> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hv.b(je.aI, Lifecycle.stable(), dio.a).fieldOf("dimensions").forGetter(dli::d)).apply($$0, $$0.stable(dli::new))
   );
   private static final Set<aet<dio>> c = ImmutableSet.of(dio.b, dio.c, dio.d);
   private static final int d = c.size();

   public dli(ht<dio> b) {
      dio $$1 = b.a(dio.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<aet<dio>> a(Stream<aet<dio>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dli a(hu $$0, dhb $$1) {
      ht<din> $$2 = $$0.d(je.au);
      ht<dio> $$3 = a($$2, this.b, $$1);
      return new dli($$3);
   }

   public static ht<dio> a(ht<din> $$0, ht<dio> $$1, dhb $$2) {
      dio $$3 = $$1.a(dio.b);
      hg<din> $$4 = (hg<din>)($$3 == null ? $$0.f(dil.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static ht<dio> a(ht<dio> $$0, hg<din> $$1, dhb $$2) {
      ic<dio> $$3 = new ho<>(je.aI, Lifecycle.experimental());
      $$3.a(dio.b, new dio($$1, $$2), Lifecycle.stable());

      for (Entry<aet<dio>, dio> $$4 : $$0.g()) {
         aet<dio> $$5 = $$4.getKey();
         if ($$5 != dio.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dhb a() {
      dio $$0 = this.b.a(dio.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dio> a(aet<dio> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<aet<cpq>> b() {
      return this.d().g().stream().map(Entry::getKey).map(je::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dke;
   }

   private static ecf.a b(ht<dio> $$0) {
      return $$0.d(dio.b).map($$0x -> {
         dhb $$1 = $$0x.b();
         if ($$1 instanceof dke) {
            return ecf.a.c;
         } else {
            return $$1 instanceof dki ? ecf.a.b : ecf.a.a;
         }
      }).orElse(ecf.a.a);
   }

   static Lifecycle a(aet<dio> $$0, dio $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aet<dio> $$0, dio $$1) {
      if ($$0 == dio.b) {
         return a($$1);
      } else if ($$0 == dio.c) {
         return b($$1);
      } else {
         return $$0 == dio.d ? c($$1) : false;
      }
   }

   private static boolean a(dio $$0) {
      hg<din> $$1 = $$0.a();
      if (!$$1.a(dil.a) && !$$1.a(dil.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof crb $$2 && !$$2.a(crd.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dio $$0) {
      return $$0.a().a(dil.b) && $$0.b() instanceof dkq $$1 && $$1.a(dks.f) && $$1.c() instanceof crb $$2 && $$2.a(crd.a);
   }

   private static boolean c(dio $$0) {
      return $$0.a().a(dil.c) && $$0.b() instanceof dkq $$1 && $$1.a(dks.g) && $$1.c() instanceof crf;
   }

   public dli.b a(ht<dio> $$0) {
      Stream<aet<dio>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(aet<dio> a, dio b) {

         Lifecycle c() {
            return dli.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ic<dio> $$4 = new ho<>(je.aI, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      ht<dio> $$5 = $$4.l();
      ecf.a $$6 = b($$5);
      return new dli.b($$5.l(), $$6);
   }

   public ht<dio> d() {
      return this.b;
   }

   public static record b(ht<dio> a, ecf.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public hu.b b() {
         return new hu.c(List.of(this.a)).c();
      }

      public ht<dio> c() {
         return this.a;
      }

      public ecf.a d() {
         return this.b;
      }
   }
}
