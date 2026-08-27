public class cth extends ctf {
   private static final ctk a = ctk.a(cqn.qN);
   private static final ctk b = ctk.a(cqn.pt);
   private static final ctk c = ctk.a(cqn.us);

   public cth(ctd $$0) {
      super($$0);
   }

   public boolean a(cme $$0, cwz $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cqk $$5 = $$0.a($$4);
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

   public cqk a(cme $$0, iz $$1) {
      cqk $$2 = new cqk(cqn.ur, 3);
      ta $$3 = $$2.b("Fireworks");
      tg $$4 = new tg();
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cqk $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (b.a($$7)) {
               $$5++;
            } else if (c.a($$7)) {
               ta $$8 = $$7.c("Explosion");
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
   public cqk a(iz $$0) {
      return new cqk(cqn.ur);
   }

   @Override
   public ctr<?> ar_() {
      return ctr.g;
   }
}
