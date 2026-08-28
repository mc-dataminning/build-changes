import javax.annotation.Nullable;

public class drx extends dtb {
   public drx(je $$0, duo $$1) {
      super(dru.J, $$0, $$1);
   }

   @Override
   public dzu.d b() {
      return new drx.a(this.aB_());
   }

   protected class a extends dtb.a {
      public a(final je $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arh $$0, je $$1, jn<dzl> $$2, @Nullable dzl.a $$3) {
         int $$4 = this.a($$0, this.c, drx.this.m());
         return $$4 != 0 && dzu.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(deg $$0, je $$1, duo $$2) {
         jj $$3 = $$2.c(dhw.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
