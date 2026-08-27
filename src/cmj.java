public class cmj extends cmh {
   private static final cmm a = cmm.a(cjo.qa);
   private static final cmm b = cmm.a(cjo.oG);
   private static final cmm c = cmm.a(cjo.tB);

   public cmj(cme $$0) {
      super($$0);
   }

   public boolean a(cff $$0, cqb $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjl $$5 = $$0.a($$4);
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

   public cjl a(cff $$0, hr $$1) {
      cjl $$2 = new cjl(cjo.tA, 3);
      qw $$3 = $$2.a("Fireworks");
      rc $$4 = new rc();
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cjl $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (b.a($$7)) {
               $$5++;
            } else if (c.a($$7)) {
               qw $$8 = $$7.b("Explosion");
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
   public cjl a(hr $$0) {
      return new cjl(cjo.tA);
   }

   @Override
   public cms<?> an_() {
      return cms.g;
   }
}
