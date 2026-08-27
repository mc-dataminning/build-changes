public class clu extends cls {
   private static final clx a = clx.a(cja.qa);
   private static final clx b = clx.a(cja.oG);
   private static final clx c = clx.a(cja.tB);

   public clu(aer $$0, clq $$1) {
      super($$0, $$1);
   }

   public boolean a(cer $$0, cpl $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cix $$5 = $$0.a($$4);
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

   public cix a(cer $$0, hs $$1) {
      cix $$2 = new cix(cja.tA, 3);
      qr $$3 = $$2.a("Fireworks");
      qx $$4 = new qx();
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cix $$7 = $$0.a($$6);
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
   public cix a(hs $$0) {
      return new cix(cja.tA);
   }

   @Override
   public cmc<?> ai_() {
      return cmc.g;
   }
}
