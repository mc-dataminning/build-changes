import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqf {
   private final glp a;
   private int b = -1;
   @Nullable
   private Consumer<ua> c;

   public fqf(glp $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable ua $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<ua> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<ua> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new ahv($$2, $$0));
   }

   public void a(iw $$0, Consumer<ua> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new ahd($$2, $$0));
   }
}
