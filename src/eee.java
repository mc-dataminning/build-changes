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

public record eee(Map<alo<ebk>, ebk> b) {
   public static final MapCodec<eee> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(alo.a(mb.bf), ebk.a).fieldOf("dimensions").forGetter(eee::d)).apply($$0, $$0.stable(eee::new))
   );
   private static final Set<alo<ebk>> c = ImmutableSet.of(ebk.b, ebk.c, ebk.d);
   private static final int d = c.size();

   public eee(Map<alo<ebk>, ebk> b) {
      ebk $$1 = b.get(ebk.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public eee(kd<ebk> $$0) {
      this($$0.c().collect(Collectors.toMap(jq.c::h, jq.c::a)));
   }

   public static Stream<alo<ebk>> a(Stream<alo<ebk>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public eee a(js.a $$0, dzk $$1) {
      js<ebj> $$2 = $$0.d(mb.aN);
      Map<alo<ebk>, ebk> $$3 = a($$2, this.b, $$1);
      return new eee($$3);
   }

   public static Map<alo<ebk>, ebk> a(js<ebj> $$0, Map<alo<ebk>, ebk> $$1, dzk $$2) {
      ebk $$3 = $$1.get(ebk.b);
      jq<ebj> $$4 = (jq<ebj>)($$3 == null ? $$0.b(ebh.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<alo<ebk>, ebk> a(Map<alo<ebk>, ebk> $$0, jq<ebj> $$1, dzk $$2) {
      Builder<alo<ebk>, ebk> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(ebk.b, new ebk($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dzk a() {
      ebk $$0 = this.b.get(ebk.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<ebk> a(alo<ebk> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<alo<dgz>> b() {
      return this.d().keySet().stream().map(mb::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof eda;
   }

   private static ewa.a b(kd<ebk> $$0) {
      return $$0.f(ebk.b).map($$0x -> {
         dzk $$1 = $$0x.b();
         if ($$1 instanceof eda) {
            return ewa.a.c;
         } else {
            return $$1 instanceof ede ? ewa.a.b : ewa.a.a;
         }
      }).orElse(ewa.a.a);
   }

   static Lifecycle a(alo<ebk> $$0, ebk $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(alo<ebk> $$0, ebk $$1) {
      if ($$0 == ebk.b) {
         return a($$1);
      } else if ($$0 == ebk.c) {
         return b($$1);
      } else {
         return $$0 == ebk.d ? c($$1) : false;
      }
   }

   private static boolean a(ebk $$0) {
      jq<ebj> $$1 = $$0.a();
      if (!$$1.a(ebh.a) && !$$1.a(ebh.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dio $$2 && !$$2.a(diq.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(ebk $$0) {
      return $$0.a().a(ebh.b) && $$0.b() instanceof edm $$1 && $$1.a(edo.f) && $$1.d() instanceof dio $$2 && $$2.a(diq.a);
   }

   private static boolean c(ebk $$0) {
      return $$0.a().a(ebh.c) && $$0.b() instanceof edm $$1 && $$1.a(edo.g) && $$1.d() instanceof dis;
   }

   public eee.b a(kd<ebk> $$0) {
      Stream<alo<ebk>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(alo<ebk> a, ebk b) {

         kc c() {
            return new kc(Optional.empty(), eee.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      km<ebk> $$4 = new jy<>(mb.bf, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      kd<ebk> $$5 = $$4.n();
      ewa.a $$6 = b($$5);
      return new eee.b($$5.n(), $$6);
   }

   public Map<alo<ebk>, ebk> d() {
      return this.b;
   }

   public static record b(kd<ebk> a, ewa.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public ke.b b() {
         return new ke.c(List.of(this.a)).e();
      }

      public kd<ebk> c() {
         return this.a;
      }

      public ewa.a d() {
         return this.b;
      }
   }
}
