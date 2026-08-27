import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fbk {
   private final Consumer<ezf> a;
   private final Consumer<ezf> b;
   @Nullable
   private fbj c;
   @Nullable
   private fdm d;

   public fbk(Consumer<ezf> $$0, Consumer<ezf> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fdm $$0) {
      this.d = $$0;
      fbj $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(fbj $$0, boolean $$1) {
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
            exh.O().ai().a(gkb.a(atk.zJ, 1.0F));
         }
      }
   }

   @Nullable
   public fbj a() {
      return this.c;
   }
}
