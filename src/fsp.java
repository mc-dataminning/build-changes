public class fsp<T extends bfz, M extends fbf<T>> extends ftg<T, M> {
   private static final acq a = new acq("textures/entity/elytra.png");
   private final fbc<T> b;

   public fsp(fqt<T, M> $$0, fea $$1) {
      super($$0);
      this.b = new fbc<>($$1.a(fed.Q));
   }

   public void a(eij $$0, fjx $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cfz $$10 = $$3.c(bfo.e);
      if ($$10.a(cgc.nh)) {
         acq $$12;
         if ($$3 instanceof fiv $$11) {
            if ($$11.h() && $$11.i() != null) {
               $$12 = $$11.i();
            } else if ($$11.a() && $$11.e() != null && $$11.a(byp.a)) {
               $$12 = $$11.e();
            } else {
               $$12 = a;
            }
         } else {
            $$12 = a;
         }

         $$0.a();
         $$0.a(0.0F, 0.0F, 0.125F);
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         ein $$16 = fpw.a($$1, fkf.a($$12), false, $$10.B());
         this.b.a($$0, $$16, $$2, fum.d, 1.0F, 1.0F, 1.0F, 1.0F);
         $$0.b();
      }
   }
}
