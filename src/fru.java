import javax.annotation.Nullable;

public abstract class fru extends fon {
   private static final int b = 100;
   private final xe c;
   @Nullable
   private final xe d;
   private final xe r;
   @Nullable
   protected fip a;
   @Nullable
   private fiy s;
   private final fly u;

   protected fru(xe $$0, xe $$1, xe $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fru(xe $$0, xe $$1, @Nullable xe $$2, xe $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.r = $$3;
      this.u = new fly(0, 0, this.n, this.o);
   }

   protected abstract fmb B();

   @Override
   protected void aN_() {
      fme $$0 = this.u.a(fme.d().a(8));
      $$0.c().b();
      $$0.a(new fju(this.n(), this.p));
      this.s = $$0.a(new fiy(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.s.b(false);
      fme $$1 = $$0.a(fme.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fip.a(this.d, this.p).a());
      }

      $$1.a(this.B());
      this.u.a($$1x -> {
         fil var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.s != null) {
         this.s.d(this.n - 100);
      }

      this.u.a();
      fly.a(this.u, this.G());
   }

   @Override
   public xe i() {
      return this.r;
   }
}
