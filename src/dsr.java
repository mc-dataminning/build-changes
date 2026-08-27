import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public final class dsr {
   private static final Map<String, dsr> l = new Object2ObjectArrayMap();
   public static final Codec<dsr> a = axu.a((Function<dsr, String>)($$0 -> $$0.m), l::get);
   public static final dsr b = new dsr(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(sf.j), Optional.of(sf.q), Optional.of(sf.F), Optional.of(sf.L)
   );
   public static final dsr c = new dsr(
      "spruce", 0.5F, Optional.of(sf.t), Optional.of(sf.u), Optional.of(sf.n), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final dsr d = new dsr(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(sf.A), Optional.of(sf.B), Optional.empty(), Optional.empty()
   );
   public static final dsr e = new dsr(
      "potato", 0.05F, Optional.of(sf.f), Optional.empty(), Optional.of(sf.e), Optional.of(sf.d), Optional.empty(), Optional.empty()
   );
   public static final dsr f = new dsr("azalea", Optional.empty(), Optional.of(sf.z), Optional.empty());
   public static final dsr g = new dsr("birch", Optional.empty(), Optional.of(sf.l), Optional.of(sf.I));
   public static final dsr h = new dsr("jungle", Optional.of(sf.s), Optional.of(sf.r), Optional.empty());
   public static final dsr i = new dsr("acacia", Optional.empty(), Optional.of(sf.m), Optional.empty());
   public static final dsr j = new dsr("cherry", Optional.empty(), Optional.of(sf.C), Optional.of(sf.N));
   public static final dsr k = new dsr("dark_oak", Optional.of(sf.k), Optional.empty(), Optional.empty());
   private final String m;
   private final float n;
   private final Optional<aks<ebm<?, ?>>> o;
   private final Optional<aks<ebm<?, ?>>> p;
   private final Optional<aks<ebm<?, ?>>> q;
   private final Optional<aks<ebm<?, ?>>> r;
   private final Optional<aks<ebm<?, ?>>> s;
   private final Optional<aks<ebm<?, ?>>> t;

   public dsr(String $$0, Optional<aks<ebm<?, ?>>> $$1, Optional<aks<ebm<?, ?>>> $$2, Optional<aks<ebm<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public dsr(
      String $$0,
      float $$1,
      Optional<aks<ebm<?, ?>>> $$2,
      Optional<aks<ebm<?, ?>>> $$3,
      Optional<aks<ebm<?, ?>>> $$4,
      Optional<aks<ebm<?, ?>>> $$5,
      Optional<aks<ebm<?, ?>>> $$6,
      Optional<aks<ebm<?, ?>>> $$7
   ) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
      this.p = $$3;
      this.q = $$4;
      this.r = $$5;
      this.s = $$6;
      this.t = $$7;
      l.put($$0, this);
   }

   @Nullable
   private aks<ebm<?, ?>> a(ayt $$0, boolean $$1) {
      if ($$0.i() < this.n) {
         if ($$1 && this.t.isPresent()) {
            return this.t.get();
         }

         if (this.r.isPresent()) {
            return this.r.get();
         }
      }

      return $$1 && this.s.isPresent() ? this.s.get() : this.q.orElse(null);
   }

   @Nullable
   private aks<ebm<?, ?>> a(ayt $$0) {
      return this.p.isPresent() && $$0.i() < this.n ? this.p.get() : this.o.orElse(null);
   }

   public boolean a(aqt $$0, duz $$1, ir $$2, dtc $$3, ayt $$4) {
      aks<ebm<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         ja<ebm<?, ?>> $$6 = $$0.I_().d(li.aC).b($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     ebm<?, ?> $$9 = $$6.a();
                     dtc $$10 = dfe.a.n();
                     $$0.a($$2.b($$7, 0, $$8), $$10, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$10, 4);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$10, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$10, 4);
                     if ($$9.a($$0, $$1, $$4, $$2.b($$7, 0, $$8))) {
                        return true;
                     }

                     $$0.a($$2.b($$7, 0, $$8), $$3, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$3, 4);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$3, 4);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$3, 4);
                     return false;
                  }
               }
            }
         }
      }

      aks<ebm<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         ja<ebm<?, ?>> $$12 = $$0.I_().d(li.aC).b($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            ebm<?, ?> $$13 = $$12.a();
            dtc $$14 = $$0.b_($$2).g();
            $$0.a($$2, $$14, 4);
            if ($$13.a($$0, $$1, $$4, $$2)) {
               if ($$0.a_($$2) == $$14) {
                  $$0.a($$2, $$3, $$14, 2);
               }

               return true;
            } else {
               $$0.a($$2, $$3, 4);
               return false;
            }
         }
      }
   }

   private static boolean a(dtc $$0, dbg $$1, ir $$2, int $$3, int $$4) {
      dfc $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dcb $$0, ir $$1) {
      for (ir $$2 : ir.a.c($$1.d().d(2).f(2), $$1.c().e(2).g(2))) {
         if ($$0.a_($$2).a(awe.U)) {
            return true;
         }
      }

      return false;
   }
}
