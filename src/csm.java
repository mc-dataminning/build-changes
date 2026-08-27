public class csm extends csk {
   private static final csp a = csp.a(cpt.qN);
   private static final csp b = csp.a(cpt.pt);
   private static final csp c = csp.a(cpt.ur);

   public csm(csi $$0) {
      super($$0);
   }

   public boolean a(clk $$0, cwe $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cpq $$5 = $$0.a($$4);
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

   public cpq a(clk $$0, iy $$1) {
      cpq $$2 = new cpq(cpt.uq, 3);
      sy $$3 = $$2.b("Fireworks");
      te $$4 = new te();
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cpq $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (b.a($$7)) {
               $$5++;
            } else if (c.a($$7)) {
               sy $$8 = $$7.c("Explosion");
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
   public cpq a(iy $$0) {
      return new cpq(cpt.uq);
   }

   @Override
   public csw<?> as_() {
      return csw.g;
   }
}
