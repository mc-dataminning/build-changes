import javax.annotation.Nullable;

public class dqm extends drp {
   public dqm(jd $$0, dtc $$1) {
      super(dqj.J, $$0, $$1);
   }

   @Override
   public dyi.d b() {
      return new dqm.a(this.aD_());
   }

   protected class a extends drp.a {
      public a(final jd $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aqu $$0, jd $$1, jm<dxz> $$2, @Nullable dxz.a $$3) {
         int $$4 = this.a($$0, this.c, dqm.this.n());
         return $$4 != 0 && dyi.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dcw $$0, jd $$1, dtc $$2) {
         ji $$3 = $$2.c(dgl.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
