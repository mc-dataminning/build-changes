public class czv<T extends bxe & byc> extends dag {
   private final bxn<T> a;
   private final int b;

   public czv(bxn<T> $$0, int $$1, dag.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bvc a(dkj $$0, csi $$1, bvb $$2) {
      dak $$3 = $$1.b($$2);
      if ($$0.C) {
         return bvc.e;
      } else {
         bxe $$4 = $$1.dl();
         if ($$1.bY() && $$4 instanceof byc $$5 && $$4.an() == this.a && $$5.a()) {
            bxo $$6 = byf.d($$2);
            dak $$7 = $$3.a(this.b, dao.sd, $$1, $$6);
            return bvc.b.a($$7);
         }

         $$1.b(axi.c.b(this));
         return bvc.e;
      }
   }
}
