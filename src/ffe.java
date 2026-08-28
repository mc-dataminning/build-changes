import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ffe {
   private final fye a;
   private int b = -1;
   @Nullable
   private Consumer<tx> c;

   public ffe(fye $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable tx $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<tx> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<tx> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new agv($$2, $$0));
   }

   public void a(ja $$0, Consumer<tx> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new age($$2, $$0));
   }
}
