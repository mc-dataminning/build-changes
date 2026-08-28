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

public record dyq(Map<ale<dvw>, dvw> b) {
   public static final MapCodec<dyq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(ale.a(lq.aT), dvw.a).fieldOf("dimensions").forGetter(dyq::d)).apply($$0, $$0.stable(dyq::new))
   );
   private static final Set<ale<dvw>> c = ImmutableSet.of(dvw.b, dvw.c, dvw.d);
   private static final int d = c.size();

   public dyq(Map<ale<dvw>, dvw> b) {
      dvw $$1 = b.get(dvw.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dyq(jv<dvw> $$0) {
      this($$0.h().collect(Collectors.toMap(ji.c::h, ji.c::a)));
   }

   public static Stream<ale<dvw>> a(Stream<ale<dvw>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dyq a(jw $$0, dua $$1) {
      jv<dvv> $$2 = $$0.d(lq.aE);
      Map<ale<dvw>, dvw> $$3 = a($$2, this.b, $$1);
      return new dyq($$3);
   }

   public static Map<ale<dvw>, dvw> a(jv<dvv> $$0, Map<ale<dvw>, dvw> $$1, dua $$2) {
      dvw $$3 = $$1.get(dvw.b);
      ji<dvv> $$4 = (ji<dvv>)($$3 == null ? $$0.g(dvt.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<ale<dvw>, dvw> a(Map<ale<dvw>, dvw> $$0, ji<dvv> $$1, dua $$2) {
      Builder<ale<dvw>, dvw> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dvw.b, new dvw($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dua a() {
      dvw $$0 = this.b.get(dvw.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dvw> a(ale<dvw> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<ale<dbz>> b() {
      return this.d().keySet().stream().map(lq::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dxm;
   }

   private static eqb.a b(jv<dvw> $$0) {
      return $$0.e(dvw.b).map($$0x -> {
         dua $$1 = $$0x.b();
         if ($$1 instanceof dxm) {
            return eqb.a.c;
         } else {
            return $$1 instanceof dxq ? eqb.a.b : eqb.a.a;
         }
      }).orElse(eqb.a.a);
   }

   static Lifecycle a(ale<dvw> $$0, dvw $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ale<dvw> $$0, dvw $$1) {
      if ($$0 == dvw.b) {
         return a($$1);
      } else if ($$0 == dvw.c) {
         return b($$1);
      } else {
         return $$0 == dvw.d ? c($$1) : false;
      }
   }

   private static boolean a(dvw $$0) {
      ji<dvv> $$1 = $$0.a();
      if (!$$1.a(dvt.a) && !$$1.a(dvt.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof ddl $$2 && !$$2.a(ddn.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dvw $$0) {
      return $$0.a().a(dvt.b) && $$0.b() instanceof dxy $$1 && $$1.a(dya.f) && $$1.d() instanceof ddl $$2 && $$2.a(ddn.a);
   }

   private static boolean c(dvw $$0) {
      return $$0.a().a(dvt.c) && $$0.b() instanceof dxy $$1 && $$1.a(dya.g) && $$1.d() instanceof ddp;
   }

   public dyq.b a(jv<dvw> $$0) {
      Stream<ale<dvw>> $$1 = Stream.concat($$0.f().stream(), this.b.keySet().stream()).distinct();

      record a(ale<dvw> a, dvw b) {

         ju c() {
            return new ju(Optional.empty(), dyq.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ke<dvw> $$4 = new jq<>(lq.aT, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jv<dvw> $$5 = $$4.l();
      eqb.a $$6 = b($$5);
      return new dyq.b($$5.l(), $$6);
   }

   public Map<ale<dvw>, dvw> d() {
      return this.b;
   }

   public static record b(jv<dvw> a, eqb.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public jw.b b() {
         return new jw.c(List.of(this.a)).d();
      }

      public jv<dvw> c() {
         return this.a;
      }

      public eqb.a d() {
         return this.b;
      }
   }
}
