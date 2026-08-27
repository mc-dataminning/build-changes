import javax.annotation.Nullable;

public abstract class ffs implements fft {
   @Nullable
   private ffu a;
   private boolean b;

   @Override
   public final boolean aG_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public ffu aH_() {
      return this.a;
   }

   @Override
   public void a(@Nullable ffu $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
