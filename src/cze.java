public class cze extends cxy {
   public cze(cxv $$0) {
      super($$0);
   }

   public boolean a(cxw $$0, dcd $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.a(); $$6++) {
         cua $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if ($$7.a(dfh.cf.r()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dfh.cg.r()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(awd.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cud.pq) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cua a(cxw $$0, jl.a $$1) {
      cua $$2 = new cua(cud.vX, 1);

      for (int $$3 = 0; $$3 < $$0.a(); $$3++) {
         cua $$4 = $$0.a($$3);
         if (!$$4.e()) {
            dnh $$5 = dnh.a($$4.g());
            if ($$5 != null) {
               $$2.b(kn.H, $$5.b());
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
   public cyl<?> ap_() {
      return cyl.n;
   }
}
