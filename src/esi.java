import java.util.function.Consumer;
import javax.annotation.Nullable;

public class esi {
   private final fkx a;
   private int b = -1;
   @Nullable
   private Consumer<rz> c;

   public esi(fkx $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable rz $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<rz> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<rz> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new adc($$2, $$0));
   }

   public void a(ht $$0, Consumer<rz> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new acn($$2, $$0));
   }
}
