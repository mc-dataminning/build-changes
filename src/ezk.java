import javax.annotation.Nullable;

public abstract class ezk implements ezl {
   @Nullable
   private ezm a;
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
   public ezm aJ_() {
      return this.a;
   }

   @Override
   public void a(@Nullable ezm $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
