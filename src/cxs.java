import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cxs extends cxc {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float m = 5.0F;
   public static final float b = 3.5F;
   private static final float n = 0.7F;

   public cxs(cxc.a $$0) {
      super($$0);
   }

   public static czx b() {
      return czx.a().a(bxf.c, new bxd(g, 5.0, bxd.a.a), bvk.b).a(bxf.e, new bxd(h, -3.4F, bxd.a.a), bvk.b).a();
   }

   public static dai c() {
      return new dai(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dxo $$0, dgz $$1, jh $$2, cpo $$3) {
      return !$$3.b();
   }

   @Override
   public boolean a(cxg $$0, bvx $$1, bvx $$2) {
      if (b($$2)) {
         arx $$3 = (arx)$$2.dW();
         $$2.h($$2.dz().a(jm.a.b, 0.01F));
         if ($$2 instanceof ary $$4) {
            $$4.cx = this.a($$4);
            $$4.w(true);
            $$4.f.b(new afs($$4));
         }

         if ($$1.aJ()) {
            if ($$2 instanceof ary $$5) {
               $$5.b(true);
            }

            awu $$6 = $$2.Z > 5.0F ? awv.oO : awv.oN;
            $$3.a(null, $$2.dB(), $$2.dD(), $$2.dH(), $$6, $$2.dn(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dB(), $$2.dD(), $$2.dH(), awv.oM, $$2.dn(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }

      return true;
   }

   private fbr a(ary $$0) {
      return $$0.gL() && $$0.cx != null && $$0.cx.e <= $$0.du().e ? $$0.cx : $$0.du();
   }

   @Override
   public void b(cxg $$0, bvx $$1, bvx $$2) {
      $$0.a(1, $$2, bvj.a);
      if (b($$2)) {
         $$2.k();
      }
   }

   @Override
   public float a(bvb $$0, float $$1, btr $$2) {
      if ($$2.c() instanceof bvx $$3) {
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

            return $$3.dW() instanceof arx $$11 ? $$8 + dds.b($$11, $$3.ea(), $$0, $$2, 0.0F) * $$7 : $$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dgz $$0, bvb $$1, bvb $$2) {
      $$0.c(2013, $$2.aR(), 750);
      $$0.a(bvx.class, $$2.cR().g(3.5), a($$1, $$2)).forEach($$2x -> {
         fbr $$3 = $$2x.du().d($$2.du());
         double $$4 = a($$1, $$2x, $$3);
         fbr $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof ary $$6) {
               $$6.f.b(new afs($$6));
            }
         }
      });
   }

   private static Predicate<bvx> a(bvb $$0, bvb $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label62: {
            $$3 = !$$2.aa_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bwu $$6 && $$6.p() && $$0.cG().equals($$6.ab_())) {
               var10000 = true;
               break label62;
            }

            var10000 = false;
         }

         boolean $$7;
         label55: {
            $$7 = !var10000;
            if ($$2 instanceof clh $$8 && $$8.x()) {
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

   private static double a(bvb $$0, bvx $$1, fbr $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.Z > 5.0F ? 2 : 1) * (1.0 - $$1.h(bxf.p));
   }

   public static boolean b(bvx $$0) {
      return $$0.Z > 1.5F && !$$0.fJ();
   }

   @Nullable
   @Override
   public btr a(bvx $$0) {
      return b($$0) ? $$0.dX().f($$0) : super.a($$0);
   }
}
