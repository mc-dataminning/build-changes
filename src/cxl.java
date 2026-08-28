import java.util.List;

public class cxl extends cvn implements cwn {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cxl(cvn.a $$0) {
      super($$0);
   }

   public static cyn d() {
      return cyn.a().a(bvu.c, new bvs(f, 8.0, bvs.a.a), bua.b).a(bvu.e, new bvs(g, -2.9F, bvs.a.a), bua.b).a();
   }

   public static cyy g() {
      return new cyy(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dus $$0, dej $$1, jf $$2, cnx $$3) {
      return !$$3.f();
   }

   @Override
   public cvu a(cvs $$0) {
      return cvu.f;
   }

   @Override
   public int a(cvs $$0, bun $$1) {
      return 72000;
   }

   @Override
   public boolean a(cvs $$0, dej $$1, bun $$2, int $$3) {
      if ($$2 instanceof cnx $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = dbp.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bj()) {
               return false;
            } else if (g($$0)) {
               return false;
            } else {
               jo<awf> $$8 = dbp.b($$0, dbo.C).orElse(awg.zM);
               if ($$1 instanceof arj $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     cpe $$10 = cor.a(cpe::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fR()) {
                        $$10.d = coe.a.c;
                     } else {
                        $$4.gd().h($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), awh.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               $$4.b(awq.c.b(this));
               if ($$7 > 0.0F) {
                  float $$11 = $$4.dI();
                  float $$12 = $$4.dK();
                  float $$13 = -azf.a($$11 * (float) (Math.PI / 180.0)) * azf.b($$12 * (float) (Math.PI / 180.0));
                  float $$14 = -azf.a($$12 * (float) (Math.PI / 180.0));
                  float $$15 = azf.b($$11 * (float) (Math.PI / 180.0)) * azf.b($$12 * (float) (Math.PI / 180.0));
                  float $$16 = azf.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                  $$13 *= $$7 / $$16;
                  $$14 *= $$7 / $$16;
                  $$15 *= $$7 / $$16;
                  $$4.j((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aH()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bur.a, new eyw(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$8.a(), awh.h, 1.0F, 1.0F);
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
   public brs a(dej $$0, cnx $$1, brr $$2) {
      cvs $$3 = $$1.b($$2);
      if (g($$3)) {
         return brs.d;
      } else if (dbp.a($$3, $$1) > 0.0F && !$$1.bj()) {
         return brs.d;
      } else {
         $$1.c($$2);
         return brs.c;
      }
   }

   private static boolean g(cvs $$0) {
      return $$0.o() >= $$0.p() - 1;
   }

   @Override
   public boolean a(cvs $$0, bun $$1, bun $$2) {
      return true;
   }

   @Override
   public void b(cvs $$0, bun $$1, bun $$2) {
      $$0.a(1, $$2, btz.a);
   }

   @Override
   public cor a(dej $$0, jy $$1, cvs $$2, jk $$3) {
      cpe $$4 = new cpe($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = coe.a.b;
      return $$4;
   }
}
