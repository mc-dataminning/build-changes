import javax.annotation.Nullable;

public abstract class ews implements ewt {
   @Nullable
   private ewu a;
   private boolean b;

   @Override
   public final boolean aI_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public ewu t() {
      return this.a;
   }

   @Override
   public void a(@Nullable ewu $$0) {
      if (this.a != null) {
         this.a.b_(false);
      }

      if ($$0 != null) {
         $$0.b_(true);
      }

      this.a = $$0;
   }
}
