import javax.annotation.Nullable;

public class djq extends dkr {
   public djq(ib $$0, dme $$1) {
      super(djn.J, $$0, $$1);
   }

   @Override
   public dra.d b() {
      return new djq.a(this.aD_());
   }

   protected class a extends dkr.a {
      public a(ib $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(apa $$0, ib $$1, il<dqr> $$2, @Nullable dqr.a $$3) {
         int $$4 = this.a($$0, this.c, djq.this.n());
         return $$4 != 0 && dra.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cwe $$0, ib $$1, dme $$2) {
         ih $$3 = $$2.c(czs.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
