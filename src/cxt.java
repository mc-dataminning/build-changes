import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cxt extends cxd {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float n = 5.0F;
   public static final float b = 3.5F;
   private static final float o = 0.7F;

   public cxt(cxd.a $$0) {
      super($$0);
   }

   public static czw b() {
      return czw.a().a(bxg.c, new bxe(h, 5.0, bxe.a.a), bvk.b).a(bxg.e, new bxe(i, -3.4F, bxe.a.a), bvk.b).a();
   }

   public static dah c() {
      return new dah(List.of(), 1.0F, 2, false);
   }

   @Override
   public void a(cxh $$0, bvy $$1, bvy $$2) {
      if (b($$2)) {
         ard $$3 = (ard)$$2.dU();
         $$2.i($$2.dx().a(jn.a.b, 0.01F));
         if ($$2 instanceof are $$4) {
            $$4.cl = this.a($$4);
            $$4.w(true);
            $$4.f.b(new aew($$4));
         }

         if ($$1.aJ()) {
            if ($$2 instanceof are $$5) {
               $$5.b(true);
            }

            avz $$6 = $$2.Z > 5.0F ? awa.oY : awa.oX;
            $$3.a(null, $$2.dz(), $$2.dB(), $$2.dF(), $$6, $$2.dl(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dz(), $$2.dB(), $$2.dF(), awa.oW, $$2.dl(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }
   }

   private fbx a(are $$0) {
      return $$0.gP() && $$0.cl != null && $$0.cl.e <= $$0.ds().e ? $$0.cl : $$0.ds();
   }

   @Override
   public void b(cxh $$0, bvy $$1, bvy $$2) {
      if (b($$2)) {
         $$2.k();
      }
   }

   @Override
   public float a(bva $$0, float $$1, btp $$2) {
      if ($$2.c() instanceof bvy $$3) {
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

            return $$3.dU() instanceof ard $$11 ? $$8 + ddt.b($$11, $$3.dY(), $$0, $$2, 0.0F) * $$7 : $$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dgz $$0, bva $$1, bva $$2) {
      $$0.c(2013, $$2.aR(), 750);
      $$0.a(bvy.class, $$2.cQ().g(3.5), a($$1, $$2)).forEach($$2x -> {
         fbx $$3 = $$2x.ds().d($$2.ds());
         double $$4 = a($$1, $$2x, $$3);
         fbx $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof are $$6) {
               $$6.f.b(new aew($$6));
            }
         }
      });
   }

   private static Predicate<bvy> a(bva $$0, bva $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label64: {
            $$3 = !$$2.U_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bwv $$6 && $$1 instanceof bvy $$7 && $$6.q() && $$6.k($$7)) {
               var10000 = true;
               break label64;
            }

            var10000 = false;
         }

         boolean $$8;
         label56: {
            $$8 = !var10000;
            if ($$2 instanceof cll $$9 && $$9.t()) {
               var10000 = false;
               break label56;
            }

            var10000 = true;
         }

         boolean $$11 = var10000;
         boolean $$12 = $$1.g($$2) <= Math.pow(3.5, 2.0);
         return $$3 && $$4 && $$5 && $$8 && $$11 && $$12;
      };
   }

   private static double a(bva $$0, bvy $$1, fbx $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.Z > 5.0F ? 2 : 1) * (1.0 - $$1.h(bxg.p));
   }

   public static boolean b(bvy $$0) {
      return $$0.Z > 1.5F && !$$0.fL();
   }

   @Nullable
   @Override
   public btp a(bvy $$0) {
      return b($$0) ? $$0.dV().f($$0) : super.a($$0);
   }
}
