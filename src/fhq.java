import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fhq {
   private final gay a;
   private int b = -1;
   @Nullable
   private Consumer<uf> c;

   public fhq(gay $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable uf $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<uf> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<uf> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new ahl($$2, $$0));
   }

   public void a(je $$0, Consumer<uf> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new agt($$2, $$0));
   }
}
