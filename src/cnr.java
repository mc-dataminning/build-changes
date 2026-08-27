public class cnr extends cnx {
   public cnr(cnu $$0) {
      super($$0);
   }

   public boolean a(cgu $$0, crs $$1) {
      int $$2 = 0;
      clb $$3 = clb.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clb $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cle.ti)) {
               if (!$$3.b()) {
                  return false;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cle.th)) {
                  return false;
               }

               $$2++;
            }
         }
      }

      return !$$3.b() && $$3.u() && $$2 > 0;
   }

   public clb a(cgu $$0, ip $$1) {
      int $$2 = 0;
      clb $$3 = clb.b;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clb $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if ($$5.a(cle.ti)) {
               if (!$$3.b()) {
                  return clb.b;
               }

               $$3 = $$5;
            } else {
               if (!$$5.a(cle.th)) {
                  return clb.b;
               }

               $$2++;
            }
         }
      }

      if (!$$3.b() && $$3.u() && $$2 >= 1 && cmx.d($$3) < 2) {
         clb $$6 = new clb(cle.ti, $$2);
         rz $$7 = $$3.v().h();
         $$7.a("generation", cmx.d($$3) + 1);
         $$6.c($$7);
         return $$6;
      } else {
         return clb.b;
      }
   }

   public il<clb> a(cgu $$0) {
      il<clb> $$1 = il.a($$0.b(), clb.b);

      for (int $$2 = 0; $$2 < $$1.size(); $$2++) {
         clb $$3 = $$0.a($$2);
         if ($$3.d().t()) {
            $$1.set($$2, new clb($$3.d().s()));
         } else if ($$3.d() instanceof cmx) {
            $$1.set($$2, $$3.c(1));
            break;
         }
      }

      return $$1;
   }

   @Override
   public coj<?> aq_() {
      return coj.d;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 3 && $$1 >= 3;
   }
}
