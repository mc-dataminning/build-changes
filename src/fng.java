import javax.annotation.Nullable;

public abstract class fng extends fmw {
   protected final ffj<?>[] r;
   @Nullable
   private fhd a;
   protected fic s;

   public fng(fne $$0, ffk $$1, xp $$2, ffj<?>[] $$3) {
      super($$0, $$1, $$2);
      this.r = $$3;
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fic(this.m, this.n, this.o, this));
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
      if (this.a instanceof fhm) {
         ((fhm)this.a).a(this.c.as().c());
      }
   }
}
