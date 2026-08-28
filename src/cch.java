import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cch<T extends btn> extends ccf<T> {
   private static final int i = 200;
   private int j = 0;

   public cch(coj $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<btn> $$3) {
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
      if (this.j > 0 || !this.e.dS().h()) {
         return false;
      } else if (!((coj)this.e).gC()) {
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
