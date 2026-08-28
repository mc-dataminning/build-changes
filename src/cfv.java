import javax.annotation.Nullable;

public class cfv<T extends bxe> extends cft<T> {
   private static final int i = 200;
   private int j = 0;

   public cfv(cst $$0, Class<T> $$1, boolean $$2, @Nullable cht.a $$3) {
      super($$0, $$1, 500, $$2, false, $$3);
   }

   public int i() {
      return this.j;
   }

   public void k() {
      this.j--;
   }

   @Override
   public boolean b() {
      if (this.j > 0 || !this.e.dY().h()) {
         return false;
      } else if (!((cst)this.e).gF()) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   @Override
   public void d() {
      this.j = b(200);
      super.d();
   }
}
