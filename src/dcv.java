import javax.annotation.Nullable;

public class dcv extends ddv {
   public dcv(gw $$0, dfe $$1) {
      super(dcs.J, $$0, $$1);
   }

   @Override
   public djx.d c() {
      return new dcv.a(this.p());
   }

   protected class a extends ddv.a {
      public a(gw $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(akn $$0, gw $$1, djo $$2, @Nullable djo.a $$3) {
         int $$4 = this.a($$0, this.c, dcv.this.q());
         return $$4 != 0 && djx.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cpq $$0, gw $$1, dfe $$2) {
         hc $$3 = $$2.c(ctc.a).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
