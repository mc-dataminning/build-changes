public class cnh extends cnf {
   private static final cnk a = cnk.a(ckm.qa);
   private static final cnk b = cnk.a(ckm.oG);
   private static final cnk c = cnk.a(ckm.tB);

   public cnh(cnc $$0) {
      super($$0);
   }

   public boolean a(cgd $$0, cqz $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ckj $$5 = $$0.a($$4);
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

   public ckj a(cgd $$0, ip $$1) {
      ckj $$2 = new ckj(ckm.tA, 3);
      rt $$3 = $$2.a("Fireworks");
      rz $$4 = new rz();
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         ckj $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (b.a($$7)) {
               $$5++;
            } else if (c.a($$7)) {
               rt $$8 = $$7.b("Explosion");
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
   public ckj a(ip $$0) {
      return new ckj(ckm.tA);
   }

   @Override
   public cnq<?> aq_() {
      return cnq.g;
   }
}
