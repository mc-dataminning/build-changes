import javax.annotation.Nullable;

public class dpv extends dqy {
   public dpv(ja $$0, dsl $$1) {
      super(dps.J, $$0, $$1);
   }

   @Override
   public dxq.d b() {
      return new dpv.a(this.az_());
   }

   protected class a extends dqy.a {
      public a(final ja $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aqm $$0, ja $$1, jj<dxh> $$2, @Nullable dxh.a $$3) {
         int $$4 = this.a($$0, this.c, dpv.this.n());
         return $$4 != 0 && dxq.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dcg $$0, ja $$1, dsl $$2) {
         jf $$3 = $$2.c(dfv.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
