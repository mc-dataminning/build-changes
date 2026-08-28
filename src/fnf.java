import javax.annotation.Nullable;

public abstract class fnf extends fmv {
   protected final ffi<?>[] r;
   @Nullable
   private fhc a;
   protected fib s;

   public fnf(fnd $$0, ffj $$1, xp $$2, ffi<?>[] $$3) {
      super($$0, $$1, $$2);
      this.r = $$3;
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fib(this.m, this.n, this.o, this));
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
      if (this.a instanceof fhl) {
         ((fhl)this.a).a(this.c.as().c());
      }
   }
}
