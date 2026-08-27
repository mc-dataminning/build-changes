import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eur {
   private final fnl a;
   private int b = -1;
   @Nullable
   private Consumer<sl> c;

   public eur(fnl $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable sl $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<sl> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<sl> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new adz($$2, $$0));
   }

   public void a(hx $$0, Consumer<sl> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new adk($$2, $$0));
   }
}
