import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddv extends cvf {
   public static final MapCodec<ddv> a = b(ddv::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final eks g = cvf.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final eks h = cvf.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final din e = did.aE;
   public static final din f = did.aD;

   @Override
   public MapCodec<ddv> a() {
      return a;
   }

   public ddv(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bkv $$3) {
      if (!$$3.bT()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(csf $$0, dhn $$1, hx $$2, bkv $$3, float $$4) {
      if (!($$3 instanceof ccg)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(csf $$0, dhn $$1, hx $$2, bkv $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(cvh.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(csf $$0, hx $$1, dhn $$2) {
      $$0.a(null, $$1, aqv.yQ, aqw.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dlx.f, $$1, dlx.a.a($$2));
         $$0.c(2001, $$1, cvf.i($$2));
      }
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, aqv.yR, aqw.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dlx.c, $$2, dlx.a.a($$0));
         } else {
            $$1.a(null, $$2, aqv.yS, aqw.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dlx.f, $$2, dlx.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, cvf.i($$0));
               bxx $$6 = bkz.bd.a((csf)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.i($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(crl $$0, hx $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(crl $$0, hx $$1) {
      return $$0.a_($$1).a(ark.H);
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2005, $$2, 0);
      }
   }

   private boolean a(csf $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(csf $$0, cdz $$1, hx $$2, dhn $$3, @Nullable dfi $$4, clo $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   public boolean a(dhn $$0, cnw $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(e, f);
   }

   private boolean a(csf $$0, bkv $$1) {
      if ($$1 instanceof bxx || $$1 instanceof bwr) {
         return false;
      } else {
         return !($$1 instanceof bll) ? false : $$1 instanceof cdz || $$0.Y().b(csb.c);
      }
   }
}
