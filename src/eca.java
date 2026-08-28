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

public record eca(Map<alh<dzg>, dzg> b) {
   public static final MapCodec<eca> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(alh.a(lz.bc), dzg.a).fieldOf("dimensions").forGetter(eca::d)).apply($$0, $$0.stable(eca::new))
   );
   private static final Set<alh<dzg>> c = ImmutableSet.of(dzg.b, dzg.c, dzg.d);
   private static final int d = c.size();

   public eca(Map<alh<dzg>, dzg> b) {
      dzg $$1 = b.get(dzg.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public eca(kd<dzg> $$0) {
      this($$0.c().collect(Collectors.toMap(jq.c::h, jq.c::a)));
   }

   public static Stream<alh<dzg>> a(Stream<alh<dzg>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public eca a(js.a $$0, dxg $$1) {
      js<dzf> $$2 = $$0.d(lz.aL);
      Map<alh<dzg>, dzg> $$3 = a($$2, this.b, $$1);
      return new eca($$3);
   }

   public static Map<alh<dzg>, dzg> a(js<dzf> $$0, Map<alh<dzg>, dzg> $$1, dxg $$2) {
      dzg $$3 = $$1.get(dzg.b);
      jq<dzf> $$4 = (jq<dzf>)($$3 == null ? $$0.b(dzd.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<alh<dzg>, dzg> a(Map<alh<dzg>, dzg> $$0, jq<dzf> $$1, dxg $$2) {
      Builder<alh<dzg>, dzg> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dzg.b, new dzg($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dxg a() {
      dzg $$0 = this.b.get(dzg.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dzg> a(alh<dzg> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<alh<dfb>> b() {
      return this.d().keySet().stream().map(lz::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof eaw;
   }

   private static etu.a b(kd<dzg> $$0) {
      return $$0.f(dzg.b).map($$0x -> {
         dxg $$1 = $$0x.b();
         if ($$1 instanceof eaw) {
            return etu.a.c;
         } else {
            return $$1 instanceof eba ? etu.a.b : etu.a.a;
         }
      }).orElse(etu.a.a);
   }

   static Lifecycle a(alh<dzg> $$0, dzg $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(alh<dzg> $$0, dzg $$1) {
      if ($$0 == dzg.b) {
         return a($$1);
      } else if ($$0 == dzg.c) {
         return b($$1);
      } else {
         return $$0 == dzg.d ? c($$1) : false;
      }
   }

   private static boolean a(dzg $$0) {
      jq<dzf> $$1 = $$0.a();
      if (!$$1.a(dzd.a) && !$$1.a(dzd.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dgp $$2 && !$$2.a(dgr.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dzg $$0) {
      return $$0.a().a(dzd.b) && $$0.b() instanceof ebi $$1 && $$1.a(ebk.f) && $$1.d() instanceof dgp $$2 && $$2.a(dgr.a);
   }

   private static boolean c(dzg $$0) {
      return $$0.a().a(dzd.c) && $$0.b() instanceof ebi $$1 && $$1.a(ebk.g) && $$1.d() instanceof dgt;
   }

   public eca.b a(kd<dzg> $$0) {
      Stream<alh<dzg>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(alh<dzg> a, dzg b) {

         kc c() {
            return new kc(Optional.empty(), eca.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      km<dzg> $$4 = new jy<>(lz.bc, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      kd<dzg> $$5 = $$4.n();
      etu.a $$6 = b($$5);
      return new eca.b($$5.n(), $$6);
   }

   public Map<alh<dzg>, dzg> d() {
      return this.b;
   }

   public static record b(kd<dzg> a, etu.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public ke.b b() {
         return new ke.c(List.of(this.a)).e();
      }

      public kd<dzg> c() {
         return this.a;
      }

      public etu.a d() {
         return this.b;
      }
   }
}
