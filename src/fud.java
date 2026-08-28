import javax.annotation.Nullable;

public abstract class fud extends fra {
   protected final fra b;
   protected final fjm c;
   @Nullable
   protected fme d;
   public final fow s = new fow(this);

   public fud(fra $$0, fjm $$1, xi $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aR_() {
      this.F();
      this.E();
      this.D();
      this.s.a($$1 -> {
         flf var10000 = this.c($$1);
      });
      this.c();
   }

   protected void F() {
      this.s.a(this.l, this.p);
   }

   protected void E() {
      this.d = this.s.c(new fme(this.m, this.n, this));
      this.m();
      if (this.d.b(this.c.au()) instanceof flo $$0) {
         this.q = $$0;
         this.q.j = this.m.aZ().a();
      }
   }

   protected abstract void m();

   protected void D() {
      this.s.b(flh.a(xh.d, $$0 -> this.d()).a(200).a());
   }

   @Override
   protected void c() {
      this.s.a();
      if (this.d != null) {
         this.d.a(this.n, this.s);
      }
   }

   @Override
   public void j() {
      this.m.n.ay();
   }

   @Override
   public void d() {
      if (this.d != null) {
         this.d.c();
      }

      this.m.a(this.b);
   }
}
