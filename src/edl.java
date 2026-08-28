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

public record edl(Map<akt<ear>, ear> b) {
   public static final MapCodec<edl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(akt.a(mc.bf), ear.a).fieldOf("dimensions").forGetter(edl::d)).apply($$0, $$0.stable(edl::new))
   );
   private static final Set<akt<ear>> c = ImmutableSet.of(ear.b, ear.c, ear.d);
   private static final int d = c.size();

   public edl(Map<akt<ear>, ear> b) {
      ear $$1 = b.get(ear.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public edl(ke<ear> $$0) {
      this($$0.c().collect(Collectors.toMap(jr.c::h, jr.c::a)));
   }

   public static Stream<akt<ear>> a(Stream<akt<ear>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public edl a(jt.a $$0, dyr $$1) {
      jt<eaq> $$2 = $$0.d(mc.aN);
      Map<akt<ear>, ear> $$3 = a($$2, this.b, $$1);
      return new edl($$3);
   }

   public static Map<akt<ear>, ear> a(jt<eaq> $$0, Map<akt<ear>, ear> $$1, dyr $$2) {
      ear $$3 = $$1.get(ear.b);
      jr<eaq> $$4 = (jr<eaq>)($$3 == null ? $$0.b(eao.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<akt<ear>, ear> a(Map<akt<ear>, ear> $$0, jr<eaq> $$1, dyr $$2) {
      Builder<akt<ear>, ear> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(ear.b, new ear($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dyr a() {
      ear $$0 = this.b.get(ear.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<ear> a(akt<ear> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<akt<dgg>> b() {
      return this.d().keySet().stream().map(mc::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof ech;
   }

   private static evh.a b(ke<ear> $$0) {
      return $$0.f(ear.b).map($$0x -> {
         dyr $$1 = $$0x.b();
         if ($$1 instanceof ech) {
            return evh.a.c;
         } else {
            return $$1 instanceof ecl ? evh.a.b : evh.a.a;
         }
      }).orElse(evh.a.a);
   }

   static Lifecycle a(akt<ear> $$0, ear $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(akt<ear> $$0, ear $$1) {
      if ($$0 == ear.b) {
         return a($$1);
      } else if ($$0 == ear.c) {
         return b($$1);
      } else {
         return $$0 == ear.d ? c($$1) : false;
      }
   }

   private static boolean a(ear $$0) {
      jr<eaq> $$1 = $$0.a();
      if (!$$1.a(eao.a) && !$$1.a(eao.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dhv $$2 && !$$2.a(dhx.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(ear $$0) {
      return $$0.a().a(eao.b) && $$0.b() instanceof ect $$1 && $$1.a(ecv.f) && $$1.d() instanceof dhv $$2 && $$2.a(dhx.a);
   }

   private static boolean c(ear $$0) {
      return $$0.a().a(eao.c) && $$0.b() instanceof ect $$1 && $$1.a(ecv.g) && $$1.d() instanceof dhz;
   }

   public edl.b a(ke<ear> $$0) {
      Stream<akt<ear>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(akt<ear> a, ear b) {

         kd c() {
            return new kd(Optional.empty(), edl.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kn<ear> $$4 = new jz<>(mc.bf, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      ke<ear> $$5 = $$4.n();
      evh.a $$6 = b($$5);
      return new edl.b($$5.n(), $$6);
   }

   public Map<akt<ear>, ear> d() {
      return this.b;
   }

   public static record b(ke<ear> a, evh.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public kf.b b() {
         return new kf.c(List.of(this.a)).e();
      }

      public ke<ear> c() {
         return this.a;
      }

      public evh.a d() {
         return this.b;
      }
   }
}
