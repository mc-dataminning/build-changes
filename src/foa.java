import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class foa {
   private final Consumer<flu> a;
   private final Consumer<flu> b;
   @Nullable
   private fnz c;
   @Nullable
   private fqe d;

   public foa(Consumer<flu> $$0, Consumer<flu> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fqe $$0) {
      this.d = $$0;
      fnz $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fnz $$0, boolean $$1) {
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
            fjx.Q().ak().a(hcl.a(awo.Av, 1.0F));
         }
      }
   }

   @Nullable
   public fnz a() {
      return this.c;
   }
}
