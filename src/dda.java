import javax.annotation.Nullable;

public class dda extends dea {
   public dda(gw $$0, dfj $$1) {
      super(dcx.J, $$0, $$1);
   }

   @Override
   public dkc.d c() {
      return new dda.a(this.p());
   }

   protected class a extends dea.a {
      public a(gw $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(akq $$0, gw $$1, djt $$2, @Nullable djt.a $$3) {
         int $$4 = this.a($$0, this.c, dda.this.q());
         return $$4 != 0 && dkc.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cpv $$0, gw $$1, dfj $$2) {
         ha $$3 = $$2.c(cth.a).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
