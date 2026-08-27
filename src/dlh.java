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

public record dlh(hq<din> b) {
   public static final MapCodec<dlh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(hs.b(jc.aJ, Lifecycle.stable(), din.a).fieldOf("dimensions").forGetter(dlh::d)).apply($$0, $$0.stable(dlh::new))
   );
   private static final Set<aey<din>> c = ImmutableSet.of(din.b, din.c, din.d);
   private static final int d = c.size();

   public dlh(hq<din> b) {
      din $$1 = b.a(din.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<aey<din>> a(Stream<aey<din>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public dlh a(hr $$0, dha $$1) {
      hq<dim> $$2 = $$0.d(jc.av);
      hq<din> $$3 = a($$2, this.b, $$1);
      return new dlh($$3);
   }

   public static hq<din> a(hq<dim> $$0, hq<din> $$1, dha $$2) {
      din $$3 = $$1.a(din.b);
      he<dim> $$4 = (he<dim>)($$3 == null ? $$0.f(dik.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static hq<din> a(hq<din> $$0, he<dim> $$1, dha $$2) {
      hz<din> $$3 = new hm<>(jc.aJ, Lifecycle.experimental());
      $$3.a(din.b, new din($$1, $$2), Lifecycle.stable());

      for (Entry<aey<din>, din> $$4 : $$0.g()) {
         aey<din> $$5 = $$4.getKey();
         if ($$5 != din.b) {
            $$3.a($$5, $$4.getValue(), $$0.e($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dha a() {
      din $$0 = this.b.a(din.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<din> a(aey<din> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<aey<cqb>> b() {
      return this.d().g().stream().map(Entry::getKey).map(jc::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dkd;
   }

   private static ece.a b(hq<din> $$0) {
      return $$0.d(din.b).map($$0x -> {
         dha $$1 = $$0x.b();
         if ($$1 instanceof dkd) {
            return ece.a.c;
         } else {
            return $$1 instanceof dkh ? ece.a.b : ece.a.a;
         }
      }).orElse(ece.a.a);
   }

   static Lifecycle a(aey<din> $$0, din $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aey<din> $$0, din $$1) {
      if ($$0 == din.b) {
         return a($$1);
      } else if ($$0 == din.c) {
         return b($$1);
      } else {
         return $$0 == din.d ? c($$1) : false;
      }
   }

   private static boolean a(din $$0) {
      he<dim> $$1 = $$0.a();
      if (!$$1.a(dik.a) && !$$1.a(dik.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof crm $$2 && !$$2.a(cro.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(din $$0) {
      return $$0.a().a(dik.b) && $$0.b() instanceof dkp $$1 && $$1.a(dkr.f) && $$1.c() instanceof crm $$2 && $$2.a(cro.a);
   }

   private static boolean c(din $$0) {
      return $$0.a().a(dik.c) && $$0.b() instanceof dkp $$1 && $$1.a(dkr.g) && $$1.c() instanceof crq;
   }

   public dlh.b a(hq<din> $$0) {
      Stream<aey<din>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(aey<din> a, din b) {

         Lifecycle c() {
            return dlh.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      hz<din> $$4 = new hm<>(jc.aJ, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      hq<din> $$5 = $$4.l();
      ece.a $$6 = b($$5);
      return new dlh.b($$5.l(), $$6);
   }

   public hq<din> d() {
      return this.b;
   }

   public static record b(hq<din> a, ece.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public hr.b b() {
         return new hr.c(List.of(this.a)).c();
      }

      public hq<din> c() {
         return this.a;
      }

      public ece.a d() {
         return this.b;
      }
   }
}
