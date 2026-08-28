import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmt extends dhv {
   public static final MapCodec<dmt> a = b(dmt::new);
   public static final dwl<jm> b = dme.aF;
   public static final dwf c = dwe.w;
   public static final dwf d = dwe.o;
   public static final fal e = dij.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final fal f = dij.a(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
   public static final fal g = fai.a(e, f);
   public static final fal h = dij.a(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
   public static final fal i = fai.a(g, h);
   public static final fal j = fai.a(
      dij.a(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), dij.a(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), dij.a(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), g
   );
   public static final fal k = fai.a(
      dij.a(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), dij.a(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), dij.a(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), g
   );
   public static final fal l = fai.a(
      dij.a(10.666667, 10.0, 0.0, 15.0, 14.0, 16.0), dij.a(6.333333, 12.0, 0.0, 10.666667, 16.0, 16.0), dij.a(2.0, 14.0, 0.0, 6.333333, 18.0, 16.0), g
   );
   public static final fal m = fai.a(
      dij.a(0.0, 10.0, 10.666667, 16.0, 14.0, 15.0), dij.a(0.0, 12.0, 6.333333, 16.0, 16.0, 10.666667), dij.a(0.0, 14.0, 2.0, 16.0, 18.0, 6.333333), g
   );
   private static final int n = 2;

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   protected dmt(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf(false)));
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   protected fal d_(dvo $$0) {
      return g;
   }

   @Override
   protected boolean g_(dvo $$0) {
      return true;
   }

   @Override
   public dvo a(czw $$0) {
      dff $$1 = $$0.q();
      cwf $$2 = $$0.n();
      cor $$3 = $$0.o();
      boolean $$4 = false;
      if (!$$1.C && $$3 != null && $$3.gJ()) {
         cyo $$5 = $$2.a(ku.Y, cyo.a);
         if ($$5.a("Book")) {
            $$4 = true;
         }
      }

      return this.m().b(b, $$0.g().g()).b(d, Boolean.valueOf($$4));
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return i;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      switch ((jm)$$0.c(b)) {
         case c:
            return k;
         case d:
            return m;
         case f:
            return l;
         case e:
            return j;
         default:
            return g;
      }
   }

   @Override
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c, d);
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dtv($$0, $$1);
   }

   public static boolean a(@Nullable bve $$0, dff $$1, jh $$2, dvo $$3, cwf $$4) {
      if (!$$3.c(d)) {
         if (!$$1.C) {
            b($$0, $$1, $$2, $$3, $$4);
         }

         return true;
      } else {
         return false;
      }
   }

   private static void b(@Nullable bve $$0, dff $$1, jh $$2, dvo $$3, cwf $$4) {
      if ($$1.c_($$2) instanceof dtv $$6) {
         $$6.b($$4.b(1, $$0));
         a($$0, $$1, $$2, $$3, true);
         $$1.a(null, $$2, awo.cz, awp.e, 1.0F, 1.0F);
      }
   }

   public static void a(@Nullable bui $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      dvo $$5 = $$3.b(c, Boolean.valueOf(false)).b(d, Boolean.valueOf($$4));
      $$1.a($$2, $$5, 3);
      $$1.a(eak.c, $$2, eak.a.a($$0, $$5));
      b($$1, $$2, $$3);
   }

   public static void a(dff $$0, jh $$1, dvo $$2) {
      a($$0, $$1, $$2, true);
      $$0.a($$1, $$2.b(), 2);
      $$0.c(1043, $$1, 0);
   }

   private static void a(dff $$0, jh $$1, dvo $$2, boolean $$3) {
      $$0.a($$1, $$2.b(c, Boolean.valueOf($$3)), 3);
      b($$0, $$1, $$2);
   }

   private static void b(dff $$0, jh $$1, dvo $$2) {
      esw $$3 = ess.a($$0, $$2.c(b).g(), jm.b);
      $$0.a($$1.e(), $$2.b(), $$3);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      a($$1, $$2, $$0, false);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(c)) {
            b($$1, $$2, $$0);
         }
      }
   }

   private void e(dvo $$0, dff $$1, jh $$2) {
      if ($$1.c_($$2) instanceof dtv $$4) {
         jm $$5 = $$0.c(b);
         cwf $$6 = $$4.b().v();
         float $$7 = 0.25F * (float)$$5.j();
         float $$8 = 0.25F * (float)$$5.l();
         ckz $$9 = new ckz($$1, (double)$$2.u() + 0.5 + (double)$$7, (double)($$2.v() + 1), (double)$$2.w() + 0.5 + (double)$$8, $$6);
         $$9.q();
         $$1.b($$9);
         $$4.a();
      }
   }

   @Override
   protected boolean f_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$0.c(c) ? 15 : 0;
   }

   @Override
   protected int b(dvo $$0, dek $$1, jh $$2, jm $$3) {
      return $$3 == jm.b && $$0.c(c) ? 15 : 0;
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      if ($$0.c(d)) {
         dsr $$3 = $$1.c_($$2);
         if ($$3 instanceof dtv) {
            return ((dtv)$$3).j();
         }
      }

      return 0;
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      if ($$1.c(d)) {
         return bsh.f;
      } else if ($$0.a(axm.aZ)) {
         return (bsh)(a($$4, $$2, $$3, $$1, $$0) ? bsh.a : bsh.e);
      } else {
         return (bsh)($$0.f() && $$5 == bsg.a ? bsh.e : bsh.f);
      }
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if ($$0.c(d)) {
         if (!$$1.C) {
            this.a($$1, $$2, $$3);
         }

         return bsh.a;
      } else {
         return bsh.c;
      }
   }

   @Nullable
   @Override
   protected bsj b(dvo $$0, dff $$1, jh $$2) {
      return !$$0.c(d) ? null : super.b($$0, $$1, $$2);
   }

   private void a(dff $$0, jh $$1, cor $$2) {
      dsr $$3 = $$0.c_($$1);
      if ($$3 instanceof dtv) {
         $$2.a((dtv)$$3);
         $$2.a(awy.au);
      }
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
