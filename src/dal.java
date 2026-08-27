public class dal extends csk {
   public static final dfy a = dfo.aw;
   protected static final float b = 6.0F;
   protected static final ehy c = csk.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   protected dal(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return c;
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$1.t($$2.c())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(a);
            if ($$5 == 15) {
               $$1.b($$2.c(), this.n());
               $$1.a($$2, $$0.a(a, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.a(a, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      dey $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(apj.af) || $$3.a(apj.H)) {
            gv $$4 = $$2.d();

            for (hb $$5 : hb.c.a) {
               dey $$6 = $$1.a_($$4.a($$5));
               eab $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(apo.a) || $$6.a(csl.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }
}
