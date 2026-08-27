import javax.annotation.Nullable;

public abstract class fpb extends flz {
   private static final int b = 100;
   private final wx c;
   @Nullable
   private final wx d;
   private final wx r;
   @Nullable
   protected fgc a;
   @Nullable
   private fgl s;
   private final fjl u;

   protected fpb(wx $$0, wx $$1, wx $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fpb(wx $$0, wx $$1, @Nullable wx $$2, wx $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.r = $$3;
      this.u = new fjl(0, 0, this.n, this.o);
   }

   protected abstract fjo m();

   @Override
   protected void aN_() {
      fjr $$0 = this.u.a(fjr.d().a(8));
      $$0.c().b();
      $$0.a(new fhh(this.n(), this.p));
      this.s = $$0.a(new fgl(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.s.b(false);
      fjr $$1 = $$0.a(fjr.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fgc.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.u.a($$1x -> {
         ffy var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.s != null) {
         this.s.d(this.n - 100);
      }

      this.u.a();
      fjl.a(this.u, this.G());
   }

   @Override
   public wx i() {
      return this.r;
   }
}
