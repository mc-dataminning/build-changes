import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtc extends dke {
   public static final MapCodec<dtc> a = b(dtc::new);
   public static final dyq b = dyg.aH;
   public static final dyq c = dyg.aG;
   public static final int d = 2;
   public static final int e = 1;
   public static final int f = 4;
   private static final fcr g = dke.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final fcr h = dke.b(14.0, 0.0, 7.0);

   @Override
   public MapCodec<dtc> a() {
      return a;
   }

   public dtc(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, Integer.valueOf(1)));
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, bva $$3) {
      if (!$$3.cd()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgz $$0, dxq $$1, ji $$2, bva $$3, float $$4) {
      if (!($$3 instanceof cnl)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dgz $$0, dxq $$1, ji $$2, bva $$3, int $$4) {
      if ($$1.a(dkg.mH) && $$0 instanceof ard $$5 && this.a($$5, $$3) && $$0.A.a($$4) == 0) {
         this.a($$5, $$2, $$1);
      }
   }

   private void a(dgz $$0, ji $$1, dxq $$2) {
      $$0.a(null, $$1, awa.Bg, awb.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(c);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(c, Integer.valueOf($$3 - 1)), 2);
         $$0.a(ecp.f, $$1, ecp.a.a($$2));
         $$0.c(2001, $$1, dke.j($$2));
      }
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a(null, $$2, awa.Bh, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 + 1)), 2);
            $$1.a(ecp.c, $$2, ecp.a.a($$0));
         } else {
            $$1.a(null, $$2, awa.Bi, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(ecp.f, $$2, ecp.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(c); $$5++) {
               $$1.c(2001, $$2, dke.j($$0));
               cit $$6 = bvi.bA.a($$1, bvh.e);
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

   public static boolean a(dgf $$0, ji $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(dgf $$0, ji $$1) {
      return $$0.a_($$1).a(awp.J);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dgz $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(dgz $$0, cpr $$1, ji $$2, dxq $$3, @Nullable dus $$4, cxh $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dxq $$0, dax $$1) {
      return !$$1.h() && $$1.n().a(this.i()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dxq $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1))) : super.a($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return $$0.c(c) == 1 ? g : h;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c);
   }

   private boolean a(ard $$0, bva $$1) {
      if ($$1 instanceof cit || $$1 instanceof chj) {
         return false;
      } else {
         return !($$1 instanceof bvy) ? false : $$1 instanceof cpr || $$0.O().b(dgv.c);
      }
   }
}
