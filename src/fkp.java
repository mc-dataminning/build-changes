import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fkp {
   private final Consumer<fik> a;
   private final Consumer<fik> b;
   @Nullable
   private fko c;
   @Nullable
   private fms d;

   public fkp(Consumer<fik> $$0, Consumer<fik> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fms $$0) {
      this.d = $$0;
      fko $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fko $$0, boolean $$1) {
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
            fgo.Q().aj().a(gtv.a(avp.Ar, 1.0F));
         }
      }
   }

   @Nullable
   public fko a() {
      return this.c;
   }
}
