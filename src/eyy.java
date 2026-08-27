import javax.annotation.Nullable;

public abstract class eyy implements eyz {
   @Nullable
   private eza a;
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
   public eza aH_() {
      return this.a;
   }

   @Override
   public void a(@Nullable eza $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
