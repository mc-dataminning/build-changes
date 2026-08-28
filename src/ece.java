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

public record ece(Map<alk<dzk>, dzk> b) {
   public static final MapCodec<ece> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(alk.a(ma.bc), dzk.a).fieldOf("dimensions").forGetter(ece::d)).apply($$0, $$0.stable(ece::new))
   );
   private static final Set<alk<dzk>> c = ImmutableSet.of(dzk.b, dzk.c, dzk.d);
   private static final int d = c.size();

   public ece(Map<alk<dzk>, dzk> b) {
      dzk $$1 = b.get(dzk.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public ece(kd<dzk> $$0) {
      this($$0.c().collect(Collectors.toMap(jq.c::h, jq.c::a)));
   }

   public static Stream<alk<dzk>> a(Stream<alk<dzk>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public ece a(js.a $$0, dxk $$1) {
      js<dzj> $$2 = $$0.d(ma.aL);
      Map<alk<dzk>, dzk> $$3 = a($$2, this.b, $$1);
      return new ece($$3);
   }

   public static Map<alk<dzk>, dzk> a(js<dzj> $$0, Map<alk<dzk>, dzk> $$1, dxk $$2) {
      dzk $$3 = $$1.get(dzk.b);
      jq<dzj> $$4 = (jq<dzj>)($$3 == null ? $$0.b(dzh.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<alk<dzk>, dzk> a(Map<alk<dzk>, dzk> $$0, jq<dzj> $$1, dxk $$2) {
      Builder<alk<dzk>, dzk> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dzk.b, new dzk($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dxk a() {
      dzk $$0 = this.b.get(dzk.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dzk> a(alk<dzk> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<alk<dff>> b() {
      return this.d().keySet().stream().map(ma::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof eba;
   }

   private static ety.a b(kd<dzk> $$0) {
      return $$0.f(dzk.b).map($$0x -> {
         dxk $$1 = $$0x.b();
         if ($$1 instanceof eba) {
            return ety.a.c;
         } else {
            return $$1 instanceof ebe ? ety.a.b : ety.a.a;
         }
      }).orElse(ety.a.a);
   }

   static Lifecycle a(alk<dzk> $$0, dzk $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(alk<dzk> $$0, dzk $$1) {
      if ($$0 == dzk.b) {
         return a($$1);
      } else if ($$0 == dzk.c) {
         return b($$1);
      } else {
         return $$0 == dzk.d ? c($$1) : false;
      }
   }

   private static boolean a(dzk $$0) {
      jq<dzj> $$1 = $$0.a();
      if (!$$1.a(dzh.a) && !$$1.a(dzh.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dgu $$2 && !$$2.a(dgw.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dzk $$0) {
      return $$0.a().a(dzh.b) && $$0.b() instanceof ebm $$1 && $$1.a(ebo.f) && $$1.d() instanceof dgu $$2 && $$2.a(dgw.a);
   }

   private static boolean c(dzk $$0) {
      return $$0.a().a(dzh.c) && $$0.b() instanceof ebm $$1 && $$1.a(ebo.g) && $$1.d() instanceof dgy;
   }

   public ece.b a(kd<dzk> $$0) {
      Stream<alk<dzk>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(alk<dzk> a, dzk b) {

         kc c() {
            return new kc(Optional.empty(), ece.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      km<dzk> $$4 = new jy<>(ma.bc, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      kd<dzk> $$5 = $$4.n();
      ety.a $$6 = b($$5);
      return new ece.b($$5.n(), $$6);
   }

   public Map<alk<dzk>, dzk> d() {
      return this.b;
   }

   public static record b(kd<dzk> a, ety.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public ke.b b() {
         return new ke.c(List.of(this.a)).e();
      }

      public kd<dzk> c() {
         return this.a;
      }

      public ety.a d() {
         return this.b;
      }
   }
}
