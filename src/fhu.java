import javax.annotation.Nullable;

public abstract class fhu implements fhv {
   @Nullable
   private fhw a;
   private boolean b;

   @Override
   public final boolean aH_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fhw aI_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fhw $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
