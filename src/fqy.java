import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqy {
   private final Consumer<fos> a;
   private final Consumer<fos> b;
   @Nullable
   private fqx c;
   @Nullable
   private ftb d;

   public fqy(Consumer<fos> $$0, Consumer<fos> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(ftb $$0) {
      this.d = $$0;
      fqx $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fqx $$0, boolean $$1) {
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
            flk.Q().ak().a(hil.a(awa.Bf, 1.0F));
         }
      }
   }

   @Nullable
   public fqx a() {
      return this.c;
   }
}
