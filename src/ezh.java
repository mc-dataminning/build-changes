import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ezh {
   private final Consumer<exd> a;
   private final Consumer<exd> b;
   @Nullable
   private ezg c;
   @Nullable
   private fbi d;

   public ezh(Consumer<exd> $$0, Consumer<exd> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fbi $$0) {
      this.d = $$0;
      ezg $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(ezg $$0, boolean $$1) {
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
            evh.O().ai().a(ghu.a(arr.zu, 1.0F));
         }
      }
   }

   @Nullable
   public ezg a() {
      return this.c;
   }
}
