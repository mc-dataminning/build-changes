import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class exb {
   private final Consumer<eux> a;
   private final Consumer<eux> b;
   @Nullable
   private exa c;
   @Nullable
   private ezc d;

   public exb(Consumer<eux> $$0, Consumer<eux> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(ezc $$0) {
      this.d = $$0;
      exa $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(exa $$0, boolean $$1) {
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
            etd.N().ah().a(gex.a(aqr.yZ, 1.0F));
         }
      }
   }

   @Nullable
   public exa a() {
      return this.c;
   }
}
