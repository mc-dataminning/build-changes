import javax.annotation.Nullable;

public abstract class fqg extends fne {
   private static final int b = 100;
   private final xp c;
   @Nullable
   private final xp d;
   private final xp r;
   @Nullable
   protected fhh a;
   @Nullable
   private fhq s;
   private final fkq u;

   protected fqg(xp $$0, xp $$1, xp $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fqg(xp $$0, xp $$1, @Nullable xp $$2, xp $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.r = $$3;
      this.u = new fkq(0, 0, this.n, this.o);
   }

   protected abstract fkt m();

   @Override
   protected void aM_() {
      fkw $$0 = this.u.a(fkw.d().a(8));
      $$0.c().b();
      $$0.a(new fim(this.n(), this.p));
      this.s = $$0.a(new fhq(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.s.b(false);
      fkw $$1 = $$0.a(fkw.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fhh.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.u.a($$1x -> {
         fhd var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.s != null) {
         this.s.d(this.n - 100);
      }

      this.u.a();
      fkq.a(this.u, this.G());
   }

   @Override
   public xp i() {
      return this.r;
   }
}
