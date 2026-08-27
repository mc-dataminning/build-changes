import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class exg {
   private final Consumer<evc> a;
   private final Consumer<evc> b;
   @Nullable
   private exf c;
   @Nullable
   private ezh d;

   public exg(Consumer<evc> $$0, Consumer<evc> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(ezh $$0) {
      this.d = $$0;
      exf $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(exf $$0, boolean $$1) {
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
            eti.N().ah().a(gfc.a(aqv.yZ, 1.0F));
         }
      }
   }

   @Nullable
   public exf a() {
      return this.c;
   }
}
