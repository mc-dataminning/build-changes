import javax.annotation.Nullable;

public abstract class fka implements fkb {
   @Nullable
   private fkc a;
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
   public fkc aJ_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fkc $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
