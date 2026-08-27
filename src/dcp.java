import com.google.common.annotations.VisibleForTesting;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dcp extends cwy implements czt, ddy {
   public static final MapCodec<dcp> a = b(dcp::new);
   public static final dkj b = dkf.bm;
   public static final dkn<dkm> c = dkf.bn;
   public static final dkg d = dkf.C;
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
   private static final emv M = cwy.a(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
   private static final emv N = cwy.a(5.0, 0.0, 5.0, 11.0, 11.0, 11.0);
   private static final emv O = cwy.a(5.0, 5.0, 5.0, 11.0, 16.0, 11.0);
   private static final emv P = cwy.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);
   private static final emv Q = cwy.a(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
   private static final emv R = cwy.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);
   private static final float S = 0.125F;
   private static final emv T = cwy.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);

   @Override
   public MapCodec<dcp> a() {
      return a;
   }

   public dcp(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ic.b).a(c, dkm.b).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      return c($$1, $$2, $$0.c(b));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      if ($$1 != ic.b && $$1 != ic.a) {
         return $$0;
      } else {
         ic $$6 = $$0.c(b);
         if ($$6 == ic.a && $$3.N().a($$4, this)) {
            return $$0;
         } else if ($$1 == $$6.g() && !this.a($$0, (cua)$$3, $$4)) {
            if ($$6 == ic.a) {
               $$3.a($$4, this, 2);
            } else {
               $$3.a($$4, this, 1);
            }

            return $$0;
         } else {
            boolean $$7 = $$0.c(c) == dkm.a;
            dkm $$8 = a($$3, $$4, $$6, $$7);
            return $$0.a(c, $$8);
         }
      }
   }

   @Override
   public void a(ctx $$0, djp $$1, ely $$2, cgi $$3) {
      if (!$$0.B) {
         hx $$4 = $$2.a();
         if ($$3.a($$0, $$4) && $$3.b($$0) && $$3 instanceof cgu && $$3.do().f() > 0.6) {
            $$0.b($$4, true);
         }
      }
   }

   @Override
   public void a(ctx $$0, djp $$1, hx $$2, blw $$3, float $$4) {
      if ($$1.c(b) == ic.b && $$1.c(c) == dkm.b) {
         $$3.a($$4 + 2.0F, 2.0F, $$0.ai().u());
      } else {
         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if (h($$0)) {
         float $$4 = $$3.i();
         if (!($$4 > 0.12F)) {
            b($$1, $$2, $$0).filter($$1x -> $$4 < 0.02F || a($$1x.b)).ifPresent($$3x -> a($$1, $$2, $$0, $$3x.b));
         }
      }
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (o($$0) && !this.a($$0, (cua)$$1, $$2)) {
         $$1.b($$2, true);
      } else {
         a($$0, $$1, $$2);
      }
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      a($$0, $$1, $$2, $$3.i());
      if ($$3.i() < 0.011377778F && b($$0, (cua)$$1, $$2)) {
         c($$0, $$1, $$2, $$3);
      }
   }

   @VisibleForTesting
   public static void a(djp $$0, ane $$1, hx $$2, float $$3) {
      if (!($$3 > 0.17578125F) || !($$3 > 0.05859375F)) {
         if (b($$0, (cua)$$1, $$2)) {
            Optional<dcp.a> $$4 = b($$1, $$2, $$0);
            if (!$$4.isEmpty()) {
               eey $$5 = $$4.get().b;
               float $$6;
               if ($$5 == efa.c) {
                  $$6 = 0.17578125F;
               } else {
                  if ($$5 != efa.e) {
                     return;
                  }

                  $$6 = 0.05859375F;
               }

               if (!($$3 >= $$6)) {
                  hx $$9 = a($$0, $$1, $$2, 11, false);
                  if ($$9 != null) {
                     if ($$4.get().c.a(cxa.sI) && $$5 == efa.c) {
                        djp $$10 = cxa.dR.o();
                        $$1.b($$4.get().a, $$10);
                        cwy.a($$4.get().c, $$10, $$1, $$4.get().a);
                        $$1.a(dnz.c, $$4.get().a, dnz.a.a($$10));
                        $$1.c(1504, $$9, 0);
                     } else {
                        hx $$11 = a($$1, $$9, $$5);
                        if ($$11 != null) {
                           $$1.c(1504, $$9, 0);
                           int $$12 = $$9.v() - $$11.v();
                           int $$13 = 50 + $$12;
                           djp $$14 = $$1.a_($$11);
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
   public djp a(cpp $$0) {
      cty $$1 = $$0.q();
      hx $$2 = $$0.a();
      ic $$3 = $$0.e().g();
      ic $$4 = b($$1, $$2, $$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = !$$0.h();
         dkm $$6 = a($$1, $$2, $$4, $$5);
         return $$6 == null ? null : this.o().a(b, $$4).a(c, $$6).a(d, Boolean.valueOf($$1.b_($$2).a() == efa.c));
      }
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(d) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public emv f(djp $$0, ctd $$1, hx $$2) {
      return ems.a();
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      dkm $$4 = $$0.c(c);
      emv $$5;
      if ($$4 == dkm.a) {
         $$5 = M;
      } else if ($$4 == dkm.b) {
         if ($$0.c(b) == ic.a) {
            $$5 = O;
         } else {
            $$5 = N;
         }
      } else if ($$4 == dkm.c) {
         $$5 = P;
      } else if ($$4 == dkm.d) {
         $$5 = Q;
      } else {
         $$5 = R;
      }

      emc $$11 = $$0.n($$1, $$2);
      return $$5.a($$11.c, 0.0, $$11.e);
   }

   @Override
   public boolean c(djp $$0, ctd $$1, hx $$2) {
      return false;
   }

   @Override
   public float aw_() {
      return 0.125F;
   }

   @Override
   public void a(ctx $$0, hx $$1, cca $$2) {
      if (!$$2.aU()) {
         $$0.c(1045, $$1, 0);
      }
   }

   @Override
   public bkv a(blw $$0) {
      return $$0.dM().c($$0);
   }

   private static void a(djp $$0, ane $$1, hx $$2) {
      hx.a $$3 = $$2.j();
      djp $$4 = $$0;

      while (n($$4)) {
         cca $$5 = cca.a($$1, $$3, $$4);
         if (a($$4, true)) {
            int $$6 = Math.max(1 + $$2.v() - $$3.v(), 6);
            float $$7 = 1.0F * (float)$$6;
            $$5.b($$7, 40);
            break;
         }

         $$3.c(ic.a);
         $$4 = $$1.a_($$3);
      }
   }

   @VisibleForTesting
   public static void c(djp $$0, ane $$1, hx $$2, auw $$3) {
      djp $$4 = $$1.a_($$2.b(1));
      djp $$5 = $$1.a_($$2.b(2));
      if (a($$4, $$5)) {
         hx $$6 = a($$0, $$1, $$2, 7, false);
         if ($$6 != null) {
            djp $$7 = $$1.a_($$6);
            if (h($$7) && b($$7, $$1, $$6)) {
               if ($$3.h()) {
                  a($$1, $$6, ic.a);
               } else {
                  b($$1, $$6);
               }
            }
         }
      }
   }

   private static void b(ane $$0, hx $$1) {
      hx.a $$2 = $$1.j();

      for (int $$3 = 0; $$3 < 10; $$3++) {
         $$2.c(ic.a);
         djp $$4 = $$0.a_($$2);
         if (!$$4.u().c()) {
            return;
         }

         if (a($$4, ic.b) && b($$4, $$0, $$2)) {
            a($$0, $$2, ic.b);
            return;
         }

         if (c($$0, $$2, ic.b) && !$$0.z($$2.d())) {
            a($$0, $$2.d(), ic.b);
            return;
         }

         if (!a((ctd)$$0, $$2, $$4)) {
            return;
         }
      }
   }

   private static void a(ane $$0, hx $$1, ic $$2) {
      hx $$3 = $$1.a($$2);
      djp $$4 = $$0.a_($$3);
      if (a($$4, $$2.g())) {
         a($$4, (cty)$$0, $$3);
      } else if ($$4.i() || $$4.a(cxa.G)) {
         a($$0, $$3, $$2, dkm.b);
      }
   }

   private static void a(cty $$0, hx $$1, ic $$2, dkm $$3) {
      djp $$4 = cxa.st.o().a(b, $$2).a(c, $$3).a(d, Boolean.valueOf($$0.b_($$1).a() == efa.c));
      $$0.a($$1, $$4, 3);
   }

   private static void a(djp $$0, cty $$1, hx $$2) {
      hx $$4;
      hx $$3;
      if ($$0.c(b) == ic.b) {
         $$3 = $$2;
         $$4 = $$2.c();
      } else {
         $$4 = $$2;
         $$3 = $$2.d();
      }

      a($$1, $$4, ic.a, dkm.a);
      a($$1, $$3, ic.b, dkm.a);
   }

   public static void a(ctx $$0, hx $$1, djp $$2) {
      b($$0, $$1, $$2).ifPresent($$3 -> a($$0, $$1, $$2, $$3.b));
   }

   private static void a(ctx $$0, hx $$1, djp $$2, eey $$3) {
      emc $$4 = $$2.n($$0, $$1);
      double $$5 = 0.0625;
      double $$6 = (double)$$1.u() + 0.5 + $$4.c;
      double $$7 = (double)((float)($$1.v() + 1) - 0.6875F) - 0.0625;
      double $$8 = (double)$$1.w() + 0.5 + $$4.e;
      eey $$9 = a($$0, $$3);
      jv $$10 = $$9.a(asn.b) ? jx.aI : jx.aK;
      $$0.a($$10, $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Nullable
   private static hx a(djp $$0, cty $$1, hx $$2, int $$3, boolean $$4) {
      if (a($$0, $$4)) {
         return $$2;
      } else {
         ic $$5 = $$0.c(b);
         BiPredicate<hx, djp> $$6 = ($$1x, $$2x) -> $$2x.a(cxa.st) && $$2x.c(b) == $$5;
         return a($$1, $$2, $$5.f(), $$6, $$1x -> a($$1x, $$4), $$3).orElse(null);
      }
   }

   @Nullable
   private static ic b(cua $$0, hx $$1, ic $$2) {
      ic $$3;
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

   private static dkm a(cua $$0, hx $$1, ic $$2, boolean $$3) {
      ic $$4 = $$2.g();
      djp $$5 = $$0.a_($$1.a($$2));
      if (b($$5, $$4)) {
         return !$$3 && $$5.c(c) != dkm.a ? dkm.b : dkm.a;
      } else if (!b($$5, $$2)) {
         return dkm.b;
      } else {
         dkm $$6 = $$5.c(c);
         if ($$6 != dkm.b && $$6 != dkm.a) {
            djp $$7 = $$0.a_($$1.a($$4));
            return !b($$7, $$2) ? dkm.e : dkm.d;
         } else {
            return dkm.c;
         }
      }
   }

   public static boolean h(djp $$0) {
      return n($$0) && $$0.c(c) == dkm.b && !$$0.c(d);
   }

   private static boolean b(djp $$0, ane $$1, hx $$2) {
      ic $$3 = $$0.c(b);
      hx $$4 = $$2.a($$3);
      djp $$5 = $$1.a_($$4);
      if (!$$5.u().c()) {
         return false;
      } else {
         return $$5.i() ? true : a($$5, $$3.g());
      }
   }

   private static Optional<hx> a(ctx $$0, hx $$1, djp $$2, int $$3) {
      ic $$4 = $$2.c(b);
      BiPredicate<hx, djp> $$5 = ($$1x, $$2x) -> $$2x.a(cxa.st) && $$2x.c(b) == $$4;
      return a($$0, $$1, $$4.g().f(), $$5, $$0x -> !$$0x.a(cxa.st), $$3);
   }

   private static boolean c(cua $$0, hx $$1, ic $$2) {
      hx $$3 = $$1.a($$2.g());
      djp $$4 = $$0.a_($$3);
      return $$4.d($$0, $$3, $$2) || b($$4, $$2);
   }

   private static boolean a(djp $$0, boolean $$1) {
      if (!$$0.a(cxa.st)) {
         return false;
      } else {
         dkm $$2 = $$0.c(c);
         return $$2 == dkm.b || $$1 && $$2 == dkm.a;
      }
   }

   private static boolean a(djp $$0, ic $$1) {
      return a($$0, false) && $$0.c(b) == $$1;
   }

   private static boolean n(djp $$0) {
      return b($$0, ic.a);
   }

   private static boolean o(djp $$0) {
      return b($$0, ic.b);
   }

   private static boolean b(djp $$0, cua $$1, hx $$2) {
      return n($$0) && !$$1.a_($$2.c()).a(cxa.st);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   private static boolean b(djp $$0, ic $$1) {
      return $$0.a(cxa.st) && $$0.c(b) == $$1;
   }

   @Nullable
   private static hx a(ctx $$0, hx $$1, eey $$2) {
      Predicate<djp> $$3 = $$1x -> $$1x.b() instanceof cvr && ((cvr)$$1x.b()).a($$2);
      BiPredicate<hx, djp> $$4 = ($$1x, $$2x) -> a((ctd)$$0, $$1x, $$2x);
      return a($$0, $$1, ic.a.f(), $$4, $$3, 11).orElse(null);
   }

   @Nullable
   public static hx a(ctx $$0, hx $$1) {
      BiPredicate<hx, djp> $$2 = ($$1x, $$2x) -> a((ctd)$$0, $$1x, $$2x);
      return a($$0, $$1, ic.b.f(), $$2, dcp::h, 11).orElse(null);
   }

   public static eey a(ane $$0, hx $$1) {
      return b($$0, $$1, $$0.a_($$1)).map($$0x -> $$0x.b).filter(dcp::a).orElse(efa.a);
   }

   private static Optional<dcp.a> b(ctx $$0, hx $$1, djp $$2) {
      return !n($$2) ? Optional.empty() : a($$0, $$1, $$2, 11).map($$1x -> {
         hx $$2x = $$1x.c();
         djp $$3 = $$0.a_($$2x);
         eey $$4;
         if ($$3.a(cxa.sI) && !$$0.E_().i()) {
            $$4 = efa.c;
         } else {
            $$4 = $$0.b_($$2x).a();
         }

         return new dcp.a($$2x, $$4, $$3);
      });
   }

   private static boolean a(eey $$0) {
      return $$0 == efa.e || $$0 == efa.c;
   }

   private static boolean a(djp $$0, djp $$1) {
      return $$0.a(cxa.su) && $$1.a(cxa.G) && $$1.u().b();
   }

   private static eey a(ctx $$0, eey $$1) {
      if ($$1.a(efa.a)) {
         return $$0.E_().i() ? efa.e : efa.c;
      } else {
         return $$1;
      }
   }

   private static Optional<hx> a(cty $$0, hx $$1, ic.b $$2, BiPredicate<hx, djp> $$3, Predicate<djp> $$4, int $$5) {
      ic $$6 = ic.a($$2, ic.a.b);
      hx.a $$7 = $$1.j();

      for (int $$8 = 1; $$8 < $$5; $$8++) {
         $$7.c($$6);
         djp $$9 = $$0.a_($$7);
         if ($$4.test($$9)) {
            return Optional.of($$7.i());
         }

         if ($$0.d($$7.v()) || !$$3.test($$7, $$9)) {
            return Optional.empty();
         }
      }

      return Optional.empty();
   }

   private static boolean a(ctd $$0, hx $$1, djp $$2) {
      if ($$2.i()) {
         return true;
      } else if ($$2.i($$0, $$1)) {
         return false;
      } else if (!$$2.u().c()) {
         return false;
      } else {
         emv $$3 = $$2.k($$0, $$1);
         return !ems.c(T, $$3, emg.i);
      }
   }

   static record a(hx a, eey b, djp c) {
   }
}
