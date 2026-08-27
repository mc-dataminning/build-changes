import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ezi {
   private final Consumer<exe> a;
   private final Consumer<exe> b;
   @Nullable
   private ezh c;
   @Nullable
   private fbj d;

   public ezi(Consumer<exe> $$0, Consumer<exe> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(fbj $$0) {
      this.d = $$0;
      ezh $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(ezh $$0, boolean $$1) {
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
            evi.O().ai().a(ghv.a(ars.zu, 1.0F));
         }
      }
   }

   @Nullable
   public ezh a() {
      return this.c;
   }
}
