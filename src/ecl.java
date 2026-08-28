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

public record ecl(Map<ali<dzr>, dzr> b) {
   public static final MapCodec<ecl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(ali.a(ma.bc), dzr.a).fieldOf("dimensions").forGetter(ecl::d)).apply($$0, $$0.stable(ecl::new))
   );
   private static final Set<ali<dzr>> c = ImmutableSet.of(dzr.b, dzr.c, dzr.d);
   private static final int d = c.size();

   public ecl(Map<ali<dzr>, dzr> b) {
      dzr $$1 = b.get(dzr.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public ecl(kd<dzr> $$0) {
      this($$0.c().collect(Collectors.toMap(jq.c::h, jq.c::a)));
   }

   public static Stream<ali<dzr>> a(Stream<ali<dzr>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public ecl a(js.a $$0, dxr $$1) {
      js<dzq> $$2 = $$0.d(ma.aL);
      Map<ali<dzr>, dzr> $$3 = a($$2, this.b, $$1);
      return new ecl($$3);
   }

   public static Map<ali<dzr>, dzr> a(js<dzq> $$0, Map<ali<dzr>, dzr> $$1, dxr $$2) {
      dzr $$3 = $$1.get(dzr.b);
      jq<dzq> $$4 = (jq<dzq>)($$3 == null ? $$0.b(dzo.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<ali<dzr>, dzr> a(Map<ali<dzr>, dzr> $$0, jq<dzq> $$1, dxr $$2) {
      Builder<ali<dzr>, dzr> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dzr.b, new dzr($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dxr a() {
      dzr $$0 = this.b.get(dzr.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dzr> a(ali<dzr> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<ali<dfm>> b() {
      return this.d().keySet().stream().map(ma::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof ebh;
   }

   private static euf.a b(kd<dzr> $$0) {
      return $$0.f(dzr.b).map($$0x -> {
         dxr $$1 = $$0x.b();
         if ($$1 instanceof ebh) {
            return euf.a.c;
         } else {
            return $$1 instanceof ebl ? euf.a.b : euf.a.a;
         }
      }).orElse(euf.a.a);
   }

   static Lifecycle a(ali<dzr> $$0, dzr $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ali<dzr> $$0, dzr $$1) {
      if ($$0 == dzr.b) {
         return a($$1);
      } else if ($$0 == dzr.c) {
         return b($$1);
      } else {
         return $$0 == dzr.d ? c($$1) : false;
      }
   }

   private static boolean a(dzr $$0) {
      jq<dzq> $$1 = $$0.a();
      if (!$$1.a(dzo.a) && !$$1.a(dzo.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dhb $$2 && !$$2.a(dhd.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dzr $$0) {
      return $$0.a().a(dzo.b) && $$0.b() instanceof ebt $$1 && $$1.a(ebv.f) && $$1.d() instanceof dhb $$2 && $$2.a(dhd.a);
   }

   private static boolean c(dzr $$0) {
      return $$0.a().a(dzo.c) && $$0.b() instanceof ebt $$1 && $$1.a(ebv.g) && $$1.d() instanceof dhf;
   }

   public ecl.b a(kd<dzr> $$0) {
      Stream<ali<dzr>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(ali<dzr> a, dzr b) {

         kc c() {
            return new kc(Optional.empty(), ecl.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      km<dzr> $$4 = new jy<>(ma.bc, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      kd<dzr> $$5 = $$4.n();
      euf.a $$6 = b($$5);
      return new ecl.b($$5.n(), $$6);
   }

   public Map<ali<dzr>, dzr> d() {
      return this.b;
   }

   public static record b(kd<dzr> a, euf.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public ke.b b() {
         return new ke.c(List.of(this.a)).e();
      }

      public kd<dzr> c() {
         return this.a;
      }

      public euf.a d() {
         return this.b;
      }
   }
}
