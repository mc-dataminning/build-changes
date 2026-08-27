public class ftk<T extends bfz> extends ftg<T, fdd<T>> {
   private final fbf<T> a;

   public ftk(fqt<T, fdd<T>> $$0, fea $$1) {
      super($$0);
      this.a = new fdd<>($$1.a(fed.bn));
   }

   public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      enn $$10 = enn.N();
      boolean $$11 = $$10.b($$3) && $$3.cb();
      if (!$$3.cb() || $$11) {
         ein $$12;
         if ($$11) {
            $$12 = $$1.getBuffer(fkf.p(this.a($$3)));
         } else {
            $$12 = $$1.getBuffer(fkf.h(this.a($$3)));
         }

         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         this.a.a($$0, $$12, $$2, fpz.c($$3, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
