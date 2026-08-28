import javax.annotation.Nullable;

public class drj extends dsn {
   public drj(je $$0, dua $$1) {
      super(drg.J, $$0, $$1);
   }

   @Override
   public dzg.d b() {
      return new drj.a(this.aD_());
   }

   protected class a extends dsn.a {
      public a(final je $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arg $$0, je $$1, jn<dyx> $$2, @Nullable dyx.a $$3) {
         int $$4 = this.a($$0, this.c, drj.this.m());
         return $$4 != 0 && dzg.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dds $$0, je $$1, dua $$2) {
         jj $$3 = $$2.c(dhi.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
