import javax.annotation.Nullable;

public class dha extends dib {
   public dha(hx $$0, djh $$1) {
      super(dgx.J, $$0, $$1);
   }

   @Override
   public doa.d c() {
      return new dha.a(this.aB_());
   }

   protected class a extends dib.a {
      public a(hx $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(and $$0, hx $$1, dnr $$2, @Nullable dnr.a $$3) {
         int $$4 = this.a($$0, this.c, dha.this.r());
         return $$4 != 0 && doa.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(ctp $$0, hx $$1, djh $$2) {
         ic $$3 = $$2.c(cxd.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
