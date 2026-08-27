import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eqm {
   private final fiy a;
   private int b = -1;
   @Nullable
   private Consumer<qy> c;

   public eqm(fiy $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable qy $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<qy> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<qy> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new abv($$2, $$0));
   }

   public void a(gw $$0, Consumer<qy> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new abh($$2, $$0));
   }
}
