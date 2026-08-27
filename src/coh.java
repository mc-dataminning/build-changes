public class coh extends cof {
   private static final cok a = cok.a(clm.qL);
   private static final cok b = cok.a(clm.pr);
   private static final cok c = cok.a(clm.un);

   public coh(coc $$0) {
      super($$0);
   }

   public boolean a(chc $$0, csa $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clj $$5 = $$0.a($$4);
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

   public clj a(chc $$0, ip $$1) {
      clj $$2 = new clj(clm.um, 3);
      rz $$3 = $$2.a("Fireworks");
      sf $$4 = new sf();
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         clj $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (b.a($$7)) {
               $$5++;
            } else if (c.a($$7)) {
               rz $$8 = $$7.b("Explosion");
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
   public clj a(ip $$0) {
      return new clj(clm.um);
   }

   @Override
   public cos<?> aq_() {
      return cos.g;
   }
}
