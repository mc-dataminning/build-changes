public class czj<T extends bwt & bxr> extends czu {
   private final bxc<T> a;
   private final int b;

   public czj(bxc<T> $$0, int $$1, czu.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bur a(djx $$0, crx $$1, buq $$2) {
      czy $$3 = $$1.b($$2);
      if ($$0.C) {
         return bur.e;
      } else {
         bwt $$4 = $$1.dl();
         if ($$1.bY() && $$4 instanceof bxr $$5 && $$4.an() == this.a && $$5.a()) {
            bxd $$6 = bxu.d($$2);
            czy $$7 = $$3.a(this.b, dac.sd, $$1, $$6);
            return bur.b.a($$7);
         }

         $$1.b(awz.c.b(this));
         return bur.e;
      }
   }
}
