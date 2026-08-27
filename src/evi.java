import java.util.function.Consumer;
import javax.annotation.Nullable;

public class evi {
   private final fof a;
   private int b = -1;
   @Nullable
   private Consumer<so> c;

   public evi(fof $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable so $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<so> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<so> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new aed($$2, $$0));
   }

   public void a(hx $$0, Consumer<so> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new ado($$2, $$0));
   }
}
