import javax.annotation.Nullable;

public abstract class fma extends flq {
   protected final fec<?>[] r;
   @Nullable
   private ffx a;
   protected fgw s;

   public fma(fly $$0, fed $$1, wx $$2, fec<?>[] $$3) {
      super($$0, $$1, $$2);
      this.r = $$3;
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fgw(this.m, this.n, this.o, this));
      this.s.a(this.r);
      this.a = this.s.b(this.c.as());
      if (this.a != null) {
         this.a.j = this.m.aZ().a();
      }

      super.aM_();
   }

   @Override
   protected void c() {
      super.c();
      this.s.a(this.n, this.d);
   }

   public void C() {
      if (this.a instanceof fgg) {
         ((fgg)this.a).a(this.c.as().c());
      }
   }
}
