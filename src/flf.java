import javax.annotation.Nullable;

public abstract class flf extends fkv {
   protected final fdh<?>[] r;
   @Nullable
   private ffc a;
   protected fgb s;

   public flf(fld $$0, fdi $$1, wu $$2, fdh<?>[] $$3) {
      super($$0, $$1, $$2);
      this.r = $$3;
   }

   @Override
   protected void aM_() {
      this.s = this.c(new fgb(this.m, this.n, this.o, this));
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
      if (this.a instanceof ffl) {
         ((ffl)this.a).a(this.c.as().c());
      }
   }
}
