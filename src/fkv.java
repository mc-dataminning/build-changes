import javax.annotation.Nullable;

public abstract class fkv extends fkl {
   protected final fcx<?>[] r;
   @Nullable
   private fes a;
   protected ffr s;

   public fkv(fkt $$0, fcy $$1, ws $$2, fcx<?>[] $$3) {
      super($$0, $$1, $$2);
      this.r = $$3;
   }

   @Override
   protected void aM_() {
      this.s = this.c(new ffr(this.m, this.n, this.o, this));
      this.s.a(this.r);
      this.a = this.s.b(this.c.as());
      if (this.a != null) {
         this.a.j = this.m.aY().a();
      }

      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      this.s.a(this.n, this.d);
   }

   public void C() {
      if (this.a instanceof ffb) {
         ((ffb)this.a).a(this.c.as().c());
      }
   }
}
