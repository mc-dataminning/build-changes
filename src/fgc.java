import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fgc {
   private final fze a;
   private int b = -1;
   @Nullable
   private Consumer<ub> c;

   public fgc(fze $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable ub $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<ub> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<ub> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new ahc($$2, $$0));
   }

   public void a(jd $$0, Consumer<ub> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new agl($$2, $$0));
   }
}
