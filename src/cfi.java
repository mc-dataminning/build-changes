import javax.annotation.Nullable;

public class cfi<T extends bwr> extends cfg<T> {
   private static final int i = 200;
   private int j = 0;

   public cfi(crw $$0, Class<T> $$1, boolean $$2, @Nullable chg.a $$3) {
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
      } else if (!((crw)this.e).gE()) {
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
