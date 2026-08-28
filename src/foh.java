import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class foh {
   private final Consumer<fmb> a;
   private final Consumer<fmb> b;
   @Nullable
   private fog c;
   @Nullable
   private fql d;

   public foh(Consumer<fmb> $$0, Consumer<fmb> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fql $$0) {
      this.d = $$0;
      fog $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fog $$0, boolean $$1) {
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
            fke.Q().ak().a(hcw.a(awn.Av, 1.0F));
         }
      }
   }

   @Nullable
   public fog a() {
      return this.c;
   }
}
