import javax.annotation.Nullable;

public abstract class fqw extends fob {
   private static final int b = 100;
   private final wz c;
   @Nullable
   private final wz r;
   private final wz s;
   @Nullable
   protected fim a;
   @Nullable
   private fiv u;
   private final flv v;

   protected fqw(wz $$0, wz $$1, wz $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fqw(wz $$0, wz $$1, @Nullable wz $$2, wz $$3) {
      super($$0);
      this.c = $$1;
      this.r = $$2;
      this.s = $$3;
      this.v = new flv(0, 0, this.m, this.n);
   }

   protected abstract fly m();

   @Override
   protected void aT_() {
      fmb $$0 = this.v.a(fmb.d().a(8));
      $$0.c().b();
      $$0.a(new fjr(this.n(), this.o));
      this.u = $$0.a(new fiv(this.m - 100, this.c, this.o, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fmb $$1 = $$0.a(fmb.d().a(8));
      $$1.c().b();
      if (this.r != null) {
         this.a = $$1.a(fim.a(this.r, this.o).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         fii var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.m - 100);
      }

      this.v.a();
      flv.a(this.v, this.H());
   }

   @Override
   public wz i() {
      return this.s;
   }
}
