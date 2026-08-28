import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cyk extends cxu {
   private static final int c = 5;
   private static final float d = -3.4F;
   public static final float a = 1.5F;
   private static final float n = 5.0F;
   public static final float b = 3.5F;
   private static final float o = 0.7F;

   public cyk(cxu.a $$0) {
      super($$0);
   }

   public static dam b() {
      return dam.a().a(bxx.c, new bxv(h, 5.0, bxv.a.a), bwd.b).a(bxx.e, new bxv(i, -3.4F, bxv.a.a), bwd.b).a();
   }

   public static dax c() {
      return new dax(List.of(), 1.0F, 2, false);
   }

   @Override
   public void a(cxy $$0, bwr $$1, bwr $$2) {
      if (b($$2)) {
         arn $$3 = (arn)$$2.dV();
         $$2.i($$2.dy().a(jo.a.b, 0.01F));
         if ($$2 instanceof aro $$4) {
            $$4.ck = this.a($$4);
            $$4.w(true);
            $$4.f.b(new afc($$4));
         }

         if ($$1.aJ()) {
            if ($$2 instanceof aro $$5) {
               $$5.b(true);
            }

            awj $$6 = $$2.Z > 5.0 ? awk.oY : awk.oX;
            $$3.a(null, $$2.dA(), $$2.dC(), $$2.dG(), $$6, $$2.dm(), 1.0F, 1.0F);
         } else {
            $$3.a(null, $$2.dA(), $$2.dC(), $$2.dG(), awk.oW, $$2.dm(), 1.0F, 1.0F);
         }

         a($$3, $$2, $$1);
      }
   }

   private fcu a(aro $$0) {
      return $$0.gM() && $$0.ck != null && $$0.ck.e <= $$0.dt().e ? $$0.ck : $$0.dt();
   }

   @Override
   public void b(cxy $$0, bwr $$1, bwr $$2) {
      if (b($$2)) {
         $$2.k();
      }
   }

   @Override
   public float a(bvs $$0, float $$1, buh $$2) {
      if ($$2.c() instanceof bwr $$3) {
         if (!b($$3)) {
            return 0.0F;
         } else {
            double $$5 = 3.0;
            double $$6 = 8.0;
            double $$7 = $$3.Z;
            double $$8;
            if ($$7 <= 3.0) {
               $$8 = 4.0 * $$7;
            } else if ($$7 <= 8.0) {
               $$8 = 12.0 + 2.0 * ($$7 - 3.0);
            } else {
               $$8 = 22.0 + $$7 - 8.0;
            }

            return $$3.dV() instanceof arn $$11 ? (float)($$8 + (double)dej.b($$11, $$3.dZ(), $$0, $$2, 0.0F) * $$7) : (float)$$8;
         }
      } else {
         return 0.0F;
      }
   }

   private static void a(dhp $$0, bvs $$1, bvs $$2) {
      $$0.c(2013, $$2.aR(), 750);
      $$0.a(bwr.class, $$2.cR().g(3.5), a($$1, $$2)).forEach($$2x -> {
         fcu $$3 = $$2x.dt().d($$2.dt());
         double $$4 = a($$1, $$2x, $$3);
         fcu $$5 = $$3.d().c($$4);
         if ($$4 > 0.0) {
            $$2x.j($$5.d, 0.7F, $$5.f);
            if ($$2x instanceof aro $$6) {
               $$6.f.b(new afc($$6));
            }
         }
      });
   }

   private static Predicate<bwr> a(bvs $$0, bvs $$1) {
      return $$2 -> {
         boolean $$3;
         boolean $$4;
         boolean $$5;
         boolean var10000;
         label64: {
            $$3 = !$$2.U_();
            $$4 = $$2 != $$0 && $$2 != $$1;
            $$5 = !$$0.s($$2);
            if ($$2 instanceof bxn $$6 && $$1 instanceof bwr $$7 && $$6.q() && $$6.k($$7)) {
               var10000 = true;
               break label64;
            }

            var10000 = false;
         }

         boolean $$8;
         label56: {
            $$8 = !var10000;
            if ($$2 instanceof cmc $$9 && $$9.t()) {
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

   private static double a(bvs $$0, bwr $$1, fcu $$2) {
      return (3.5 - $$2.g()) * 0.7F * (double)($$0.Z > 5.0 ? 2 : 1) * (1.0 - $$1.h(bxx.p));
   }

   public static boolean b(bwr $$0) {
      return $$0.Z > 1.5 && !$$0.fI();
   }

   @Nullable
   @Override
   public buh a(bwr $$0) {
      return b($$0) ? $$0.dW().f($$0) : super.a($$0);
   }
}
