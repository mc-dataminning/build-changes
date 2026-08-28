import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fms {
   private final gia a;
   private int b = -1;
   @Nullable
   private Consumer<tw> c;

   public fms(gia $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable tw $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<tw> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<tw> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new ahh($$2, $$0));
   }

   public void a(jj $$0, Consumer<tw> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new agp($$2, $$0));
   }
}
