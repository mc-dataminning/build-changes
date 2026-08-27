public class cql extends cpt {
   public cql(cpr $$0) {
      super($$0);
   }

   public boolean a(ciq $$0, cto $$1) {
      cmx $$2 = cmx.f;
      cmx $$3 = cmx.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmx $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof ckn) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cna.vl)) {
                  return false;
               }

               if (!$$2.b()) {
                  return false;
               }

               if (ckq.a($$5) != null) {
                  return false;
               }

               $$2 = $$5;
            }
         }
      }

      return !$$2.b() && !$$3.b();
   }

   public cmx a(ciq $$0, iu $$1) {
      cmx $$2 = cmx.f;
      cmx $$3 = cmx.f;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmx $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.d() instanceof ckn) {
               $$2 = $$5;
            } else if ($$5.a(cna.vl)) {
               $$3 = $$5.p();
            }
         }
      }

      if ($$3.b()) {
         return $$3;
      } else {
         sn $$6 = ckq.a($$2);
         sn $$7 = $$6 == null ? new sn() : $$6.h();
         $$7.a("Base", ((ckn)$$2.d()).b().a());
         ckq.a($$3, dgw.t, $$7);
         return $$3;
      }
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cqf<?> ar_() {
      return cqf.l;
   }
}
