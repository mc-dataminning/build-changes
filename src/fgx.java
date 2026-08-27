import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fgx {
   private final Consumer<fes> a;
   private final Consumer<fes> b;
   @Nullable
   private fgw c;
   @Nullable
   private fja d;

   public fgx(Consumer<fes> $$0, Consumer<fes> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fja $$0) {
      this.d = $$0;
      fgw $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fgw $$0, boolean $$1) {
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
            fcu.Q().ak().a(gpw.a(auz.Ac, 1.0F));
         }
      }
   }

   @Nullable
   public fgw a() {
      return this.c;
   }
}
