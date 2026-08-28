import javax.annotation.Nullable;

public class dux extends dwc {
   public dux(ji $$0, dxq $$1) {
      super(duu.K, $$0, $$1);
   }

   @Override
   public ecy.d b() {
      return new dux.a(this.aA_());
   }

   protected class a extends dwc.a {
      public a(final ji $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(ard $$0, ji $$1, jr<ecp> $$2, @Nullable ecp.a $$3) {
         int $$4 = this.a($$0, this.c, dux.this.m());
         return $$4 != 0 && ecy.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dgz $$0, ji $$1, dxq $$2) {
         jn $$3 = $$2.c(dks.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
