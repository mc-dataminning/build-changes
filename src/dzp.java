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

public record dzp(Map<aks<dwv>, dwv> b) {
   public static final MapCodec<dzp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(aks.a(li.aT), dwv.a).fieldOf("dimensions").forGetter(dzp::d)).apply($$0, $$0.stable(dzp::new))
   );
   private static final Set<aks<dwv>> c = ImmutableSet.of(dwv.b, dwv.c, dwv.d, dwv.e);
   private static final int d = c.size();

   public dzp(Map<aks<dwv>, dwv> b) {
      dwv $$1 = b.get(dwv.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dzp(jn<dwv> $$0) {
      this($$0.h().collect(Collectors.toMap(ja.c::h, ja.c::a)));
   }

   public static Stream<aks<dwv>> a(Stream<aks<dwv>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dzp a(jo $$0, duz $$1) {
      jn<dwu> $$2 = $$0.d(li.aE);
      Map<aks<dwv>, dwv> $$3 = a($$2, this.b, $$1);
      return new dzp($$3);
   }

   public static Map<aks<dwv>, dwv> a(jn<dwu> $$0, Map<aks<dwv>, dwv> $$1, duz $$2) {
      dwv $$3 = $$1.get(dwv.b);
      ja<dwu> $$4 = (ja<dwu>)($$3 == null ? $$0.g(dws.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<aks<dwv>, dwv> a(Map<aks<dwv>, dwv> $$0, ja<dwu> $$1, duz $$2) {
      Builder<aks<dwv>, dwv> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dwv.b, new dwv($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public duz a() {
      dwv $$0 = this.b.get(dwv.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dwv> a(aks<dwv> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<aks<dca>> b() {
      return this.d().keySet().stream().map(li::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dyl;
   }

   private static erj.a b(jn<dwv> $$0) {
      return $$0.e(dwv.b).map($$0x -> {
         duz $$1 = $$0x.b();
         if ($$1 instanceof dyl) {
            return erj.a.c;
         } else {
            return $$1 instanceof dyp ? erj.a.b : erj.a.a;
         }
      }).orElse(erj.a.a);
   }

   static Lifecycle a(aks<dwv> $$0, dwv $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aks<dwv> $$0, dwv $$1) {
      if ($$0 == dwv.b) {
         return a($$1);
      } else if ($$0 == dwv.c) {
         return b($$1);
      } else if ($$0 == dwv.d) {
         return c($$1);
      } else {
         return $$0 == dwv.e ? d($$1) : false;
      }
   }

   private static boolean a(dwv $$0) {
      ja<dwu> $$1 = $$0.a();
      if (!$$1.a(dws.a) && !$$1.a(dws.e)) {
         return false;
      } else {
         if ($$0.b().c() instanceof ddm $$2 && !$$2.a(ddo.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dwv $$0) {
      return $$0.a().a(dws.b) && $$0.b() instanceof dyx $$1 && $$1.a(dyz.f) && $$1.c() instanceof ddm $$2 && $$2.a(ddo.a);
   }

   private static boolean c(dwv $$0) {
      return $$0.a().a(dws.c) && $$0.b() instanceof dyx $$1 && $$1.a(dyz.g) && $$1.c() instanceof ddq;
   }

   private static boolean d(dwv $$0) {
      return $$0.a().a(dws.d) && $$0.b() instanceof dyx $$1 && $$1.a(dyz.j) && $$1.c() instanceof ddm $$2 && $$2.a(ddo.c);
   }

   public dzp.b a(jn<dwv> $$0) {
      Stream<aks<dwv>> $$1 = Stream.concat($$0.f().stream(), this.b.keySet().stream()).distinct();

      record a(aks<dwv> a, dwv b) {

         jm c() {
            return new jm(Optional.empty(), dzp.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      jw<dwv> $$4 = new ji<>(li.aT, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jn<dwv> $$5 = $$4.l();
      erj.a $$6 = b($$5);
      return new dzp.b($$5.l(), $$6);
   }

   public Map<aks<dwv>, dwv> d() {
      return this.b;
   }

   public static record b(jn<dwv> a, erj.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public jo.b b() {
         return new jo.c(List.of(this.a)).d();
      }

      public jn<dwv> c() {
         return this.a;
      }

      public erj.a d() {
         return this.b;
      }
   }
}
