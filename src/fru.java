import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fru {
   private final Consumer<fpo> a;
   private final Consumer<fpo> b;
   @Nullable
   private frt c;
   @Nullable
   private ftx d;

   public fru(Consumer<fpo> $$0, Consumer<fpo> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(ftx $$0) {
      this.d = $$0;
      frt $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(frt $$0, boolean $$1) {
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
            fmg.Q().ak().a(hjj.a(awa.Bp, 1.0F));
         }
      }
   }

   @Nullable
   public frt a() {
      return this.c;
   }
}
