import javax.annotation.Nullable;

public class dxx extends dzc {
   public dxx(iv $$0, eat $$1) {
      super(dxt.K, $$0, $$1);
   }

   @Override
   public egc.d a() {
      return new dxx.a(this.ax_());
   }

   protected class a extends dzc.a {
      public a(final iv $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arq $$0, iv $$1, jf<eft> $$2, @Nullable eft.a $$3) {
         int $$4 = this.a($$0, this.c, dxx.this.m());
         return $$4 != 0 && egc.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(djm $$0, iv $$1, eat $$2) {
         jb $$3 = $$2.c(dng.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
