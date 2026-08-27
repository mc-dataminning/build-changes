import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fdq {
   private final fws a;
   private int b = -1;
   @Nullable
   private Consumer<ud> c;

   public fdq(fws $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable ud $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<ud> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<ud> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new agx($$2, $$0));
   }

   public void a(io $$0, Consumer<ud> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new agg($$2, $$0));
   }
}
