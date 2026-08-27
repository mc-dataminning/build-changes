import javax.annotation.Nullable;

public class dmk extends dnm {
   public dmk(ib $$0, doz $$1) {
      super(dmh.J, $$0, $$1);
   }

   @Override
   public dub.d b() {
      return new dmk.a(this.aA_());
   }

   protected class a extends dnm.a {
      public a(ib $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aps $$0, ib $$1, il<dts> $$2, @Nullable dts.a $$3) {
         int $$4 = this.a($$0, this.c, dmk.this.n());
         return $$4 != 0 && dub.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cyx $$0, ib $$1, doz $$2) {
         ih $$3 = $$2.c(dcl.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
