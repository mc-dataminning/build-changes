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

public record eej(Map<akt<ebn>, ebn> b) {
   public static final MapCodec<eej> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(akt.a(mc.bh), ebn.a).fieldOf("dimensions").forGetter(eej::d)).apply($$0, $$0.stable(eej::new))
   );
   private static final Set<akt<ebn>> c = ImmutableSet.of(ebn.b, ebn.c, ebn.d);
   private static final int d = c.size();

   public eej(Map<akt<ebn>, ebn> b) {
      ebn $$1 = b.get(ebn.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public eej(ke<ebn> $$0) {
      this($$0.c().collect(Collectors.toMap(jr.c::h, jr.c::a)));
   }

   public static Stream<akt<ebn>> a(Stream<akt<ebn>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public eej a(jt.a $$0, dzn $$1) {
      jt<ebm> $$2 = $$0.d(mc.aO);
      Map<akt<ebn>, ebn> $$3 = a($$2, this.b, $$1);
      return new eej($$3);
   }

   public static Map<akt<ebn>, ebn> a(jt<ebm> $$0, Map<akt<ebn>, ebn> $$1, dzn $$2) {
      ebn $$3 = $$1.get(ebn.b);
      jr<ebm> $$4 = (jr<ebm>)($$3 == null ? $$0.b(ebk.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<akt<ebn>, ebn> a(Map<akt<ebn>, ebn> $$0, jr<ebm> $$1, dzn $$2) {
      Builder<akt<ebn>, ebn> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(ebn.b, new ebn($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public dzn a() {
      ebn $$0 = this.b.get(ebn.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<ebn> a(akt<ebn> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<akt<dgz>> b() {
      return this.d().keySet().stream().map(mc::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof edf;
   }

   private static ewg.a b(ke<ebn> $$0) {
      return $$0.f(ebn.b).map($$0x -> {
         dzn $$1 = $$0x.b();
         if ($$1 instanceof edf) {
            return ewg.a.c;
         } else {
            return $$1 instanceof edj ? ewg.a.b : ewg.a.a;
         }
      }).orElse(ewg.a.a);
   }

   static Lifecycle a(akt<ebn> $$0, ebn $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(akt<ebn> $$0, ebn $$1) {
      if ($$0 == ebn.b) {
         return a($$1);
      } else if ($$0 == ebn.c) {
         return b($$1);
      } else {
         return $$0 == ebn.d ? c($$1) : false;
      }
   }

   private static boolean a(ebn $$0) {
      jr<ebm> $$1 = $$0.a();
      if (!$$1.a(ebk.a) && !$$1.a(ebk.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dip $$2 && !$$2.a(dir.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(ebn $$0) {
      return $$0.a().a(ebk.b) && $$0.b() instanceof edr $$1 && $$1.a(edt.f) && $$1.d() instanceof dip $$2 && $$2.a(dir.a);
   }

   private static boolean c(ebn $$0) {
      return $$0.a().a(ebk.c) && $$0.b() instanceof edr $$1 && $$1.a(edt.g) && $$1.d() instanceof dit;
   }

   public eej.b a(ke<ebn> $$0) {
      Stream<akt<ebn>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(akt<ebn> a, ebn b) {

         kd c() {
            return new kd(Optional.empty(), eej.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      kn<ebn> $$4 = new jz<>(mc.bh, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      ke<ebn> $$5 = $$4.n();
      ewg.a $$6 = b($$5);
      return new eej.b($$5.n(), $$6);
   }

   public Map<akt<ebn>, ebn> d() {
      return this.b;
   }

   public static record b(ke<ebn> a, ewg.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public kf.b b() {
         return new kf.c(List.of(this.a)).e();
      }

      public ke<ebn> c() {
         return this.a;
      }

      public ewg.a d() {
         return this.b;
      }
   }
}
