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

public record edm(Map<aku<eas>, eas> b) {
   public static final MapCodec<edm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(aku.a(mc.bf), eas.a).fieldOf("dimensions").forGetter(edm::d)).apply($$0, $$0.stable(edm::new))
   );
   private static final Set<aku<eas>> c = ImmutableSet.of(eas.b, eas.c, eas.d);
   private static final int d = c.size();

   public edm(Map<aku<eas>, eas> b) {
      eas $$1 = b.get(eas.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public edm(ke<eas> $$0) {
      this($$0.c().collect(Collectors.toMap(jr.c::h, jr.c::a)));
   }

   public static Stream<aku<eas>> a(Stream<aku<eas>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public edm a(jt.a $$0, dys $$1) {
      jt<ear> $$2 = $$0.d(mc.aN);
      Map<aku<eas>, eas> $$3 = a($$2, this.b, $$1);
      return new edm($$3);
   }

   public static Map<aku<eas>, eas> a(jt<ear> $$0, Map<aku<eas>, eas> $$1, dys $$2) {
      eas $$3 = $$1.get(eas.b);
      jr<ear> $$4 = (jr<ear>)($$3 == null ? $$0.b(eap.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<aku<eas>, eas> a(Map<aku<eas>, eas> $$0, jr<ear> $$1, dys $$2) {
      Builder<aku<eas>, eas> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(eas.b, new eas($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dys a() {
      eas $$0 = this.b.get(eas.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<eas> a(aku<eas> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<aku<dgh>> b() {
      return this.d().keySet().stream().map(mc::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof eci;
   }

   private static evi.a b(ke<eas> $$0) {
      return $$0.f(eas.b).map($$0x -> {
         dys $$1 = $$0x.b();
         if ($$1 instanceof eci) {
            return evi.a.c;
         } else {
            return $$1 instanceof ecm ? evi.a.b : evi.a.a;
         }
      }).orElse(evi.a.a);
   }

   static Lifecycle a(aku<eas> $$0, eas $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aku<eas> $$0, eas $$1) {
      if ($$0 == eas.b) {
         return a($$1);
      } else if ($$0 == eas.c) {
         return b($$1);
      } else {
         return $$0 == eas.d ? c($$1) : false;
      }
   }

   private static boolean a(eas $$0) {
      jr<ear> $$1 = $$0.a();
      if (!$$1.a(eap.a) && !$$1.a(eap.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dhw $$2 && !$$2.a(dhy.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(eas $$0) {
      return $$0.a().a(eap.b) && $$0.b() instanceof ecu $$1 && $$1.a(ecw.f) && $$1.d() instanceof dhw $$2 && $$2.a(dhy.a);
   }

   private static boolean c(eas $$0) {
      return $$0.a().a(eap.c) && $$0.b() instanceof ecu $$1 && $$1.a(ecw.g) && $$1.d() instanceof dia;
   }

   public edm.b a(ke<eas> $$0) {
      Stream<aku<eas>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(aku<eas> a, eas b) {

         kd c() {
            return new kd(Optional.empty(), edm.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kn<eas> $$4 = new jz<>(mc.bf, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      ke<eas> $$5 = $$4.n();
      evi.a $$6 = b($$5);
      return new edm.b($$5.n(), $$6);
   }

   public Map<aku<eas>, eas> d() {
      return this.b;
   }

   public static record b(ke<eas> a, evi.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public kf.b b() {
         return new kf.c(List.of(this.a)).e();
      }

      public ke<eas> c() {
         return this.a;
      }

      public evi.a d() {
         return this.b;
      }
   }
}
