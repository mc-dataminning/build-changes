import javax.annotation.Nullable;

public class dpn extends dqp {
   public dpn(iz $$0, dsd $$1) {
      super(dpk.J, $$0, $$1);
   }

   @Override
   public dxf.d b() {
      return new dpn.a(this.ay_());
   }

   protected class a extends dqp.a {
      public a(final iz $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arf $$0, iz $$1, ji<dww> $$2, @Nullable dww.a $$3) {
         int $$4 = this.a($$0, this.c, dpn.this.n());
         return $$4 != 0 && dxf.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dbz $$0, iz $$1, dsd $$2) {
         je $$3 = $$2.c(dfn.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
