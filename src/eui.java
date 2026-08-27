import javax.annotation.Nullable;

public abstract class eui implements euj {
   @Nullable
   private euk a;
   private boolean b;

   @Override
   public final boolean aC_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public euk t() {
      return this.a;
   }

   @Override
   public void a(@Nullable euk $$0) {
      if (this.a != null) {
         this.a.b_(false);
      }

      if ($$0 != null) {
         $$0.b_(true);
      }

      this.a = $$0;
   }
}
