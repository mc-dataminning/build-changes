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

public record dyr(Map<ale<dvx>, dvx> b) {
   public static final MapCodec<dyr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(ale.a(lq.aT), dvx.a).fieldOf("dimensions").forGetter(dyr::d)).apply($$0, $$0.stable(dyr::new))
   );
   private static final Set<ale<dvx>> c = ImmutableSet.of(dvx.b, dvx.c, dvx.d);
   private static final int d = c.size();

   public dyr(Map<ale<dvx>, dvx> b) {
      dvx $$1 = b.get(dvx.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dyr(jv<dvx> $$0) {
      this($$0.h().collect(Collectors.toMap(ji.c::h, ji.c::a)));
   }

   public static Stream<ale<dvx>> a(Stream<ale<dvx>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dyr a(jw $$0, dub $$1) {
      jv<dvw> $$2 = $$0.d(lq.aE);
      Map<ale<dvx>, dvx> $$3 = a($$2, this.b, $$1);
      return new dyr($$3);
   }

   public static Map<ale<dvx>, dvx> a(jv<dvw> $$0, Map<ale<dvx>, dvx> $$1, dub $$2) {
      dvx $$3 = $$1.get(dvx.b);
      ji<dvw> $$4 = (ji<dvw>)($$3 == null ? $$0.g(dvu.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<ale<dvx>, dvx> a(Map<ale<dvx>, dvx> $$0, ji<dvw> $$1, dub $$2) {
      Builder<ale<dvx>, dvx> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dvx.b, new dvx($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dub a() {
      dvx $$0 = this.b.get(dvx.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dvx> a(ale<dvx> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<ale<dca>> b() {
      return this.d().keySet().stream().map(lq::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dxn;
   }

   private static eqc.a b(jv<dvx> $$0) {
      return $$0.e(dvx.b).map($$0x -> {
         dub $$1 = $$0x.b();
         if ($$1 instanceof dxn) {
            return eqc.a.c;
         } else {
            return $$1 instanceof dxr ? eqc.a.b : eqc.a.a;
         }
      }).orElse(eqc.a.a);
   }

   static Lifecycle a(ale<dvx> $$0, dvx $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ale<dvx> $$0, dvx $$1) {
      if ($$0 == dvx.b) {
         return a($$1);
      } else if ($$0 == dvx.c) {
         return b($$1);
      } else {
         return $$0 == dvx.d ? c($$1) : false;
      }
   }

   private static boolean a(dvx $$0) {
      ji<dvw> $$1 = $$0.a();
      if (!$$1.a(dvu.a) && !$$1.a(dvu.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof ddm $$2 && !$$2.a(ddo.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dvx $$0) {
      return $$0.a().a(dvu.b) && $$0.b() instanceof dxz $$1 && $$1.a(dyb.f) && $$1.d() instanceof ddm $$2 && $$2.a(ddo.a);
   }

   private static boolean c(dvx $$0) {
      return $$0.a().a(dvu.c) && $$0.b() instanceof dxz $$1 && $$1.a(dyb.g) && $$1.d() instanceof ddq;
   }

   public dyr.b a(jv<dvx> $$0) {
      Stream<ale<dvx>> $$1 = Stream.concat($$0.f().stream(), this.b.keySet().stream()).distinct();

      record a(ale<dvx> a, dvx b) {

         ju c() {
            return new ju(Optional.empty(), dyr.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ke<dvx> $$4 = new jq<>(lq.aT, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jv<dvx> $$5 = $$4.l();
      eqc.a $$6 = b($$5);
      return new dyr.b($$5.l(), $$6);
   }

   public Map<ale<dvx>, dvx> d() {
      return this.b;
   }

   public static record b(jv<dvx> a, eqc.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public jw.b b() {
         return new jw.c(List.of(this.a)).d();
      }

      public jv<dvx> c() {
         return this.a;
      }

      public eqc.a d() {
         return this.b;
      }
   }
}
