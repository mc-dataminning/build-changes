import javax.annotation.Nullable;

public abstract class fnh extends fmx {
   protected final ffk<?>[] r;
   @Nullable
   private fhe a;
   protected fid s;

   public fnh(fnf $$0, ffl $$1, xp $$2, ffk<?>[] $$3) {
      super($$0, $$1, $$2);
      this.r = $$3;
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fid(this.m, this.n, this.o, this));
      this.s.a(this.r);
      this.a = this.s.b(this.c.as());
      if (this.a != null) {
         this.a.j = this.m.aX().a();
      }

      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      this.s.a(this.n, this.d);
   }

   public void E() {
      if (this.a instanceof fhn) {
         ((fhn)this.a).a(this.c.as().c());
      }
   }
}
