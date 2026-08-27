import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cys extends ctc implements cvv, dab {
   public static final MapCodec<cys> a = b(cys::new);
   public static final dfx b = dft.bm;
   public static final dgb<dga> c = dft.bn;
   public static final dfu d = dft.C;
   private static final int e = 11;
   private static final int f = 2;
   private static final float g = 0.02F;
   private static final float h = 0.12F;
   private static final int i = 11;
   private static final float j = 0.17578125F;
   private static final float k = 0.05859375F;
   private static final double l = 0.6;
   private static final float m = 1.0F;
   private static final int n = 40;
   private static final int o = 6;
   private static final float F = 2.0F;
   private static final int G = 2;
   private static final float H = 5.0F;
   private static final float I = 0.011377778F;
   private static final int J = 7;
   private static final int K = 10;
   private static final float L = 0.6875F;
   private static final eia M = ctc.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final eia N = ctc.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final eia O = ctc.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final eia P = ctc.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final eia Q = ctc.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final eia R = ctc.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final eia T = ctc.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<cys> a() {
      return a;
   }

   public cys(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ha.b).a(c, dga.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eah.c, eah.c.a($$3));
      }

      if ($$1 != ha.b && $$1 != ha.a) {
         return $$0;
      } else {
         ha $$6 = $$0.c(b);
         if ($$6 == ha.a && $$3.L().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (cqe)$$3, $$4)) {
            if ($$6 == ha.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dga.a;
            dga $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   public void a(cqb $$0, dfd $$1, ehd $$2, ccs $$3) {
      gw $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3 instanceof cde && $$3.do().f() > 0.6) {
         $$0.b($$4, true);
      }
   }

   @Override
   public void a(cqb $$0, dfd $$1, gw $$2, biw $$3, float $$4) {
      if ($$1.c(b) == ha.b && $$1.c(c) == dga.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ag().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if (h($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if (o($$0) && !this.a($$0, (cqe)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (cqe)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dfd $$0, akt $$1, gw $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (cqe)$$1, $$2)) {
            Optional<cys.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eaf $$5 = $$4.get().b;
               float $$6;
               if ($$5 == eah.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != eah.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  gw $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(cte.rH) && $$5 == eah.c) {
                        dfd $$10 = cte.dR.o();
                        $$1.b($$4.get().a, $$10);
                        ctc.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(djn.c, $$4.get().a, djn.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        gw $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dfd $$14 = $$1.a_($$11);
                           $$1.a($$11, $$14.b(), $$13);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   @Nullable
   @Override
   public dfd a(clt $$0) {
      cqc $$1 = $$0.q();
      gw $$2 = $$0.a();
      ha $$3 = $$0.e().g();
      ha $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dga $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == eah.c));
      }
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(d) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public eia f(dfd $$0, cph $$1, gw $$2) {
      return ehx.a();
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      dga $$4 = $$0.c(c);
      eia $$5;
      if ($$4 == dga.a) {
         $$5 = M;
      } else if ($$4 == dga.b) {
         if ($$0.c(b) == ha.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dga.c) {
         $$5 = P;
      } else if ($$4 == dga.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      ehh $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   public boolean a_(dfd $$0, cph $$1, gw $$2) {
      return false;
   }

   @Override
   public float ap_() {
      return 0.125F;
   }

   @Override
   public void a(cqb $$0, gw $$1, bys $$2) {
      if (!$$2.aS()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bhu a(biw $$0) {
      return $$0.dM().c($$0);
   }

   private static void a(dfd $$0, akt $$1, gw $$2) {
      gw.a $$3 = $$2.j();
      dfd $$4 = $$0;

      while (n($$4)) {
         bys $$5 = bys.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(ha.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dfd $$0, akt $$1, gw $$2, ash $$3) {
      dfd $$4 = $$1.a_($$2.b(1));
      dfd $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         gw $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dfd $$7 = $$1.a_($$6);
            if (h($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, ha.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(akt $$0, gw $$1) {
      gw.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ha.a);
         dfd $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, ha.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, ha.b);
            return;
         }

         if (c($$0, $$2, ha.b) && !$$0.y($$2.d())) {
            a($$0, $$2.d(), ha.b);
            return;
         }

         if (!a((cph)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(akt $$0, gw $$1, ha $$2) {
      gw $$3 = $$1.a($$2);
      dfd $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (cqc)$$0, $$3);
      } else if ($$4.i() || $$4.a(cte.G)) {
         a($$0, $$3, $$2, dga.b);
      }
   }

   private static void a(cqc $$0, gw $$1, ha $$2, dga $$3) {
      dfd $$4 = cte.rs.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == eah.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dfd $$0, cqc $$1, gw $$2) {
      gw $$4;
      gw $$3;
      if ($$0.c(b) == ha.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, ha.a, dga.a);
      a($$1, $$3, ha.b, dga.a);
   }

   public static void a(cqb $$0, gw $$1, dfd $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(cqb $$0, gw $$1, dfd $$2, eaf $$3) {
      ehh $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      eaf $$9 = a($$0, $$3);
      it $$10 = $$9.a(aqa.b) ? iv.aF : iv.aH;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static gw a(dfd $$0, cqc $$1, gw $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ha $$5 = $$0.c(b);
         BiPredicate<gw, dfd> $$6 = ($$1x, $$2x) -> $$2x.a(cte.rs) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ha b(cqe $$0, gw $$1, ha $$2) {
      ha $$3;
      if (c($$0, $$1, $$2)) {
         $$3 = $$2;
      } else {
         if (!c($$0, $$1, $$2.g())) {
            return null;
         }

         $$3 = $$2.g();
      }

      return $$3;
   }

   private static dga a(cqe $$0, gw $$1, ha $$2, boolean $$3) {
      ha $$4 = $$2.g();
      dfd $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dga.a ? dga.b : dga.a;
      } else if (!b($$5, $$2)) {
         return dga.b;
      } else {
         dga $$6 = $$5.c(c);
         if ($$6 != dga.b && $$6 != dga.a) {
            dfd $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dga.e : dga.d;
         } else {
            return dga.c;
         }
      }
   }

   public static boolean h(dfd $$0) {
      return n($$0) && $$0.c(c) == dga.b && !$$0.c(d);
   }

   private static boolean b(dfd $$0, akt $$1, gw $$2) {
      ha $$3 = $$0.c(b);
      gw $$4 = $$2.a($$3);
      dfd $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<gw> a(cqb $$0, gw $$1, dfd $$2, int $$3) {
      ha $$4 = $$2.c(b);
      BiPredicate<gw, dfd> $$5 = ($$1x, $$2x) -> $$2x.a(cte.rs) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(cte.rs), $$3);
   }

   private static boolean c(cqe $$0, gw $$1, ha $$2) {
      gw $$3 = $$1.a($$2.g());
      dfd $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dfd $$0, boolean $$1) {
      if (!$$0.a(cte.rs)) {
         return false;
      } else {
         dga $$2 = $$0.c(c);
         return $$2 == dga.b || $$1 && $$2 == dga.a;
      }
   }

   private static boolean a(dfd $$0, ha $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dfd $$0) {
      return b($$0, ha.a);
   }

   private static boolean o(dfd $$0) {
      return b($$0, ha.b);
   }

   private static boolean b(dfd $$0, cqe $$1, gw $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(cte.rs);
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }

   private static boolean b(dfd $$0, ha $$1) {
      return $$0.a(cte.rs) && $$0.c(b) == $$1;
   }

   @Nullable
   private static gw a(cqb $$0, gw $$1, eaf $$2) {
      Predicate<dfd> $$3 = $$1x -> $$1x.b() instanceof cru && ((cru)$$1x.b()).a($$2);
      BiPredicate<gw, dfd> $$4 = ($$1x, $$2x) -> a((cph)$$0, $$1x, $$2x);
      return a($$0, $$1, ha.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static gw a(cqb $$0, gw $$1) {
      BiPredicate<gw, dfd> $$2 = ($$1x, $$2x) -> a((cph)$$0, $$1x, $$2x);
      return a($$0, $$1, ha.b.f(), $$2, cys::h, 11).orElse(null);
   }

   public static eaf a(akt $$0, gw $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(cys::a).orElse(eah.a);
   }

   private static Optional<cys.a> b(cqb $$0, gw $$1, dfd $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         gw $$2x = $$1x.c();
         dfd $$3 = $$0.a_($$2x);
         eaf $$4;
         if ($$3.a(cte.rH) && !$$0.C_().i()) {
            $$4 = eah.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new cys.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eaf $$0) {
      return $$0 == eah.e || $$0 == eah.c;
   }

   private static boolean a(dfd $$0, dfd $$1) {
      return $$0.a(cte.rt) && $$1.a(cte.G) && $$1.u().b();
   }

   private static eaf a(cqb $$0, eaf $$1) {
      if ($$1.a(eah.a)) {
         return $$0.C_().i() ? eah.e : eah.c;
      } else {
         return $$1;
      }
   }

   private static Optional<gw> a(cqc $$0, gw $$1, ha.b $$2, BiPredicate<gw, dfd> $$3, Predicate<dfd> $$4, int $$5) {
      ha $$6 = ha.a($$2, ha.a.b);
      gw.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dfd $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(cph $$0, gw $$1, dfd $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         eia $$3 = $$2.k($$0, $$1);
         return !ehx.c(T, $$3, ehl.i);
      }
   }

   static record a(gw a, eaf b, dfd c) {
   }
}
