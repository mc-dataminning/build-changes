import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cxw extends cxg {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float l = 5.0F;
   public static final float b = 3.5F;
   private static final float m = 0.7F;

   public cxw(cxg.a $$0) {
      super($$0);
   }

   public static dab b() {
      return dab.a().a(bxj.c, new bxh(f, 5.0, bxh.a.a), bvo.b).a(bxj.e, new bxh(g, -3.4F, bxh.a.a), bvo.b).a();
   }

   public static dam c() {
      return new dam(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dxn $$0, dha $$1, jh $$2, cps $$3) {
      return !$$3.b();
   }

   @Override
   public boolean a(cxk $$0, bwb $$1, bwb $$2) {
      if (b($$2)) {
         ash $$3 = (ash)$$2.dV();
         $$2.h($$2.dy().a(jm.a.b, 0.01F));
         if ($$2 instanceof asi $$4) {
            $$4.cx = this.a($$4);
            $$4.w(true);
            $$4.f.b(new agd($$4));
         }

         if ($$1.aJ()) {
            if ($$2 instanceof asi $$5) {
               $$5.b(true);
            }

            axe $$6 = $$2.Z > 5.0F ? axf.oH : axf.oG;
            $$3.a(null, $$2.dA(), $$2.dC(), $$2.dG(), $$6, $$2.dm(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dA(), $$2.dC(), $$2.dG(), axf.oF, $$2.dm(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }

      return true;
   }

   private fbs a(asi $$0) {
      return $$0.gJ() && $$0.cx != null && $$0.cx.e <= $$0.dt().e ? $$0.cx : $$0.dt();
   }

   @Override
   public void b(cxk $$0, bwb $$1, bwb $$2) {
      $$0.a(1, $$2, bvn.a);
      if (b($$2)) {
         $$2.k();
      }
   }

   @Override
   public float a(bvf $$0, float $$1, btv $$2) {
      if ($$2.c() instanceof bwb $$3) {
         if (!b($$3)) {
            return 0.0F;
         } else {
            float $$5 = 3.0F;
            float $$6 = 8.0F;
            float $$7 = $$3.Z;
            float $$8;
            if ($$7 <= 3.0F) {
               $$8 = 4.0F * $$7;
            } else if ($$7 <= 8.0F) {
               $$8 = 12.0F + 2.0F * ($$7 - 3.0F);
            } else {
               $$8 = 22.0F + $$7 - 8.0F;
            }

            return $$3.dV() instanceof ash $$11 ? $$8 + ddt.b($$11, $$3.dZ(), $$0, $$2, 0.0F) * $$7 : $$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dha $$0, bvf $$1, bvf $$2) {
      $$0.c(2013, $$2.aR(), 750);
      $$0.a(bwb.class, $$2.cR().g(3.5), a($$1, $$2)).forEach($$2x -> {
         fbs $$3 = $$2x.dt().d($$2.dt());
         double $$4 = a($$1, $$2x, $$3);
         fbs $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof asi $$6) {
               $$6.f.b(new agd($$6));
            }
         }
      });
   }

   private static Predicate<bwb> a(bvf $$0, bvf $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label62: {
            $$3 = !$$2.aa_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bwy $$6 && $$6.p() && $$0.cG().equals($$6.ab_())) {
               var10000 = true;
               break label62;
            }

            var10000 = false;
         }

         boolean $$7;
         label55: {
            $$7 = !var10000;
            if ($$2 instanceof cll $$8 && $$8.x()) {
               var10000 = false;
               break label55;
            }

            var10000 = true;
         }

         boolean $$10 = var10000;
         boolean $$11 = $$1.g($$2) <= Math.pow(3.5, 2.0);
         return $$3 && $$4 && $$5 && $$7 && $$10 && $$11;
      };
   }

   private static double a(bvf $$0, bwb $$1, fbs $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.Z > 5.0F ? 2 : 1) * (1.0 - $$1.h(bxj.p));
   }

   public static boolean b(bwb $$0) {
      return $$0.Z > 1.5F && !$$0.fH();
   }

   @Nullable
   @Override
   public btv a(bwb $$0) {
      return b($$0) ? $$0.dW().f($$0) : super.a($$0);
   }
}
