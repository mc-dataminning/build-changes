import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cxb extends cwl {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float m = 5.0F;
   public static final float b = 3.5F;
   private static final float n = 0.7F;

   public cxb(cwl.a $$0) {
      super($$0);
   }

   public static czg b() {
      return czg.a().a(bwo.c, new bwm(g, 5.0, bwm.a.a), but.b).a(bwo.e, new bwm(h, -3.4F, bwm.a.a), but.b).a();
   }

   public static czr c() {
      return new czr(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dwx $$0, dgi $$1, ji $$2, cox $$3) {
      return !$$3.b();
   }

   @Override
   public boolean a(cwp $$0, bvg $$1, bvg $$2) {
      if (b($$2)) {
         arc $$3 = (arc)$$2.dW();
         $$2.h($$2.dz().a(jn.a.b, 0.01F));
         if ($$2 instanceof ard $$4) {
            $$4.cy = this.a($$4);
            $$4.x(true);
            $$4.f.b(new aew($$4));
         }

         if ($$1.aJ()) {
            if ($$2 instanceof ard $$5) {
               $$5.b(true);
            }

            avz $$6 = $$2.Z > 5.0F ? awa.oO : awa.oN;
            $$3.a(null, $$2.dB(), $$2.dD(), $$2.dH(), $$6, $$2.dn(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dB(), $$2.dD(), $$2.dH(), awa.oM, $$2.dn(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }

      return true;
   }

   private fba a(ard $$0) {
      return $$0.gN() && $$0.cy != null && $$0.cy.e <= $$0.du().e ? $$0.cy : $$0.du();
   }

   @Override
   public void b(cwp $$0, bvg $$1, bvg $$2) {
      $$0.a(1, $$2, bus.a);
      if (b($$2)) {
         $$2.k();
      }
   }

   @Override
   public float a(buk $$0, float $$1, bta $$2) {
      if ($$2.c() instanceof bvg $$3) {
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

            return $$3.dW() instanceof arc $$11 ? $$8 + ddb.b($$11, $$3.ea(), $$0, $$2, 0.0F) * $$7 : $$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dgi $$0, buk $$1, buk $$2) {
      $$0.c(2013, $$2.aR(), 750);
      $$0.a(bvg.class, $$2.cR().g(3.5), a($$1, $$2)).forEach($$2x -> {
         fba $$3 = $$2x.du().d($$2.du());
         double $$4 = a($$1, $$2x, $$3);
         fba $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof ard $$6) {
               $$6.f.b(new aew($$6));
            }
         }
      });
   }

   private static Predicate<bvg> a(buk $$0, buk $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label62: {
            $$3 = !$$2.Z_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bwd $$6 && $$6.p() && $$0.cG().equals($$6.aa_())) {
               var10000 = true;
               break label62;
            }

            var10000 = false;
         }

         boolean $$7;
         label55: {
            $$7 = !var10000;
            if ($$2 instanceof ckq $$8 && $$8.x()) {
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

   private static double a(buk $$0, bvg $$1, fba $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.Z > 5.0F ? 2 : 1) * (1.0 - $$1.h(bwo.p));
   }

   public static boolean b(bvg $$0) {
      return $$0.Z > 1.5F && !$$0.fJ();
   }

   @Nullable
   @Override
   public bta a(bvg $$0) {
      return b($$0) ? $$0.dX().f($$0) : super.a($$0);
   }
}
