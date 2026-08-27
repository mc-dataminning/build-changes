import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fgb {
   private final Consumer<fdw> a;
   private final Consumer<fdw> b;
   @Nullable
   private fga c;
   @Nullable
   private fie d;

   public fgb(Consumer<fdw> $$0, Consumer<fdw> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fie $$0) {
      this.d = $$0;
      fga $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fga $$0, boolean $$1) {
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
            fby.Q().ak().a(gpa.a(auo.zV, 1.0F));
         }
      }
   }

   @Nullable
   public fga a() {
      return this.c;
   }
}
