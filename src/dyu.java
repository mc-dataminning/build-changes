import javax.annotation.Nullable;

public class dyu extends dzz {
   public dyu(iw $$0, ebq $$1) {
      super(dyq.K, $$0, $$1);
   }

   @Override
   public egz.d a() {
      return new dyu.a(this.aC_());
   }

   protected class a extends dzz.a {
      public a(final iw $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(asb $$0, iw $$1, jg<egq> $$2, @Nullable egq.a $$3) {
         int $$4 = this.a($$0, this.c, dyu.this.m());
         return $$4 != 0 && egz.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dkj $$0, iw $$1, ebq $$2) {
         jc $$3 = $$2.c(dod.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
