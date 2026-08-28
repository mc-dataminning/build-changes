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

public record dyk(Map<ala<dvq>, dvq> b) {
   public static final MapCodec<dyk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(ala.a(lq.aT), dvq.a).fieldOf("dimensions").forGetter(dyk::d)).apply($$0, $$0.stable(dyk::new))
   );
   private static final Set<ala<dvq>> c = ImmutableSet.of(dvq.b, dvq.c, dvq.d);
   private static final int d = c.size();

   public dyk(Map<ala<dvq>, dvq> b) {
      dvq $$1 = b.get(dvq.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dyk(jv<dvq> $$0) {
      this($$0.h().collect(Collectors.toMap(ji.c::h, ji.c::a)));
   }

   public static Stream<ala<dvq>> a(Stream<ala<dvq>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dyk a(jw $$0, dtu $$1) {
      jv<dvp> $$2 = $$0.d(lq.aE);
      Map<ala<dvq>, dvq> $$3 = a($$2, this.b, $$1);
      return new dyk($$3);
   }

   public static Map<ala<dvq>, dvq> a(jv<dvp> $$0, Map<ala<dvq>, dvq> $$1, dtu $$2) {
      dvq $$3 = $$1.get(dvq.b);
      ji<dvp> $$4 = (ji<dvp>)($$3 == null ? $$0.g(dvn.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<ala<dvq>, dvq> a(Map<ala<dvq>, dvq> $$0, ji<dvp> $$1, dtu $$2) {
      Builder<ala<dvq>, dvq> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dvq.b, new dvq($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dtu a() {
      dvq $$0 = this.b.get(dvq.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dvq> a(ala<dvq> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<ala<dbt>> b() {
      return this.d().keySet().stream().map(lq::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dxg;
   }

   private static epv.a b(jv<dvq> $$0) {
      return $$0.e(dvq.b).map($$0x -> {
         dtu $$1 = $$0x.b();
         if ($$1 instanceof dxg) {
            return epv.a.c;
         } else {
            return $$1 instanceof dxk ? epv.a.b : epv.a.a;
         }
      }).orElse(epv.a.a);
   }

   static Lifecycle a(ala<dvq> $$0, dvq $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ala<dvq> $$0, dvq $$1) {
      if ($$0 == dvq.b) {
         return a($$1);
      } else if ($$0 == dvq.c) {
         return b($$1);
      } else {
         return $$0 == dvq.d ? c($$1) : false;
      }
   }

   private static boolean a(dvq $$0) {
      ji<dvp> $$1 = $$0.a();
      if (!$$1.a(dvn.a) && !$$1.a(dvn.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof ddf $$2 && !$$2.a(ddh.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dvq $$0) {
      return $$0.a().a(dvn.b) && $$0.b() instanceof dxs $$1 && $$1.a(dxu.f) && $$1.c() instanceof ddf $$2 && $$2.a(ddh.a);
   }

   private static boolean c(dvq $$0) {
      return $$0.a().a(dvn.c) && $$0.b() instanceof dxs $$1 && $$1.a(dxu.g) && $$1.c() instanceof ddj;
   }

   public dyk.b a(jv<dvq> $$0) {
      Stream<ala<dvq>> $$1 = Stream.concat($$0.f().stream(), this.b.keySet().stream()).distinct();

      record a(ala<dvq> a, dvq b) {

         ju c() {
            return new ju(Optional.empty(), dyk.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ke<dvq> $$4 = new jq<>(lq.aT, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jv<dvq> $$5 = $$4.l();
      epv.a $$6 = b($$5);
      return new dyk.b($$5.l(), $$6);
   }

   public Map<ala<dvq>, dvq> d() {
      return this.b;
   }

   public static record b(jv<dvq> a, epv.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public jw.b b() {
         return new jw.c(List.of(this.a)).d();
      }

      public jv<dvq> c() {
         return this.a;
      }

      public epv.a d() {
         return this.b;
      }
   }
}
