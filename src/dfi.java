import javax.annotation.Nullable;

public class dfi extends dgj {
   public dfi(ht $$0, dhi $$1) {
      super(dff.J, $$0, $$1);
   }

   @Override
   public dmb.d c() {
      return new dfi.a(this.p());
   }

   protected class a extends dgj.a {
      public a(ht $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(ame $$0, ht $$1, dls $$2, @Nullable dls.a $$3) {
         int $$4 = this.a($$0, this.c, dfi.this.q());
         return $$4 != 0 && dmb.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(csa $$0, ht $$1, dhi $$2) {
         hx $$3 = $$2.c(cvn.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
