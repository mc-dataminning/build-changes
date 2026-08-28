import javax.annotation.Nullable;

public class dvr extends dww {
   public dvr(jj $$0, dym $$1) {
      super(dvn.K, $$0, $$1);
   }

   @Override
   public edv.d a() {
      return new dvr.a(this.aw_());
   }

   protected class a extends dww.a {
      public a(final jj $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arn $$0, jj $$1, js<edm> $$2, @Nullable edm.a $$3) {
         int $$4 = this.a($$0, this.c, dvr.this.m());
         return $$4 != 0 && edv.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dhp $$0, jj $$1, dym $$2) {
         jo $$3 = $$2.c(dli.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
