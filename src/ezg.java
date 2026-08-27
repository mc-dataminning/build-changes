import javax.annotation.Nullable;

public abstract class ezg extends ezm implements fbj {
   @Nullable
   private fbk a;
   private boolean b;

   public ezg(int $$0, int $$1, int $$2, int $$3, vq $$4) {
      super($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public final boolean aJ_() {
      return this.b;
   }

   @Override
   public final void b(boolean $$0) {
      this.b = $$0;
   }

   @Nullable
   @Override
   public fbk aK_() {
      return this.a;
   }

   @Override
   public void a(@Nullable fbk $$0) {
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
   public eyy a(fdp $$0) {
      return fbj.super.a($$0);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      return fbj.super.a($$0, $$1, $$2);
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return fbj.super.b($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return fbj.super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean aL_() {
      return fbj.super.aL_();
   }

   @Override
   public void a(boolean $$0) {
      fbj.super.a($$0);
   }
}
