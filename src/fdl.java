import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fdl {
   private final Consumer<fbg> a;
   private final Consumer<fbg> b;
   @Nullable
   private fdk c;
   @Nullable
   private ffo d;

   public fdl(Consumer<fbg> $$0, Consumer<fbg> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(ffo $$0) {
      this.d = $$0;
      fdk $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fdk $$0, boolean $$1) {
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
            ezi.Q().ak().a(gmk.a(aty.zS, 1.0F));
         }
      }
   }

   @Nullable
   public fdk a() {
      return this.c;
   }
}
