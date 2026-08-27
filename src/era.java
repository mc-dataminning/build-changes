import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class era {
   private final Consumer<epf> a;
   private final Consumer<epf> b;
   @Nullable
   private eqz c;
   @Nullable
   private esz d;

   public era(Consumer<epf> $$0, Consumer<epf> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(esz $$0) {
      this.d = $$0;
      eqz $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(eqz $$0, boolean $$1) {
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
            enn.N().ah().a(fxt.a(amh.yo, 1.0F));
         }
      }
   }

   @Nullable
   public eqz a() {
      return this.c;
   }

   public void b() {
      eqz $$0 = this.a();
      if ($$0 != null) {
         $$0.b();
      }
   }
}
