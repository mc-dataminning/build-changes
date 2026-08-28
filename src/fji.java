import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fji {
   private final Consumer<fhd> a;
   private final Consumer<fhd> b;
   @Nullable
   private fjh c;
   @Nullable
   private fll d;

   public fji(Consumer<fhd> $$0, Consumer<fhd> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fll $$0) {
      this.d = $$0;
      fjh $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fjh $$0, boolean $$1) {
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
            ffg.Q().aj().a(gsj.a(awa.Ao, 1.0F));
         }
      }
   }

   @Nullable
   public fjh a() {
      return this.c;
   }
}
