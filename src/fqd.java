import javax.annotation.Nullable;

public abstract class fqd extends fnb {
   private static final int b = 100;
   private final xo c;
   @Nullable
   private final xo d;
   private final xo r;
   @Nullable
   protected fhe a;
   @Nullable
   private fhn s;
   private final fkn u;

   protected fqd(xo $$0, xo $$1, xo $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fqd(xo $$0, xo $$1, @Nullable xo $$2, xo $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.r = $$3;
      this.u = new fkn(0, 0, this.n, this.o);
   }

   protected abstract fkq m();

   @Override
   protected void aM_() {
      fkt $$0 = this.u.a(fkt.d().a(8));
      $$0.c().b();
      $$0.a(new fij(this.n(), this.p));
      this.s = $$0.a(new fhn(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.s.b(false);
      fkt $$1 = $$0.a(fkt.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fhe.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.u.a($$1x -> {
         fha var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.s != null) {
         this.s.d(this.n - 100);
      }

      this.u.a();
      fkn.a(this.u, this.G());
   }

   @Override
   public xo i() {
      return this.r;
   }
}
