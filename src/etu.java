import javax.annotation.Nullable;

public abstract class etu implements etv {
   @Nullable
   private etw a;
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
   public etw t() {
      return this.a;
   }

   @Override
   public void a(@Nullable etw $$0) {
      if (this.a != null) {
         this.a.c_(false);
      }

      if ($$0 != null) {
         $$0.c_(true);
      }

      this.a = $$0;
   }
}
