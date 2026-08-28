import javax.annotation.Nullable;

public abstract class ftb extends fqh {
   private static final int b = 100;
   private final xe c;
   @Nullable
   private final xe d;
   private final xe s;
   @Nullable
   protected fkq a;
   @Nullable
   private fkz u;
   private final foa v;

   protected ftb(xe $$0, xe $$1, xe $$2) {
      this($$0, $$1, null, $$2);
   }

   protected ftb(xe $$0, xe $$1, @Nullable xe $$2, xe $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new foa(0, 0, this.n, this.o);
   }

   protected abstract fod m();

   @Override
   protected void aS_() {
      fog $$0 = this.v.a(fog.d().a(8));
      $$0.c().b();
      $$0.a(new flv(this.n(), this.p));
      this.u = $$0.a(new fkz(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fog $$1 = $$0.a(fog.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fkq.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         fkm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      foa.a(this.v, this.H());
   }

   @Override
   public xe i() {
      return this.s;
   }
}
