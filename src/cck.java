import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cck<T extends btr> extends cci<T> {
   private static final int i = 200;
   private int j = 0;

   public cck(col $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<btr> $$3) {
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
      if (this.j > 0 || !this.e.el().h()) {
         return false;
      } else if (!((col)this.e).gH()) {
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
