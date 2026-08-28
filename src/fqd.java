import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqd {
   private final Consumer<fnw> a;
   private final Consumer<fnw> b;
   @Nullable
   private fqc c;
   @Nullable
   private fsg d;

   public fqd(Consumer<fnw> $$0, Consumer<fnw> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fsg $$0) {
      this.d = $$0;
      fqc $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fqc $$0, boolean $$1) {
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
            flz.Q().ak().a(hew.a(axf.AP, 1.0F));
         }
      }
   }

   @Nullable
   public fqc a() {
      return this.c;
   }
}
