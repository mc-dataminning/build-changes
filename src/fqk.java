import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqk {
   private final Consumer<fod> a;
   private final Consumer<fod> b;
   @Nullable
   private fqj c;
   @Nullable
   private fsn d;

   public fqk(Consumer<fod> $$0, Consumer<fod> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fsn $$0) {
      this.d = $$0;
      fqj $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fqj $$0, boolean $$1) {
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
            fmg.Q().ak().a(hfd.a(axf.AQ, 1.0F));
         }
      }
   }

   @Nullable
   public fqj a() {
      return this.c;
   }
}
