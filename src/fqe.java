import javax.annotation.Nullable;

public abstract class fqe extends fnc {
   private static final int b = 100;
   private final xo c;
   @Nullable
   private final xo d;
   private final xo r;
   @Nullable
   protected fhf a;
   @Nullable
   private fho s;
   private final fko u;

   protected fqe(xo $$0, xo $$1, xo $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fqe(xo $$0, xo $$1, @Nullable xo $$2, xo $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.r = $$3;
      this.u = new fko(0, 0, this.n, this.o);
   }

   protected abstract fkr m();

   @Override
   protected void aM_() {
      fku $$0 = this.u.a(fku.d().a(8));
      $$0.c().b();
      $$0.a(new fik(this.n(), this.p));
      this.s = $$0.a(new fho(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.s.b(false);
      fku $$1 = $$0.a(fku.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fhf.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.u.a($$1x -> {
         fhb var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.s != null) {
         this.s.d(this.n - 100);
      }

      this.u.a();
      fko.a(this.u, this.G());
   }

   @Override
   public xo i() {
      return this.r;
   }
}
