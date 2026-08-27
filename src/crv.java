public class crv extends crt {
   private static final cry a = cry.a(cpc.qN);
   private static final cry b = cry.a(cpc.pt);
   private static final cry c = cry.a(cpc.ur);

   public crv(crr $$0) {
      super($$0);
   }

   public boolean a(ckr $$0, cvn $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         coz $$5 = $$0.a($$4);
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

   public coz a(ckr $$0, iw $$1) {
      coz $$2 = new coz(cpc.uq, 3);
      sw $$3 = $$2.a("Fireworks");
      tc $$4 = new tc();
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         coz $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (b.a($$7)) {
               $$5++;
            } else if (c.a($$7)) {
               sw $$8 = $$7.b("Explosion");
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
   public coz a(iw $$0) {
      return new coz(cpc.uq);
   }

   @Override
   public csf<?> at_() {
      return csf.g;
   }
}
