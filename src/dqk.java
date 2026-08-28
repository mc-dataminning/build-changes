import javax.annotation.Nullable;

public class dqk extends drn {
   public dqk(jd $$0, dta $$1) {
      super(dqh.J, $$0, $$1);
   }

   @Override
   public dyf.d b() {
      return new dqk.a(this.az_());
   }

   protected class a extends drn.a {
      public a(final jd $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aqt $$0, jd $$1, jm<dxw> $$2, @Nullable dxw.a $$3) {
         int $$4 = this.a($$0, this.c, dqk.this.n());
         return $$4 != 0 && dyf.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dcu $$0, jd $$1, dta $$2) {
         ji $$3 = $$2.c(dgj.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
