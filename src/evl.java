import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class evl {
   private final Consumer<eth> a;
   private final Consumer<eth> b;
   @Nullable
   private evk c;
   @Nullable
   private exm d;

   public evl(Consumer<eth> $$0, Consumer<eth> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(exm $$0) {
      this.d = $$0;
      evk $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(evk $$0, boolean $$1) {
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
            ero.O().ai().a(gdd.a(aqd.yw, 1.0F));
         }
      }
   }

   @Nullable
   public evk a() {
      return this.c;
   }
}
