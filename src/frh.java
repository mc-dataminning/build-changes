import javax.annotation.Nullable;

public abstract class frh extends frj implements ftm {
   @Nullable
   private ftn a;
   private boolean c;

   public frh(int $$0, int $$1, int $$2, int $$3, ww $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aG_() {
      return this.c;
   }

   @Override
   public final void b_(boolean $$0) {
      this.c = $$0;
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

   @Nullable
   @Override
   public fqz a(fvt $$0) {
      return ftm.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      boolean $$3 = this.c($$0, $$1, $$2);
      return ftm.super.a($$0, $$1, $$2) || $$3;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      super.b($$0, $$1, $$2);
      return ftm.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      return ftm.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aI_() {
      return ftm.super.aI_();
   }

   @Override
   public void a(boolean $$0) {
      ftm.super.a($$0);
   }
}
