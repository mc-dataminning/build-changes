import javax.annotation.Nullable;

public abstract class fce implements fcf {
   @Nullable
   private fcg a;
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
   public fcg aJ_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fcg $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
