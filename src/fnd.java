import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fnd {
   private final Consumer<fkx> a;
   private final Consumer<fkx> b;
   @Nullable
   private fnc c;
   @Nullable
   private fph d;

   public fnd(Consumer<fkx> $$0, Consumer<fkx> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fph $$0) {
      this.d = $$0;
      fnc $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fnc $$0, boolean $$1) {
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
            fja.Q().ak().a(hbk.a(awk.Av, 1.0F));
         }
      }
   }

   @Nullable
   public fnc a() {
      return this.c;
   }
}
