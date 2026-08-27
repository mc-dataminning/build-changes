import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fdj {
   private final Consumer<fbe> a;
   private final Consumer<fbe> b;
   @Nullable
   private fdi c;
   @Nullable
   private ffm d;

   public fdj(Consumer<fbe> $$0, Consumer<fbe> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(ffm $$0) {
      this.d = $$0;
      fdi $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fdi $$0, boolean $$1) {
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
            ezg.Q().ak().a(gmh.a(aty.zN, 1.0F));
         }
      }
   }

   @Nullable
   public fdi a() {
      return this.c;
   }
}
