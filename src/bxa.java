import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxa<T extends boi> extends bwy<T> {
   private static final int i = 200;
   private int j = 0;

   public bxa(civ $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<boi> $$3) {
      super($$0, $$1, 500, $$2, false, $$3);
   }

   public int i() {
      return this.j;
   }

   public void k() {
      this.j--;
   }

   @Override
   public boolean a() {
      if (this.j > 0 || !this.e.eh().h()) {
         return false;
      } else if (!((civ)this.e).gv()) {
         return false;
      } else {
         this.h();
         return this.c != null;
      }
   }

   @Override
   public void c() {
      this.j = b(200);
      super.c();
   }
}
