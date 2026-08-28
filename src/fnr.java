import javax.annotation.Nullable;

public abstract class fnr implements fns {
   @Nullable
   private fnt a;
   private boolean b;

   @Override
   public final boolean aK_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fnt aL_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fnt $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
