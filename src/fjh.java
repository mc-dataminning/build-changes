import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fjh {
   private final Consumer<fhc> a;
   private final Consumer<fhc> b;
   @Nullable
   private fjg c;
   @Nullable
   private flk d;

   public fjh(Consumer<fhc> $$0, Consumer<fhc> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(flk $$0) {
      this.d = $$0;
      fjg $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fjg $$0, boolean $$1) {
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
            fff.Q().aj().a(gsi.a(awa.Ao, 1.0F));
         }
      }
   }

   @Nullable
   public fjg a() {
      return this.c;
   }
}
