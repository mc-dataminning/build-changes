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

public record dyo(Map<ald<dvu>, dvu> b) {
   public static final MapCodec<dyo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(ald.a(lq.aT), dvu.a).fieldOf("dimensions").forGetter(dyo::d)).apply($$0, $$0.stable(dyo::new))
   );
   private static final Set<ald<dvu>> c = ImmutableSet.of(dvu.b, dvu.c, dvu.d);
   private static final int d = c.size();

   public dyo(Map<ald<dvu>, dvu> b) {
      dvu $$1 = b.get(dvu.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dyo(jv<dvu> $$0) {
      this($$0.h().collect(Collectors.toMap(ji.c::h, ji.c::a)));
   }

   public static Stream<ald<dvu>> a(Stream<ald<dvu>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dyo a(jw $$0, dty $$1) {
      jv<dvt> $$2 = $$0.d(lq.aE);
      Map<ald<dvu>, dvu> $$3 = a($$2, this.b, $$1);
      return new dyo($$3);
   }

   public static Map<ald<dvu>, dvu> a(jv<dvt> $$0, Map<ald<dvu>, dvu> $$1, dty $$2) {
      dvu $$3 = $$1.get(dvu.b);
      ji<dvt> $$4 = (ji<dvt>)($$3 == null ? $$0.g(dvr.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<ald<dvu>, dvu> a(Map<ald<dvu>, dvu> $$0, ji<dvt> $$1, dty $$2) {
      Builder<ald<dvu>, dvu> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dvu.b, new dvu($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dty a() {
      dvu $$0 = this.b.get(dvu.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dvu> a(ald<dvu> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<ald<dbx>> b() {
      return this.d().keySet().stream().map(lq::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dxk;
   }

   private static epz.a b(jv<dvu> $$0) {
      return $$0.e(dvu.b).map($$0x -> {
         dty $$1 = $$0x.b();
         if ($$1 instanceof dxk) {
            return epz.a.c;
         } else {
            return $$1 instanceof dxo ? epz.a.b : epz.a.a;
         }
      }).orElse(epz.a.a);
   }

   static Lifecycle a(ald<dvu> $$0, dvu $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ald<dvu> $$0, dvu $$1) {
      if ($$0 == dvu.b) {
         return a($$1);
      } else if ($$0 == dvu.c) {
         return b($$1);
      } else {
         return $$0 == dvu.d ? c($$1) : false;
      }
   }

   private static boolean a(dvu $$0) {
      ji<dvt> $$1 = $$0.a();
      if (!$$1.a(dvr.a) && !$$1.a(dvr.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof ddj $$2 && !$$2.a(ddl.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dvu $$0) {
      return $$0.a().a(dvr.b) && $$0.b() instanceof dxw $$1 && $$1.a(dxy.f) && $$1.d() instanceof ddj $$2 && $$2.a(ddl.a);
   }

   private static boolean c(dvu $$0) {
      return $$0.a().a(dvr.c) && $$0.b() instanceof dxw $$1 && $$1.a(dxy.g) && $$1.d() instanceof ddn;
   }

   public dyo.b a(jv<dvu> $$0) {
      Stream<ald<dvu>> $$1 = Stream.concat($$0.f().stream(), this.b.keySet().stream()).distinct();

      record a(ald<dvu> a, dvu b) {

         ju c() {
            return new ju(Optional.empty(), dyo.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ke<dvu> $$4 = new jq<>(lq.aT, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jv<dvu> $$5 = $$4.l();
      epz.a $$6 = b($$5);
      return new dyo.b($$5.l(), $$6);
   }

   public Map<ald<dvu>, dvu> d() {
      return this.b;
   }

   public static record b(jv<dvu> a, epz.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public jw.b b() {
         return new jw.c(List.of(this.a)).d();
      }

      public jv<dvu> c() {
         return this.a;
      }

      public epz.a d() {
         return this.b;
      }
   }
}
