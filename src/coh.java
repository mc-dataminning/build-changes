public class coh<T extends bno & bod> extends cou {
   private final bnu<T> a;
   private final int b;

   public coh(cou.a $$0, bnu<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public blv<coz> a(cvn $$0, chh $$1, blt $$2) {
      coz $$3 = $$1.b($$2);
      if ($$0.B) {
         return blv.c($$3);
      } else {
         bno $$4 = $$1.da();
         if ($$1.bO() && $$4 instanceof bod $$5 && $$4.ai() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, bog.d($$2));
            if ($$3.b()) {
               coz $$6 = new coz(cpc.qU);
               $$6.c($$3.w());
               return blv.a($$6);
            }

            return blv.a($$3);
         }

         $$1.b(atu.c.b(this));
         return blv.c($$3);
      }
   }
}
