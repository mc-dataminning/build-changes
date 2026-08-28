import javax.annotation.Nullable;

public class dyi extends dzn {
   public dyi(iv $$0, ebe $$1) {
      super(dye.K, $$0, $$1);
   }

   @Override
   public egn.d a() {
      return new dyi.a(this.aB_());
   }

   protected class a extends dzn.a {
      public a(final iv $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(ars $$0, iv $$1, jf<ege> $$2, @Nullable ege.a $$3) {
         int $$4 = this.a($$0, this.c, dyi.this.m());
         return $$4 != 0 && egn.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(djx $$0, iv $$1, ebe $$2) {
         jb $$3 = $$2.c(dnr.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
