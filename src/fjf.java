import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fjf {
   private final Consumer<fha> a;
   private final Consumer<fha> b;
   @Nullable
   private fje c;
   @Nullable
   private fli d;

   public fjf(Consumer<fha> $$0, Consumer<fha> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fli $$0) {
      this.d = $$0;
      fje $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fje $$0, boolean $$1) {
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
            ffd.Q().aj().a(gsg.a(avz.Ao, 1.0F));
         }
      }
   }

   @Nullable
   public fje a() {
      return this.c;
   }
}
