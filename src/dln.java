import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Stream;

public record dln(hq<dit> b) {
   public static final MapCodec<dln> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hs.b(jc.aI, Lifecycle.stable(), dit.a).fieldOf("dimensions").forGetter(dln::d)).apply($$0, $$0.stable(dln::new))
   );
   private static final Set<aev<dit>> c = ImmutableSet.of(dit.b, dit.c, dit.d);
   private static final int d = c.size();

   public dln(hq<dit> b) {
      dit $$1 = b.a(dit.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<aev<dit>> a(Stream<aev<dit>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dln a(hr $$0, dhg $$1) {
      hq<dis> $$2 = $$0.d(jc.au);
      hq<dit> $$3 = a($$2, this.b, $$1);
      return new dln($$3);
   }

   public static hq<dit> a(hq<dis> $$0, hq<dit> $$1, dhg $$2) {
      dit $$3 = $$1.a(dit.b);
      he<dis> $$4 = (he<dis>)($$3 == null ? $$0.f(diq.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static hq<dit> a(hq<dit> $$0, he<dis> $$1, dhg $$2) {
      hz<dit> $$3 = new hm<>(jc.aI, Lifecycle.experimental());
      $$3.a(dit.b, new dit($$1, $$2), Lifecycle.stable());

      for (Entry<aev<dit>, dit> $$4 : $$0.g()) {
         aev<dit> $$5 = $$4.getKey();
         if ($$5 != dit.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dhg a() {
      dit $$0 = this.b.a(dit.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dit> a(aev<dit> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<aev<cpv>> b() {
      return this.d().g().stream().map(Entry::getKey).map(jc::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dkj;
   }

   private static eck.a b(hq<dit> $$0) {
      return $$0.d(dit.b).map($$0x -> {
         dhg $$1 = $$0x.b();
         if ($$1 instanceof dkj) {
            return eck.a.c;
         } else {
            return $$1 instanceof dkn ? eck.a.b : eck.a.a;
         }
      }).orElse(eck.a.a);
   }

   static Lifecycle a(aev<dit> $$0, dit $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aev<dit> $$0, dit $$1) {
      if ($$0 == dit.b) {
         return a($$1);
      } else if ($$0 == dit.c) {
         return b($$1);
      } else {
         return $$0 == dit.d ? c($$1) : false;
      }
   }

   private static boolean a(dit $$0) {
      he<dis> $$1 = $$0.a();
      if (!$$1.a(diq.a) && !$$1.a(diq.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof crg $$2 && !$$2.a(cri.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dit $$0) {
      return $$0.a().a(diq.b) && $$0.b() instanceof dkv $$1 && $$1.a(dkx.f) && $$1.c() instanceof crg $$2 && $$2.a(cri.a);
   }

   private static boolean c(dit $$0) {
      return $$0.a().a(diq.c) && $$0.b() instanceof dkv $$1 && $$1.a(dkx.g) && $$1.c() instanceof crk;
   }

   public dln.b a(hq<dit> $$0) {
      Stream<aev<dit>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(aev<dit> a, dit b) {

         Lifecycle c() {
            return dln.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      hz<dit> $$4 = new hm<>(jc.aI, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      hq<dit> $$5 = $$4.l();
      eck.a $$6 = b($$5);
      return new dln.b($$5.l(), $$6);
   }

   public hq<dit> d() {
      return this.b;
   }

   public static record b(hq<dit> a, eck.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public hr.b b() {
         return new hr.c(List.of(this.a)).c();
      }

      public hq<dit> c() {
         return this.a;
      }

      public eck.a d() {
         return this.b;
      }
   }
}
