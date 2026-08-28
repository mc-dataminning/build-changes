import javax.annotation.Nullable;

public class dph extends dqj {
   public dph(iz $$0, drx $$1) {
      super(dpe.J, $$0, $$1);
   }

   @Override
   public dwz.d b() {
      return new dph.a(this.aA_());
   }

   protected class a extends dqj.a {
      public a(final iz $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arb $$0, iz $$1, ji<dwq> $$2, @Nullable dwq.a $$3) {
         int $$4 = this.a($$0, this.c, dph.this.n());
         return $$4 != 0 && dwz.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dbt $$0, iz $$1, drx $$2) {
         je $$3 = $$2.c(dfh.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
