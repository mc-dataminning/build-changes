import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqj {
   private final Consumer<foc> a;
   private final Consumer<foc> b;
   @Nullable
   private fqi c;
   @Nullable
   private fsm d;

   public fqj(Consumer<foc> $$0, Consumer<foc> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fsm $$0) {
      this.d = $$0;
      fqi $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fqi $$0, boolean $$1) {
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
            fmf.Q().ak().a(hfc.a(axf.AQ, 1.0F));
         }
      }
   }

   @Nullable
   public fqi a() {
      return this.c;
   }
}
