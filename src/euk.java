import javax.annotation.Nullable;

public abstract class euk implements eul {
   @Nullable
   private eum a;
   private boolean b;

   @Override
   public final boolean aB_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public eum t() {
      return this.a;
   }

   @Override
   public void a(@Nullable eum $$0) {
      if (this.a != null) {
         this.a.b_(false);
      }

      if ($$0 != null) {
         $$0.b_(true);
      }

      this.a = $$0;
   }
}
