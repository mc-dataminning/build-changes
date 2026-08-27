import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ezg {
   private final Consumer<exc> a;
   private final Consumer<exc> b;
   @Nullable
   private ezf c;
   @Nullable
   private fbh d;

   public ezg(Consumer<exc> $$0, Consumer<exc> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fbh $$0) {
      this.d = $$0;
      ezf $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(ezf $$0, boolean $$1) {
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
            evg.O().ai().a(ght.a(arr.zu, 1.0F));
         }
      }
   }

   @Nullable
   public ezf a() {
      return this.c;
   }
}
