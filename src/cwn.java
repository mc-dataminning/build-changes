import java.util.List;

public class cwn extends cul implements cvm {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cwn(cul.a $$0) {
      super($$0);
   }

   public static cxn h() {
      return cxn.a().a(buw.c, new buu(e, 8.0, buu.a.a), bsz.b).a(buw.e, new buu(f, -2.9F, buu.a.a), bsz.b).a();
   }

   public static cxx k() {
      return new cxx(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dtc $$0, dcw $$1, jd $$2, cmx $$3) {
      return !$$3.f();
   }

   @Override
   public cwo b(cuq $$0) {
      return cwo.f;
   }

   @Override
   public int a(cuq $$0, btn $$1) {
      return 72000;
   }

   @Override
   public void a(cuq $$0, dcw $$1, btn $$2, int $$3) {
      if ($$2 instanceof cmx $$4) {
         int $$5 = this.a($$0, $$2) - $$3;
         if ($$5 >= 10) {
            float $$6 = dae.a($$0, $$4);
            if (!($$6 > 0.0F) || $$4.bg()) {
               jm<avo> $$7 = dae.b($$0, dad.C).orElse(avp.zG);
               if (!$$1.B) {
                  $$0.a(1, $$4, btn.d($$2.fs()));
                  if ($$6 == 0.0F) {
                     coc $$8 = new coc($$1, $$4, $$0);
                     $$8.a($$4, $$4.dG(), $$4.dE(), 0.0F, 2.5F, 1.0F);
                     if ($$4.fL()) {
                        $$8.d = cnd.a.c;
                     }

                     $$1.b($$8);
                     $$1.a(null, $$8, $$7.a(), avq.h, 1.0F, 1.0F);
                     if (!$$4.fL()) {
                        $$4.fY().h($$0);
                     }
                  }
               }

               $$4.b(avz.c.b(this));
               if ($$6 > 0.0F) {
                  float $$9 = $$4.dE();
                  float $$10 = $$4.dG();
                  float $$11 = -ayo.a($$9 * (float) (Math.PI / 180.0)) * ayo.b($$10 * (float) (Math.PI / 180.0));
                  float $$12 = -ayo.a($$10 * (float) (Math.PI / 180.0));
                  float $$13 = ayo.b($$9 * (float) (Math.PI / 180.0)) * ayo.b($$10 * (float) (Math.PI / 180.0));
                  float $$14 = ayo.c($$11 * $$11 + $$12 * $$12 + $$13 * $$13);
                  $$11 *= $$6 / $$14;
                  $$12 *= $$6 / $$14;
                  $$13 *= $$6 / $$14;
                  $$4.j((double)$$11, (double)$$12, (double)$$13);
                  $$4.a(20, 8.0F, $$0);
                  if ($$4.aF()) {
                     float $$15 = 1.1999999F;
                     $$4.a(bts.a, new exc(0.0, 1.1999999F, 0.0));
                  }

                  $$1.a(null, $$4, $$7.a(), avq.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bqs<cuq> a(dcw $$0, cmx $$1, bqq $$2) {
      cuq $$3 = $$1.b($$2);
      if ($$3.n() >= $$3.o() - 1) {
         return bqs.d($$3);
      } else if (dae.a($$3, $$1) > 0.0F && !$$1.bg()) {
         return bqs.d($$3);
      } else {
         $$1.c($$2);
         return bqs.b($$3);
      }
   }

   @Override
   public boolean a(cuq $$0, btn $$1, btn $$2) {
      return true;
   }

   @Override
   public void b(cuq $$0, btn $$1, btn $$2) {
      $$0.a(1, $$2, bsy.a);
   }

   @Override
   public int g() {
      return 1;
   }

   @Override
   public cnp a(dcw $$0, jw $$1, cuq $$2, ji $$3) {
      coc $$4 = new coc($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cnd.a.b;
      return $$4;
   }
}
