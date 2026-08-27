import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eur {
   private final Consumer<eso> a;
   private final Consumer<eso> b;
   @Nullable
   private euq c;
   @Nullable
   private ews d;

   public eur(Consumer<eso> $$0, Consumer<eso> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(ews $$0) {
      this.d = $$0;
      euq $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(euq $$0, boolean $$1) {
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
            eqv.O().ai().a(gch.a(apd.yu, 1.0F));
         }
      }
   }

   @Nullable
   public euq a() {
      return this.c;
   }
}
