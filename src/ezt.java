import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ezt {
   private final Consumer<exp> a;
   private final Consumer<exp> b;
   @Nullable
   private ezs c;
   @Nullable
   private fbu d;

   public ezt(Consumer<exp> $$0, Consumer<exp> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fbu $$0) {
      this.d = $$0;
      ezs $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(ezs $$0, boolean $$1) {
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
            evr.O().ai().a(gij.a(art.zJ, 1.0F));
         }
      }
   }

   @Nullable
   public ezs a() {
      return this.c;
   }
}
