import javax.annotation.Nullable;

public class dkn extends dlo {
   public dkn(ib $$0, dnb $$1) {
      super(dkk.J, $$0, $$1);
   }

   @Override
   public dry.d b() {
      return new dkn.a(this.aC_());
   }

   protected class a extends dlo.a {
      public a(ib $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(apf $$0, ib $$1, il<drp> $$2, @Nullable drp.a $$3) {
         int $$4 = this.a($$0, this.c, dkn.this.n());
         return $$4 != 0 && dry.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cxb $$0, ib $$1, dnb $$2) {
         ih $$3 = $$2.c(dap.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
