import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fkq {
   private final Consumer<fil> a;
   private final Consumer<fil> b;
   @Nullable
   private fkp c;
   @Nullable
   private fmt d;

   public fkq(Consumer<fil> $$0, Consumer<fil> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fmt $$0) {
      this.d = $$0;
      fkp $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fkp $$0, boolean $$1) {
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
            fgj.Q().ak().a(guh.a(avo.AM, 1.0F));
         }
      }
   }

   @Nullable
   public fkp a() {
      return this.c;
   }
}
