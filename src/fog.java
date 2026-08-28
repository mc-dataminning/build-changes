import javax.annotation.Nullable;

public abstract class fog extends foi implements fqm {
   @Nullable
   private fqn a;
   private boolean c;

   public fog(int $$0, int $$1, int $$2, int $$3, wo $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aK_() {
      return this.c;
   }

   @Override
   public final void b_(boolean $$0) {
      this.c = $$0;
   }

   @Nullable
   @Override
   public fqn aL_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fqn $$0) {
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
   public fny a(fst $$0) {
      return fqm.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      boolean $$3 = this.c($$0, $$1, $$2);
      return fqm.super.a($$0, $$1, $$2) || $$3;
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      super.b($$0, $$1, $$2);
      return fqm.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      return fqm.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aM_() {
      return fqm.super.aM_();
   }

   @Override
   public void a(boolean $$0) {
      fqm.super.a($$0);
   }
}
