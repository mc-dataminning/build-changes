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

public record edn(Map<aku<eat>, eat> b) {
   public static final MapCodec<edn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(aku.a(mc.bf), eat.a).fieldOf("dimensions").forGetter(edn::d)).apply($$0, $$0.stable(edn::new))
   );
   private static final Set<aku<eat>> c = ImmutableSet.of(eat.b, eat.c, eat.d);
   private static final int d = c.size();

   public edn(Map<aku<eat>, eat> b) {
      eat $$1 = b.get(eat.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public edn(ke<eat> $$0) {
      this($$0.c().collect(Collectors.toMap(jr.c::h, jr.c::a)));
   }

   public static Stream<aku<eat>> a(Stream<aku<eat>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public edn a(jt.a $$0, dyt $$1) {
      jt<eas> $$2 = $$0.d(mc.aN);
      Map<aku<eat>, eat> $$3 = a($$2, this.b, $$1);
      return new edn($$3);
   }

   public static Map<aku<eat>, eat> a(jt<eas> $$0, Map<aku<eat>, eat> $$1, dyt $$2) {
      eat $$3 = $$1.get(eat.b);
      jr<eas> $$4 = (jr<eas>)($$3 == null ? $$0.b(eaq.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<aku<eat>, eat> a(Map<aku<eat>, eat> $$0, jr<eas> $$1, dyt $$2) {
      Builder<aku<eat>, eat> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(eat.b, new eat($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dyt a() {
      eat $$0 = this.b.get(eat.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<eat> a(aku<eat> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<aku<dgi>> b() {
      return this.d().keySet().stream().map(mc::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof ecj;
   }

   private static evj.a b(ke<eat> $$0) {
      return $$0.f(eat.b).map($$0x -> {
         dyt $$1 = $$0x.b();
         if ($$1 instanceof ecj) {
            return evj.a.c;
         } else {
            return $$1 instanceof ecn ? evj.a.b : evj.a.a;
         }
      }).orElse(evj.a.a);
   }

   static Lifecycle a(aku<eat> $$0, eat $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aku<eat> $$0, eat $$1) {
      if ($$0 == eat.b) {
         return a($$1);
      } else if ($$0 == eat.c) {
         return b($$1);
      } else {
         return $$0 == eat.d ? c($$1) : false;
      }
   }

   private static boolean a(eat $$0) {
      jr<eas> $$1 = $$0.a();
      if (!$$1.a(eaq.a) && !$$1.a(eaq.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dhx $$2 && !$$2.a(dhz.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(eat $$0) {
      return $$0.a().a(eaq.b) && $$0.b() instanceof ecv $$1 && $$1.a(ecx.f) && $$1.d() instanceof dhx $$2 && $$2.a(dhz.a);
   }

   private static boolean c(eat $$0) {
      return $$0.a().a(eaq.c) && $$0.b() instanceof ecv $$1 && $$1.a(ecx.g) && $$1.d() instanceof dib;
   }

   public edn.b a(ke<eat> $$0) {
      Stream<aku<eat>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(aku<eat> a, eat b) {

         kd c() {
            return new kd(Optional.empty(), edn.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kn<eat> $$4 = new jz<>(mc.bf, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      ke<eat> $$5 = $$4.n();
      evj.a $$6 = b($$5);
      return new edn.b($$5.n(), $$6);
   }

   public Map<aku<eat>, eat> d() {
      return this.b;
   }

   public static record b(ke<eat> a, evj.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public kf.b b() {
         return new kf.c(List.of(this.a)).e();
      }

      public ke<eat> c() {
         return this.a;
      }

      public evj.a d() {
         return this.b;
      }
   }
}
