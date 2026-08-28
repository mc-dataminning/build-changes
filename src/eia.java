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

public record eia(Map<alj<efe>, efe> b) {
   public static final MapCodec<eia> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(alj.a(mi.bq), efe.a).fieldOf("dimensions").forGetter(eia::d)).apply($$0, $$0.stable(eia::new))
   );
   private static final Set<alj<efe>> c = ImmutableSet.of(efe.b, efe.c, efe.d);
   private static final int d = c.size();

   public eia(Map<alj<efe>, efe> b) {
      efe $$1 = b.get(efe.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public eia(jt<efe> $$0) {
      this($$0.c().collect(Collectors.toMap(jg.c::h, jg.c::a)));
   }

   public static Stream<alj<efe>> a(Stream<alj<efe>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public eia a(ji.a $$0, ede $$1) {
      ji<efd> $$2 = $$0.e(mi.aP);
      Map<alj<efe>, efe> $$3 = a($$2, this.b, $$1);
      return new eia($$3);
   }

   public static Map<alj<efe>, efe> a(ji<efd> $$0, Map<alj<efe>, efe> $$1, ede $$2) {
      efe $$3 = $$1.get(efe.b);
      jg<efd> $$4 = (jg<efd>)($$3 == null ? $$0.b(efb.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<alj<efe>, efe> a(Map<alj<efe>, efe> $$0, jg<efd> $$1, ede $$2) {
      Builder<alj<efe>, efe> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(efe.b, new efe($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public ede a() {
      efe $$0 = this.b.get(efe.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<efe> a(alj<efe> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<alj<djz>> b() {
      return this.d().keySet().stream().map(mi::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof egw;
   }

   private static fab.a b(jt<efe> $$0) {
      return $$0.f(efe.b).map($$0x -> {
         ede $$1 = $$0x.b();
         if ($$1 instanceof egw) {
            return fab.a.c;
         } else {
            return $$1 instanceof eha ? fab.a.b : fab.a.a;
         }
      }).orElse(fab.a.a);
   }

   static Lifecycle a(alj<efe> $$0, efe $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(alj<efe> $$0, efe $$1) {
      if ($$0 == efe.b) {
         return a($$1);
      } else if ($$0 == efe.c) {
         return b($$1);
      } else {
         return $$0 == efe.d ? c($$1) : false;
      }
   }

   private static boolean a(efe $$0) {
      jg<efd> $$1 = $$0.a();
      if (!$$1.a(efb.a) && !$$1.a(efb.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dlp $$2 && !$$2.a(dlr.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(efe $$0) {
      return $$0.a().a(efb.b) && $$0.b() instanceof ehi $$1 && $$1.a(ehk.f) && $$1.d() instanceof dlp $$2 && $$2.a(dlr.a);
   }

   private static boolean c(efe $$0) {
      return $$0.a().a(efb.c) && $$0.b() instanceof ehi $$1 && $$1.a(ehk.g) && $$1.d() instanceof dlt;
   }

   public eia.b a(jt<efe> $$0) {
      Stream<alj<efe>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(alj<efe> a, efe b) {

         js c() {
            return new js(Optional.empty(), eia.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kc<efe> $$4 = new jo<>(mi.bq, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jt<efe> $$5 = $$4.n();
      fab.a $$6 = b($$5);
      return new eia.b($$5.n(), $$6);
   }

   public Map<alj<efe>, efe> d() {
      return this.b;
   }

   public static record b(jt<efe> a, fab.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public ju.b b() {
         return new ju.c(List.of(this.a)).e();
      }

      public jt<efe> c() {
         return this.a;
      }

      public fab.a d() {
         return this.b;
      }
   }
}
