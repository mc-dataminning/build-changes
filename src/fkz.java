import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fkz {
   private final ggb a;
   private int b = -1;
   @Nullable
   private Consumer<tq> c;

   public fkz(ggb $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable tq $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<tq> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<tq> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new ahb($$2, $$0));
   }

   public void a(ji $$0, Consumer<tq> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new agj($$2, $$0));
   }
}
