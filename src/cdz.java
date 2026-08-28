import javax.annotation.Nullable;

public class cdz<T extends bvg> extends cdx<T> {
   private static final int i = 200;
   private int j = 0;

   public cdz(cql $$0, Class<T> $$1, boolean $$2, @Nullable cfx.a $$3) {
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
      if (this.j > 0 || !this.e.dZ().h()) {
         return false;
      } else if (!((cql)this.e).gF()) {
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
