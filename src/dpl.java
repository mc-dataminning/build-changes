import javax.annotation.Nullable;

public class dpl extends dqn {
   public dpl(iz $$0, dsb $$1) {
      super(dpi.J, $$0, $$1);
   }

   @Override
   public dxd.d b() {
      return new dpl.a(this.ay_());
   }

   protected class a extends dqn.a {
      public a(final iz $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(are $$0, iz $$1, ji<dwu> $$2, @Nullable dwu.a $$3) {
         int $$4 = this.a($$0, this.c, dpl.this.n());
         return $$4 != 0 && dxd.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dbx $$0, iz $$1, dsb $$2) {
         je $$3 = $$2.c(dfl.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
