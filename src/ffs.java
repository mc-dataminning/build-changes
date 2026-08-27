import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ffs {
   private final Consumer<fdn> a;
   private final Consumer<fdn> b;
   @Nullable
   private ffr c;
   @Nullable
   private fhv d;

   public ffs(Consumer<fdn> $$0, Consumer<fdn> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fhv $$0) {
      this.d = $$0;
      ffr $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(ffr $$0, boolean $$1) {
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
            fbp.Q().ak().a(gor.a(aum.zV, 1.0F));
         }
      }
   }

   @Nullable
   public ffr a() {
      return this.c;
   }
}
