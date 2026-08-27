import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fbp {
   private final fur a;
   private int b = -1;
   @Nullable
   private Consumer<to> c;

   public fbp(fur $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable to $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<to> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<to> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new agg($$2, $$0));
   }

   public void a(id $$0, Consumer<to> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new afq($$2, $$0));
   }
}
