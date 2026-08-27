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

public record drj(iv<dop> b) {
   public static final MapCodec<drj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ix.b(kg.aN, Lifecycle.stable(), dop.a).fieldOf("dimensions").forGetter(drj::d)).apply($$0, $$0.stable(drj::new))
   );
   private static final Set<aix<dop>> c = ImmutableSet.of(dop.b, dop.c, dop.d);
   private static final int d = c.size();

   public drj(iv<dop> b) {
      dop $$1 = b.a(dop.b);
      if ($$1 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         this.b = b;
      }
   }

   public static Stream<aix<dop>> a(Stream<aix<dop>> $$0) {
      return Stream.concat(c.stream(), $$0.filter($$0x -> !c.contains($$0x)));
   }

   public drj a(iw $$0, dnc $$1) {
      iv<doo> $$2 = $$0.d(kg.ay);
      iv<dop> $$3 = a($$2, this.b, $$1);
      return new drj($$3);
   }

   public static iv<dop> a(iv<doo> $$0, iv<dop> $$1, dnc $$2) {
      dop $$3 = $$1.a(dop.b);
      ij<doo> $$4 = (ij<doo>)($$3 == null ? $$0.f(dom.a) : $$3.a());
      return a($$1, $$4, $$2);
   }

   public static iv<dop> a(iv<dop> $$0, ij<doo> $$1, dnc $$2) {
      je<dop> $$3 = new ir<>(kg.aN, Lifecycle.experimental());
      $$3.a(dop.b, new dop($$1, $$2), Lifecycle.stable());

      for (Entry<aix<dop>, dop> $$4 : $$0.g()) {
         aix<dop> $$5 = $$4.getKey();
         if ($$5 != dop.b) {
            $$3.a($$5, $$4.getValue(), $$0.f($$4.getValue()));
         }
      }

      return $$3.l();
   }

   public dnc a() {
      dop $$0 = this.b.a(dop.b);
      if ($$0 == null) {
         throw new IllegalStateException("Overworld settings missing");
      } else {
         return $$0.b();
      }
   }

   public Optional<dop> a(aix<dop> $$0) {
      return this.b.d($$0);
   }

   public ImmutableSet<aix<cvn>> b() {
      return this.d().g().stream().map(Entry::getKey).map(kg::a).collect(ImmutableSet.toImmutableSet());
   }

   public boolean c() {
      return this.a() instanceof dqf;
   }

   private static eip.a b(iv<dop> $$0) {
      return $$0.d(dop.b).map($$0x -> {
         dnc $$1 = $$0x.b();
         if ($$1 instanceof dqf) {
            return eip.a.c;
         } else {
            return $$1 instanceof dqj ? eip.a.b : eip.a.a;
         }
      }).orElse(eip.a.a);
   }

   static Lifecycle a(aix<dop> $$0, dop $$1) {
      return b($$0, $$1) ? Lifecycle.stable() : Lifecycle.experimental();
   }

   private static boolean b(aix<dop> $$0, dop $$1) {
      if ($$0 == dop.b) {
         return a($$1);
      } else if ($$0 == dop.c) {
         return b($$1);
      } else {
         return $$0 == dop.d ? c($$1) : false;
      }
   }

   private static boolean a(dop $$0) {
      ij<doo> $$1 = $$0.a();
      if (!$$1.a(dom.a) && !$$1.a(dom.d)) {
         return false;
      } else {
         if ($$0.b().c() instanceof cwz $$2 && !$$2.a(cxb.b)) {
            return false;
         }

         return true;
      }
   }

   private static boolean b(dop $$0) {
      return $$0.a().a(dom.b) && $$0.b() instanceof dqr $$1 && $$1.a(dqt.f) && $$1.c() instanceof cwz $$2 && $$2.a(cxb.a);
   }

   private static boolean c(dop $$0) {
      return $$0.a().a(dom.c) && $$0.b() instanceof dqr $$1 && $$1.a(dqt.g) && $$1.c() instanceof cxd;
   }

   public drj.b a(iv<dop> $$0) {
      Stream<aix<dop>> $$1 = Stream.concat($$0.f().stream(), this.b.f().stream()).distinct();

      record a(aix<dop> a, dop b) {

         Lifecycle c() {
            return drj.a(this.a, this.b);
         }
      }

      List<a> $$2 = new ArrayList<>();
      a($$1).forEach($$2x -> $$0.d($$2x).or(() -> this.b.d($$2x)).ifPresent($$2xx -> $$2.add(new a($$2x, $$2xx))));
      Lifecycle $$3 = $$2.size() == d ? Lifecycle.stable() : Lifecycle.experimental();
      je<dop> $$4 = new ir<>(kg.aN, $$3);
      $$2.forEach($$1x -> $$4.a($$1x.a, $$1x.b, $$1x.c()));
      iv<dop> $$5 = $$4.l();
      eip.a $$6 = b($$5);
      return new drj.b($$5.l(), $$6);
   }

   public iv<dop> d() {
      return this.b;
   }

   public static record b(iv<dop> a, eip.a b) {
      public Lifecycle a() {
         return this.a.d();
      }

      public iw.b b() {
         return new iw.c(List.of(this.a)).d();
      }

      public iv<dop> c() {
         return this.a;
      }

      public eip.a d() {
         return this.b;
      }
   }
}
