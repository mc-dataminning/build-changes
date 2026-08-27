public class cpw extends cpu {
   private static final cpz a = cpz.a(cnb.qL);
   private static final cpz b = cpz.a(cnb.pr);
   private static final cpz c = cpz.a(cnb.uo);

   public cpw(cps $$0) {
      super($$0);
   }

   public boolean a(cir $$0, ctp $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cmy $$5 = $$0.a($$4);
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

   public cmy a(cir $$0, iu $$1) {
      cmy $$2 = new cmy(cnb.un, 3);
      sn $$3 = $$2.a("Fireworks");
      st $$4 = new st();
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cmy $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (b.a($$7)) {
               $$5++;
            } else if (c.a($$7)) {
               sn $$8 = $$7.b("Explosion");
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
   public cmy a(iu $$0) {
      return new cmy(cnb.un);
   }

   @Override
   public cqg<?> ar_() {
      return cqg.g;
   }
}
