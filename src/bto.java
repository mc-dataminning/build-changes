import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bto<T extends bky> extends btm<T> {
   private static final int i = 200;
   private int j = 0;

   public bto(ceu $$0, Class<T> $$1, boolean $$2, @Nullable Predicate<bky> $$3) {
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
      if (this.j > 0 || !this.e.ef().h()) {
         return false;
      } else if (!((ceu)this.e).gt()) {
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
