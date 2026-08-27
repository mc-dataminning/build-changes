import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fbr {
   private final Consumer<ezm> a;
   private final Consumer<ezm> b;
   @Nullable
   private fbq c;
   @Nullable
   private fdt d;

   public fbr(Consumer<ezm> $$0, Consumer<ezm> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fdt $$0) {
      this.d = $$0;
      fbq $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fbq $$0, boolean $$1) {
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
            exo.P().aj().a(gkj.a(atl.zK, 1.0F));
         }
      }
   }

   @Nullable
   public fbq a() {
      return this.c;
   }
}
