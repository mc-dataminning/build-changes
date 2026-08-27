public class fub extends fua<bzg> {
   private static final aex a = new aex("textures/entity/illager/illusioner.png");

   public fub(fth.a $$0) {
      super($$0, new ffr<>($$0.a(fib.ao)), 0.5F);
      this.a(new fxi<bzg, ffr<bzg>>(this, $$0.d()) {
         public void a(elp $$0, foe $$1, int $$2, bzg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gn() || $$3.fV()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public aex a(bzg $$0) {
      return a;
   }

   public void a(bzg $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      if ($$0.cd()) {
         ehn[] $$6 = $$0.E($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)arx.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)arx.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)arx.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(bzg $$0) {
      return true;
   }
}
