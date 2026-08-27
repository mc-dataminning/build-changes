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

public record dxq(Map<akm<duw>, duw> b) {
   public static final MapCodec<dxq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(akm.a(lf.aT), duw.a).fieldOf("dimensions").forGetter(dxq::d)).apply($$0, $$0.stable(dxq::new))
   );
   private static final Set<akm<duw>> c = ImmutableSet.of(duw.b, duw.c, duw.d);
   private static final int d = c.size();

   public dxq(Map<akm<duw>, duw> b) {
      duw $$1 = b.get(duw.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dxq(jk<duw> $$0) {
      this($$0.h().collect(Collectors.toMap(ix.c::h, ix.c::a)));
   }

   public static Stream<akm<duw>> a(Stream<akm<duw>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dxq a(jl $$0, dta $$1) {
      jk<duv> $$2 = $$0.d(lf.aE);
      Map<akm<duw>, duw> $$3 = a($$2, this.b, $$1);
      return new dxq($$3);
   }

   public static Map<akm<duw>, duw> a(jk<duv> $$0, Map<akm<duw>, duw> $$1, dta $$2) {
      duw $$3 = $$1.get(duw.b);
      ix<duv> $$4 = (ix<duv>)($$3 == null ? $$0.g(dut.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<akm<duw>, duw> a(Map<akm<duw>, duw> $$0, ix<duv> $$1, dta $$2) {
      Builder<akm<duw>, duw> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(duw.b, new duw($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dta a() {
      duw $$0 = this.b.get(duw.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<duw> a(akm<duw> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<akm<daz>> b() {
      return this.d().keySet().stream().map(lf::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dwm;
   }

   private static epb.a b(jk<duw> $$0) {
      return $$0.e(duw.b).map($$0x -> {
         dta $$1 = $$0x.b();
         if ($$1 instanceof dwm) {
            return epb.a.c;
         } else {
            return $$1 instanceof dwq ? epb.a.b : epb.a.a;
         }
      }).orElse(epb.a.a);
   }

   static Lifecycle a(akm<duw> $$0, duw $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(akm<duw> $$0, duw $$1) {
      if ($$0 == duw.b) {
         return a($$1);
      } else if ($$0 == duw.c) {
         return b($$1);
      } else {
         return $$0 == duw.d ? c($$1) : false;
      }
   }

   private static boolean a(duw $$0) {
      ix<duv> $$1 = $$0.a();
      if (!$$1.a(dut.a) && !$$1.a(dut.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof dcl $$2 && !$$2.a(dcn.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(duw $$0) {
      return $$0.a().a(dut.b) && $$0.b() instanceof dwy $$1 && $$1.a(dxa.f) && $$1.c() instanceof dcl $$2 && $$2.a(dcn.a);
   }

   private static boolean c(duw $$0) {
      return $$0.a().a(dut.c) && $$0.b() instanceof dwy $$1 && $$1.a(dxa.g) && $$1.c() instanceof dcp;
   }

   public dxq.b a(jk<duw> $$0) {
      Stream<akm<duw>> $$1 = Stream.concat($$0.f().stream(), this.b.keySet().stream()).distinct();

      record a(akm<duw> a, duw b) {

         jj c() {
            return new jj(Optional.empty(), dxq.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      jt<duw> $$4 = new jf<>(lf.aT, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jk<duw> $$5 = $$4.l();
      epb.a $$6 = b($$5);
      return new dxq.b($$5.l(), $$6);
   }

   public Map<akm<duw>, duw> d() {
      return this.b;
   }

   public static record b(jk<duw> a, epb.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public jl.b b() {
         return new jl.c(List.of(this.a)).d();
      }

      public jk<duw> c() {
         return this.a;
      }

      public epb.a d() {
         return this.b;
      }
   }
}
