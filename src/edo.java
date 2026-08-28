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

public record edo(Map<aku<eau>, eau> b) {
   public static final MapCodec<edo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(aku.a(mc.bf), eau.a).fieldOf("dimensions").forGetter(edo::d)).apply($$0, $$0.stable(edo::new))
   );
   private static final Set<aku<eau>> c = ImmutableSet.of(eau.b, eau.c, eau.d);
   private static final int d = c.size();

   public edo(Map<aku<eau>, eau> b) {
      eau $$1 = b.get(eau.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public edo(ke<eau> $$0) {
      this($$0.c().collect(Collectors.toMap(jr.c::h, jr.c::a)));
   }

   public static Stream<aku<eau>> a(Stream<aku<eau>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public edo a(jt.a $$0, dyu $$1) {
      jt<eat> $$2 = $$0.d(mc.aN);
      Map<aku<eau>, eau> $$3 = a($$2, this.b, $$1);
      return new edo($$3);
   }

   public static Map<aku<eau>, eau> a(jt<eat> $$0, Map<aku<eau>, eau> $$1, dyu $$2) {
      eau $$3 = $$1.get(eau.b);
      jr<eat> $$4 = (jr<eat>)($$3 == null ? $$0.b(ear.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<aku<eau>, eau> a(Map<aku<eau>, eau> $$0, jr<eat> $$1, dyu $$2) {
      Builder<aku<eau>, eau> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(eau.b, new eau($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dyu a() {
      eau $$0 = this.b.get(eau.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<eau> a(aku<eau> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<aku<dgj>> b() {
      return this.d().keySet().stream().map(mc::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof eck;
   }

   private static evk.a b(ke<eau> $$0) {
      return $$0.f(eau.b).map($$0x -> {
         dyu $$1 = $$0x.b();
         if ($$1 instanceof eck) {
            return evk.a.c;
         } else {
            return $$1 instanceof eco ? evk.a.b : evk.a.a;
         }
      }).orElse(evk.a.a);
   }

   static Lifecycle a(aku<eau> $$0, eau $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aku<eau> $$0, eau $$1) {
      if ($$0 == eau.b) {
         return a($$1);
      } else if ($$0 == eau.c) {
         return b($$1);
      } else {
         return $$0 == eau.d ? c($$1) : false;
      }
   }

   private static boolean a(eau $$0) {
      jr<eat> $$1 = $$0.a();
      if (!$$1.a(ear.a) && !$$1.a(ear.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dhy $$2 && !$$2.a(dia.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(eau $$0) {
      return $$0.a().a(ear.b) && $$0.b() instanceof ecw $$1 && $$1.a(ecy.f) && $$1.d() instanceof dhy $$2 && $$2.a(dia.a);
   }

   private static boolean c(eau $$0) {
      return $$0.a().a(ear.c) && $$0.b() instanceof ecw $$1 && $$1.a(ecy.g) && $$1.d() instanceof dic;
   }

   public edo.b a(ke<eau> $$0) {
      Stream<aku<eau>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(aku<eau> a, eau b) {

         kd c() {
            return new kd(Optional.empty(), edo.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kn<eau> $$4 = new jz<>(mc.bf, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      ke<eau> $$5 = $$4.n();
      evk.a $$6 = b($$5);
      return new edo.b($$5.n(), $$6);
   }

   public Map<aku<eau>, eau> d() {
      return this.b;
   }

   public static record b(ke<eau> a, evk.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public kf.b b() {
         return new kf.c(List.of(this.a)).e();
      }

      public ke<eau> c() {
         return this.a;
      }

      public evk.a d() {
         return this.b;
      }
   }
}
