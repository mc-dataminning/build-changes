import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fkj {
   private final Consumer<fie> a;
   private final Consumer<fie> b;
   @Nullable
   private fki c;
   @Nullable
   private fmm d;

   public fkj(Consumer<fie> $$0, Consumer<fie> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fmm $$0) {
      this.d = $$0;
      fki $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fki $$0, boolean $$1) {
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
            fgi.Q().aj().a(gto.a(avo.Ar, 1.0F));
         }
      }
   }

   @Nullable
   public fki a() {
      return this.c;
   }
}
