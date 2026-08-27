public class dau extends csy implements css {
   private static final float c = 0.003F;
   public static final int a = 3;
   public static final dge b = dfu.as;
   private static final eib d = csq.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final eib e = csq.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   public dau(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return new cja(cjd.vv);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      if ($$0.c(b) == 0) {
         return d;
      } else {
         return $$0.c(b) < 3 ? e : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public boolean e_(dfe $$0) {
      return $$0.c(b) < 3;
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      int $$4 = $$0.c(b);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.c(), 0) >= 9) {
         dfe $$5 = $$0.a(b, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(djo.c, $$2, djo.a.a($$5));
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      if ($$3 instanceof bjb && $$3.ag() != bip.N && $$3.ag() != bip.h) {
         $$3.a($$0, new ehi(0.8F, 0.75, 0.8F));
         if (!$$1.B && $$0.c(b) > 0 && ($$3.ac != $$3.dp() || $$3.ae != $$3.dv())) {
            double $$4 = Math.abs($$3.dp() - $$3.ac);
            double $$5 = Math.abs($$3.dv() - $$3.ae);
            if ($$4 >= 0.003F || $$5 >= 0.003F) {
               $$3.a($$1.ag().s(), 1.0F);
            }
         }
      }
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      int $$6 = $$0.c(b);
      boolean $$7 = $$6 == 3;
      if (!$$7 && $$3.b($$4).a(cjd.qK)) {
         return bgt.d;
      } else if ($$6 > 1) {
         int $$8 = 1 + $$1.z.a(2);
         a($$1, $$2, new cja(cjd.vv, $$8 + ($$7 ? 1 : 0)));
         $$1.a(null, $$2, aoz.xF, apa.e, 1.0F, 0.8F + $$1.z.i() * 0.4F);
         dfe $$9 = $$0.a(b, Integer.valueOf(1));
         $$1.a($$2, $$9, 2);
         $$1.a(djo.c, $$2, djo.a.a($$3, $$9));
         return bgt.a($$1.B);
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return $$2.c(b) < 3;
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      int $$4 = Math.min(3, $$3.c(b) + 1);
      $$0.a($$2, $$3.a(b, Integer.valueOf($$4)), 2);
   }
}
