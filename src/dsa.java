import javax.annotation.Nullable;

public class dsa extends dte {
   public dsa(jf $$0, dus $$1) {
      super(drx.J, $$0, $$1);
   }

   @Override
   public dzy.d b() {
      return new dsa.a(this.aC_());
   }

   protected class a extends dte.a {
      public a(final jf $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arj $$0, jf $$1, jo<dzp> $$2, @Nullable dzp.a $$3) {
         int $$4 = this.a($$0, this.c, dsa.this.m());
         return $$4 != 0 && dzy.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dej $$0, jf $$1, dus $$2) {
         jk $$3 = $$2.c(dhz.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
