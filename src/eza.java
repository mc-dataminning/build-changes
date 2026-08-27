import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eza {
   private final Consumer<eww> a;
   private final Consumer<eww> b;
   @Nullable
   private eyz c;
   @Nullable
   private fbb d;

   public eza(Consumer<eww> $$0, Consumer<eww> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fbb $$0) {
      this.d = $$0;
      eyz $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(eyz $$0, boolean $$1) {
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
            eva.N().ah().a(ghi.a(arm.zu, 1.0F));
         }
      }
   }

   @Nullable
   public eyz a() {
      return this.c;
   }
}
