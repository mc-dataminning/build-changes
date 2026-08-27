import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eqh {
   private final fit a;
   private int b = -1;
   @Nullable
   private Consumer<qu> c;

   public eqh(fit $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable qu $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<qu> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<qu> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new abs($$2, $$0));
   }

   public void a(gw $$0, Consumer<qu> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new abd($$2, $$0));
   }
}
