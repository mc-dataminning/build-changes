public class cpf extends cpd {
   private static final cpi a = cpi.a(cmk.qL);
   private static final cpi b = cpi.a(cmk.pr);
   private static final cpi c = cpi.a(cmk.uo);

   public cpf(cpb $$0) {
      super($$0);
   }

   public boolean a(cia $$0, csy $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmh $$5 = $$0.a($$4);
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

   public cmh a(cia $$0, is $$1) {
      cmh $$2 = new cmh(cmk.un, 3);
      sj $$3 = $$2.a("Fireworks");
      sp $$4 = new sp();
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cmh $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (b.a($$7)) {
               $$5++;
            } else if (c.a($$7)) {
               sj $$8 = $$7.b("Explosion");
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
   public cmh a(is $$0) {
      return new cmh(cmk.un);
   }

   @Override
   public cpp<?> ar_() {
      return cpp.g;
   }
}
