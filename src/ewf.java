import javax.annotation.Nullable;

public abstract class ewf implements ewg {
   @Nullable
   private ewh a;
   private boolean b;

   @Override
   public final boolean aH_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public ewh t() {
      return this.a;
   }

   @Override
   public void a(@Nullable ewh $$0) {
      if (this.a != null) {
         this.a.b_(false);
      }

      if ($$0 != null) {
         $$0.b_(true);
      }

      this.a = $$0;
   }
}
