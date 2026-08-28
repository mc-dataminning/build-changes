import javax.annotation.Nullable;

public class dpo extends dqq {
   public dpo(iz $$0, dse $$1) {
      super(dpl.J, $$0, $$1);
   }

   @Override
   public dxg.d b() {
      return new dpo.a(this.ay_());
   }

   protected class a extends dqq.a {
      public a(final iz $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arf $$0, iz $$1, ji<dwx> $$2, @Nullable dwx.a $$3) {
         int $$4 = this.a($$0, this.c, dpo.this.n());
         return $$4 != 0 && dxg.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dca $$0, iz $$1, dse $$2) {
         je $$3 = $$2.c(dfo.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
