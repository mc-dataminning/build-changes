import javax.annotation.Nullable;

public class dps extends dqu {
   public dps(ja $$0, dsh $$1) {
      super(dpp.J, $$0, $$1);
   }

   @Override
   public dxj.d b() {
      return new dps.a(this.az_());
   }

   protected class a extends dqu.a {
      public a(final ja $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aqk $$0, ja $$1, jj<dxa> $$2, @Nullable dxa.a $$3) {
         int $$4 = this.a($$0, this.c, dps.this.n());
         return $$4 != 0 && dxj.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dcd $$0, ja $$1, dsh $$2) {
         jf $$3 = $$2.c(dfs.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
