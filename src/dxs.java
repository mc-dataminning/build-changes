import javax.annotation.Nullable;

public class dxs extends dyx {
   public dxs(iv $$0, eao $$1) {
      super(dxo.K, $$0, $$1);
   }

   @Override
   public efx.d a() {
      return new dxs.a(this.ax_());
   }

   protected class a extends dyx.a {
      public a(final iv $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arq $$0, iv $$1, jf<efo> $$2, @Nullable efo.a $$3) {
         int $$4 = this.a($$0, this.c, dxs.this.m());
         return $$4 != 0 && efx.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(djh $$0, iv $$1, eao $$2) {
         jb $$3 = $$2.c(dnb.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
