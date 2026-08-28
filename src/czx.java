public class czx extends cyr {
   public czx(cyo $$0) {
      super($$0);
   }

   public boolean a(cyp $$0, dcw $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cuq $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if ($$7.a(dga.cf.r()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dga.cg.r()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(awn.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cut.ot) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cuq a(cyp $$0, jo.a $$1) {
      cuq $$2 = new cuq(cut.vX, 1);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cuq $$4 = $$0.a($$3);
         if (!$$4.e()) {
            dob $$5 = dob.a($$4.g());
            if ($$5 != null) {
               $$2.b(kq.H, $$5.b());
               break;
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 >= 2 && $$1 >= 2;
   }

   @Override
   public cze<?> at_() {
      return cze.n;
   }
}
