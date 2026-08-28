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

public record eik(Map<alq<efo>, efo> b) {
   public static final MapCodec<eik> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(alq.a(mi.bq), efo.a).fieldOf("dimensions").forGetter(eik::d)).apply($$0, $$0.stable(eik::new))
   );
   private static final Set<alq<efo>> c = ImmutableSet.of(efo.b, efo.c, efo.d);
   private static final int d = c.size();

   public eik(Map<alq<efo>, efo> b) {
      efo $$1 = b.get(efo.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public eik(jt<efo> $$0) {
      this($$0.c().collect(Collectors.toMap(jg.c::h, jg.c::a)));
   }

   public static Stream<alq<efo>> a(Stream<alq<efo>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public eik a(ji.a $$0, edo $$1) {
      ji<efn> $$2 = $$0.e(mi.aP);
      Map<alq<efo>, efo> $$3 = a($$2, this.b, $$1);
      return new eik($$3);
   }

   public static Map<alq<efo>, efo> a(ji<efn> $$0, Map<alq<efo>, efo> $$1, edo $$2) {
      efo $$3 = $$1.get(efo.b);
      jg<efn> $$4 = (jg<efn>)($$3 == null ? $$0.b(efl.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<alq<efo>, efo> a(Map<alq<efo>, efo> $$0, jg<efn> $$1, edo $$2) {
      Builder<alq<efo>, efo> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(efo.b, new efo($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public edo a() {
      efo $$0 = this.b.get(efo.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<efo> a(alq<efo> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<alq<dkj>> b() {
      return this.d().keySet().stream().map(mi::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof ehg;
   }

   private static fal.a b(jt<efo> $$0) {
      return $$0.f(efo.b).map($$0x -> {
         edo $$1 = $$0x.b();
         if ($$1 instanceof ehg) {
            return fal.a.c;
         } else {
            return $$1 instanceof ehk ? fal.a.b : fal.a.a;
         }
      }).orElse(fal.a.a);
   }

   static Lifecycle a(alq<efo> $$0, efo $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(alq<efo> $$0, efo $$1) {
      if ($$0 == efo.b) {
         return a($$1);
      } else if ($$0 == efo.c) {
         return b($$1);
      } else {
         return $$0 == efo.d ? c($$1) : false;
      }
   }

   private static boolean a(efo $$0) {
      jg<efn> $$1 = $$0.a();
      if (!$$1.a(efl.a) && !$$1.a(efl.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dlz $$2 && !$$2.a(dmb.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(efo $$0) {
      return $$0.a().a(efl.b) && $$0.b() instanceof ehs $$1 && $$1.a(ehu.f) && $$1.d() instanceof dlz $$2 && $$2.a(dmb.a);
   }

   private static boolean c(efo $$0) {
      return $$0.a().a(efl.c) && $$0.b() instanceof ehs $$1 && $$1.a(ehu.g) && $$1.d() instanceof dmd;
   }

   public eik.b a(jt<efo> $$0) {
      Stream<alq<efo>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(alq<efo> a, efo b) {

         js c() {
            return new js(Optional.empty(), eik.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kc<efo> $$4 = new jo<>(mi.bq, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jt<efo> $$5 = $$4.n();
      fal.a $$6 = b($$5);
      return new eik.b($$5.n(), $$6);
   }

   public Map<alq<efo>, efo> d() {
      return this.b;
   }

   public static record b(jt<efo> a, fal.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public ju.b b() {
         return new ju.c(List.of(this.a)).e();
      }

      public jt<efo> c() {
         return this.a;
      }

      public fal.a d() {
         return this.b;
      }
   }
}
