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

public record dyu(Map<akj<dwa>, dwa> b) {
   public static final MapCodec<dyu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(akj.a(lr.ba), dwa.a).fieldOf("dimensions").forGetter(dyu::d)).apply($$0, $$0.stable(dyu::new))
   );
   private static final Set<akj<dwa>> c = ImmutableSet.of(dwa.b, dwa.c, dwa.d);
   private static final int d = c.size();

   public dyu(Map<akj<dwa>, dwa> b) {
      dwa $$1 = b.get(dwa.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dyu(jw<dwa> $$0) {
      this($$0.i().collect(Collectors.toMap(jj.c::h, jj.c::a)));
   }

   public static Stream<akj<dwa>> a(Stream<akj<dwa>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dyu a(jx $$0, due $$1) {
      jw<dvz> $$2 = $$0.d(lr.aJ);
      Map<akj<dwa>, dwa> $$3 = a($$2, this.b, $$1);
      return new dyu($$3);
   }

   public static Map<akj<dwa>, dwa> a(jw<dvz> $$0, Map<akj<dwa>, dwa> $$1, due $$2) {
      dwa $$3 = $$1.get(dwa.b);
      jj<dvz> $$4 = (jj<dvz>)($$3 == null ? $$0.g(dvx.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<akj<dwa>, dwa> a(Map<akj<dwa>, dwa> $$0, jj<dvz> $$1, due $$2) {
      Builder<akj<dwa>, dwa> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dwa.b, new dwa($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public due a() {
      dwa $$0 = this.b.get(dwa.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dwa> a(akj<dwa> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<akj<dcd>> b() {
      return this.d().keySet().stream().map(lr::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dxq;
   }

   private static eqg.a b(jw<dwa> $$0) {
      return $$0.e(dwa.b).map($$0x -> {
         due $$1 = $$0x.b();
         if ($$1 instanceof dxq) {
            return eqg.a.c;
         } else {
            return $$1 instanceof dxu ? eqg.a.b : eqg.a.a;
         }
      }).orElse(eqg.a.a);
   }

   static Lifecycle a(akj<dwa> $$0, dwa $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(akj<dwa> $$0, dwa $$1) {
      if ($$0 == dwa.b) {
         return a($$1);
      } else if ($$0 == dwa.c) {
         return b($$1);
      } else {
         return $$0 == dwa.d ? c($$1) : false;
      }
   }

   private static boolean a(dwa $$0) {
      jj<dvz> $$1 = $$0.a();
      if (!$$1.a(dvx.a) && !$$1.a(dvx.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof ddq $$2 && !$$2.a(dds.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dwa $$0) {
      return $$0.a().a(dvx.b) && $$0.b() instanceof dyc $$1 && $$1.a(dye.f) && $$1.d() instanceof ddq $$2 && $$2.a(dds.a);
   }

   private static boolean c(dwa $$0) {
      return $$0.a().a(dvx.c) && $$0.b() instanceof dyc $$1 && $$1.a(dye.g) && $$1.d() instanceof ddu;
   }

   public dyu.b a(jw<dwa> $$0) {
      Stream<akj<dwa>> $$1 = Stream.concat($$0.g().stream(), this.b.keySet().stream()).distinct();

      record a(akj<dwa> a, dwa b) {

         jv c() {
            return new jv(Optional.empty(), dyu.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kf<dwa> $$4 = new jr<>(lr.ba, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jw<dwa> $$5 = $$4.m();
      eqg.a $$6 = b($$5);
      return new dyu.b($$5.m(), $$6);
   }

   public Map<akj<dwa>, dwa> d() {
      return this.b;
   }

   public static record b(jw<dwa> a, eqg.a b) {
      public Lifecycle a() {
         return this.a.e();
      }

      public jx.b b() {
         return new jx.c(List.of(this.a)).d();
      }

      public jw<dwa> c() {
         return this.a;
      }

      public eqg.a d() {
         return this.b;
      }
   }
}
