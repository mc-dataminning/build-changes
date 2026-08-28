import javax.annotation.Nullable;

public class dpk extends dqm {
   public dpk(iz $$0, dsa $$1) {
      super(dph.J, $$0, $$1);
   }

   @Override
   public dxc.d b() {
      return new dpk.a(this.az_());
   }

   protected class a extends dqm.a {
      public a(final iz $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(are $$0, iz $$1, ji<dwt> $$2, @Nullable dwt.a $$3) {
         int $$4 = this.a($$0, this.c, dpk.this.n());
         return $$4 != 0 && dxc.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dbw $$0, iz $$1, dsa $$2) {
         je $$3 = $$2.c(dfk.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
