import javax.annotation.Nullable;

public abstract class fny implements fnz {
   @Nullable
   private foa a;
   private boolean b;

   @Override
   public final boolean aJ_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public foa aK_() {
      return this.a;
   }

   @Override
   public void a(@Nullable foa $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
