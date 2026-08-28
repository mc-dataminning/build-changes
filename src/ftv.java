import javax.annotation.Nullable;

public abstract class ftv extends fqs {
   protected final fqs b;
   protected final fje c;
   @Nullable
   protected flw d;
   public final fon s = new fon(this);

   public ftv(fqs $$0, fje $$1, xh $$2) {
      super($$2);
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   protected void aS_() {
      this.F();
      this.E();
      this.D();
      this.s.a($$1 -> {
         fkx var10000 = this.c($$1);
      });
      this.c();
   }

   protected void F() {
      this.s.a(this.l, this.p);
   }

   protected void E() {
      this.d = this.s.c(new flw(this.m, this.n, this));
      this.m();
      if (this.d.b(this.c.au()) instanceof flg $$0) {
         this.q = $$0;
         this.q.j = this.m.ba().a();
      }
   }

   protected abstract void m();

   protected void D() {
      this.s.b(fkz.a(xg.d, $$0 -> this.d()).a(200).a());
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
