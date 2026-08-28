import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fmo {
   private final Consumer<fki> a;
   private final Consumer<fki> b;
   @Nullable
   private fmn c;
   @Nullable
   private fos d;

   public fmo(Consumer<fki> $$0, Consumer<fki> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fos $$0) {
      this.d = $$0;
      fmn $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fmn $$0, boolean $$1) {
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
            fil.Q().ak().a(haq.a(awe.Ax, 1.0F));
         }
      }
   }

   @Nullable
   public fmn a() {
      return this.c;
   }
}
