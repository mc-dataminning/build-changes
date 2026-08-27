import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public record dtj(Map<ajg<dqp>, dqp> b) {
   public static final MapCodec<dtj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(ajg.a(kj.aO), dqp.a).fieldOf("dimensions").forGetter(dtj::d)).apply($$0, $$0.stable(dtj::new))
   );
   private static final Set<ajg<dqp>> c = ImmutableSet.of(dqp.b, dqp.c, dqp.d);
   private static final int d = c.size();

   public dtj(Map<ajg<dqp>, dqp> b) {
      dqp $$1 = b.get(dqp.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dtj(iy<dqp> $$0) {
      this($$0.h().collect(Collectors.toMap(il.c::h, il.c::a)));
   }

   public static Stream<ajg<dqp>> a(Stream<ajg<dqp>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dtj a(iz $$0, doy $$1) {
      iy<dqo> $$2 = $$0.d(kj.az);
      Map<ajg<dqp>, dqp> $$3 = a($$2, this.b, $$1);
      return new dtj($$3);
   }

   public static Map<ajg<dqp>, dqp> a(iy<dqo> $$0, Map<ajg<dqp>, dqp> $$1, doy $$2) {
      dqp $$3 = $$1.get(dqp.b);
      il<dqo> $$4 = (il<dqo>)($$3 == null ? $$0.g(dqm.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<ajg<dqp>, dqp> a(Map<ajg<dqp>, dqp> $$0, il<dqo> $$1, doy $$2) {
      Builder<ajg<dqp>, dqp> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dqp.b, new dqp($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public doy a() {
      dqp $$0 = this.b.get(dqp.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dqp> a(ajg<dqp> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<ajg<cxb>> b() {
      return this.d().keySet().stream().map(kj::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dsf;
   }

   private static ekq.a b(iy<dqp> $$0) {
      return $$0.e(dqp.b).map($$0x -> {
         doy $$1 = $$0x.b();
         if ($$1 instanceof dsf) {
            return ekq.a.c;
         } else {
            return $$1 instanceof dsj ? ekq.a.b : ekq.a.a;
         }
      }).orElse(ekq.a.a);
   }

   static Lifecycle a(ajg<dqp> $$0, dqp $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ajg<dqp> $$0, dqp $$1) {
      if ($$0 == dqp.b) {
         return a($$1);
      } else if ($$0 == dqp.c) {
         return b($$1);
      } else {
         return $$0 == dqp.d ? c($$1) : false;
      }
   }

   private static boolean a(dqp $$0) {
      il<dqo> $$1 = $$0.a();
      if (!$$1.a(dqm.a) && !$$1.a(dqm.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof cyn $$2 && !$$2.a(cyp.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dqp $$0) {
      return $$0.a().a(dqm.b) && $$0.b() instanceof dsr $$1 && $$1.a(dst.f) && $$1.c() instanceof cyn $$2 && $$2.a(cyp.a);
   }

   private static boolean c(dqp $$0) {
      return $$0.a().a(dqm.c) && $$0.b() instanceof dsr $$1 && $$1.a(dst.g) && $$1.c() instanceof cyr;
   }

   public dtj.b a(iy<dqp> $$0) {
      Stream<ajg<dqp>> $$1 = Stream.concat($$0.f().stream(), this.b.keySet().stream()).distinct();

      record a(ajg<dqp> a, dqp b) {

         ix c() {
            return new ix(Optional.empty(), dtj.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      jh<dqp> $$4 = new it<>(kj.aO, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      iy<dqp> $$5 = $$4.l();
      ekq.a $$6 = b($$5);
      return new dtj.b($$5.l(), $$6);
   }

   public Map<ajg<dqp>, dqp> d() {
      return this.b;
   }

   public static record b(iy<dqp> a, ekq.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public iz.b b() {
         return new iz.c(List.of(this.a)).d();
      }

      public iy<dqp> c() {
         return this.a;
      }

      public ekq.a d() {
         return this.b;
      }
   }
}
