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

public record dyp(Map<ale<dvv>, dvv> b) {
   public static final MapCodec<dyp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(ale.a(lq.aT), dvv.a).fieldOf("dimensions").forGetter(dyp::d)).apply($$0, $$0.stable(dyp::new))
   );
   private static final Set<ale<dvv>> c = ImmutableSet.of(dvv.b, dvv.c, dvv.d);
   private static final int d = c.size();

   public dyp(Map<ale<dvv>, dvv> b) {
      dvv $$1 = b.get(dvv.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dyp(jv<dvv> $$0) {
      this($$0.h().collect(Collectors.toMap(ji.c::h, ji.c::a)));
   }

   public static Stream<ale<dvv>> a(Stream<ale<dvv>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dyp a(jw $$0, dtz $$1) {
      jv<dvu> $$2 = $$0.d(lq.aE);
      Map<ale<dvv>, dvv> $$3 = a($$2, this.b, $$1);
      return new dyp($$3);
   }

   public static Map<ale<dvv>, dvv> a(jv<dvu> $$0, Map<ale<dvv>, dvv> $$1, dtz $$2) {
      dvv $$3 = $$1.get(dvv.b);
      ji<dvu> $$4 = (ji<dvu>)($$3 == null ? $$0.g(dvs.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<ale<dvv>, dvv> a(Map<ale<dvv>, dvv> $$0, ji<dvu> $$1, dtz $$2) {
      Builder<ale<dvv>, dvv> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dvv.b, new dvv($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dtz a() {
      dvv $$0 = this.b.get(dvv.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dvv> a(ale<dvv> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<ale<dby>> b() {
      return this.d().keySet().stream().map(lq::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dxl;
   }

   private static eqa.a b(jv<dvv> $$0) {
      return $$0.e(dvv.b).map($$0x -> {
         dtz $$1 = $$0x.b();
         if ($$1 instanceof dxl) {
            return eqa.a.c;
         } else {
            return $$1 instanceof dxp ? eqa.a.b : eqa.a.a;
         }
      }).orElse(eqa.a.a);
   }

   static Lifecycle a(ale<dvv> $$0, dvv $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ale<dvv> $$0, dvv $$1) {
      if ($$0 == dvv.b) {
         return a($$1);
      } else if ($$0 == dvv.c) {
         return b($$1);
      } else {
         return $$0 == dvv.d ? c($$1) : false;
      }
   }

   private static boolean a(dvv $$0) {
      ji<dvu> $$1 = $$0.a();
      if (!$$1.a(dvs.a) && !$$1.a(dvs.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof ddk $$2 && !$$2.a(ddm.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dvv $$0) {
      return $$0.a().a(dvs.b) && $$0.b() instanceof dxx $$1 && $$1.a(dxz.f) && $$1.d() instanceof ddk $$2 && $$2.a(ddm.a);
   }

   private static boolean c(dvv $$0) {
      return $$0.a().a(dvs.c) && $$0.b() instanceof dxx $$1 && $$1.a(dxz.g) && $$1.d() instanceof ddo;
   }

   public dyp.b a(jv<dvv> $$0) {
      Stream<ale<dvv>> $$1 = Stream.concat($$0.f().stream(), this.b.keySet().stream()).distinct();

      record a(ale<dvv> a, dvv b) {

         ju c() {
            return new ju(Optional.empty(), dyp.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ke<dvv> $$4 = new jq<>(lq.aT, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jv<dvv> $$5 = $$4.l();
      eqa.a $$6 = b($$5);
      return new dyp.b($$5.l(), $$6);
   }

   public Map<ale<dvv>, dvv> d() {
      return this.b;
   }

   public static record b(jv<dvv> a, eqa.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public jw.b b() {
         return new jw.c(List.of(this.a)).d();
      }

      public jv<dvv> c() {
         return this.a;
      }

      public eqa.a d() {
         return this.b;
      }
   }
}
