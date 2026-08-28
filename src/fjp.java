import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fjp {
   private final Consumer<fhk> a;
   private final Consumer<fhk> b;
   @Nullable
   private fjo c;
   @Nullable
   private fls d;

   public fjp(Consumer<fhk> $$0, Consumer<fhk> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fls $$0) {
      this.d = $$0;
      fjo $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fjo $$0, boolean $$1) {
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
            ffn.Q().aj().a(gsr.a(avf.Ar, 1.0F));
         }
      }
   }

   @Nullable
   public fjo a() {
      return this.c;
   }
}
