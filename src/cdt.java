import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cdt<T extends bva> extends cdr<T> {
   private static final int i = 200;
   private int j = 0;

   public cdt(cqb $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<bva> $$3) {
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
      if (this.j > 0 || !this.e.ea().h()) {
         return false;
      } else if (!((cqb)this.e).gL()) {
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
