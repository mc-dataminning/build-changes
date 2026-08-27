import javax.annotation.Nullable;

public abstract class fjz extends fjp {
   protected final fcb<?>[] o;
   @Nullable
   private fdw a;
   protected fev p;

   public fjz(fjx $$0, fcc $$1, wi $$2, fcb<?>[] $$3) {
      super($$0, $$1, $$2);
      this.o = $$3;
   }

   @Override
   protected void aM_() {
      this.p = this.c(new fev(this.j, this.k, this.l, this));
      this.p.a(this.o);
      this.a = this.p.b(this.c.as());
      if (this.a != null) {
         this.a.j = this.j.aY().a();
      }

      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      this.p.a(this.k, this.d);
   }

   public void C() {
      if (this.a instanceof fef) {
         ((fef)this.a).a(this.c.as().c());
      }
   }
}
