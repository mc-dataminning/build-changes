public class com extends cok {
   private static final coq a = coq.a(clr.qL);
   private static final coq b = coq.a(clr.pr);
   private static final coq c = coq.a(clr.un);

   public com(coh $$0) {
      super($$0);
   }

   public boolean a(chh $$0, csf $$1) {
      boolean $$2 = false;
      int $$3 = 0;

      for (int $$4 = 0; $$4 < $$0.b(); $$4++) {
         clo $$5 = $$0.a($$4);
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

   public clo a(chh $$0, it $$1) {
      clo $$2 = new clo(clr.um, 3);
      sd $$3 = $$2.a("Fireworks");
      sj $$4 = new sj();
      int $$5 = 0;

      for (int $$6 = 0; $$6 < $$0.b(); $$6++) {
         clo $$7 = $$0.a($$6);
         if (!$$7.b()) {
            if (b.a($$7)) {
               $$5++;
            } else if (c.a($$7)) {
               sd $$8 = $$7.b("Explosion");
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
   public clo a(it $$0) {
      return new clo(clr.um);
   }

   @Override
   public cox<?> as_() {
      return cox.g;
   }
}
