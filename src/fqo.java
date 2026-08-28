import javax.annotation.Nullable;

public abstract class fqo implements fqp {
   @Nullable
   private fqq a;
   private boolean b;

   @Override
   public final boolean aK_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fqq aL_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fqq $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
