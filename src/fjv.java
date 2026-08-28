import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fjv {
   private final Consumer<fhq> a;
   private final Consumer<fhq> b;
   @Nullable
   private fju c;
   @Nullable
   private fly d;

   public fjv(Consumer<fhq> $$0, Consumer<fhq> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fly $$0) {
      this.d = $$0;
      fju $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fju $$0, boolean $$1) {
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
            fft.Q().aj().a(gsx.a(avh.Ar, 1.0F));
         }
      }
   }

   @Nullable
   public fju a() {
      return this.c;
   }
}
