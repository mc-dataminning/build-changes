import java.util.List;

public class czo extends cxu implements cys {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public czo(cxu.a $$0) {
      super($$0);
   }

   public static dam c() {
      return dam.a().a(bxx.c, new bxv(h, 8.0, bxv.a.a), bwd.b).a(bxx.e, new bxv(i, -2.9F, bxv.a.a), bwd.b).a();
   }

   public static dax d() {
      return new dax(List.of(), 1.0F, 2, false);
   }

   @Override
   public cya b(cxy $$0) {
      return cya.f;
   }

   @Override
   public int a(cxy $$0, bwr $$1) {
      return 72000;
   }

   @Override
   public boolean a(cxy $$0, dhp $$1, bwr $$2, int $$3) {
      if ($$2 instanceof cqi $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dej.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bl()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               js<awj> $$8 = dej.b($$0, dei.C).orElse(awk.AE);
               $$4.b(awu.c.b(this));
               if ($$1 instanceof arn $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     cro $$10 = crb.a(cro::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fU()) {
                        $$10.b = cqp.a.c;
                     } else {
                        $$4.gi().h($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), awl.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               if ($$7 > 0.0F) {
                  float $$11 = $$4.dL();
                  float $$12 = $$4.dN();
                  float $$13 = -azk.a($$11 * (float) (Math.PI / 180.0)) * azk.b($$12 * (float) (Math.PI / 180.0));
                  float $$14 = -azk.a($$12 * (float) (Math.PI / 180.0));
                  float $$15 = azk.b($$11 * (float) (Math.PI / 180.0)) * azk.b($$12 * (float) (Math.PI / 180.0));
                  float $$16 = azk.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                  $$13 *= $$7 / $$16;
                  $$14 *= $$7 / $$16;
                  $$15 *= $$7 / $$16;
                  $$4.j((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aJ()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bwv.a, new fcu(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$8.a(), awl.h, 1.0F, 1.0F);
                  return true;
               } else {
                  return false;
               }
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public btq a(dhp $$0, cqi $$1, btp $$2) {
      cxy $$3 = $$1.b($$2);
      if ($$3.r()) {
         return btq.d;
      } else if (dej.a($$3, $$1) > 0.0F && !$$1.bl()) {
         return btq.d;
      } else {
         $$1.c($$2);
         return btq.c;
      }
   }

   @Override
   public crb a(dhp $$0, kc $$1, cxy $$2, jo $$3) {
      cro $$4 = new cro($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.b = cqp.a.b;
      return $$4;
   }
}
