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

public record ebu(Map<alg<dza>, dza> b) {
   public static final MapCodec<ebu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(alg.a(ly.bc), dza.a).fieldOf("dimensions").forGetter(ebu::d)).apply($$0, $$0.stable(ebu::new))
   );
   private static final Set<alg<dza>> c = ImmutableSet.of(dza.b, dza.c, dza.d);
   private static final int d = c.size();

   public ebu(Map<alg<dza>, dza> b) {
      dza $$1 = b.get(dza.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public ebu(kc<dza> $$0) {
      this($$0.c().collect(Collectors.toMap(jp.c::h, jp.c::a)));
   }

   public static Stream<alg<dza>> a(Stream<alg<dza>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public ebu a(jr.a $$0, dxa $$1) {
      jr<dyz> $$2 = $$0.d(ly.aL);
      Map<alg<dza>, dza> $$3 = a($$2, this.b, $$1);
      return new ebu($$3);
   }

   public static Map<alg<dza>, dza> a(jr<dyz> $$0, Map<alg<dza>, dza> $$1, dxa $$2) {
      dza $$3 = $$1.get(dza.b);
      jp<dyz> $$4 = (jp<dyz>)($$3 == null ? $$0.b(dyx.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<alg<dza>, dza> a(Map<alg<dza>, dza> $$0, jp<dyz> $$1, dxa $$2) {
      Builder<alg<dza>, dza> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dza.b, new dza($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dxa a() {
      dza $$0 = this.b.get(dza.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dza> a(alg<dza> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<alg<dev>> b() {
      return this.d().keySet().stream().map(ly::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof eaq;
   }

   private static eto.a b(kc<dza> $$0) {
      return $$0.f(dza.b).map($$0x -> {
         dxa $$1 = $$0x.b();
         if ($$1 instanceof eaq) {
            return eto.a.c;
         } else {
            return $$1 instanceof eau ? eto.a.b : eto.a.a;
         }
      }).orElse(eto.a.a);
   }

   static Lifecycle a(alg<dza> $$0, dza $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(alg<dza> $$0, dza $$1) {
      if ($$0 == dza.b) {
         return a($$1);
      } else if ($$0 == dza.c) {
         return b($$1);
      } else {
         return $$0 == dza.d ? c($$1) : false;
      }
   }

   private static boolean a(dza $$0) {
      jp<dyz> $$1 = $$0.a();
      if (!$$1.a(dyx.a) && !$$1.a(dyx.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dgj $$2 && !$$2.a(dgl.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dza $$0) {
      return $$0.a().a(dyx.b) && $$0.b() instanceof ebc $$1 && $$1.a(ebe.f) && $$1.d() instanceof dgj $$2 && $$2.a(dgl.a);
   }

   private static boolean c(dza $$0) {
      return $$0.a().a(dyx.c) && $$0.b() instanceof ebc $$1 && $$1.a(ebe.g) && $$1.d() instanceof dgn;
   }

   public ebu.b a(kc<dza> $$0) {
      Stream<alg<dza>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(alg<dza> a, dza b) {

         kb c() {
            return new kb(Optional.empty(), ebu.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kl<dza> $$4 = new jx<>(ly.bc, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      kc<dza> $$5 = $$4.n();
      eto.a $$6 = b($$5);
      return new ebu.b($$5.n(), $$6);
   }

   public Map<alg<dza>, dza> d() {
      return this.b;
   }

   public static record b(kc<dza> a, eto.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public kd.b b() {
         return new kd.c(List.of(this.a)).e();
      }

      public kc<dza> c() {
         return this.a;
      }

      public eto.a d() {
         return this.b;
      }
   }
}
