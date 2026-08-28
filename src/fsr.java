import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fsr {
   private final Consumer<fql> a;
   private final Consumer<fql> b;
   @Nullable
   private fsq c;
   @Nullable
   private fuu d;

   public fsr(Consumer<fql> $$0, Consumer<fql> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fuu $$0) {
      this.d = $$0;
      fsq $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fsq $$0, boolean $$1) {
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
            fnd.Q().ak().a(hkk.a(awk.Bp, 1.0F));
         }
      }
   }

   @Nullable
   public fsq a() {
      return this.c;
   }
}
