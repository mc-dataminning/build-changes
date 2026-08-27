import java.util.function.Consumer;
import javax.annotation.Nullable;

public class esz {
   private final flp a;
   private int b = -1;
   @Nullable
   private Consumer<sd> c;

   public esz(flp $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable sd $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<sd> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<sd> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new adi($$2, $$0));
   }

   public void a(hx $$0, Consumer<sd> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new act($$2, $$0));
   }
}
