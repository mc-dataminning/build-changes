import java.util.function.Consumer;
import javax.annotation.Nullable;

public class flo {
   private final gfg a;
   private int b = -1;
   @Nullable
   private Consumer<um> c;

   public flo(gfg $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable um $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<um> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<um> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new ahw($$2, $$0));
   }

   public void a(jh $$0, Consumer<um> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new ahe($$2, $$0));
   }
}
