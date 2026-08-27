import javax.annotation.Nullable;

public class dqh extends dro {
   public dqh(ir $$0, dtc $$1) {
      super(dqe.K, $$0, $$1);
   }

   @Override
   public dye.d b() {
      return new dqh.a(this.az_());
   }

   protected class a extends dro.a {
      public a(ir $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aqt $$0, ir $$1, ja<dxv> $$2, @Nullable dxv.a $$3) {
         int $$4 = this.a($$0, this.c, dqh.this.n());
         return $$4 != 0 && dye.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dca $$0, ir $$1, dtc $$2) {
         iw $$3 = $$2.c(dfp.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
