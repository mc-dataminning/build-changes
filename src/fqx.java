import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqx {
   private final Consumer<foq> a;
   private final Consumer<foq> b;
   @Nullable
   private fqw c;
   @Nullable
   private fta d;

   public fqx(Consumer<foq> $$0, Consumer<foq> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fta $$0) {
      this.d = $$0;
      fqw $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fqw $$0, boolean $$1) {
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
            flj.Q().ak().a(hik.a(awa.Bf, 1.0F));
         }
      }
   }

   @Nullable
   public fqw a() {
      return this.c;
   }
}
