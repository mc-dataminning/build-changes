import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dop extends dfw {
   public static final MapCodec<dop> a = b(dop::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final exp g = dfw.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final exp h = dfw.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dua e = dtq.aE;
   public static final dua f = dtq.aD;

   @Override
   public MapCodec<dop> a() {
      return a;
   }

   public dop(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dcu $$0, jd $$1, dta $$2, bsq $$3) {
      if (!$$3.bX()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcu $$0, dta $$1, jd $$2, bsq $$3, float $$4) {
      if (!($$3 instanceof cku)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dcu $$0, dta $$1, jd $$2, bsq $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dfy.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dcu $$0, jd $$1, dta $$2) {
      $$0.a(null, $$1, avo.Ai, avp.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dxw.f, $$1, dxw.a.a($$2));
         $$0.c(2001, $$1, dfw.i($$2));
      }
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, avo.Aj, avp.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dxw.c, $$2, dxw.a.a($$0));
         } else {
            $$1.a(null, $$2, avo.Ak, avp.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dxw.f, $$2, dxw.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dfw.i($$0));
               cgd $$6 = bsw.bh.a((dcu)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.g($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(dca $$0, jd $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(dca $$0, jd $$1) {
      return $$0.a_($$1).a(awd.H);
   }

   @Override
   protected void b(dta $$0, dcu $$1, jd $$2, dta $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dcu $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(dcu $$0, cmv $$1, jd $$2, dta $$3, @Nullable dqf $$4, cuo $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dta $$0, cyb $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dta $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dcu $$0, bsq $$1) {
      if ($$1 instanceof cgd || $$1 instanceof cex) {
         return false;
      } else {
         return !($$1 instanceof btl) ? false : $$1 instanceof cmv || $$0.ab().b(dcq.c);
      }
   }
}
