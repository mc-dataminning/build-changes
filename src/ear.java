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

public record ear(Map<ala<dxx>, dxx> b) {
   public static final MapCodec<ear> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(ala.a(lv.bb), dxx.a).fieldOf("dimensions").forGetter(ear::d)).apply($$0, $$0.stable(ear::new))
   );
   private static final Set<ala<dxx>> c = ImmutableSet.of(dxx.b, dxx.c, dxx.d);
   private static final int d = c.size();

   public ear(Map<ala<dxx>, dxx> b) {
      dxx $$1 = b.get(dxx.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public ear(ka<dxx> $$0) {
      this($$0.i().collect(Collectors.toMap(jn.c::h, jn.c::a)));
   }

   public static Stream<ala<dxx>> a(Stream<ala<dxx>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public ear a(jp.a $$0, dvx $$1) {
      jp<dxw> $$2 = $$0.b(lv.aK);
      Map<ala<dxx>, dxx> $$3 = a($$2, this.b, $$1);
      return new ear($$3);
   }

   public static Map<ala<dxx>, dxx> a(jp<dxw> $$0, Map<ala<dxx>, dxx> $$1, dvx $$2) {
      dxx $$3 = $$1.get(dxx.b);
      jn<dxw> $$4 = (jn<dxw>)($$3 == null ? $$0.b(dxu.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<ala<dxx>, dxx> a(Map<ala<dxx>, dxx> $$0, jn<dxw> $$1, dvx $$2) {
      Builder<ala<dxx>, dxx> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dxx.b, new dxx($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dvx a() {
      dxx $$0 = this.b.get(dxx.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dxx> a(ala<dxx> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<ala<dds>> b() {
      return this.d().keySet().stream().map(lv::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dzn;
   }

   private static esl.a b(ka<dxx> $$0) {
      return $$0.e(dxx.b).map($$0x -> {
         dvx $$1 = $$0x.b();
         if ($$1 instanceof dzn) {
            return esl.a.c;
         } else {
            return $$1 instanceof dzr ? esl.a.b : esl.a.a;
         }
      }).orElse(esl.a.a);
   }

   static Lifecycle a(ala<dxx> $$0, dxx $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ala<dxx> $$0, dxx $$1) {
      if ($$0 == dxx.b) {
         return a($$1);
      } else if ($$0 == dxx.c) {
         return b($$1);
      } else {
         return $$0 == dxx.d ? c($$1) : false;
      }
   }

   private static boolean a(dxx $$0) {
      jn<dxw> $$1 = $$0.a();
      if (!$$1.a(dxu.a) && !$$1.a(dxu.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dfg $$2 && !$$2.a(dfi.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dxx $$0) {
      return $$0.a().a(dxu.b) && $$0.b() instanceof dzz $$1 && $$1.a(eab.f) && $$1.d() instanceof dfg $$2 && $$2.a(dfi.a);
   }

   private static boolean c(dxx $$0) {
      return $$0.a().a(dxu.c) && $$0.b() instanceof dzz $$1 && $$1.a(eab.g) && $$1.d() instanceof dfk;
   }

   public ear.b a(ka<dxx> $$0) {
      Stream<ala<dxx>> $$1 = Stream.concat($$0.g().stream(), this.b.keySet().stream()).distinct();

      record a(ala<dxx> a, dxx b) {

         jz c() {
            return new jz(Optional.empty(), ear.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kj<dxx> $$4 = new jv<>(lv.bb, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      ka<dxx> $$5 = $$4.l();
      esl.a $$6 = b($$5);
      return new ear.b($$5.l(), $$6);
   }

   public Map<ala<dxx>, dxx> d() {
      return this.b;
   }

   public static record b(ka<dxx> a, esl.a b) {
      public Lifecycle a() {
         return this.a.e();
      }

      public kb.b b() {
         return new kb.c(List.of(this.a)).f();
      }

      public ka<dxx> c() {
         return this.a;
      }

      public esl.a d() {
         return this.b;
      }
   }
}
