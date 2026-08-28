import javax.annotation.Nullable;

public abstract class fjo implements fjp {
   @Nullable
   private fjq a;
   private boolean b;

   @Override
   public final boolean aI_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fjq aJ_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fjq $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
