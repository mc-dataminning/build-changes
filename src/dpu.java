import javax.annotation.Nullable;

public class dpu extends dqx {
   public dpu(ja $$0, dsk $$1) {
      super(dpr.J, $$0, $$1);
   }

   @Override
   public dxp.d b() {
      return new dpu.a(this.az_());
   }

   protected class a extends dqx.a {
      public a(final ja $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aqm $$0, ja $$1, jj<dxg> $$2, @Nullable dxg.a $$3) {
         int $$4 = this.a($$0, this.c, dpu.this.n());
         return $$4 != 0 && dxp.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dcf $$0, ja $$1, dsk $$2) {
         jf $$3 = $$2.c(dfu.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
