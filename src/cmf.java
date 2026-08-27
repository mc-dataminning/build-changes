public class cmf extends cmd {
   private static final cmi a = cmi.a(cjk.qa);
   private static final cmi b = cmi.a(cjk.oG);
   private static final cmi c = cmi.a(cjk.tB);

   public cmf(cma $$0) {
      super($$0);
   }

   public boolean a(cfb $$0, cpx $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         cjh $$5 = $$0.a($$4);
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

   public cjh a(cfb $$0, hu $$1) {
      cjh $$2 = new cjh(cjk.tA, 3);
      qy $$3 = $$2.a("Fireworks");
      re $$4 = new re();
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         cjh $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (b.a($$7)) {
               $$5++;
            } else if (c.a($$7)) {
               qy $$8 = $$7.b("Explosion");
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
   public cjh a(hu $$0) {
      return new cjh(cjk.tA);
   }

   @Override
   public cmo<?> an_() {
      return cmo.g;
   }
}
