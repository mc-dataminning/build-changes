import javax.annotation.Nullable;

public abstract class ety implements etz {
   @Nullable
   private eua a;
   private boolean b;

   @Override
   public final boolean aw_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public eua t() {
      return this.a;
   }

   @Override
   public void a(@Nullable eua $$0) {
      if (this.a != null) {
         this.a.c_(false);
      }

      if ($$0 != null) {
         $$0.c_(true);
      }

      this.a = $$0;
   }
}
