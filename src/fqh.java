import javax.annotation.Nullable;

public abstract class fqh extends fnf {
   private static final int b = 100;
   private final xp c;
   @Nullable
   private final xp d;
   private final xp r;
   @Nullable
   protected fhi a;
   @Nullable
   private fhr s;
   private final fkr u;

   protected fqh(xp $$0, xp $$1, xp $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fqh(xp $$0, xp $$1, @Nullable xp $$2, xp $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.r = $$3;
      this.u = new fkr(0, 0, this.n, this.o);
   }

   protected abstract fku m();

   @Override
   protected void aM_() {
      fkx $$0 = this.u.a(fkx.d().a(8));
      $$0.c().b();
      $$0.a(new fin(this.n(), this.p));
      this.s = $$0.a(new fhr(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.s.b(false);
      fkx $$1 = $$0.a(fkx.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fhi.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.u.a($$1x -> {
         fhe var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.s != null) {
         this.s.d(this.n - 100);
      }

      this.u.a();
      fkr.a(this.u, this.G());
   }

   @Override
   public xp i() {
      return this.r;
   }
}
