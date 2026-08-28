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

public record ebj(Map<ald<dyp>, dyp> b) {
   public static final MapCodec<ebj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(ald.a(lw.bd), dyp.a).fieldOf("dimensions").forGetter(ebj::d)).apply($$0, $$0.stable(ebj::new))
   );
   private static final Set<ald<dyp>> c = ImmutableSet.of(dyp.b, dyp.c, dyp.d);
   private static final int d = c.size();

   public ebj(Map<ald<dyp>, dyp> b) {
      dyp $$1 = b.get(dyp.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public ebj(kb<dyp> $$0) {
      this($$0.c().collect(Collectors.toMap(jo.c::h, jo.c::a)));
   }

   public static Stream<ald<dyp>> a(Stream<ald<dyp>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public ebj a(jq.a $$0, dwp $$1) {
      jq<dyo> $$2 = $$0.d(lw.aM);
      Map<ald<dyp>, dyp> $$3 = a($$2, this.b, $$1);
      return new ebj($$3);
   }

   public static Map<ald<dyp>, dyp> a(jq<dyo> $$0, Map<ald<dyp>, dyp> $$1, dwp $$2) {
      dyp $$3 = $$1.get(dyp.b);
      jo<dyo> $$4 = (jo<dyo>)($$3 == null ? $$0.b(dym.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<ald<dyp>, dyp> a(Map<ald<dyp>, dyp> $$0, jo<dyo> $$1, dwp $$2) {
      Builder<ald<dyp>, dyp> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dyp.b, new dyp($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dwp a() {
      dyp $$0 = this.b.get(dyp.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dyp> a(ald<dyp> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<ald<dej>> b() {
      return this.d().keySet().stream().map(lw::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof eaf;
   }

   private static etd.a b(kb<dyp> $$0) {
      return $$0.f(dyp.b).map($$0x -> {
         dwp $$1 = $$0x.b();
         if ($$1 instanceof eaf) {
            return etd.a.c;
         } else {
            return $$1 instanceof eaj ? etd.a.b : etd.a.a;
         }
      }).orElse(etd.a.a);
   }

   static Lifecycle a(ald<dyp> $$0, dyp $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ald<dyp> $$0, dyp $$1) {
      if ($$0 == dyp.b) {
         return a($$1);
      } else if ($$0 == dyp.c) {
         return b($$1);
      } else {
         return $$0 == dyp.d ? c($$1) : false;
      }
   }

   private static boolean a(dyp $$0) {
      jo<dyo> $$1 = $$0.a();
      if (!$$1.a(dym.a) && !$$1.a(dym.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dfx $$2 && !$$2.a(dfz.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dyp $$0) {
      return $$0.a().a(dym.b) && $$0.b() instanceof ear $$1 && $$1.a(eat.f) && $$1.d() instanceof dfx $$2 && $$2.a(dfz.a);
   }

   private static boolean c(dyp $$0) {
      return $$0.a().a(dym.c) && $$0.b() instanceof ear $$1 && $$1.a(eat.g) && $$1.d() instanceof dgb;
   }

   public ebj.b a(kb<dyp> $$0) {
      Stream<ald<dyp>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(ald<dyp> a, dyp b) {

         ka c() {
            return new ka(Optional.empty(), ebj.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kk<dyp> $$4 = new jw<>(lw.bd, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      kb<dyp> $$5 = $$4.n();
      etd.a $$6 = b($$5);
      return new ebj.b($$5.n(), $$6);
   }

   public Map<ald<dyp>, dyp> d() {
      return this.b;
   }

   public static record b(kb<dyp> a, etd.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public kc.b b() {
         return new kc.c(List.of(this.a)).e();
      }

      public kb<dyp> c() {
         return this.a;
      }

      public etd.a d() {
         return this.b;
      }
   }
}
