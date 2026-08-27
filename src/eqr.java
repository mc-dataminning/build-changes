import javax.annotation.Nullable;

public abstract class eqr implements eqs {
   @Nullable
   private eqt a;
   private boolean b;

   @Override
   public final boolean aA_() {
      return this.b;
   }

   @Override
   public final void c_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public eqt t() {
      return this.a;
   }

   @Override
   public void a(@Nullable eqt $$0) {
      if (this.a != null) {
         this.a.b_(false);
      }

      if ($$0 != null) {
         $$0.b_(true);
      }

      this.a = $$0;
   }
}
