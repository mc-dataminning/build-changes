import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eux {
   private final fnr a;
   private int b = -1;
   @Nullable
   private Consumer<sn> c;

   public eux(fnr $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable sn $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<sn> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<sn> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new aec($$2, $$0));
   }

   public void a(hx $$0, Consumer<sn> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new adn($$2, $$0));
   }
}
