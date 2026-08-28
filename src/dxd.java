import javax.annotation.Nullable;

public class dxd extends dyi {
   public dxd(iu $$0, dzz $$1) {
      super(dwz.K, $$0, $$1);
   }

   @Override
   public efi.d a() {
      return new dxd.a(this.aw_());
   }

   protected class a extends dyi.a {
      public a(final iu $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arq $$0, iu $$1, je<eez> $$2, @Nullable eez.a $$3) {
         int $$4 = this.a($$0, this.c, dxd.this.m());
         return $$4 != 0 && efi.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(div $$0, iu $$1, dzz $$2) {
         ja $$3 = $$2.c(dmo.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
