import javax.annotation.Nullable;

public abstract class fop extends foe {
   protected final fgm<?>[] r;
   @Nullable
   private fil a;
   protected fjk s;

   public fop(fon $$0, fgn $$1, xe $$2, fgm<?>[] $$3) {
      super($$0, $$1, $$2);
      this.r = $$3;
   }

   @Override
   protected void aN_() {
      this.s = this.c(new fjk(this.m, this.n, this.o, this));
      this.s.a(this.r);
      this.a = this.s.b(this.c.as());
      if (this.a != null) {
         this.a.j = this.m.aZ().a();
      }

      super.aN_();
   }

   @Override
   protected void c() {
      super.c();
      this.s.a(this.n, this.d);
   }

   public void B() {
      if (this.a instanceof fiu) {
         ((fiu)this.a).a(this.c.as().c());
      }
   }
}
