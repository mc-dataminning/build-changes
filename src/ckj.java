public class ckj<T extends bki & bkv> extends ckw {
   private final bkm<T> a;
   private final int b;

   public ckj(ckw.a $$0, bkm<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bir<clb> a(crs $$0, cdm $$1, bip $$2) {
      clb $$3 = $$1.b($$2);
      if ($$0.B) {
         return bir.c($$3);
      } else {
         bki $$4 = $$1.cZ();
         if ($$1.bN() && $$4 instanceof bkv $$5 && $$4.ag() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, $$1x -> $$1x.d($$2));
            if ($$3.b()) {
               clb $$6 = new clb(cle.qh);
               $$6.c($$3.v());
               return bir.a($$6);
            }

            return bir.a($$3);
         }

         $$1.b(aqx.c.b(this));
         return bir.c($$3);
      }
   }
}
