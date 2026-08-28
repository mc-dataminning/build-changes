import javax.annotation.Nullable;

public abstract class fqf extends fnd {
   private static final int b = 100;
   private final xp c;
   @Nullable
   private final xp d;
   private final xp r;
   @Nullable
   protected fhg a;
   @Nullable
   private fhp s;
   private final fkp u;

   protected fqf(xp $$0, xp $$1, xp $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fqf(xp $$0, xp $$1, @Nullable xp $$2, xp $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.r = $$3;
      this.u = new fkp(0, 0, this.n, this.o);
   }

   protected abstract fks m();

   @Override
   protected void aM_() {
      fkv $$0 = this.u.a(fkv.d().a(8));
      $$0.c().b();
      $$0.a(new fil(this.n(), this.p));
      this.s = $$0.a(new fhp(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.s.b(false);
      fkv $$1 = $$0.a(fkv.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fhg.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.u.a($$1x -> {
         fhc var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.s != null) {
         this.s.d(this.n - 100);
      }

      this.u.a();
      fkp.a(this.u, this.G());
   }

   @Override
   public xp i() {
      return this.r;
   }
}
