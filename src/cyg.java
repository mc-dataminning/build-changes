import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cyg extends csq implements cvh, czr {
   public static final dfy a = dfu.bm;
   public static final dgc<dgb> b = dfu.bn;
   public static final dfv c = dfu.C;
   private static final int d = 11;
   private static final int e = 2;
   private static final float f = 0.02F;
   private static final float g = 0.12F;
   private static final int h = 11;
   private static final float i = 0.17578125F;
   private static final float j = 0.05859375F;
   private static final double k = 0.6;
   private static final float l = 1.0F;
   private static final int m = 40;
   private static final int n = 6;
   private static final float D = 2.0F;
   private static final int E = 2;
   private static final float F = 5.0F;
   private static final float G = 0.011377778F;
   private static final int H = 7;
   private static final int I = 10;
   private static final float J = 0.6875F;
   private static final eib K = csq.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final eib L = csq.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final eib M = csq.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final eib N = csq.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final eib O = csq.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final eib P = csq.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float Q = 0.125F;
   private static final eib R = csq.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   public cyg(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.b).a(b, dgb.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return c($$1, $$2, $$0.c(a));
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      if ($$1 != hc.b && $$1 != hc.a) {
         return $$0;
      } else {
         hc $$6 = $$0.c(a);
         if ($$6 == hc.a && $$3.L().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (cpt)$$3, $$4)) {
            if ($$6 == hc.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(b) == dgb.a;
            dgb $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(b, $$8);
         }
      }
   }

   @Override
   public void a(cpq $$0, dfe $$1, ehe $$2, cch $$3) {
      gw $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3 instanceof cct && $$3.dn().f() > 0.6) {
         $$0.b($$4, true);
      }
   }

   @Override
   public void a(cpq $$0, dfe $$1, gw $$2, bil $$3, float $$4) {
      if ($$1.c(a) == hc.b && $$1.c(b) == dgb.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ag().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      if (h($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (o($$0) && !this.a($$0, (cpt)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (cpt)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dfe $$0, akn $$1, gw $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (cpt)$$1, $$2)) {
            Optional<cyg.a> $$4 = b((cpq)$$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eag $$5 = $$4.get().b;
               float $$6;
               if ($$5 == eai.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != eai.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  gw $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(csr.rH) && $$5 == eai.c) {
                        dfe $$10 = csr.dR.n();
                        $$1.b($$4.get().a, $$10);
                        csq.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(djo.c, $$4.get().a, djo.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        gw $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dfe $$14 = $$1.a_($$11);
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
   public dfe a(cli $$0) {
      cpr $$1 = $$0.q();
      gw $$2 = $$0.a();
      hc $$3 = $$0.e().g();
      hc $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dgb $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.n().a(a, $$4).a(b, $$6).a(c, Boolean.valueOf($$1.b_($$2).a() == eai.c));
      }
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(c) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public eib f(dfe $$0, cow $$1, gw $$2) {
      return ehy.a();
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      dgb $$4 = $$0.c(b);
      eib $$5;
      if ($$4 == dgb.a) {
         $$5 = K;
      } else if ($$4 == dgb.b) {
         if ($$0.c(a) == hc.a) {
            $$5 = M;
         } else {
            $$5 = L;
         }
      } else if ($$4 == dgb.c) {
         $$5 = N;
      } else if ($$4 == dgb.d) {
         $$5 = O;
      } else {
         $$5 = P;
      }

      ehi $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   public boolean a_(dfe $$0, cow $$1, gw $$2) {
      return false;
   }

   @Override
   public float ak_() {
      return 0.125F;
   }

   @Override
   public void a(cpq $$0, gw $$1, byh $$2) {
      if (!$$2.aS()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bhj a(bil $$0) {
      return $$0.dL().c($$0);
   }

   private static void a(dfe $$0, akn $$1, gw $$2) {
      gw.a $$3 = $$2.j();
      dfe $$4 = $$0;

      while (n($$4)) {
         byh $$5 = byh.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(hc.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dfe $$0, akn $$1, gw $$2, arx $$3) {
      dfe $$4 = $$1.a_($$2.b(1));
      dfe $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         gw $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dfe $$7 = $$1.a_($$6);
            if (h($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, hc.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(akn $$0, gw $$1) {
      gw.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(hc.a);
         dfe $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, hc.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, hc.b);
            return;
         }

         if (c($$0, $$2, hc.b) && !$$0.y($$2.d())) {
            a($$0, $$2.d(), hc.b);
            return;
         }

         if (!b((cow)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(akn $$0, gw $$1, hc $$2) {
      gw $$3 = $$1.a($$2);
      dfe $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (cpr)$$0, $$3);
      } else if ($$4.i() || $$4.a(csr.G)) {
         a($$0, $$3, $$2, dgb.b);
      }
   }

   private static void a(cpr $$0, gw $$1, hc $$2, dgb $$3) {
      dfe $$4 = csr.rs.n().a(a, $$2).a(b, $$3).a(c, Boolean.valueOf($$0.b_($$1).a() == eai.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dfe $$0, cpr $$1, gw $$2) {
      gw $$4;
      gw $$3;
      if ($$0.c(a) == hc.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, hc.a, dgb.a);
      a($$1, $$3, hc.b, dgb.a);
   }

   public static void a(cpq $$0, gw $$1, dfe $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(cpq $$0, gw $$1, dfe $$2, eag $$3) {
      ehi $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      eag $$9 = a($$0, $$3);
      iv $$10 = $$9.a(apt.b) ? ix.aF : ix.aH;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static gw a(dfe $$0, cpr $$1, gw $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         hc $$5 = $$0.c(a);
         BiPredicate<gw, dfe> $$6 = ($$1x, $$2x) -> $$2x.a(csr.rs) && $$2x.c(a) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static hc b(cpt $$0, gw $$1, hc $$2) {
      hc $$3;
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

   private static dgb a(cpt $$0, gw $$1, hc $$2, boolean $$3) {
      hc $$4 = $$2.g();
      dfe $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(b) != dgb.a ? dgb.b : dgb.a;
      } else if (!b($$5, $$2)) {
         return dgb.b;
      } else {
         dgb $$6 = $$5.c(b);
         if ($$6 != dgb.b && $$6 != dgb.a) {
            dfe $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dgb.e : dgb.d;
         } else {
            return dgb.c;
         }
      }
   }

   public static boolean h(dfe $$0) {
      return n($$0) && $$0.c(b) == dgb.b && !$$0.c(c);
   }

   private static boolean b(dfe $$0, akn $$1, gw $$2) {
      hc $$3 = $$0.c(a);
      gw $$4 = $$2.a($$3);
      dfe $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<gw> a(cpq $$0, gw $$1, dfe $$2, int $$3) {
      hc $$4 = $$2.c(a);
      BiPredicate<gw, dfe> $$5 = ($$1x, $$2x) -> $$2x.a(csr.rs) && $$2x.c(a) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(csr.rs), $$3);
   }

   private static boolean c(cpt $$0, gw $$1, hc $$2) {
      gw $$3 = $$1.a($$2.g());
      dfe $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dfe $$0, boolean $$1) {
      if (!$$0.a(csr.rs)) {
         return false;
      } else {
         dgb $$2 = $$0.c(b);
         return $$2 == dgb.b || $$1 && $$2 == dgb.a;
      }
   }

   private static boolean a(dfe $$0, hc $$1) {
      return a($$0, false) && $$0.c(a) == $$1;
   }

   private static boolean n(dfe $$0) {
      return b($$0, hc.a);
   }

   private static boolean o(dfe $$0) {
      return b($$0, hc.b);
   }

   private static boolean b(dfe $$0, cpt $$1, gw $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(csr.rs);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }

   private static boolean b(dfe $$0, hc $$1) {
      return $$0.a(csr.rs) && $$0.c(a) == $$1;
   }

   @Nullable
   private static gw a(cpq $$0, gw $$1, eag $$2) {
      Predicate<dfe> $$3 = $$1x -> $$1x.b() instanceof crj && ((crj)$$1x.b()).a($$2);
      BiPredicate<gw, dfe> $$4 = ($$1x, $$2x) -> b((cow)$$0, $$1x, $$2x);
      return a($$0, $$1, hc.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static gw a(cpq $$0, gw $$1) {
      BiPredicate<gw, dfe> $$2 = ($$1x, $$2x) -> b((cow)$$0, $$1x, $$2x);
      return a($$0, $$1, hc.b.f(), $$2, cyg::h, 11).orElse(null);
   }

   public static eag a(akn $$0, gw $$1) {
      return b((cpq)$$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(cyg::a).orElse(eai.a);
   }

   private static Optional<cyg.a> b(cpq $$0, gw $$1, dfe $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         gw $$2x = $$1x.c();
         dfe $$3 = $$0.a_($$2x);
         eag $$4;
         if ($$3.a(csr.rH) && !$$0.x_().i()) {
            $$4 = eai.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new cyg.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eag $$0) {
      return $$0 == eai.e || $$0 == eai.c;
   }

   private static boolean a(dfe $$0, dfe $$1) {
      return $$0.a(csr.rt) && $$1.a(csr.G) && $$1.u().b();
   }

   private static eag a(cpq $$0, eag $$1) {
      if ($$1.a(eai.a)) {
         return $$0.x_().i() ? eai.e : eai.c;
      } else {
         return $$1;
      }
   }

   private static Optional<gw> a(cpr $$0, gw $$1, hc.b $$2, BiPredicate<gw, dfe> $$3, Predicate<dfe> $$4, int $$5) {
      hc $$6 = hc.a($$2, hc.a.b);
      gw.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dfe $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean b(cow $$0, gw $$1, dfe $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         eib $$3 = $$2.k($$0, $$1);
         return !ehy.c(R, $$3, ehm.i);
      }
   }

   static record a(gw a, eag b, dfe c) {
   }
}
