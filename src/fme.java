import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fme {
   private final Consumer<fjy> a;
   private final Consumer<fjy> b;
   @Nullable
   private fmd c;
   @Nullable
   private foh d;

   public fme(Consumer<fjy> $$0, Consumer<fjy> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(foh $$0) {
      this.d = $$0;
      fmd $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fmd $$0, boolean $$1) {
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
            fib.Q().aj().a(gzz.a(awd.Ax, 1.0F));
         }
      }
   }

   @Nullable
   public fmd a() {
      return this.c;
   }
}
