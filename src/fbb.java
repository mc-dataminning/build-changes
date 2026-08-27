import javax.annotation.Nullable;

public abstract class fbb implements fbc {
   @Nullable
   private fbd a;
   private boolean b;

   @Override
   public final boolean aJ_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fbd aK_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fbd $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
