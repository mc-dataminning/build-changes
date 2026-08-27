import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fhh {
   private final Consumer<ffc> a;
   private final Consumer<ffc> b;
   @Nullable
   private fhg c;
   @Nullable
   private fjk d;

   public fhh(Consumer<ffc> $$0, Consumer<ffc> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fjk $$0) {
      this.d = $$0;
      fhg $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fhg $$0, boolean $$1) {
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
            fde.Q().ak().a(gqh.a(avc.Ad, 1.0F));
         }
      }
   }

   @Nullable
   public fhg a() {
      return this.c;
   }
}
