import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fjj {
   private final Consumer<fhe> a;
   private final Consumer<fhe> b;
   @Nullable
   private fji c;
   @Nullable
   private flm d;

   public fjj(Consumer<fhe> $$0, Consumer<fhe> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(flm $$0) {
      this.d = $$0;
      fji $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fji $$0, boolean $$1) {
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
            ffh.Q().aj().a(gsk.a(awa.Ao, 1.0F));
         }
      }
   }

   @Nullable
   public fji a() {
      return this.c;
   }
}
