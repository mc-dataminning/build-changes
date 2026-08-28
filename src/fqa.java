import javax.annotation.Nullable;

public abstract class fqa extends fmy {
   private static final int b = 100;
   private final xl c;
   @Nullable
   private final xl d;
   private final xl r;
   @Nullable
   protected fhb a;
   @Nullable
   private fhk s;
   private final fkk u;

   protected fqa(xl $$0, xl $$1, xl $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fqa(xl $$0, xl $$1, @Nullable xl $$2, xl $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.r = $$3;
      this.u = new fkk(0, 0, this.n, this.o);
   }

   protected abstract fkn m();

   @Override
   protected void aN_() {
      fkq $$0 = this.u.a(fkq.d().a(8));
      $$0.c().b();
      $$0.a(new fig(this.n(), this.p));
      this.s = $$0.a(new fhk(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.s.b(false);
      fkq $$1 = $$0.a(fkq.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fhb.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.u.a($$1x -> {
         fgx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.s != null) {
         this.s.d(this.n - 100);
      }

      this.u.a();
      fkk.a(this.u, this.G());
   }

   @Override
   public xl i() {
      return this.r;
   }
}
