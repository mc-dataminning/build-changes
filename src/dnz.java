import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnz extends dfh {
   public static final MapCodec<dnz> a = b(dnz::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final ewy g = dfh.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ewy h = dfh.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dtk e = dta.aE;
   public static final dtk f = dta.aD;

   @Override
   public MapCodec<dnz> a() {
      return a;
   }

   public dnz(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dcf $$0, ja $$1, dsk $$2, bsg $$3) {
      if (!$$3.bX()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dcf $$0, dsk $$1, ja $$2, bsg $$3, float $$4) {
      if (!($$3 instanceof ckj)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dcf $$0, dsk $$1, ja $$2, bsg $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dfj.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dcf $$0, ja $$1, dsk $$2) {
      $$0.a(null, $$1, avh.Ai, avi.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dxg.f, $$1, dxg.a.a($$2));
         $$0.c(2001, $$1, dfh.i($$2));
      }
   }

   @Override
   protected void b(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, avh.Aj, avi.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dxg.c, $$2, dxg.a.a($$0));
         } else {
            $$1.a(null, $$2, avh.Ak, avi.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dxg.f, $$2, dxg.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dfh.i($$0));
               cfs $$6 = bsm.bh.a((dcf)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.h($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(dbl $$0, ja $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(dbl $$0, ja $$1) {
      return $$0.a_($$1).a(avw.H);
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dcf $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(dcf $$0, cmk $$1, ja $$2, dsk $$3, @Nullable dpp $$4, cuc $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dsk $$0, cxm $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dcf $$0, bsg $$1) {
      if ($$1 instanceof cfs || $$1 instanceof cem) {
         return false;
      } else {
         return !($$1 instanceof btb) ? false : $$1 instanceof cmk || $$0.ab().b(dcb.c);
      }
   }
}
