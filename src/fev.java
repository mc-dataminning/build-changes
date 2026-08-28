import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fev {
   private final fxv a;
   private int b = -1;
   @Nullable
   private Consumer<ur> c;

   public fev(fxv $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable ur $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<ur> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<ur> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new ahp($$2, $$0));
   }

   public void a(iz $$0, Consumer<ur> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new agy($$2, $$0));
   }
}
