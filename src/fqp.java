import javax.annotation.Nullable;

public abstract class fqp implements fqq {
   @Nullable
   private fqr a;
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
   public fqr aL_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fqr $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
