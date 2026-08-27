public class dan extends csm {
   public static final dga a = dfq.aw;
   protected static final float b = 6.0F;
   protected static final ehx c = csm.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   protected dan(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Integer.valueOf(0)));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return c;
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
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
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      dfa $$3 = $$1.a_($$2.d());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(apl.af) || $$3.a(apl.H)) {
            gu $$4 = $$2.d();

            for (ha $$5 : ha.c.a) {
               dfa $$6 = $$1.a_($$4.a($$5));
               ead $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(apq.a) || $$6.a(csn.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }
}
