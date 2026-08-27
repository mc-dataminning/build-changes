public class cqe extends cqc {
   private static final cqh a = cqh.a(cnj.qN);
   private static final cqh b = cqh.a(cnj.pt);
   private static final cqh c = cqh.a(cnj.ur);

   public cqe(cqa $$0) {
      super($$0);
   }

   public boolean a(ciz $$0, ctx $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cng $$5 = $$0.a($$4);
         if (!$$5.b()) {
            if (a.a($$5)) {
               if ($$2) {
                  return false;
               }

               $$2 = true;
            } else if (b.a($$5)) {
               if (++$$3 > 3) {
                  return false;
               }
            } else if (!c.a($$5)) {
               return false;
            }
         }
      }

      return $$2 && $$3 >= 1;
   }

   public cng a(ciz $$0, iu $$1) {
      cng $$2 = new cng(cnj.uq, 3);
      so $$3 = $$2.a("Fireworks");
      su $$4 = new su();
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cng $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (b.a($$7)) {
               $$5++;
            } else if (c.a($$7)) {
               so $$8 = $$7.b("Explosion");
               if ($$8 != null) {
                  $$4.add($$8);
               }
            }
         }
      }

      $$3.a("Flight", (byte)$$5);
      if (!$$4.isEmpty()) {
         $$3.a("Explosions", $$4);
      }

      return $$2;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return $$0 * $$1 >= 2;
   }

   @Override
   public cng a(iu $$0) {
      return new cng(cnj.uq);
   }

   @Override
   public cqo<?> at_() {
      return cqo.g;
   }
}
