import java.util.List;

public class cxg extends cvg implements cwh {
   public static final int a = 10;
   public static final float b = 8.0F;
   public static final float c = 2.5F;

   public cxg(cvg.a $$0) {
      super($$0);
   }

   public static cyg h() {
      return cyg.a().a(bvm.c, new bvk(f, 8.0, bvk.a.a), bts.b).a(bvm.e, new bvk(g, -2.9F, bvk.a.a), bts.b).a();
   }

   public static cyq k() {
      return new cyq(List.of(), 1.0F, 2);
   }

   @Override
   public boolean a(dua $$0, dds $$1, je $$2, cnp $$3) {
      return !$$3.f();
   }

   @Override
   public cxh b(cvl $$0) {
      return cxh.f;
   }

   @Override
   public int a(cvl $$0, buf $$1) {
      return 72000;
   }

   @Override
   public void a(cvl $$0, dds $$1, buf $$2, int $$3) {
      if ($$2 instanceof cnp $$4) {
         int $$6 = this.a($$0, $$2) - $$3;
         if ($$6 >= 10) {
            float $$7 = day.a($$0, $$4);
            if (!($$7 > 0.0F) || $$4.bj()) {
               if (!h($$0)) {
                  jn<awc> $$8 = day.b($$0, dax.C).orElse(awd.zM);
                  if ($$1 instanceof arg $$9) {
                     $$0.a(1, $$4);
                     if ($$7 == 0.0F) {
                        cow $$10 = coi.a(cow::new, $$9, $$0, $$4, 0.0F, 2.5F, 1.0F);
                        if ($$4.fP()) {
                           $$10.d = cnw.a.c;
                        } else {
                           $$4.gc().h($$0);
                        }

                        $$1.a(null, $$10, $$8.a(), awe.h, 1.0F, 1.0F);
                     }
                  }

                  $$4.b(awn.c.b(this));
                  if ($$7 > 0.0F) {
                     float $$11 = $$4.dI();
                     float $$12 = $$4.dK();
                     float $$13 = -azc.a($$11 * (float) (Math.PI / 180.0)) * azc.b($$12 * (float) (Math.PI / 180.0));
                     float $$14 = -azc.a($$12 * (float) (Math.PI / 180.0));
                     float $$15 = azc.b($$11 * (float) (Math.PI / 180.0)) * azc.b($$12 * (float) (Math.PI / 180.0));
                     float $$16 = azc.c($$13 * $$13 + $$14 * $$14 + $$15 * $$15);
                     $$13 *= $$7 / $$16;
                     $$14 *= $$7 / $$16;
                     $$15 *= $$7 / $$16;
                     $$4.j((double)$$13, (double)$$14, (double)$$15);
                     $$4.a(20, 8.0F, $$0);
                     if ($$4.aH()) {
                        float $$17 = 1.1999999F;
                        $$4.a(buj.a, new eye(0.0, 1.1999999F, 0.0));
                     }

                     $$1.a(null, $$4, $$8.a(), awe.h, 1.0F, 1.0F);
                  }
               }
            }
         }
      }
   }

   @Override
   public brk a(dds $$0, cnp $$1, brj $$2) {
      cvl $$3 = $$1.b($$2);
      if (h($$3)) {
         return brk.d;
      } else if (day.a($$3, $$1) > 0.0F && !$$1.bj()) {
         return brk.d;
      } else {
         $$1.c($$2);
         return brk.c;
      }
   }

   private static boolean h(cvl $$0) {
      return $$0.o() >= $$0.p() - 1;
   }

   @Override
   public boolean a(cvl $$0, buf $$1, buf $$2) {
      return true;
   }

   @Override
   public void b(cvl $$0, buf $$1, buf $$2) {
      $$0.a(1, $$2, btr.a);
   }

   @Override
   public coi a(dds $$0, jx $$1, cvl $$2, jj $$3) {
      cow $$4 = new cow($$0, $$1.a(), $$1.b(), $$1.c(), $$2.c(1));
      $$4.d = cnw.a.b;
      return $$4;
   }
}
