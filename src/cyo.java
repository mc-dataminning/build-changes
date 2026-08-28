public class cyo<T extends bwf & bxb> extends cyz {
   private final bwo<T> a;
   private final int b;

   public cyo(bwo<T> $$0, int $$1, cyz.a $$2) {
      super($$2);
      this.a = $$0;
      this.b = $$1;
   }

   @Override
   public bud a(dja $$0, crc $$1, buc $$2) {
      czd $$3 = $$1.b($$2);
      if ($$0.C) {
         return bud.e;
      } else {
         bwf $$4 = $$1.dl();
         if ($$1.bZ() && $$4 instanceof bxb $$5 && $$4.aq() == this.a && $$5.a()) {
            bwp $$6 = bxe.d($$2);
            czd $$7 = $$3.a(this.b, czh.sd, $$1, $$6);
            return bud.b.a($$7);
         }

         $$1.b(awx.c.b(this));
         return bud.e;
      }
   }
}
