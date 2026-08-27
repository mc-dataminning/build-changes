import com.google.common.annotations.VisibleForTesting;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cvd extends cpn implements cse, cwo {
   public static final dcv a = dcr.bm;
   public static final dcz<dcy> b = dcr.bn;
   public static final dcs c = dcr.C;
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
   private static final efb K = cpn.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final efb L = cpn.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final efb M = cpn.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final efb N = cpn.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final efb O = cpn.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final efb P = cpn.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float Q = 0.125F;
   private static final efb R = cpn.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   public cvd(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.b).a(b, dcy.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(a, b, c);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      return c($$1, $$2, $$0.c(a));
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, dxf.c, dxf.c.a($$3));
      }

      if ($$1 != ha.b && $$1 != ha.a) {
         return $$0;
      } else {
         ha $$6 = $$0.c(a);
         if ($$6 == ha.a && $$3.L().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (cmp)$$3, $$4)) {
            if ($$6 == ha.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(b) == dcy.a;
            dcy $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(b, $$8);
         }
      }
   }

   @Override
   public void a(cmm $$0, dcb $$1, eee $$2, bzg $$3) {
      gu $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3 instanceof bzs && $$3.dl().f() > 0.6) {
         $$0.b($$4, true);
      }
   }

   @Override
   public void a(cmm $$0, dcb $$1, gu $$2, bfj $$3, float $$4) {
      if ($$1.c(a) == ha.b && $$1.c(b) == dcy.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ag().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      if (h($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   public void a(dcb $$0, aif $$1, gu $$2, apf $$3) {
      if (o($$0) && !this.a($$0, (cmp)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (cmp)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dcb $$0, aif $$1, gu $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (cmp)$$1, $$2)) {
            Optional<cvd.a> $$4 = b((cmm)$$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               dxd $$5 = $$4.get().b;
               float $$6;
               if ($$5 == dxf.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != dxf.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  gu $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(cpo.rH) && $$5 == dxf.c) {
                        dcb $$10 = cpo.dR.n();
                        $$1.b($$4.get().a, $$10);
                        cpn.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dgl.c, $$4.get().a, dgl.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        gu $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dcb $$14 = $$1.a_($$11);
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
   public dcb a(cih $$0) {
      cmn $$1 = $$0.q();
      gu $$2 = $$0.a();
      ha $$3 = $$0.e().g();
      ha $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dcy $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.n().a(a, $$4).a(b, $$6).a(c, Boolean.valueOf($$1.b_($$2).a() == dxf.c));
      }
   }

   @Override
   public dxe c_(dcb $$0) {
      return $$0.c(c) ? dxf.c.a(false) : super.c_($$0);
   }

   @Override
   public efb f(dcb $$0, cls $$1, gu $$2) {
      return eey.a();
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      dcy $$4 = $$0.c(b);
      efb $$5;
      if ($$4 == dcy.a) {
         $$5 = K;
      } else if ($$4 == dcy.b) {
         if ($$0.c(a) == ha.a) {
            $$5 = M;
         } else {
            $$5 = L;
         }
      } else if ($$4 == dcy.c) {
         $$5 = N;
      } else if ($$4 == dcy.d) {
         $$5 = O;
      } else {
         $$5 = P;
      }

      eei $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   public boolean a_(dcb $$0, cls $$1, gu $$2) {
      return false;
   }

   @Override
   public float al_() {
      return 0.125F;
   }

   @Override
   public void a(cmm $$0, gu $$1, bvg $$2) {
      if (!$$2.aQ()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public ben a(bfj $$0) {
      return $$0.dJ().c($$0);
   }

   private static void a(dcb $$0, aif $$1, gu $$2) {
      gu.a $$3 = $$2.j();
      dcb $$4 = $$0;

      while (n($$4)) {
         bvg $$5 = bvg.a($$1, $$3, $$4);
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
   public static void c(dcb $$0, aif $$1, gu $$2, apf $$3) {
      dcb $$4 = $$1.a_($$2.b(1));
      dcb $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         gu $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dcb $$7 = $$1.a_($$6);
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

   private static void b(aif $$0, gu $$1) {
      gu.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ha.a);
         dcb $$4 = $$0.a_($$2);
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

         if (!b((cls)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(aif $$0, gu $$1, ha $$2) {
      gu $$3 = $$1.a($$2);
      dcb $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (cmn)$$0, $$3);
      } else if ($$4.i() || $$4.a(cpo.G)) {
         a($$0, $$3, $$2, dcy.b);
      }
   }

   private static void a(cmn $$0, gu $$1, ha $$2, dcy $$3) {
      dcb $$4 = cpo.rs.n().a(a, $$2).a(b, $$3).a(c, Boolean.valueOf($$0.b_($$1).a() == dxf.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dcb $$0, cmn $$1, gu $$2) {
      gu $$4;
      gu $$3;
      if ($$0.c(a) == ha.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, ha.a, dcy.a);
      a($$1, $$3, ha.b, dcy.a);
   }

   public static void a(cmm $$0, gu $$1, dcb $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(cmm $$0, gu $$1, dcb $$2, dxd $$3) {
      eei $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      dxd $$9 = a($$0, $$3);
      it $$10 = $$9.a(anb.b) ? iv.aF : iv.aH;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static gu a(dcb $$0, cmn $$1, gu $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ha $$5 = $$0.c(a);
         BiPredicate<gu, dcb> $$6 = ($$1x, $$2x) -> $$2x.a(cpo.rs) && $$2x.c(a) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ha b(cmp $$0, gu $$1, ha $$2) {
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

   private static dcy a(cmp $$0, gu $$1, ha $$2, boolean $$3) {
      ha $$4 = $$2.g();
      dcb $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(b) != dcy.a ? dcy.b : dcy.a;
      } else if (!b($$5, $$2)) {
         return dcy.b;
      } else {
         dcy $$6 = $$5.c(b);
         if ($$6 != dcy.b && $$6 != dcy.a) {
            dcb $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dcy.e : dcy.d;
         } else {
            return dcy.c;
         }
      }
   }

   public static boolean h(dcb $$0) {
      return n($$0) && $$0.c(b) == dcy.b && !$$0.c(c);
   }

   private static boolean b(dcb $$0, aif $$1, gu $$2) {
      ha $$3 = $$0.c(a);
      gu $$4 = $$2.a($$3);
      dcb $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<gu> a(cmm $$0, gu $$1, dcb $$2, int $$3) {
      ha $$4 = $$2.c(a);
      BiPredicate<gu, dcb> $$5 = ($$1x, $$2x) -> $$2x.a(cpo.rs) && $$2x.c(a) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(cpo.rs), $$3);
   }

   private static boolean c(cmp $$0, gu $$1, ha $$2) {
      gu $$3 = $$1.a($$2.g());
      dcb $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dcb $$0, boolean $$1) {
      if (!$$0.a(cpo.rs)) {
         return false;
      } else {
         dcy $$2 = $$0.c(b);
         return $$2 == dcy.b || $$1 && $$2 == dcy.a;
      }
   }

   private static boolean a(dcb $$0, ha $$1) {
      return a($$0, false) && $$0.c(a) == $$1;
   }

   private static boolean n(dcb $$0) {
      return b($$0, ha.a);
   }

   private static boolean o(dcb $$0) {
      return b($$0, ha.b);
   }

   private static boolean b(dcb $$0, cmp $$1, gu $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(cpo.rs);
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }

   private static boolean b(dcb $$0, ha $$1) {
      return $$0.a(cpo.rs) && $$0.c(a) == $$1;
   }

   @Nullable
   private static gu a(cmm $$0, gu $$1, dxd $$2) {
      Predicate<dcb> $$3 = $$1x -> $$1x.b() instanceof cof && ((cof)$$1x.b()).a($$2);
      BiPredicate<gu, dcb> $$4 = ($$1x, $$2x) -> b((cls)$$0, $$1x, $$2x);
      return a($$0, $$1, ha.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static gu a(cmm $$0, gu $$1) {
      BiPredicate<gu, dcb> $$2 = ($$1x, $$2x) -> b((cls)$$0, $$1x, $$2x);
      return a($$0, $$1, ha.b.f(), $$2, cvd::h, 11).orElse(null);
   }

   public static dxd a(aif $$0, gu $$1) {
      return b((cmm)$$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(cvd::a).orElse(dxf.a);
   }

   private static Optional<cvd.a> b(cmm $$0, gu $$1, dcb $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         gu $$2x = $$1x.c();
         dcb $$3 = $$0.a_($$2x);
         dxd $$4;
         if ($$3.a(cpo.rH) && !$$0.x_().i()) {
            $$4 = dxf.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new cvd.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(dxd $$0) {
      return $$0 == dxf.e || $$0 == dxf.c;
   }

   private static boolean a(dcb $$0, dcb $$1) {
      return $$0.a(cpo.rt) && $$1.a(cpo.G) && $$1.u().b();
   }

   private static dxd a(cmm $$0, dxd $$1) {
      if ($$1.a(dxf.a)) {
         return $$0.x_().i() ? dxf.e : dxf.c;
      } else {
         return $$1;
      }
   }

   private static Optional<gu> a(cmn $$0, gu $$1, ha.b $$2, BiPredicate<gu, dcb> $$3, Predicate<dcb> $$4, int $$5) {
      ha $$6 = ha.a($$2, ha.a.b);
      gu.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dcb $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean b(cls $$0, gu $$1, dcb $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         efb $$3 = $$2.k($$0, $$1);
         return !eey.c(R, $$3, eem.i);
      }
   }

   static record a(gu a, dxd b, dcb c) {
   }
}
