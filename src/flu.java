import java.util.function.Consumer;
import javax.annotation.Nullable;

public class flu {
   private final gfk a;
   private int b = -1;
   @Nullable
   private Consumer<ux> c;

   public flu(gfk $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable ux $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<ux> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<ux> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new aih($$2, $$0));
   }

   public void a(jh $$0, Consumer<ux> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new ahp($$2, $$0));
   }
}
