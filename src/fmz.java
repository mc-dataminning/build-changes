import javax.annotation.Nullable;

public abstract class fmz extends fjx {
   private static final int b = 100;
   private final wi c;
   @Nullable
   private final wi d;
   private final wi o;
   @Nullable
   protected fea a;
   @Nullable
   private fej p;
   private final fhj q;

   protected fmz(wi $$0, wi $$1, wi $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fmz(wi $$0, wi $$1, @Nullable wi $$2, wi $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.o = $$3;
      this.q = new fhj(0, 0, this.k, this.l);
   }

   protected abstract fhm m();

   @Override
   protected void aM_() {
      fhp $$0 = this.q.a(fhp.d().a(8));
      $$0.c().b();
      $$0.a(new fff(this.n(), this.m));
      this.p = $$0.a(new fej(this.k - 100, this.c, this.m, 12), $$0x -> $$0x.a(12));
      this.p.b(false);
      fhp $$1 = $$0.a(fhp.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fea.a(this.d, this.m).a());
      }

      $$1.a(this.m());
      this.q.a($$1x -> {
         fdw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.p != null) {
         this.p.d(this.k - 100);
      }

      this.q.a();
      fhj.a(this.q, this.G());
   }

   @Override
   public wi i() {
      return this.o;
   }
}
