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

public record ehb(Map<alf<eef>, eef> b) {
   public static final MapCodec<ehb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.unboundedMap(alf.a(mg.bp), eef.a).fieldOf("dimensions").forGetter(ehb::d)).apply($$0, $$0.stable(ehb::new))
   );
   private static final Set<alf<eef>> c = ImmutableSet.of(eef.b, eef.c, eef.d);
   private static final int d = c.size();

   public ehb(Map<alf<eef>, eef> b) {
      eef $$1 = b.get(eef.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public ehb(jr<eef> $$0) {
      this($$0.c().collect(Collectors.toMap(je.c::h, je.c::a)));
   }

   public static Stream<alf<eef>> a(Stream<alf<eef>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public ehb a(jg.a $$0, ecf $$1) {
      jg<eee> $$2 = $$0.e(mg.aP);
      Map<alf<eef>, eef> $$3 = a($$2, this.b, $$1);
      return new ehb($$3);
   }

   public static Map<alf<eef>, eef> a(jg<eee> $$0, Map<alf<eef>, eef> $$1, ecf $$2) {
      eef $$3 = $$1.get(eef.b);
      je<eee> $$4 = (je<eee>)($$3 == null ? $$0.b(eec.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static Map<alf<eef>, eef> a(Map<alf<eef>, eef> $$0, je<eee> $$1, ecf $$2) {
      Builder<alf<eef>, eef> $$3 = ImmutableMap.builder();
      $$3.putAll($$0);
      $$3.put(eef.b, new eef($$1, $$2));
      return $$3.buildKeepingLast();
   }

   public ecf a() {
      eef $$0 = this.b.get(eef.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<eef> a(alf<eef> $$0) {
      return Optional.ofNullable(this.b.get($$0));
   }

   public ImmutableSet<alf<dja>> b() {
      return this.d().keySet().stream().map(mg::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof efx;
   }

   private static eyz.a b(jr<eef> $$0) {
      return $$0.f(eef.b).map($$0x -> {
         ecf $$1 = $$0x.b();
         if ($$1 instanceof efx) {
            return eyz.a.c;
         } else {
            return $$1 instanceof egb ? eyz.a.b : eyz.a.a;
         }
      }).orElse(eyz.a.a);
   }

   static Lifecycle a(alf<eef> $$0, eef $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(alf<eef> $$0, eef $$1) {
      if ($$0 == eef.b) {
         return a($$1);
      } else if ($$0 == eef.c) {
         return b($$1);
      } else {
         return $$0 == eef.d ? c($$1) : false;
      }
   }

   private static boolean a(eef $$0) {
      je<eee> $$1 = $$0.a();
      if (!$$1.a(eec.a) && !$$1.a(eec.d)) {
         return false;
      } else {
         if ($$0.b().d() instanceof dkq $$2 && !$$2.a(dks.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(eef $$0) {
      return $$0.a().a(eec.b) && $$0.b() instanceof egj $$1 && $$1.a(egl.f) && $$1.d() instanceof dkq $$2 && $$2.a(dks.a);
   }

   private static boolean c(eef $$0) {
      return $$0.a().a(eec.c) && $$0.b() instanceof egj $$1 && $$1.a(egl.g) && $$1.d() instanceof dku;
   }

   public ehb.b a(jr<eef> $$0) {
      Stream<alf<eef>> $$1 = Stream.concat($$0.j().stream(), this.b.keySet().stream()).distinct();

      record a(alf<eef> a, eef b) {

         jq c() {
            return new jq(Optional.empty(), ehb.a(this.a, this.b));
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.f($$2x).or(() -> Optional.ofNullable(this.b.get($$2x))).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      ka<eef> $$4 = new jm<>(mg.bp, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      jr<eef> $$5 = $$4.n();
      eyz.a $$6 = b($$5);
      return new ehb.b($$5.n(), $$6);
   }

   public Map<alf<eef>, eef> d() {
      return this.b;
   }

   public static record b(jr<eef> a, eyz.a b) {
      public Lifecycle a() {
         return this.a.h();
      }

      public js.b b() {
         return new js.c(List.of(this.a)).e();
      }

      public jr<eef> c() {
         return this.a;
      }

      public eyz.a d() {
         return this.b;
      }
   }
}
