import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class clr {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<chl<? extends chk<? super clq>>> a = ImmutableList.of(chl.c, chl.f, chl.d, chl.y);
   static final List<cge<?>> b = ImmutableList.of(
      cge.o, cge.n, cge.F, cge.u, cge.aa, cge.aS, cge.aT, cge.aU, cge.aH, cge.aR, cge.h, cge.s, new cge[]{cge.P, cge.Q, cge.S}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cyy> a() {
      return $$0 -> $$0.a(axk.aa);
   }

   protected static byc<?> a(byc<clq> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(csr.a));
      $$0.b(csr.b);
      $$0.f();
      return $$0;
   }

   static clq b(clq $$0) {
      $$0.eb().b(cge.aT);
      $$0.eb().b(cge.aS);
      return $$0.a(clq.a.a);
   }

   private static void b(byc<clq> $$0) {
      $$0.a(csr.a, 0, ImmutableList.of(new cbn(0.8F), new byo<clq>(2.0F) {
         protected void a(arq $$0, clq $$1, long $$2) {
            clr.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new cad(500, 700), new byz(cge.Q)));
   }

   private static void c(byc<clq> $$0) {
      $$0.a(csr.v, ImmutableList.of(Pair.of(0, new clr.e())), Set.of(Pair.of(cge.aa, cgf.b), Pair.of(cge.aS, cgf.a), Pair.of(cge.n, cgf.a)));
   }

   private static void d(byc<clq> $$0) {
      $$0.a(
         csr.z,
         ImmutableList.of(Pair.of(0, new clr.a(160, 180)), Pair.of(0, new clr.c(40))),
         Set.of(Pair.of(cge.aa, cgf.b), Pair.of(cge.n, cgf.b), Pair.of(cge.aT, cgf.a))
      );
   }

   private static void e(byc<clq> $$0) {
      $$0.a(
         csr.b,
         ImmutableList.of(
            Pair.of(0, new byn(bwm.bj) {
               @Override
               protected void a(arq $$0, cis $$1, long $$2) {
                  clr.b((clq)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bzg($$0x -> 1.25F, $$0x -> $$0x.n_() ? 2.5 : 3.5) {
               @Override
               protected void b(arq $$0, bxk $$1, long $$2) {
                  clr.b((clq)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bzz(45, 90)),
            Pair.of(3, new clr.b(40, 100)),
            Pair.of(
               4,
               new caq(
                  ImmutableList.of(
                     Pair.of(cba.a(1.0F, 3), 2),
                     Pair.of(new clr.d(40, 80), 1),
                     Pair.of(new clr.f(40, 80), 1),
                     Pair.of(cas.a(bwm.bS, 6.0F), 1),
                     Pair.of(cal.a(1.0F), 1),
                     Pair.of(new bzd(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cge.aT, cgf.b))
      );
   }

   static void a(clq $$0) {
      $$0.eb().a(ImmutableList.of(csr.z, csr.v, csr.b));
   }

   static class a extends byt<clq> {
      a(int $$0, int $$1) {
         super(Map.of(cge.aa, cgf.b, cge.n, cgf.b, cge.aT, cgf.a, cge.aH, cgf.b), $$0, $$1);
      }

      protected boolean a(arq $$0, clq $$1) {
         return $$1.gq();
      }

      protected boolean a(arq $$0, clq $$1, long $$2) {
         return $$1.eb().c(cge.aT).isPresent() && $$1.gt() && !$$1.gA();
      }

      protected void b(arq $$0, clq $$1, long $$2) {
         $$1.a(clq.a.f);
      }

      protected void c(arq $$0, clq $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.eb().a(cge.aH, bau.a, 9600L);
         } else {
            clr.b($$1);
         }
      }
   }

   static class b extends byt<clq> {
      b(int $$0, int $$1) {
         super(Map.of(cge.aU, cgf.a), $$0, $$1);
      }

      protected boolean a(arq $$0, clq $$1, long $$2) {
         return true;
      }

      protected void b(arq $$0, clq $$1, long $$2) {
         $$1.a(clq.a.b);
      }

      protected void c(arq $$0, clq $$1, long $$2) {
         $$1.a(clq.a.a);
         $$1.eb().b(cge.aU);
      }
   }

   static class c extends byt<clq> {
      c(int $$0) {
         super(Map.of(cge.aa, cgf.b, cge.n, cgf.b, cge.aT, cgf.a, cge.aH, cgf.a), $$0, $$0);
      }

      protected boolean a(arq $$0, clq $$1) {
         return true;
      }

      protected boolean a(arq $$0, clq $$1, long $$2) {
         return $$1.eb().c(cge.aT).isPresent();
      }

      protected void b(arq $$0, clq $$1, long $$2) {
         $$1.a(clq.a.g);
      }

      protected void c(arq $$0, clq $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(clq.a.a).w($$3);
         $$1.eb().b(cge.aT);
         $$1.eb().a(cge.aU, true);
      }
   }

   static class d extends byt<clq> {
      d(int $$0, int $$1) {
         super(Map.of(cge.aa, cgf.b, cge.aT, cgf.b, cge.aS, cgf.b, cge.aU, cgf.b, cge.s, cgf.b), $$0, $$1);
      }

      protected boolean a(arq $$0, clq $$1) {
         return !$$1.x();
      }

      protected boolean a(arq $$0, clq $$1, long $$2) {
         return true;
      }

      protected void b(arq $$0, clq $$1, long $$2) {
         $$1.a(clq.a.c);
      }

      protected void c(arq $$0, clq $$1, long $$2) {
         $$1.a(clq.a.a);
      }
   }

   static class e extends byt<clq> {
      e() {
         super(Map.of(cge.n, cgf.a, cge.aa, cgf.b, cge.aS, cgf.a), 600);
      }

      protected boolean a(arq $$0, clq $$1) {
         return $$1.gq();
      }

      protected boolean a(arq $$0, clq $$1, long $$2) {
         if (!$$1.gq()) {
            $$1.a(clq.a.a);
            return false;
         } else {
            Optional<iu> $$3 = $$1.eb().c(cge.n).map(cgh::a).map(cah::b);
            Optional<iu> $$4 = $$1.eb().c(cge.aS);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arq $$0, clq $$1, long $$2) {
         $$1.a(clq.a.e);
      }

      protected void c(arq $$0, clq $$1, long $$2) {
         if ($$1.gt() && $$1.gq()) {
            $$1.eb().a(cge.aT, true);
         }

         $$1.eb().b(cge.n);
         $$1.eb().b(cge.aS);
      }
   }

   static class f extends byt<clq> {
      f(int $$0, int $$1) {
         super(Map.of(cge.n, cgf.b, cge.aS, cgf.b, cge.aH, cgf.b), $$0, $$1);
      }

      protected boolean a(arq $$0, clq $$1) {
         return !$$1.n_() && $$1.gq();
      }

      protected boolean a(arq $$0, clq $$1, long $$2) {
         return $$1.gq();
      }

      protected void b(arq $$0, clq $$1, long $$2) {
         $$1.a(clq.a.d);
      }

      protected void c(arq $$0, clq $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(clq.a.a);
         if ($$3) {
            $$1.gs().ifPresent($$1x -> {
               $$1.eb().a(cge.aS, $$1x);
               $$1.eb().a(cge.n, new cgh($$1x, 1.25F, 0));
            });
         }
      }
   }
}
