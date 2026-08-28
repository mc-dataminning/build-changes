public class czo extends cyl {
   public czo(cyj $$0) {
      super($$0);
   }

   public boolean a(cqi $$0, dbw $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cun $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if ($$7.a(dez.cf.r()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dez.cg.r()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(awx.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cuq.pq) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cun a(cqi $$0, jk.a $$1) {
      cun $$2 = new cun(cuq.vU, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cun $$4 = $$0.a($$3);
         if (!$$4.e()) {
            dmz $$5 = dmz.a($$4.g());
            if ($$5 != null) {
               $$2.b(km.G, $$5.b());
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
   public cyx<?> ap_() {
      return cyx.n;
   }
}
