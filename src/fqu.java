import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqu {
   private final Consumer<fon> a;
   private final Consumer<fon> b;
   @Nullable
   private fqt c;
   @Nullable
   private fsx d;

   public fqu(Consumer<fon> $$0, Consumer<fon> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fsx $$0) {
      this.d = $$0;
      fqt $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fqt $$0, boolean $$1) {
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
            flh.Q().ak().a(hie.a(avz.Bf, 1.0F));
         }
      }
   }

   @Nullable
   public fqt a() {
      return this.c;
   }
}
