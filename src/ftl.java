import javax.annotation.Nullable;

public abstract class ftl implements ftm {
   @Nullable
   private ftn a;
   private boolean b;

   @Override
   public final boolean aG_() {
      return this.b;
   }

   @Override
   public final void b_(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public ftn aH_() {
      return this.a;
   }

   @Override
   public void a(@Nullable ftn $$0) {
      if (this.a != null) {
         this.a.a(false);
      }

      if ($$0 != null) {
         $$0.a(true);
      }

      this.a = $$0;
   }
}
