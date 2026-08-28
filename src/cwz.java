import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cwz extends cwj {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float m = 5.0F;
   public static final float b = 3.5F;
   private static final float n = 0.7F;

   public cwz(cwj.a $$0) {
      super($$0);
   }

   public static cze b() {
      return cze.a().a(bwn.c, new bwl(g, 5.0, bwl.a.a), bus.b).a(bwn.e, new bwl(h, -3.4F, bwl.a.a), bus.b).a();
   }

   public static czp c() {
      return new czp(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dwv $$0, dgg $$1, ji $$2, cov $$3) {
      return !$$3.b();
   }

   @Override
   public boolean a(cwn $$0, bvf $$1, bvf $$2) {
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

            avy $$6 = $$2.Z > 5.0F ? avz.oO : avz.oN;
            $$3.a(null, $$2.dB(), $$2.dD(), $$2.dH(), $$6, $$2.dn(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dB(), $$2.dD(), $$2.dH(), avz.oM, $$2.dn(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }

      return true;
   }

   private fay a(ard $$0) {
      return $$0.gN() && $$0.cy != null && $$0.cy.e <= $$0.du().e ? $$0.cy : $$0.du();
   }

   @Override
   public void b(cwn $$0, bvf $$1, bvf $$2) {
      $$0.a(1, $$2, bur.a);
      if (b($$2)) {
         $$2.k();
      }
   }

   @Override
   public float a(buj $$0, float $$1, bsz $$2) {
      if ($$2.c() instanceof bvf $$3) {
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

            return $$3.dW() instanceof arc $$11 ? $$8 + dcz.b($$11, $$3.ea(), $$0, $$2, 0.0F) * $$7 : $$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dgg $$0, buj $$1, buj $$2) {
      $$0.c(2013, $$2.aR(), 750);
      $$0.a(bvf.class, $$2.cR().g(3.5), a($$1, $$2)).forEach($$2x -> {
         fay $$3 = $$2x.du().d($$2.du());
         double $$4 = a($$1, $$2x, $$3);
         fay $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof ard $$6) {
               $$6.f.b(new aew($$6));
            }
         }
      });
   }

   private static Predicate<bvf> a(buj $$0, buj $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label62: {
            $$3 = !$$2.Z_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bwc $$6 && $$6.p() && $$0.cG().equals($$6.aa_())) {
               var10000 = true;
               break label62;
            }

            var10000 = false;
         }

         boolean $$7;
         label55: {
            $$7 = !var10000;
            if ($$2 instanceof ckp $$8 && $$8.x()) {
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

   private static double a(buj $$0, bvf $$1, fay $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.Z > 5.0F ? 2 : 1) * (1.0 - $$1.h(bwn.p));
   }

   public static boolean b(bvf $$0) {
      return $$0.Z > 1.5F && !$$0.fJ();
   }

   @Nullable
   @Override
   public bsz a(bvf $$0) {
      return b($$0) ? $$0.dX().f($$0) : super.a($$0);
   }
}
