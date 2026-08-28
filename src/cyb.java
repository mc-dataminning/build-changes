import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cyb extends cxl {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float m = 5.0F;
   public static final float b = 3.5F;
   private static final float n = 0.7F;

   public cyb(cxl.a $$0) {
      super($$0);
   }

   public static dag b() {
      return dag.a().a(bxo.c, new bxm(g, 5.0, bxm.a.a), bvt.b).a(bxo.e, new bxm(h, -3.4F, bxm.a.a), bvt.b).a();
   }

   public static dar c() {
      return new dar(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dxv $$0, dhi $$1, jh $$2, cpx $$3) {
      return !$$3.b();
   }

   @Override
   public boolean a(cxp $$0, bwg $$1, bwg $$2) {
      if (b($$2)) {
         ash $$3 = (ash)$$2.dW();
         $$2.h($$2.dz().a(jm.a.b, 0.01F));
         if ($$2 instanceof asi $$4) {
            $$4.cx = this.a($$4);
            $$4.w(true);
            $$4.f.b(new agd($$4));
         }

         if ($$1.aJ()) {
            if ($$2 instanceof asi $$5) {
               $$5.b(true);
            }

            axe $$6 = $$2.Z > 5.0F ? axf.oI : axf.oH;
            $$3.a(null, $$2.dB(), $$2.dD(), $$2.dH(), $$6, $$2.dn(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dB(), $$2.dD(), $$2.dH(), axf.oG, $$2.dn(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }

      return true;
   }

   private fby a(asi $$0) {
      return $$0.gL() && $$0.cx != null && $$0.cx.e <= $$0.du().e ? $$0.cx : $$0.du();
   }

   @Override
   public void b(cxp $$0, bwg $$1, bwg $$2) {
      $$0.a(1, $$2, bvs.a);
      if (b($$2)) {
         $$2.k();
      }
   }

   @Override
   public float a(bvk $$0, float $$1, bua $$2) {
      if ($$2.c() instanceof bwg $$3) {
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

            return $$3.dW() instanceof ash $$11 ? $$8 + deb.b($$11, $$3.ea(), $$0, $$2, 0.0F) * $$7 : $$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dhi $$0, bvk $$1, bvk $$2) {
      $$0.c(2013, $$2.aR(), 750);
      $$0.a(bwg.class, $$2.cR().g(3.5), a($$1, $$2)).forEach($$2x -> {
         fby $$3 = $$2x.du().d($$2.du());
         double $$4 = a($$1, $$2x, $$3);
         fby $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof asi $$6) {
               $$6.f.b(new agd($$6));
            }
         }
      });
   }

   private static Predicate<bwg> a(bvk $$0, bvk $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label62: {
            $$3 = !$$2.aa_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bxd $$6 && $$6.p() && $$0.cG().equals($$6.ab_())) {
               var10000 = true;
               break label62;
            }

            var10000 = false;
         }

         boolean $$7;
         label55: {
            $$7 = !var10000;
            if ($$2 instanceof clq $$8 && $$8.x()) {
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

   private static double a(bvk $$0, bwg $$1, fby $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.Z > 5.0F ? 2 : 1) * (1.0 - $$1.h(bxo.p));
   }

   public static boolean b(bwg $$0) {
      return $$0.Z > 1.5F && !$$0.fJ();
   }

   @Nullable
   @Override
   public bua a(bwg $$0) {
      return b($$0) ? $$0.dX().f($$0) : super.a($$0);
   }
}
