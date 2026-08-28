import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqw {
   private final Consumer<fop> a;
   private final Consumer<fop> b;
   @Nullable
   private fqv c;
   @Nullable
   private fsz d;

   public fqw(Consumer<fop> $$0, Consumer<fop> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fsz $$0) {
      this.d = $$0;
      fqv $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fqv $$0, boolean $$1) {
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
            flj.Q().ak().a(hid.a(awa.Bg, 1.0F));
         }
      }
   }

   @Nullable
   public fqv a() {
      return this.c;
   }
}
