public class ctb extends csq {
   public static final int a = 6;
   public static final dge b = dfu.ay;
   public static final int c = b(0);
   protected static final float d = 1.0F;
   protected static final float e = 2.0F;
   protected static final eib[] f = new eib[]{
      csq.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csq.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csq.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csq.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csq.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csq.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      csq.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   protected ctb(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return f[$$0.c(b)];
   }

   @Override
   public bgt a(dfe $$0, cpq $$1, gw $$2, cbp $$3, bgs $$4, ehe $$5) {
      cja $$6 = $$3.b($$4);
      civ $$7 = $$6.d();
      if ($$6.a(apw.ai) && $$0.c(b) == 0) {
         csq $$8 = csq.a($$7);
         if ($$8 instanceof cte) {
            if (!$$3.f()) {
               $$6.h(1);
            }

            $$1.a(null, $$2, aoz.cK, apa.e, 1.0F, 1.0F);
            $$1.b($$2, ctf.a($$8));
            $$1.a($$3, djo.c, $$2);
            $$3.b(apj.c.b($$7));
            return bgt.a;
         }
      }

      if ($$1.B) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bgt.a;
         }

         if ($$6.b()) {
            return bgt.b;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bgt a(cpr $$0, gw $$1, dfe $$2, cbp $$3) {
      if (!$$3.t(false)) {
         return bgt.d;
      } else {
         $$3.a(apj.U);
         $$3.ga().a(2, 0.1F);
         int $$4 = $$2.c(b);
         $$0.a($$3, djo.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.a(b, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, djo.f, $$1);
         }

         return bgt.a;
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return $$1.a_($$2.d()).e();
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(b);
   }

   @Override
   public int a(dfe $$0, cpq $$1, gw $$2) {
      return b($$0.c(b));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   public boolean d_(dfe $$0) {
      return true;
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
