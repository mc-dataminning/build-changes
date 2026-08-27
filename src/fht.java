import javax.annotation.Nullable;

public abstract class fht implements fhu {
   @Nullable
   private fhv a;
   private boolean b;

   @Override
   public final boolean aG_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fhv aH_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fhv $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
