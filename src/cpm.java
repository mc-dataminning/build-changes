public class cpm extends cpt {
   public cpm(cpr $$0) {
      super($$0);
   }

   public boolean a(ciq $$0, cto $$1) {
      cll $$2 = null;
      cmx $$3 = null;
      cmx $$4 = null;

      for (int $$5 = 0; $$5 < $$0.b(); $$5++) {
         cmx $$6 = $$0.a($$5);
         if (!$$6.b()) {
            cms $$7 = $$6.d();
            if (!($$7 instanceof ckn)) {
               return false;
            }

            ckn $$8 = (ckn)$$7;
            if ($$2 == null) {
               $$2 = $$8.b();
            } else if ($$2 != $$8.b()) {
               return false;
            }

            int $$9 = dgk.c($$6);
            if ($$9 > 6) {
               return false;
            }

            if ($$9 > 0) {
               if ($$3 != null) {
                  return false;
               }

               $$3 = $$6;
            } else {
               if ($$4 != null) {
                  return false;
               }

               $$4 = $$6;
            }
         }
      }

      return $$3 != null && $$4 != null;
   }

   public cmx a(ciq $$0, iu $$1) {
      for (int $$2 = 0; $$2 < $$0.b(); $$2++) {
         cmx $$3 = $$0.a($$2);
         if (!$$3.b()) {
            int $$4 = dgk.c($$3);
            if ($$4 > 0 && $$4 <= 6) {
               return $$3.c(1);
            }
         }
      }

      return cmx.f;
   }

   public iq<cmx> a(ciq $$0) {
      iq<cmx> $$1 = iq.a($$0.b(), cmx.f);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         cmx $$3 = $$0.a($$2);
         if (!$$3.b()) {
            if ($$3.d().t()) {
               $$1.set($$2, new cmx($$3.d().s()));
            } else if ($$3.u() && dgk.c($$3) > 0) {
               $$1.set($$2, $$3.c(1));
            }
         }
      }

      return $$1;
   }

   @Override
   public cqf<?> ar_() {
      return cqf.k;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }
}
