import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fjx {
   private final Consumer<fhs> a;
   private final Consumer<fhs> b;
   @Nullable
   private fjw c;
   @Nullable
   private fma d;

   public fjx(Consumer<fhs> $$0, Consumer<fhs> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fma $$0) {
      this.d = $$0;
      fjw $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fjw $$0, boolean $$1) {
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
            ffw.Q().aj().a(gsz.a(avh.Ar, 1.0F));
         }
      }
   }

   @Nullable
   public fjw a() {
      return this.c;
   }
}
