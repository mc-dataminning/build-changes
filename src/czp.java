public class czp extends cym {
   public czp(cyk $$0) {
      super($$0);
   }

   public boolean a(cqj $$0, dbx $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cuo $$7 = $$0.a($$6);
         if (!$$7.e()) {
            if ($$7.a(dfa.cf.r()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(dfa.cg.r()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(awx.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cur.pq) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cuo a(cqj $$0, jk.a $$1) {
      cuo $$2 = new cuo(cur.vU, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cuo $$4 = $$0.a($$3);
         if (!$$4.e()) {
            dna $$5 = dna.a($$4.g());
            if ($$5 != null) {
               $$2.b(km.H, $$5.b());
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
   public cyy<?> ao_() {
      return cyy.n;
   }
}
