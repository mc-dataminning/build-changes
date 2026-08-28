import java.util.List;

public class cxq extends cvt implements cws {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cxq(cvt.a $$0) {
      super($$0);
   }

   public static cym d() {
      return cym.a().a(bwd.c, new bwb(f, 8.0, bwb.a.a), bui.b).a(bwd.e, new bwb(g, -2.9F, bwb.a.a), bui.b).a();
   }

   public static cyx p() {
      return new cyx(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dvd $$0, dev $$1, jg $$2, coh $$3) {
      return !$$3.f();
   }

   @Override
   public cvz a(cvx $$0) {
      return cvz.f;
   }

   @Override
   public int a(cvx $$0, buv $$1) {
      return 72000;
   }

   @Override
   public boolean a(cvx $$0, dev $$1, buv $$2, int $$3) {
      if ($$2 instanceof coh $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dbo.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bl()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jp<awj> $$8 = dbo.b($$0, dbn.C).orElse(awk.zK);
               if ($$1 instanceof arm $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     cpo $$10 = cpb.a(cpo::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fX()) {
                        $$10.d = cop.a.c;
                     } else {
                        $$4.gk().h($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), awl.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               $$4.b(awu.c.b(this));
               if ($$7 > 0.0F) {
                  float $$11 = $$4.dN();
                  float $$12 = $$4.dP();
                  float $$13 = -azj.a($$11 * (float) (Math.PI / 180.0)) * azj.b($$12 * (float) (Math.PI / 180.0));
                  float $$14 = -azj.a($$12 * (float) (Math.PI / 180.0));
                  float $$15 = azj.b($$11 * (float) (Math.PI / 180.0)) * azj.b($$12 * (float) (Math.PI / 180.0));
                  float $$16 = azj.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                  $$13 *= $$7 / $$16;
                  $$14 *= $$7 / $$16;
                  $$15 *= $$7 / $$16;
                  $$4.j((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aJ()) {
                     float $$17 = 1.1999999F;
                     $$4.a(buz.a, new ezh(0.0, 1.1999999F, 0.0));
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
   public bry a(dev $$0, coh $$1, brx $$2) {
      cvx $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bry.d;
      } else if (dbo.a($$3, $$1) > 0.0F && !$$1.bl()) {
         return bry.d;
      } else {
         $$1.c($$2);
         return bry.c;
      }
   }

   @Override
   public boolean a(cvx $$0, buv $$1, buv $$2) {
      return true;
   }

   @Override
   public void b(cvx $$0, buv $$1, buv $$2) {
      $$0.a(1, $$2, buh.a);
   }

   @Override
   public cpb a(dev $$0, jz $$1, cvx $$2, jl $$3) {
      cpo $$4 = new cpo($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cop.a.b;
      return $$4;
   }
}
