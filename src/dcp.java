import javax.annotation.Nullable;

public class dcp extends ddp {
   public dcp(gv $$0, dey $$1) {
      super(dcm.J, $$0, $$1);
   }

   @Override
   public djr.d c() {
      return new dcp.a(this.p());
   }

   protected class a extends ddp.a {
      public a(gv $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aki $$0, gv $$1, dji $$2, @Nullable dji.a $$3) {
         int $$4 = this.a($$0, this.c, dcp.this.q());
         return $$4 != 0 && djr.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cpk $$0, gv $$1, dey $$2) {
         hb $$3 = $$2.c(csw.a).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
