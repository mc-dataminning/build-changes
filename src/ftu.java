import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ftu {
   private final Consumer<fro> a;
   private final Consumer<fro> b;
   @Nullable
   private ftt c;
   @Nullable
   private fvx d;

   public ftu(Consumer<fro> $$0, Consumer<fro> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fvx $$0) {
      this.d = $$0;
      ftt $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(ftt $$0, boolean $$1) {
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
            fof.Q().ak().a(hlr.a(awl.Bp, 1.0F));
         }
      }
   }

   @Nullable
   public ftt a() {
      return this.c;
   }
}
