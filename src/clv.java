public class clv extends clt {
   private static final cly a = cly.a(cjb.qa);
   private static final cly b = cly.a(cjb.oG);
   private static final cly c = cly.a(cjb.tB);

   public clv(aer $$0, clr $$1) {
      super($$0, $$1);
   }

   public boolean a(ces $$0, cpm $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         ciy $$5 = $$0.a($$4);
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

   public ciy a(ces $$0, hs $$1) {
      ciy $$2 = new ciy(cjb.tA, 3);
      qr $$3 = $$2.a("Fireworks");
      qx $$4 = new qx();
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         ciy $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (b.a($$7)) {
               $$5++;
            } else if (c.a($$7)) {
               qr $$8 = $$7.b("Explosion");
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
   public ciy a(hs $$0) {
      return new ciy(cjb.tA);
   }

   @Override
   public cmd<?> aj_() {
      return cmd.g;
   }
}
