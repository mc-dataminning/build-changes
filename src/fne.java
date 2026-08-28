import javax.annotation.Nullable;

public abstract class fne extends fmu {
   protected final ffh<?>[] r;
   @Nullable
   private fhb a;
   protected fia s;

   public fne(fnc $$0, ffi $$1, xo $$2, ffh<?>[] $$3) {
      super($$0, $$1, $$2);
      this.r = $$3;
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fia(this.m, this.n, this.o, this));
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
      if (this.a instanceof fhk) {
         ((fhk)this.a).a(this.c.as().c());
      }
   }
}
