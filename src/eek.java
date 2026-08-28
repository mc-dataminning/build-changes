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

public record eek(Map<aly<ebq>, ebq> b) {
   public static final MapCodec<eek> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(aly.a(mb.bf), ebq.a).fieldOf("dimensions").forGetter(eek::d)).apply($$0, $$0.stable(eek::new))
   );
   private static final Set<aly<ebq>> c = ImmutableSet.of(ebq.b, ebq.c, ebq.d);
   private static final int d = c.size();

   public eek(Map<aly<ebq>, ebq> b) {
      ebq $$1 = b.get(ebq.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public eek(kd<ebq> $$0) {
      this($$0.c().collect(Collectors.toMap(jq.c::h, jq.c::a)));
   }

   public static Stream<aly<ebq>> a(Stream<aly<ebq>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public eek a(js.a $$0, dzq $$1) {
      js<ebp> $$2 = $$0.d(mb.aN);
      Map<aly<ebq>, ebq> $$3 = a($$2, this.b, $$1);
      return new eek($$3);
   }

   public static Map<aly<ebq>, ebq> a(js<ebp> $$0, Map<aly<ebq>, ebq> $$1, dzq $$2) {
      ebq $$3 = $$1.get(ebq.b);
      jq<ebp> $$4 = (jq<ebp>)($$3 == null ? $$0.b(ebn.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<aly<ebq>, ebq> a(Map<aly<ebq>, ebq> $$0, jq<ebp> $$1, dzq $$2) {
      Builder<aly<ebq>, ebq> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(ebq.b, new ebq($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dzq a() {
      ebq $$0 = this.b.get(ebq.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<ebq> a(aly<ebq> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<aly<dhh>> b() {
      return this.d().keySet().stream().map(mb::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof edg;
   }

   private static ewg.a b(kd<ebq> $$0) {
      return $$0.f(ebq.b).map($$0x -> {
         dzq $$1 = $$0x.b();
         if ($$1 instanceof edg) {
            return ewg.a.c;
         } else {
            return $$1 instanceof edk ? ewg.a.b : ewg.a.a;
         }
      }).orElse(ewg.a.a);
   }

   static Lifecycle a(aly<ebq> $$0, ebq $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aly<ebq> $$0, ebq $$1) {
      if ($$0 == ebq.b) {
         return a($$1);
      } else if ($$0 == ebq.c) {
         return b($$1);
      } else {
         return $$0 == ebq.d ? c($$1) : false;
      }
   }

   private static boolean a(ebq $$0) {
      jq<ebp> $$1 = $$0.a();
      if (!$$1.a(ebn.a) && !$$1.a(ebn.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof diw $$2 && !$$2.a(diy.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(ebq $$0) {
      return $$0.a().a(ebn.b) && $$0.b() instanceof eds $$1 && $$1.a(edu.f) && $$1.d() instanceof diw $$2 && $$2.a(diy.a);
   }

   private static boolean c(ebq $$0) {
      return $$0.a().a(ebn.c) && $$0.b() instanceof eds $$1 && $$1.a(edu.g) && $$1.d() instanceof dja;
   }

   public eek.b a(kd<ebq> $$0) {
      Stream<aly<ebq>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(aly<ebq> a, ebq b) {

         kc c() {
            return new kc(Optional.empty(), eek.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      km<ebq> $$4 = new jy<>(mb.bf, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      kd<ebq> $$5 = $$4.n();
      ewg.a $$6 = b($$5);
      return new eek.b($$5.n(), $$6);
   }

   public Map<aly<ebq>, ebq> d() {
      return this.b;
   }

   public static record b(kd<ebq> a, ewg.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public ke.b b() {
         return new ke.c(List.of(this.a)).e();
      }

      public kd<ebq> c() {
         return this.a;
      }

      public ewg.a d() {
         return this.b;
      }
   }
}
