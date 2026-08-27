import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eum {
   private final Consumer<esj> a;
   private final Consumer<esj> b;
   @Nullable
   private eul c;
   @Nullable
   private ewn d;

   public eum(Consumer<esj> $$0, Consumer<esj> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(ewn $$0) {
      this.d = $$0;
      eul $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(eul $$0, boolean $$1) {
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
            eqq.O().ai().a(gcc.a(aoz.yu, 1.0F));
         }
      }
   }

   @Nullable
   public eul a() {
      return this.c;
   }
}
