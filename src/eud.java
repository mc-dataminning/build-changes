import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eud {
   private final Consumer<esg> a;
   private final Consumer<esg> b;
   @Nullable
   private euc c;
   @Nullable
   private ewd d;

   public eud(Consumer<esg> $$0, Consumer<esg> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(ewd $$0) {
      this.d = $$0;
      euc $$1 = this.a();
      if ($$1 != null) {
         $$1.a($$0);
      }
   }

   public void a(euc $$0, boolean $$1) {
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
            eqn.N().ah().a(gbj.a(aou.yp, 1.0F));
         }
      }
   }

   @Nullable
   public euc a() {
      return this.c;
   }
}
