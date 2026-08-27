import javax.annotation.Nullable;

public class dgz extends dia {
   public dgz(hx $$0, djg $$1) {
      super(dgw.J, $$0, $$1);
   }

   @Override
   public dnz.d c() {
      return new dgz.a(this.aB_());
   }

   protected class a extends dia.a {
      public a(hx $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(and $$0, hx $$1, dnq $$2, @Nullable dnq.a $$3) {
         int $$4 = this.a($$0, this.c, dgz.this.r());
         return $$4 != 0 && dnz.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cto $$0, hx $$1, djg $$2) {
         ic $$3 = $$2.c(cxc.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
