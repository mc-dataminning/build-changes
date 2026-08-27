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

public record dvm(Map<ajs<dss>, dss> b) {
   public static final MapCodec<dvm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(ajs.a(ks.aP), dss.a).fieldOf("dimensions").forGetter(dvm::d)).apply($$0, $$0.stable(dvm::new))
   );
   private static final Set<ajs<dss>> c = ImmutableSet.of(dss.b, dss.c, dss.d);
   private static final int d = c.size();

   public dvm(Map<ajs<dss>, dss> b) {
      dss $$1 = b.get(dss.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dvm(iy<dss> $$0) {
      this($$0.h().collect(Collectors.toMap(il.c::h, il.c::a)));
   }

   public static Stream<ajs<dss>> a(Stream<ajs<dss>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dvm a(iz $$0, dqw $$1) {
      iy<dsr> $$2 = $$0.d(ks.aA);
      Map<ajs<dss>, dss> $$3 = a($$2, this.b, $$1);
      return new dvm($$3);
   }

   public static Map<ajs<dss>, dss> a(iy<dsr> $$0, Map<ajs<dss>, dss> $$1, dqw $$2) {
      dss $$3 = $$1.get(dss.b);
      il<dsr> $$4 = (il<dsr>)($$3 == null ? $$0.g(dsp.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<ajs<dss>, dss> a(Map<ajs<dss>, dss> $$0, il<dsr> $$1, dqw $$2) {
      Builder<ajs<dss>, dss> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dss.b, new dss($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dqw a() {
      dss $$0 = this.b.get(dss.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dss> a(ajs<dss> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<ajs<cyx>> b() {
      return this.d().keySet().stream().map(ks::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dui;
   }

   private static emv.a b(iy<dss> $$0) {
      return $$0.e(dss.b).map($$0x -> {
         dqw $$1 = $$0x.b();
         if ($$1 instanceof dui) {
            return emv.a.c;
         } else {
            return $$1 instanceof dum ? emv.a.b : emv.a.a;
         }
      }).orElse(emv.a.a);
   }

   static Lifecycle a(ajs<dss> $$0, dss $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ajs<dss> $$0, dss $$1) {
      if ($$0 == dss.b) {
         return a($$1);
      } else if ($$0 == dss.c) {
         return b($$1);
      } else {
         return $$0 == dss.d ? c($$1) : false;
      }
   }

   private static boolean a(dss $$0) {
      il<dsr> $$1 = $$0.a();
      if (!$$1.a(dsp.a) && !$$1.a(dsp.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof daj $$2 && !$$2.a(dal.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dss $$0) {
      return $$0.a().a(dsp.b) && $$0.b() instanceof duu $$1 && $$1.a(duw.f) && $$1.c() instanceof daj $$2 && $$2.a(dal.a);
   }

   private static boolean c(dss $$0) {
      return $$0.a().a(dsp.c) && $$0.b() instanceof duu $$1 && $$1.a(duw.g) && $$1.c() instanceof dan;
   }

   public dvm.b a(iy<dss> $$0) {
      Stream<ajs<dss>> $$1 = Stream.concat($$0.f().stream(), this.b.keySet().stream()).distinct();

      record a(ajs<dss> a, dss b) {

         ix c() {
            return new ix(Optional.empty(), dvm.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      jh<dss> $$4 = new it<>(ks.aP, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      iy<dss> $$5 = $$4.l();
      emv.a $$6 = b($$5);
      return new dvm.b($$5.l(), $$6);
   }

   public Map<ajs<dss>, dss> d() {
      return this.b;
   }

   public static record b(iy<dss> a, emv.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public iz.b b() {
         return new iz.c(List.of(this.a)).d();
      }

      public iy<dss> c() {
         return this.a;
      }

      public emv.a d() {
         return this.b;
      }
   }
}
