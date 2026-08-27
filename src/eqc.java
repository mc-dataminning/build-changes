import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eqc {
   private final fio a;
   private int b = -1;
   @Nullable
   private Consumer<qr> c;

   public eqc(fio $$0) {
      this.a = $$0;
   }

   public boolean a(int $$0, @Nullable qr $$1) {
      if (this.b == $$0 && this.c != null) {
         this.c.accept($$1);
         this.c = null;
         return true;
      } else {
         return false;
      }
   }

   private int a(Consumer<qr> $$0) {
      this.c = $$0;
      return ++this.b;
   }

   public void a(int $$0, Consumer<qr> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new abp($$2, $$0));
   }

   public void a(gu $$0, Consumer<qr> $$1) {
      int $$2 = this.a($$1);
      this.a.b(new aba($$2, $$0));
   }
}
