import javax.annotation.Nullable;

public class ddc extends dec {
   public ddc(gw $$0, dfl $$1) {
      super(dcz.J, $$0, $$1);
   }

   @Override
   public dke.d c() {
      return new ddc.a(this.p());
   }

   protected class a extends dec.a {
      public a(gw $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aks $$0, gw $$1, djv $$2, @Nullable djv.a $$3) {
         int $$4 = this.a($$0, this.c, ddc.this.q());
         return $$4 != 0 && dke.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cpx $$0, gw $$1, dfl $$2) {
         hc $$3 = $$2.c(ctj.a).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
