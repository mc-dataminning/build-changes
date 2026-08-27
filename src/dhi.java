import javax.annotation.Nullable;

public class dhi extends dij {
   public dhi(hx $$0, djp $$1) {
      super(dhf.J, $$0, $$1);
   }

   @Override
   public doi.d c() {
      return new dhi.a(this.aE_());
   }

   protected class a extends dij.a {
      public a(hx $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(ane $$0, hx $$1, ih<dnz> $$2, @Nullable dnz.a $$3) {
         int $$4 = this.a($$0, this.c, dhi.this.r());
         return $$4 != 0 && doi.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(ctx $$0, hx $$1, djp $$2) {
         ic $$3 = $$2.c(cxl.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
