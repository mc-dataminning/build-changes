public class fud extends fuc<bzi> {
   private static final aey a = new aey("textures/entity/illager/illusioner.png");

   public fud(ftj.a $$0) {
      super($$0, new fft<>($$0.a(fid.ao)), 0.5F);
      this.a(new fxk<bzi, fft<bzi>>(this, $$0.d()) {
         public void a(elr $$0, fog $$1, int $$2, bzi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
            if ($$3.gn() || $$3.fV()) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
            }
         }
      });
      this.f.c().k = true;
   }

   public aey a(bzi $$0) {
      return a;
   }

   public void a(bzi $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      if ($$0.cd()) {
         ehp[] $$6 = $$0.E($$2);
         float $$7 = this.a($$0, $$2);

         for (int $$8 = 0; $$8 < $$6.length; $$8++) {
            $$3.a();
            $$3.a(
               $$6[$$8].c + (double)ary.b((float)$$8 + $$7 * 0.5F) * 0.025,
               $$6[$$8].d + (double)ary.b((float)$$8 + $$7 * 0.75F) * 0.0125,
               $$6[$$8].e + (double)ary.b((float)$$8 + $$7 * 0.7F) * 0.025
            );
            super.a($$0, $$1, $$2, $$3, $$4, $$5);
            $$3.b();
         }
      } else {
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected boolean b(bzi $$0) {
      return true;
   }
}
