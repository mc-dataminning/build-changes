import java.util.List;

public class cwi extends cuj implements cvg {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cwi(cuj.a $$0) {
      super($$0);
   }

   public static cxj h() {
      return cxj.a().a(buw.c, new buu(e, "Tool modifier", 8.0, buu.a.a), btb.b).a(buw.e, new buu(f, "Tool modifier", -2.9F, buu.a.a), btb.b).a();
   }

   public static cxt k() {
      return new cxt(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dsb $$0, dbx $$1, iz $$2, cmw $$3) {
      return !$$3.f();
   }

   @Override
   public cwj c(cuo $$0) {
      return cwj.f;
   }

   @Override
   public int b(cuo $$0) {
      return 72000;
   }

   @Override
   public void a(cuo $$0, dbx $$1, bto $$2, int $$3) {
      if ($$2 instanceof cmw $$4) {
         int $$5 = this.b($$0) - $$3;
         if ($$5 >= 10) {
            int $$6 = daa.j($$0);
            if ($$6 <= 0 || $$4.bf()) {
               if (!$$1.B) {
                  $$0.a(1, $$4, bto.d($$2.fw()));
                  if ($$6 == 0) {
                     cob $$7 = new cob($$1, $$4, $$0);
                     $$7.a($$4, $$4.dH(), $$4.dF(), 0.0F, 2.5F + (float)$$6 * 0.5F, 1.0F);
                     if ($$4.fP()) {
                        $$7.d = cnc.a.c;
                     }

                     $$1.b($$7);
                     $$1.a(null, $$7, avz.zD, awa.h, 1.0F, 1.0F);
                     if (!$$4.fP()) {
                        $$4.gc().h($$0);
                     }
                  }
               }

               $$4.b(awj.c.b(this));
               if ($$6 > 0) {
                  float $$8 = $$4.dF();
                  float $$9 = $$4.dH();
                  float $$10 = -ayy.a($$8 * (float) (Math.PI / 180.0)) * ayy.b($$9 * (float) (Math.PI / 180.0));
                  float $$11 = -ayy.a($$9 * (float) (Math.PI / 180.0));
                  float $$12 = ayy.b($$8 * (float) (Math.PI / 180.0)) * ayy.b($$9 * (float) (Math.PI / 180.0));
                  float $$13 = ayy.c($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
                  float $$14 = 3.0F * ((1.0F + (float)$$6) / 4.0F);
                  $$10 *= $$14 / $$13;
                  $$11 *= $$14 / $$13;
                  $$12 *= $$14 / $$13;
                  $$4.j((double)$$10, (double)$$11, (double)$$12);
                  $$4.u(20);
                  if ($$4.aE()) {
                     float $$15 = 1.1999999F;
                     $$4.a(btt.a, new evq(0.0, 1.1999999F, 0.0));
                  }

                  avy $$16;
                  if ($$6 >= 3) {
                     $$16 = avz.zC;
                  } else if ($$6 == 2) {
                     $$16 = avz.zB;
                  } else {
                     $$16 = avz.zA;
                  }

                  $$1.a(null, $$4, $$16, awa.h, 1.0F, 1.0F);
               }
            }
         }
      }
   }

   @Override
   public bqu<cuo> a(dbx $$0, cmw $$1, bqs $$2) {
      cuo $$3 = $$1.b($$2);
      if ($$3.n() >= $$3.o() - 1) {
         return bqu.d($$3);
      } else if (daa.j($$3) > 0 && !$$1.bf()) {
         return bqu.d($$3);
      } else {
         $$1.c($$2);
         return bqu.b($$3);
      }
   }

   @Override
   public boolean a(cuo $$0, bto $$1, bto $$2) {
      $$0.a(1, $$2, bta.a);
      return true;
   }

   @Override
   public int g() {
      return 1;
   }

   @Override
   public cno a(dbx $$0, js $$1, cuo $$2, je $$3) {
      cob $$4 = new cob($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cnc.a.b;
      return $$4;
   }
}
