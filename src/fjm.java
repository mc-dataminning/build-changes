import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fjm {
   private final gcz a;
   private int b = -1;
   @Nullable
   private Consumer<un> c;

   public fjm(gcz $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable un $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<un> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<un> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new aht($$2, $$0));
   }

   public void a(jh $$0, Consumer<un> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new ahb($$2, $$0));
   }
}
