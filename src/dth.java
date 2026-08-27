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

public record dth(Map<ajg<dqn>, dqn> b) {
   public static final MapCodec<dth> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(ajg.a(kj.aO), dqn.a).fieldOf("dimensions").forGetter(dth::d)).apply($$0, $$0.stable(dth::new))
   );
   private static final Set<ajg<dqn>> c = ImmutableSet.of(dqn.b, dqn.c, dqn.d);
   private static final int d = c.size();

   public dth(Map<ajg<dqn>, dqn> b) {
      dqn $$1 = b.get(dqn.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public dth(iy<dqn> $$0) {
      this($$0.h().collect(Collectors.toMap(il.c::h, il.c::a)));
   }

   public static Stream<ajg<dqn>> a(Stream<ajg<dqn>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dth a(iz $$0, dow $$1) {
      iy<dqm> $$2 = $$0.d(kj.az);
      Map<ajg<dqn>, dqn> $$3 = a($$2, this.b, $$1);
      return new dth($$3);
   }

   public static Map<ajg<dqn>, dqn> a(iy<dqm> $$0, Map<ajg<dqn>, dqn> $$1, dow $$2) {
      dqn $$3 = $$1.get(dqn.b);
      il<dqm> $$4 = (il<dqm>)($$3 == null ? $$0.g(dqk.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<ajg<dqn>, dqn> a(Map<ajg<dqn>, dqn> $$0, il<dqm> $$1, dow $$2) {
      Builder<ajg<dqn>, dqn> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(dqn.b, new dqn($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dow a() {
      dqn $$0 = this.b.get(dqn.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dqn> a(ajg<dqn> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<ajg<cwz>> b() {
      return this.d().keySet().stream().map(kj::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dsd;
   }

   private static eko.a b(iy<dqn> $$0) {
      return $$0.e(dqn.b).map($$0x -> {
         dow $$1 = $$0x.b();
         if ($$1 instanceof dsd) {
            return eko.a.c;
         } else {
            return $$1 instanceof dsh ? eko.a.b : eko.a.a;
         }
      }).orElse(eko.a.a);
   }

   static Lifecycle a(ajg<dqn> $$0, dqn $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(ajg<dqn> $$0, dqn $$1) {
      if ($$0 == dqn.b) {
         return a($$1);
      } else if ($$0 == dqn.c) {
         return b($$1);
      } else {
         return $$0 == dqn.d ? c($$1) : false;
      }
   }

   private static boolean a(dqn $$0) {
      il<dqm> $$1 = $$0.a();
      if (!$$1.a(dqk.a) && !$$1.a(dqk.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof cyl $$2 && !$$2.a(cyn.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dqn $$0) {
      return $$0.a().a(dqk.b) && $$0.b() instanceof dsp $$1 && $$1.a(dsr.f) && $$1.c() instanceof cyl $$2 && $$2.a(cyn.a);
   }

   private static boolean c(dqn $$0) {
      return $$0.a().a(dqk.c) && $$0.b() instanceof dsp $$1 && $$1.a(dsr.g) && $$1.c() instanceof cyp;
   }

   public dth.b a(iy<dqn> $$0) {
      Stream<ajg<dqn>> $$1 = Stream.concat($$0.f().stream(), this.b.keySet().stream()).distinct();

      record a(ajg<dqn> a, dqn b) {

         ix c() {
            return new ix(Optional.empty(), dth.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.e($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      jh<dqn> $$4 = new it<>(kj.aO, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      iy<dqn> $$5 = $$4.l();
      eko.a $$6 = b($$5);
      return new dth.b($$5.l(), $$6);
   }

   public Map<ajg<dqn>, dqn> d() {
      return this.b;
   }

   public static record b(iy<dqn> a, eko.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public iz.b b() {
         return new iz.c(List.of(this.a)).d();
      }

      public iy<dqn> c() {
         return this.a;
      }

      public eko.a d() {
         return this.b;
      }
   }
}
