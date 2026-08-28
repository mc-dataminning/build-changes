import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dta extends dkd {
   public static final MapCodec<dta> a = b(dta::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final fcl g = dkd.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final fcl h = dkd.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dyn e = dye.aH;
   public static final dyn f = dye.aG;

   @Override
   public MapCodec<dta> a() {
      return a;
   }

   public dta(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dgz $$0, jh $$1, dxo $$2, bvb $$3) {
      if (!$$3.ce()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgz $$0, dxo $$1, jh $$2, bvb $$3, float $$4) {
      if (!($$3 instanceof cnh)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dgz $$0, dxo $$1, jh $$2, bvb $$3, int $$4) {
      if ($$1.a(dkf.mH) && $$0 instanceof arx $$5 && this.a($$5, $$3) && $$0.A.a($$4) == 0) {
         this.a($$5, $$2, $$1);
      }
   }

   private void a(dgz $$0, jh $$1, dxo $$2) {
      $$0.a(null, $$1, awv.AX, aww.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(eck.f, $$1, eck.a.a($$2));
         $$0.c(2001, $$1, dkd.j($$2));
      }
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, awv.AY, aww.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(eck.c, $$2, eck.a.a($$0));
         } else {
            $$1.a(null, $$2, awv.AZ, aww.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(eck.f, $$2, eck.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dkd.j($$0));
               cip $$6 = bvi.bB.a($$1, bvh.e);
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

   public static boolean a(dge $$0, jh $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(dge $$0, jh $$1) {
      return $$0.a_($$1).a(axk.J);
   }

   @Override
   protected void b(dxo $$0, dgz $$1, jh $$2, dxo $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dgz $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(dgz $$0, cpo $$1, jh $$2, dxo $$3, @Nullable duq $$4, cxg $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dxo $$0, dax $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dxo $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(e, f);
   }

   private boolean a(arx $$0, bvb $$1) {
      if ($$1 instanceof cip || $$1 instanceof chi) {
         return false;
      } else {
         return !($$1 instanceof bvx) ? false : $$1 instanceof cpo || $$0.O().b(dgv.c);
      }
   }
}
