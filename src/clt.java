public class clt extends clr {
   private static final clw a = clw.a(ciz.qa);
   private static final clw b = clw.a(ciz.oG);
   private static final clw c = clw.a(ciz.tB);

   public clt(aep $$0, clp $$1) {
      super($$0, $$1);
   }

   public boolean a(ceq $$0, cpk $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciw $$5 = $$0.a($$4);
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

   public ciw a(ceq $$0, ht $$1) {
      ciw $$2 = new ciw(ciz.tA, 3);
      qs $$3 = $$2.a("Fireworks");
      qy $$4 = new qy();
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         ciw $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (b.a($$7)) {
               $$5++;
            } else if (c.a($$7)) {
               qs $$8 = $$7.b("Explosion");
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
   public ciw a(ht $$0) {
      return new ciw(ciz.tA);
   }

   @Override
   public cmb<?> aj_() {
      return cmb.g;
   }
}
