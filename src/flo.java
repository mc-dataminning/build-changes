import javax.annotation.Nullable;

public abstract class flo extends flu implements fns {
   @Nullable
   private fnt a;
   private boolean b;

   public flo(int $$0, int $$1, int $$2, int $$3, xl $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

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

   @Nullable
   @Override
   public flg a(fqa $$0) {
      return fns.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fns.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fns.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fns.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aM_() {
      return fns.super.aM_();
   }

   @Override
   public void a(boolean $$0) {
      fns.super.a($$0);
   }
}
