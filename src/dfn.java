import javax.annotation.Nullable;

public class dfn extends dgo {
   public dfn(hx $$0, dhn $$1) {
      super(dfk.J, $$0, $$1);
   }

   @Override
   public dmg.d c() {
      return new dfn.a(this.aC_());
   }

   protected class a extends dgo.a {
      public a(hx $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(ami $$0, hx $$1, dlx $$2, @Nullable dlx.a $$3) {
         int $$4 = this.a($$0, this.c, dfn.this.r());
         return $$4 != 0 && dmg.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(csf $$0, hx $$1, dhn $$2) {
         ib $$3 = $$2.c(cvs.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
