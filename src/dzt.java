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

public record dzt(Map<akq<dwz>, dwz> b) {
   public static final MapCodec<dzt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(akq.a(lu.bb), dwz.a).fieldOf("dimensions").forGetter(dzt::d)).apply($$0, $$0.stable(dzt::new))
   );
   private static final Set<akq<dwz>> c = ImmutableSet.of(dwz.b, dwz.c, dwz.d);
   private static final int d = c.size();

   public dzt(Map<akq<dwz>, dwz> b) {
      dwz $$1 = b.get(dwz.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dzt(jz<dwz> $$0) {
      this($$0.i().collect(Collectors.toMap(jm.c::h, jm.c::a)));
   }

   public static Stream<akq<dwz>> a(Stream<akq<dwz>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dzt a(ka $$0, duz $$1) {
      jz<dwy> $$2 = $$0.d(lu.aK);
      Map<akq<dwz>, dwz> $$3 = a($$2, this.b, $$1);
      return new dzt($$3);
   }

   public static Map<akq<dwz>, dwz> a(jz<dwy> $$0, Map<akq<dwz>, dwz> $$1, duz $$2) {
      dwz $$3 = $$1.get(dwz.b);
      jm<dwy> $$4 = (jm<dwy>)($$3 == null ? $$0.g(dww.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<akq<dwz>, dwz> a(Map<akq<dwz>, dwz> $$0, jm<dwy> $$1, duz $$2) {
      Builder<akq<dwz>, dwz> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dwz.b, new dwz($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public duz a() {
      dwz $$0 = this.b.get(dwz.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dwz> a(akq<dwz> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<akq<dcw>> b() {
      return this.d().keySet().stream().map(lu::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dyp;
   }

   private static erh.a b(jz<dwz> $$0) {
      return $$0.e(dwz.b).map($$0x -> {
         duz $$1 = $$0x.b();
         if ($$1 instanceof dyp) {
            return erh.a.c;
         } else {
            return $$1 instanceof dyt ? erh.a.b : erh.a.a;
         }
      }).orElse(erh.a.a);
   }

   static Lifecycle a(akq<dwz> $$0, dwz $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(akq<dwz> $$0, dwz $$1) {
      if ($$0 == dwz.b) {
         return a($$1);
      } else if ($$0 == dwz.c) {
         return b($$1);
      } else {
         return $$0 == dwz.d ? c($$1) : false;
      }
   }

   private static boolean a(dwz $$0) {
      jm<dwy> $$1 = $$0.a();
      if (!$$1.a(dww.a) && !$$1.a(dww.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dej $$2 && !$$2.a(del.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dwz $$0) {
      return $$0.a().a(dww.b) && $$0.b() instanceof dzb $$1 && $$1.a(dzd.f) && $$1.d() instanceof dej $$2 && $$2.a(del.a);
   }

   private static boolean c(dwz $$0) {
      return $$0.a().a(dww.c) && $$0.b() instanceof dzb $$1 && $$1.a(dzd.g) && $$1.d() instanceof den;
   }

   public dzt.b a(jz<dwz> $$0) {
      Stream<akq<dwz>> $$1 = Stream.concat($$0.g().stream(), this.b.keySet().stream()).distinct();

      record a(akq<dwz> a, dwz b) {

         jy c() {
            return new jy(Optional.empty(), dzt.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ki<dwz> $$4 = new ju<>(lu.bb, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jz<dwz> $$5 = $$4.m();
      erh.a $$6 = b($$5);
      return new dzt.b($$5.m(), $$6);
   }

   public Map<akq<dwz>, dwz> d() {
      return this.b;
   }

   public static record b(jz<dwz> a, erh.a b) {
      public Lifecycle a() {
         return this.a.e();
      }

      public ka.b b() {
         return new ka.c(List.of(this.a)).d();
      }

      public jz<dwz> c() {
         return this.a;
      }

      public erh.a d() {
         return this.b;
      }
   }
}
