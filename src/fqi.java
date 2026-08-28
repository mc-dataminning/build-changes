import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqi {
   private final Consumer<fob> a;
   private final Consumer<fob> b;
   @Nullable
   private fqh c;
   @Nullable
   private fsl d;

   public fqi(Consumer<fob> $$0, Consumer<fob> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fsl $$0) {
      this.d = $$0;
      fqh $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fqh $$0, boolean $$1) {
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
            fme.Q().ak().a(hfb.a(axf.AQ, 1.0F));
         }
      }
   }

   @Nullable
   public fqh a() {
      return this.c;
   }
}
