import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eyz {
   private final fsb a;
   private int b = -1;
   @Nullable
   private Consumer<ta> c;

   public eyz(fsb $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable ta $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<ta> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<ta> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new afs($$2, $$0));
   }

   public void a(ib $$0, Consumer<ta> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new afc($$2, $$0));
   }
}
