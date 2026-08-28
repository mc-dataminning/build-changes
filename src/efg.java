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

public record efg(Map<alc<eck>, eck> b) {
   public static final MapCodec<efg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(alc.a(me.bm), eck.a).fieldOf("dimensions").forGetter(efg::d)).apply($$0, $$0.stable(efg::new))
   );
   private static final Set<alc<eck>> c = ImmutableSet.of(eck.b, eck.c, eck.d);
   private static final int d = c.size();

   public efg(Map<alc<eck>, eck> b) {
      eck $$1 = b.get(eck.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public efg(kf<eck> $$0) {
      this($$0.c().collect(Collectors.toMap(js.c::h, js.c::a)));
   }

   public static Stream<alc<eck>> a(Stream<alc<eck>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public efg a(ju.a $$0, eak $$1) {
      ju<ecj> $$2 = $$0.e(me.aR);
      Map<alc<eck>, eck> $$3 = a($$2, this.b, $$1);
      return new efg($$3);
   }

   public static Map<alc<eck>, eck> a(ju<ecj> $$0, Map<alc<eck>, eck> $$1, eak $$2) {
      eck $$3 = $$1.get(eck.b);
      js<ecj> $$4 = (js<ecj>)($$3 == null ? $$0.b(ech.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<alc<eck>, eck> a(Map<alc<eck>, eck> $$0, js<ecj> $$1, eak $$2) {
      Builder<alc<eck>, eck> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(eck.b, new eck($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public eak a() {
      eck $$0 = this.b.get(eck.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<eck> a(alc<eck> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<alc<dhp>> b() {
      return this.d().keySet().stream().map(me::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof eec;
   }

   private static exd.a b(kf<eck> $$0) {
      return $$0.f(eck.b).map($$0x -> {
         eak $$1 = $$0x.b();
         if ($$1 instanceof eec) {
            return exd.a.c;
         } else {
            return $$1 instanceof eeg ? exd.a.b : exd.a.a;
         }
      }).orElse(exd.a.a);
   }

   static Lifecycle a(alc<eck> $$0, eck $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(alc<eck> $$0, eck $$1) {
      if ($$0 == eck.b) {
         return a($$1);
      } else if ($$0 == eck.c) {
         return b($$1);
      } else {
         return $$0 == eck.d ? c($$1) : false;
      }
   }

   private static boolean a(eck $$0) {
      js<ecj> $$1 = $$0.a();
      if (!$$1.a(ech.a) && !$$1.a(ech.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof djf $$2 && !$$2.a(djh.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(eck $$0) {
      return $$0.a().a(ech.b) && $$0.b() instanceof eeo $$1 && $$1.a(eeq.f) && $$1.d() instanceof djf $$2 && $$2.a(djh.a);
   }

   private static boolean c(eck $$0) {
      return $$0.a().a(ech.c) && $$0.b() instanceof eeo $$1 && $$1.a(eeq.g) && $$1.d() instanceof djj;
   }

   public efg.b a(kf<eck> $$0) {
      Stream<alc<eck>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(alc<eck> a, eck b) {

         ke c() {
            return new ke(Optional.empty(), efg.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ko<eck> $$4 = new ka<>(me.bm, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      kf<eck> $$5 = $$4.n();
      exd.a $$6 = b($$5);
      return new efg.b($$5.n(), $$6);
   }

   public Map<alc<eck>, eck> d() {
      return this.b;
   }

   public static record b(kf<eck> a, exd.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public kg.b b() {
         return new kg.c(List.of(this.a)).e();
      }

      public kf<eck> c() {
         return this.a;
      }

      public exd.a d() {
         return this.b;
      }
   }
}
