public class cly extends clw {
   private static final cmb a = cmb.a(cjd.qa);
   private static final cmb b = cmb.a(cjd.oG);
   private static final cmb c = cmb.a(cjd.tB);

   public cly(clt $$0) {
      super($$0);
   }

   public boolean a(ceu $$0, cpq $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cja $$5 = $$0.a($$4);
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

   public cja a(ceu $$0, hu $$1) {
      cja $$2 = new cja(cjd.tA, 3);
      qu $$3 = $$2.a("Fireworks");
      ra $$4 = new ra();
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cja $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (b.a($$7)) {
               $$5++;
            } else if (c.a($$7)) {
               qu $$8 = $$7.b("Explosion");
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
   public cja a(hu $$0) {
      return new cja(cjd.tA);
   }

   @Override
   public cmh<?> ai_() {
      return cmh.g;
   }
}
