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

public record dzb(Map<akj<dwh>, dwh> b) {
   public static final MapCodec<dzb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(akj.a(lr.ba), dwh.a).fieldOf("dimensions").forGetter(dzb::d)).apply($$0, $$0.stable(dzb::new))
   );
   private static final Set<akj<dwh>> c = ImmutableSet.of(dwh.b, dwh.c, dwh.d);
   private static final int d = c.size();

   public dzb(Map<akj<dwh>, dwh> b) {
      dwh $$1 = b.get(dwh.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dzb(jw<dwh> $$0) {
      this($$0.i().collect(Collectors.toMap(jj.c::h, jj.c::a)));
   }

   public static Stream<akj<dwh>> a(Stream<akj<dwh>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dzb a(jx $$0, dui $$1) {
      jw<dwg> $$2 = $$0.d(lr.aJ);
      Map<akj<dwh>, dwh> $$3 = a($$2, this.b, $$1);
      return new dzb($$3);
   }

   public static Map<akj<dwh>, dwh> a(jw<dwg> $$0, Map<akj<dwh>, dwh> $$1, dui $$2) {
      dwh $$3 = $$1.get(dwh.b);
      jj<dwg> $$4 = (jj<dwg>)($$3 == null ? $$0.g(dwe.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<akj<dwh>, dwh> a(Map<akj<dwh>, dwh> $$0, jj<dwg> $$1, dui $$2) {
      Builder<akj<dwh>, dwh> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dwh.b, new dwh($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dui a() {
      dwh $$0 = this.b.get(dwh.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dwh> a(akj<dwh> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<akj<dcg>> b() {
      return this.d().keySet().stream().map(lr::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dxx;
   }

   private static eqo.a b(jw<dwh> $$0) {
      return $$0.e(dwh.b).map($$0x -> {
         dui $$1 = $$0x.b();
         if ($$1 instanceof dxx) {
            return eqo.a.c;
         } else {
            return $$1 instanceof dyb ? eqo.a.b : eqo.a.a;
         }
      }).orElse(eqo.a.a);
   }

   static Lifecycle a(akj<dwh> $$0, dwh $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(akj<dwh> $$0, dwh $$1) {
      if ($$0 == dwh.b) {
         return a($$1);
      } else if ($$0 == dwh.c) {
         return b($$1);
      } else {
         return $$0 == dwh.d ? c($$1) : false;
      }
   }

   private static boolean a(dwh $$0) {
      jj<dwg> $$1 = $$0.a();
      if (!$$1.a(dwe.a) && !$$1.a(dwe.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof ddt $$2 && !$$2.a(ddv.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dwh $$0) {
      return $$0.a().a(dwe.b) && $$0.b() instanceof dyj $$1 && $$1.a(dyl.f) && $$1.d() instanceof ddt $$2 && $$2.a(ddv.a);
   }

   private static boolean c(dwh $$0) {
      return $$0.a().a(dwe.c) && $$0.b() instanceof dyj $$1 && $$1.a(dyl.g) && $$1.d() instanceof ddx;
   }

   public dzb.b a(jw<dwh> $$0) {
      Stream<akj<dwh>> $$1 = Stream.concat($$0.g().stream(), this.b.keySet().stream()).distinct();

      record a(akj<dwh> a, dwh b) {

         jv c() {
            return new jv(Optional.empty(), dzb.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kf<dwh> $$4 = new jr<>(lr.ba, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jw<dwh> $$5 = $$4.m();
      eqo.a $$6 = b($$5);
      return new dzb.b($$5.m(), $$6);
   }

   public Map<akj<dwh>, dwh> d() {
      return this.b;
   }

   public static record b(jw<dwh> a, eqo.a b) {
      public Lifecycle a() {
         return this.a.e();
      }

      public jx.b b() {
         return new jx.c(List.of(this.a)).d();
      }

      public jw<dwh> c() {
         return this.a;
      }

      public eqo.a d() {
         return this.b;
      }
   }
}
