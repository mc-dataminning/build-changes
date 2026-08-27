public class crf extends cqc {
   public crf(cqa $$0) {
      super($$0);
   }

   public boolean a(ciz $$0, ctx $$1) {
      boolean $$2 = false;
      boolean $$3 = false;
      boolean $$4 = false;
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cng $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if ($$7.a(cxa.cf.j()) && !$$4) {
               $$4 = true;
            } else if ($$7.a(cxa.cg.j()) && !$$3) {
               $$3 = true;
            } else if ($$7.a(asq.O) && !$$2) {
               $$2 = true;
            } else {
               if (!$$7.a(cnj.pp) || $$5) {
                  return false;
               }

               $$5 = true;
            }
         }
      }

      return $$2 && $$4 && $$3 && $$5;
   }

   public cng a(ciz $$0, iu $$1) {
      cng $$2 = new cng(cnj.vQ, 1);

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         cng $$4 = $$0.a($$3);
         if (!$$4.b()) {
            dez $$5 = dez.a($$4.d());
            if ($$5 != null) {
               cor.a($$2, $$5.b());
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
   public cqo<?> at_() {
      return cqo.n;
   }
}
