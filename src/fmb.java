import javax.annotation.Nullable;

public abstract class fmb extends flr {
   protected final fee<?>[] r;
   @Nullable
   private ffy a;
   protected fgx s;

   public fmb(flz $$0, fef $$1, wx $$2, fee<?>[] $$3) {
      super($$0, $$1, $$2);
      this.r = $$3;
   }

   @Override
   protected void aN_() {
      this.s = this.c(new fgx(this.m, this.n, this.o, this));
      this.s.a(this.r);
      this.a = this.s.b(this.c.as());
      if (this.a != null) {
         this.a.j = this.m.aX().a();
      }

      super.aN_();
   }

   @Override
   protected void c() {
      super.c();
      this.s.a(this.n, this.d);
   }

   public void C() {
      if (this.a instanceof fgh) {
         ((fgh)this.a).a(this.c.as().c());
      }
   }
}
