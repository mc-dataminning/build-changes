import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cbu<T extends btb> extends cbs<T> {
   private static final int i = 200;
   private int j = 0;

   public cbu(cnw $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<btb> $$3) {
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
      if (this.j > 0 || !this.e.dT().h()) {
         return false;
      } else if (!((cnw)this.e).gF()) {
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
