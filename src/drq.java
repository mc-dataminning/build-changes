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

public record drq(iv<dow> b) {
   public static final MapCodec<drq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ix.a(kg.aN, Lifecycle.stable(), dow.a).fieldOf("dimensions").forGetter(drq::d)).apply($$0, $$0.stable(drq::new))
   );
   private static final Set<aix<dow>> c = ImmutableSet.of(dow.b, dow.c, dow.d);
   private static final int d = c.size();

   public drq(iv<dow> b) {
      dow $$1 = b.a(dow.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<aix<dow>> a(Stream<aix<dow>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public drq a(iw $$0, dng $$1) {
      iv<dov> $$2 = $$0.d(kg.ay);
      iv<dow> $$3 = a($$2, this.b, $$1);
      return new drq($$3);
   }

   public static iv<dow> a(iv<dov> $$0, iv<dow> $$1, dng $$2) {
      dow $$3 = $$1.a(dow.b);
      ij<dov> $$4 = (ij<dov>)($$3 == null ? $$0.f(dot.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static iv<dow> a(iv<dow> $$0, ij<dov> $$1, dng $$2) {
      je<dow> $$3 = new ir<>(kg.aN, Lifecycle.experimental());
      $$3.a(dow.b, new dow($$1, $$2), Lifecycle.stable());

      for (Entry<aix<dow>, dow> $$4 : $$0.g()) {
         aix<dow> $$5 = $$4.getKey();
         if ($$5 != dow.b) {
            $$3.a($$5, $$4.getValue(), $$0.f($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dng a() {
      dow $$0 = this.b.a(dow.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dow> a(aix<dow> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<aix<cvr>> b() {
      return this.d().g().stream().map(Entry::getKey).map(kg::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dqm;
   }

   private static eiw.a b(iv<dow> $$0) {
      return $$0.d(dow.b).map($$0x -> {
         dng $$1 = $$0x.b();
         if ($$1 instanceof dqm) {
            return eiw.a.c;
         } else {
            return $$1 instanceof dqq ? eiw.a.b : eiw.a.a;
         }
      }).orElse(eiw.a.a);
   }

   static Lifecycle a(aix<dow> $$0, dow $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aix<dow> $$0, dow $$1) {
      if ($$0 == dow.b) {
         return a($$1);
      } else if ($$0 == dow.c) {
         return b($$1);
      } else {
         return $$0 == dow.d ? c($$1) : false;
      }
   }

   private static boolean a(dow $$0) {
      ij<dov> $$1 = $$0.a();
      if (!$$1.a(dot.a) && !$$1.a(dot.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof cxd $$2 && !$$2.a(cxf.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dow $$0) {
      return $$0.a().a(dot.b) && $$0.b() instanceof dqy $$1 && $$1.a(dra.f) && $$1.c() instanceof cxd $$2 && $$2.a(cxf.a);
   }

   private static boolean c(dow $$0) {
      return $$0.a().a(dot.c) && $$0.b() instanceof dqy $$1 && $$1.a(dra.g) && $$1.c() instanceof cxh;
   }

   public drq.b a(iv<dow> $$0) {
      Stream<aix<dow>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(aix<dow> a, dow b) {

         Lifecycle c() {
            return drq.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      je<dow> $$4 = new ir<>(kg.aN, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      iv<dow> $$5 = $$4.l();
      eiw.a $$6 = b($$5);
      return new drq.b($$5.l(), $$6);
   }

   public iv<dow> d() {
      return this.b;
   }

   public static record b(iv<dow> a, eiw.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public iw.b b() {
         return new iw.c(List.of(this.a)).d();
      }

      public iv<dow> c() {
         return this.a;
      }

      public eiw.a d() {
         return this.b;
      }
   }
}
