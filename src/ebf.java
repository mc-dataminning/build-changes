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

public record ebf(Map<alb<dyl>, dyl> b) {
   public static final MapCodec<ebf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(alb.a(lv.bc), dyl.a).fieldOf("dimensions").forGetter(ebf::d)).apply($$0, $$0.stable(ebf::new))
   );
   private static final Set<alb<dyl>> c = ImmutableSet.of(dyl.b, dyl.c, dyl.d);
   private static final int d = c.size();

   public ebf(Map<alb<dyl>, dyl> b) {
      dyl $$1 = b.get(dyl.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public ebf(ka<dyl> $$0) {
      this($$0.i().collect(Collectors.toMap(jn.c::h, jn.c::a)));
   }

   public static Stream<alb<dyl>> a(Stream<alb<dyl>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public ebf a(jp.a $$0, dwl $$1) {
      jp<dyk> $$2 = $$0.b(lv.aL);
      Map<alb<dyl>, dyl> $$3 = a($$2, this.b, $$1);
      return new ebf($$3);
   }

   public static Map<alb<dyl>, dyl> a(jp<dyk> $$0, Map<alb<dyl>, dyl> $$1, dwl $$2) {
      dyl $$3 = $$1.get(dyl.b);
      jn<dyk> $$4 = (jn<dyk>)($$3 == null ? $$0.b(dyi.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<alb<dyl>, dyl> a(Map<alb<dyl>, dyl> $$0, jn<dyk> $$1, dwl $$2) {
      Builder<alb<dyl>, dyl> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dyl.b, new dyl($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dwl a() {
      dyl $$0 = this.b.get(dyl.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dyl> a(alb<dyl> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<alb<deg>> b() {
      return this.d().keySet().stream().map(lv::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof eab;
   }

   private static esz.a b(ka<dyl> $$0) {
      return $$0.e(dyl.b).map($$0x -> {
         dwl $$1 = $$0x.b();
         if ($$1 instanceof eab) {
            return esz.a.c;
         } else {
            return $$1 instanceof eaf ? esz.a.b : esz.a.a;
         }
      }).orElse(esz.a.a);
   }

   static Lifecycle a(alb<dyl> $$0, dyl $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(alb<dyl> $$0, dyl $$1) {
      if ($$0 == dyl.b) {
         return a($$1);
      } else if ($$0 == dyl.c) {
         return b($$1);
      } else {
         return $$0 == dyl.d ? c($$1) : false;
      }
   }

   private static boolean a(dyl $$0) {
      jn<dyk> $$1 = $$0.a();
      if (!$$1.a(dyi.a) && !$$1.a(dyi.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dfu $$2 && !$$2.a(dfw.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dyl $$0) {
      return $$0.a().a(dyi.b) && $$0.b() instanceof ean $$1 && $$1.a(eap.f) && $$1.d() instanceof dfu $$2 && $$2.a(dfw.a);
   }

   private static boolean c(dyl $$0) {
      return $$0.a().a(dyi.c) && $$0.b() instanceof ean $$1 && $$1.a(eap.g) && $$1.d() instanceof dfy;
   }

   public ebf.b a(ka<dyl> $$0) {
      Stream<alb<dyl>> $$1 = Stream.concat($$0.g().stream(), this.b.keySet().stream()).distinct();

      record a(alb<dyl> a, dyl b) {

         jz c() {
            return new jz(Optional.empty(), ebf.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kj<dyl> $$4 = new jv<>(lv.bc, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      ka<dyl> $$5 = $$4.l();
      esz.a $$6 = b($$5);
      return new ebf.b($$5.l(), $$6);
   }

   public Map<alb<dyl>, dyl> d() {
      return this.b;
   }

   public static record b(ka<dyl> a, esz.a b) {
      public Lifecycle a() {
         return this.a.e();
      }

      public kb.b b() {
         return new kb.c(List.of(this.a)).f();
      }

      public ka<dyl> c() {
         return this.a;
      }

      public esz.a d() {
         return this.b;
      }
   }
}
