import javax.annotation.Nullable;

public abstract class fqa implements fqb {
   @Nullable
   private fqc a;
   private boolean b;

   @Override
   public final boolean aL_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fqc aM_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fqc $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
