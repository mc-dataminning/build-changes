import javax.annotation.Nullable;

public abstract class fiz implements fja {
   @Nullable
   private fjb a;
   private boolean b;

   @Override
   public final boolean aF_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fjb aG_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fjb $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
