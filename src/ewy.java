import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ewy {
   private final fpy a;
   private int b = -1;
   @Nullable
   private Consumer<sw> c;

   public ewy(fpy $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable sw $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<sw> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<sw> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new afk($$2, $$0));
   }

   public void a(hz $$0, Consumer<sw> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new aev($$2, $$0));
   }
}
