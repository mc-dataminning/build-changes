import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class daw extends cvf implements cya, dcf {
   public static final MapCodec<daw> a = b(daw::new);
   public static final dih b = did.bm;
   public static final dil<dik> c = did.bn;
   public static final die d = did.C;
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
   private static final eks M = cvf.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final eks N = cvf.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final eks O = cvf.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final eks P = cvf.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final eks Q = cvf.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final eks R = cvf.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final eks T = cvf.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<daw> a() {
      return a;
   }

   public daw(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ib.b).a(c, dik.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      if ($$1 != ib.b && $$1 != ib.a) {
         return $$0;
      } else {
         ib $$6 = $$0.c(b);
         if ($$6 == ib.a && $$3.M().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (csi)$$3, $$4)) {
            if ($$6 == ib.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dik.a;
            dik $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   public void a(csf $$0, dhn $$1, ejv $$2, cer $$3) {
      hx $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cfd && $$3.dq().f() > 0.6) {
         $$0.b($$4, true);
      }
   }

   @Override
   public void a(csf $$0, dhn $$1, hx $$2, bkv $$3, float $$4) {
      if ($$1.c(b) == ib.b && $$1.c(c) == dik.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ah().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if (h($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (o($$0) && !this.a($$0, (csi)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (csi)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(dhn $$0, ami $$1, hx $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (csi)$$1, $$2)) {
            Optional<daw.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               ecw $$5 = $$4.get().b;
               float $$6;
               if ($$5 == ecy.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != ecy.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  hx $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(cvh.sI) && $$5 == ecy.c) {
                        dhn $$10 = cvh.dR.o();
                        $$1.b($$4.get().a, $$10);
                        cvf.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dlx.c, $$4.get().a, dlx.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        hx $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           dhn $$14 = $$1.a_($$11);
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
   public dhn a(cnw $$0) {
      csg $$1 = $$0.q();
      hx $$2 = $$0.a();
      ib $$3 = $$0.e().g();
      ib $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dik $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == ecy.c));
      }
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(d) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public eks f(dhn $$0, crl $$1, hx $$2) {
      return ekp.a();
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      dik $$4 = $$0.c(c);
      eks $$5;
      if ($$4 == dik.a) {
         $$5 = M;
      } else if ($$4 == dik.b) {
         if ($$0.c(b) == ib.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dik.c) {
         $$5 = P;
      } else if ($$4 == dik.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      ejz $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   public boolean c(dhn $$0, crl $$1, hx $$2) {
      return false;
   }

   @Override
   public float au_() {
      return 0.125F;
   }

   @Override
   public void a(csf $$0, hx $$1, car $$2) {
      if (!$$2.aU()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bjt a(bkv $$0) {
      return $$0.dO().c($$0);
   }

   private static void a(dhn $$0, ami $$1, hx $$2) {
      hx.a $$3 = $$2.j();
      dhn $$4 = $$0;

      while (n($$4)) {
         car $$5 = car.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(ib.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(dhn $$0, ami $$1, hx $$2, atw $$3) {
      dhn $$4 = $$1.a_($$2.b(1));
      dhn $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         hx $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            dhn $$7 = $$1.a_($$6);
            if (h($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, ib.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(ami $$0, hx $$1) {
      hx.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ib.a);
         dhn $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, ib.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, ib.b);
            return;
         }

         if (c($$0, $$2, ib.b) && !$$0.y($$2.d())) {
            a($$0, $$2.d(), ib.b);
            return;
         }

         if (!a((crl)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(ami $$0, hx $$1, ib $$2) {
      hx $$3 = $$1.a($$2);
      dhn $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (csg)$$0, $$3);
      } else if ($$4.i() || $$4.a(cvh.G)) {
         a($$0, $$3, $$2, dik.b);
      }
   }

   private static void a(csg $$0, hx $$1, ib $$2, dik $$3) {
      dhn $$4 = cvh.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == ecy.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(dhn $$0, csg $$1, hx $$2) {
      hx $$4;
      hx $$3;
      if ($$0.c(b) == ib.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, ib.a, dik.a);
      a($$1, $$3, ib.b, dik.a);
   }

   public static void a(csf $$0, hx $$1, dhn $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(csf $$0, hx $$1, dhn $$2, ecw $$3) {
      ejz $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      ecw $$9 = a($$0, $$3);
      ju $$10 = $$9.a(arp.b) ? jw.aG : jw.aI;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static hx a(dhn $$0, csg $$1, hx $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ib $$5 = $$0.c(b);
         BiPredicate<hx, dhn> $$6 = ($$1x, $$2x) -> $$2x.a(cvh.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ib b(csi $$0, hx $$1, ib $$2) {
      ib $$3;
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

   private static dik a(csi $$0, hx $$1, ib $$2, boolean $$3) {
      ib $$4 = $$2.g();
      dhn $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dik.a ? dik.b : dik.a;
      } else if (!b($$5, $$2)) {
         return dik.b;
      } else {
         dik $$6 = $$5.c(c);
         if ($$6 != dik.b && $$6 != dik.a) {
            dhn $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dik.e : dik.d;
         } else {
            return dik.c;
         }
      }
   }

   public static boolean h(dhn $$0) {
      return n($$0) && $$0.c(c) == dik.b && !$$0.c(d);
   }

   private static boolean b(dhn $$0, ami $$1, hx $$2) {
      ib $$3 = $$0.c(b);
      hx $$4 = $$2.a($$3);
      dhn $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<hx> a(csf $$0, hx $$1, dhn $$2, int $$3) {
      ib $$4 = $$2.c(b);
      BiPredicate<hx, dhn> $$5 = ($$1x, $$2x) -> $$2x.a(cvh.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(cvh.st), $$3);
   }

   private static boolean c(csi $$0, hx $$1, ib $$2) {
      hx $$3 = $$1.a($$2.g());
      dhn $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(dhn $$0, boolean $$1) {
      if (!$$0.a(cvh.st)) {
         return false;
      } else {
         dik $$2 = $$0.c(c);
         return $$2 == dik.b || $$1 && $$2 == dik.a;
      }
   }

   private static boolean a(dhn $$0, ib $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(dhn $$0) {
      return b($$0, ib.a);
   }

   private static boolean o(dhn $$0) {
      return b($$0, ib.b);
   }

   private static boolean b(dhn $$0, csi $$1, hx $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(cvh.st);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   private static boolean b(dhn $$0, ib $$1) {
      return $$0.a(cvh.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static hx a(csf $$0, hx $$1, ecw $$2) {
      Predicate<dhn> $$3 = $$1x -> $$1x.b() instanceof cty && ((cty)$$1x.b()).a($$2);
      BiPredicate<hx, dhn> $$4 = ($$1x, $$2x) -> a((crl)$$0, $$1x, $$2x);
      return a($$0, $$1, ib.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static hx a(csf $$0, hx $$1) {
      BiPredicate<hx, dhn> $$2 = ($$1x, $$2x) -> a((crl)$$0, $$1x, $$2x);
      return a($$0, $$1, ib.b.f(), $$2, daw::h, 11).orElse(null);
   }

   public static ecw a(ami $$0, hx $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(daw::a).orElse(ecy.a);
   }

   private static Optional<daw.a> b(csf $$0, hx $$1, dhn $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         hx $$2x = $$1x.c();
         dhn $$3 = $$0.a_($$2x);
         ecw $$4;
         if ($$3.a(cvh.sI) && !$$0.E_().i()) {
            $$4 = ecy.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new daw.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(ecw $$0) {
      return $$0 == ecy.e || $$0 == ecy.c;
   }

   private static boolean a(dhn $$0, dhn $$1) {
      return $$0.a(cvh.su) && $$1.a(cvh.G) && $$1.u().b();
   }

   private static ecw a(csf $$0, ecw $$1) {
      if ($$1.a(ecy.a)) {
         return $$0.E_().i() ? ecy.e : ecy.c;
      } else {
         return $$1;
      }
   }

   private static Optional<hx> a(csg $$0, hx $$1, ib.b $$2, BiPredicate<hx, dhn> $$3, Predicate<dhn> $$4, int $$5) {
      ib $$6 = ib.a($$2, ib.a.b);
      hx.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         dhn $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(crl $$0, hx $$1, dhn $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         eks $$3 = $$2.k($$0, $$1);
         return !ekp.c(T, $$3, ekd.i);
      }
   }

   static record a(hx a, ecw b, dhn c) {
   }
}
