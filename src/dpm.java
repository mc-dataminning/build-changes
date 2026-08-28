import javax.annotation.Nullable;

public class dpm extends dqo {
   public dpm(iz $$0, dsc $$1) {
      super(dpj.J, $$0, $$1);
   }

   @Override
   public dxe.d b() {
      return new dpm.a(this.ay_());
   }

   protected class a extends dqo.a {
      public a(final iz $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arf $$0, iz $$1, ji<dwv> $$2, @Nullable dwv.a $$3) {
         int $$4 = this.a($$0, this.c, dpm.this.n());
         return $$4 != 0 && dxe.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dby $$0, iz $$1, dsc $$2) {
         je $$3 = $$2.c(dfm.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
