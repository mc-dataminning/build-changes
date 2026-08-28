import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fix {
   private final gcj a;
   private int b = -1;
   @Nullable
   private Consumer<uk> c;

   public fix(gcj $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable uk $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<uk> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<uk> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new ahq($$2, $$0));
   }

   public void a(jh $$0, Consumer<uk> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new agy($$2, $$0));
   }
}
