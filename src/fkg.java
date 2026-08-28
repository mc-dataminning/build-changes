import javax.annotation.Nullable;

public abstract class fkg implements fkh {
   @Nullable
   private fki a;
   private boolean b;

   @Override
   public final boolean aM_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fki aN_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fki $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
