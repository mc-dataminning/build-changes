public class ftr extends ftq<byy> {
   private static final aer a = new aer("textures/entity/illager/illusioner.png");

   public ftr(fsx.a $$0) {
      super($$0, new ffh<>($$0.a(fhr.ao)), 0.5F);
      this.a(new fwy<byy, ffh<byy>>(this, $$0.d()) {
         public void a(elf $$0, fnu $$1, int $$2, byy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gk() || $$3.fS()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public aer a(byy $$0) {
      return a;
   }

   public void a(byy $$0, float $$1, float $$2, elf $$3, fnu $$4, int $$5) {
      if ($$0.cd()) {
         ehd[] $$6 = $$0.E($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)arp.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)arp.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)arp.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(byy $$0) {
      return true;
   }
}
