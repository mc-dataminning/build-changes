public class dam extends csl {
   public static final dfz a = dfp.aw;
   protected static final float b = 6.0F;
   protected static final ehw c = csl.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   protected dam(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return c;
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dez $$0, akk $$1, gu $$2, aru $$3) {
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
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      dez $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(apl.af) || $$3.a(apl.H)) {
            gu $$4 = $$2.d();

            for (ha $$5 : ha.c.a) {
               dez $$6 = $$1.a_($$4.a($$5));
               eac $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(apq.a) || $$6.a(csm.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
   }
}
