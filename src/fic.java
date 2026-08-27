import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fic {
   private final Consumer<ffx> a;
   private final Consumer<ffx> b;
   @Nullable
   private fib c;
   @Nullable
   private fkf d;

   public fic(Consumer<ffx> $$0, Consumer<ffx> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fkf $$0) {
      this.d = $$0;
      fib $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fib $$0, boolean $$1) {
      if (!Objects.equals(this.c, $$0)) {
         if (this.c != null) {
            this.c.a(this.b);
         }

         this.c = $$0;
         $$0.a(this.a);
         if (this.d != null) {
            $$0.a(this.d);
         }

         if ($$1) {
            fdz.Q().ak().a(gre.a(avh.Ao, 1.0F));
         }
      }
   }

   @Nullable
   public fib a() {
      return this.c;
   }
}
