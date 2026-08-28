import javax.annotation.Nullable;

public abstract class fna extends fmq {
   protected final ffd<?>[] r;
   @Nullable
   private fgx a;
   protected fhw s;

   public fna(fmy $$0, ffe $$1, xl $$2, ffd<?>[] $$3) {
      super($$0, $$1, $$2);
      this.r = $$3;
   }

   @Override
   protected void aN_() {
      this.s = this.c(new fhw(this.m, this.n, this.o, this));
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
      if (this.a instanceof fhg) {
         ((fhg)this.a).a(this.c.as().c());
      }
   }
}
