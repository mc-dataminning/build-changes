import javax.annotation.Nullable;

public abstract class fnd extends fmt {
   protected final ffg<?>[] r;
   @Nullable
   private fha a;
   protected fhz s;

   public fnd(fnb $$0, ffh $$1, xo $$2, ffg<?>[] $$3) {
      super($$0, $$1, $$2);
      this.r = $$3;
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fhz(this.m, this.n, this.o, this));
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

   public void D() {
      if (this.a instanceof fhj) {
         ((fhj)this.a).a(this.c.as().c());
      }
   }
}
