import java.util.function.Predicate;
import javax.annotation.Nullable;

public class brn<T extends biw> extends brl<T> {
   private static final int i = 200;
   private int j = 0;

   public brn(cct $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<biw> $$3) {
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
      if (this.j > 0 || !this.e.ee().h()) {
         return false;
      } else if (!((cct)this.e).go()) {
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
