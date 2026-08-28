import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fms {
   private final Consumer<fkm> a;
   private final Consumer<fkm> b;
   @Nullable
   private fmr c;
   @Nullable
   private fow d;

   public fms(Consumer<fkm> $$0, Consumer<fkm> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fow $$0) {
      this.d = $$0;
      fmr $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fmr $$0, boolean $$1) {
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
            fip.Q().ak().a(hav.a(awg.Ax, 1.0F));
         }
      }
   }

   @Nullable
   public fmr a() {
      return this.c;
   }
}
