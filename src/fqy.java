import javax.annotation.Nullable;

public abstract class fqy extends fod {
   private static final int b = 100;
   private final wz c;
   @Nullable
   private final wz r;
   private final wz s;
   @Nullable
   protected fio a;
   @Nullable
   private fix u;
   private final flx v;

   protected fqy(wz $$0, wz $$1, wz $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fqy(wz $$0, wz $$1, @Nullable wz $$2, wz $$3) {
      super($$0);
      this.c = $$1;
      this.r = $$2;
      this.s = $$3;
      this.v = new flx(0, 0, this.m, this.n);
   }

   protected abstract fma m();

   @Override
   protected void aT_() {
      fmd $$0 = this.v.a(fmd.d().a(8));
      $$0.c().b();
      $$0.a(new fjt(this.n(), this.o));
      this.u = $$0.a(new fix(this.m - 100, this.c, this.o, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fmd $$1 = $$0.a(fmd.d().a(8));
      $$1.c().b();
      if (this.r != null) {
         this.a = $$1.a(fio.a(this.r, this.o).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         fik var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.m - 100);
      }

      this.v.a();
      flx.a(this.v, this.H());
   }

   @Override
   public wz i() {
      return this.s;
   }
}
