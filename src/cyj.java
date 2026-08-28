import java.util.List;

public class cyj extends cwm implements cxl {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cyj(cwm.a $$0) {
      super($$0);
   }

   public static czh c() {
      return czh.a().a(bwq.c, new bwo(g, 8.0, bwo.a.a), buv.b).a(bwq.e, new bwo(h, -2.9F, bwo.a.a), buv.b).a();
   }

   public static czs d() {
      return new czs(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dwy $$0, dgj $$1, ji $$2, coy $$3) {
      return !$$3.b();
   }

   @Override
   public cws b(cwq $$0) {
      return cws.f;
   }

   @Override
   public int a(cwq $$0, bvi $$1) {
      return 72000;
   }

   @Override
   public boolean a(cwq $$0, dgj $$1, bvi $$2, int $$3) {
      if ($$2 instanceof coy $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 < 10) {
            return false;
         } else {
            float $$7 = ddc.a($$0, $$4);
            if ($$7 > 0.0F && !$$4.bk()) {
               return false;
            } else if ($$0.r()) {
               return false;
            } else {
               jr<avz> $$8 = ddc.b($$0, ddb.C).orElse(awa.Au);
               $$4.b(awk.c.b(this));
               if ($$1 instanceof ard $$9) {
                  $$0.a(1, $$4);
                  if ($$7 == 0.0F) {
                     cqe $$10 = cpr.a(cqe::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                     if ($$4.fV()) {
                        $$10.b = cpf.a.c;
                     } else {
                        $$4.gi().h($$0);
                     }

                     $$1.a(null, $$10, $$8.a(), awb.h, 1.0F, 1.0F);
                     return true;
                  }
               }

               if ($$7 > 0.0F) {
                  float $$11 = $$4.dL();
                  float $$12 = $$4.dN();
                  float $$13 = -ayz.a($$11 * (float) (Math.PI / 180.0)) * ayz.b($$12 * (float) (Math.PI / 180.0));
                  float $$14 = -ayz.a($$12 * (float) (Math.PI / 180.0));
                  float $$15 = ayz.b($$11 * (float) (Math.PI / 180.0)) * ayz.b($$12 * (float) (Math.PI / 180.0));
                  float $$16 = ayz.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                  $$13 *= $$7 / $$16;
                  $$14 *= $$7 / $$16;
                  $$15 *= $$7 / $$16;
                  $$4.j((double)$$13, (double)$$14, (double)$$15);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aJ()) {
                     float $$17 = 1.1999999F;
                     $$4.a(bvm.a, new fbb(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$8.a(), awb.h, 1.0F, 1.0F);
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
   public bsl a(dgj $$0, coy $$1, bsk $$2) {
      cwq $$3 = $$1.b($$2);
      if ($$3.r()) {
         return bsl.d;
      } else if (ddc.a($$3, $$1) > 0.0F && !$$1.bk()) {
         return bsl.d;
      } else {
         $$1.c($$2);
         return bsl.c;
      }
   }

   @Override
   public boolean a(cwq $$0, bvi $$1, bvi $$2) {
      return true;
   }

   @Override
   public void b(cwq $$0, bvi $$1, bvi $$2) {
      $$0.a(1, $$2, buu.a);
   }

   @Override
   public cpr a(dgj $$0, kb $$1, cwq $$2, jn $$3) {
      cqe $$4 = new cqe($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.b = cpf.a.b;
      return $$4;
   }
}
