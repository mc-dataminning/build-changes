import javax.annotation.Nullable;

public class diy extends djz {
   public diy(hz $$0, dlf $$1) {
      super(div.J, $$0, $$1);
   }

   @Override
   public dpy.d c() {
      return new diy.a(this.aE_());
   }

   protected class a extends djz.a {
      public a(hz $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aov $$0, hz $$1, ij<dpp> $$2, @Nullable dpp.a $$3) {
         int $$4 = this.a($$0, this.c, diy.this.r());
         return $$4 != 0 && dpy.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(cvn $$0, hz $$1, dlf $$2) {
         ie $$3 = $$2.c(czb.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
