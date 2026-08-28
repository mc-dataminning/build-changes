import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fnl {
   private final Consumer<flf> a;
   private final Consumer<flf> b;
   @Nullable
   private fnk c;
   @Nullable
   private fpp d;

   public fnl(Consumer<flf> $$0, Consumer<flf> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fpp $$0) {
      this.d = $$0;
      fnk $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fnk $$0, boolean $$1) {
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
            fji.Q().ak().a(hbv.a(awl.Av, 1.0F));
         }
      }
   }

   @Nullable
   public fnk a() {
      return this.c;
   }
}
