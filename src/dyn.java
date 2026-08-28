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

public record dyn(Map<ald<dvt>, dvt> b) {
   public static final MapCodec<dyn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(ald.a(lq.aT), dvt.a).fieldOf("dimensions").forGetter(dyn::d)).apply($$0, $$0.stable(dyn::new))
   );
   private static final Set<ald<dvt>> c = ImmutableSet.of(dvt.b, dvt.c, dvt.d);
   private static final int d = c.size();

   public dyn(Map<ald<dvt>, dvt> b) {
      dvt $$1 = b.get(dvt.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dyn(jv<dvt> $$0) {
      this($$0.h().collect(Collectors.toMap(ji.c::h, ji.c::a)));
   }

   public static Stream<ald<dvt>> a(Stream<ald<dvt>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dyn a(jw $$0, dtx $$1) {
      jv<dvs> $$2 = $$0.d(lq.aE);
      Map<ald<dvt>, dvt> $$3 = a($$2, this.b, $$1);
      return new dyn($$3);
   }

   public static Map<ald<dvt>, dvt> a(jv<dvs> $$0, Map<ald<dvt>, dvt> $$1, dtx $$2) {
      dvt $$3 = $$1.get(dvt.b);
      ji<dvs> $$4 = (ji<dvs>)($$3 == null ? $$0.g(dvq.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<ald<dvt>, dvt> a(Map<ald<dvt>, dvt> $$0, ji<dvs> $$1, dtx $$2) {
      Builder<ald<dvt>, dvt> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dvt.b, new dvt($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dtx a() {
      dvt $$0 = this.b.get(dvt.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dvt> a(ald<dvt> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<ald<dbw>> b() {
      return this.d().keySet().stream().map(lq::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dxj;
   }

   private static epy.a b(jv<dvt> $$0) {
      return $$0.e(dvt.b).map($$0x -> {
         dtx $$1 = $$0x.b();
         if ($$1 instanceof dxj) {
            return epy.a.c;
         } else {
            return $$1 instanceof dxn ? epy.a.b : epy.a.a;
         }
      }).orElse(epy.a.a);
   }

   static Lifecycle a(ald<dvt> $$0, dvt $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ald<dvt> $$0, dvt $$1) {
      if ($$0 == dvt.b) {
         return a($$1);
      } else if ($$0 == dvt.c) {
         return b($$1);
      } else {
         return $$0 == dvt.d ? c($$1) : false;
      }
   }

   private static boolean a(dvt $$0) {
      ji<dvs> $$1 = $$0.a();
      if (!$$1.a(dvq.a) && !$$1.a(dvq.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof ddi $$2 && !$$2.a(ddk.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dvt $$0) {
      return $$0.a().a(dvq.b) && $$0.b() instanceof dxv $$1 && $$1.a(dxx.f) && $$1.d() instanceof ddi $$2 && $$2.a(ddk.a);
   }

   private static boolean c(dvt $$0) {
      return $$0.a().a(dvq.c) && $$0.b() instanceof dxv $$1 && $$1.a(dxx.g) && $$1.d() instanceof ddm;
   }

   public dyn.b a(jv<dvt> $$0) {
      Stream<ald<dvt>> $$1 = Stream.concat($$0.f().stream(), this.b.keySet().stream()).distinct();

      record a(ald<dvt> a, dvt b) {

         ju c() {
            return new ju(Optional.empty(), dyn.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ke<dvt> $$4 = new jq<>(lq.aT, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jv<dvt> $$5 = $$4.l();
      epy.a $$6 = b($$5);
      return new dyn.b($$5.l(), $$6);
   }

   public Map<ald<dvt>, dvt> d() {
      return this.b;
   }

   public static record b(jv<dvt> a, epy.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public jw.b b() {
         return new jw.c(List.of(this.a)).d();
      }

      public jv<dvt> c() {
         return this.a;
      }

      public epy.a d() {
         return this.b;
      }
   }
}
