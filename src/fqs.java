import javax.annotation.Nullable;

public abstract class fqs extends fnx {
   private static final int b = 100;
   private final wy c;
   @Nullable
   private final wy q;
   private final wy r;
   @Nullable
   protected fii a;
   @Nullable
   private fir s;
   private final flr u;

   protected fqs(wy $$0, wy $$1, wy $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fqs(wy $$0, wy $$1, @Nullable wy $$2, wy $$3) {
      super($$0);
      this.c = $$1;
      this.q = $$2;
      this.r = $$3;
      this.u = new flr(0, 0, this.m, this.n);
   }

   protected abstract flu m();

   @Override
   protected void aP_() {
      flx $$0 = this.u.a(flx.d().a(8));
      $$0.c().b();
      $$0.a(new fjn(this.n(), this.o));
      this.s = $$0.a(new fir(this.m - 100, this.c, this.o, 12), $$0x -> $$0x.a(12));
      this.s.b(false);
      flx $$1 = $$0.a(flx.d().a(8));
      $$1.c().b();
      if (this.q != null) {
         this.a = $$1.a(fii.a(this.q, this.o).a());
      }

      $$1.a(this.m());
      this.u.a($$1x -> {
         fie var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.s != null) {
         this.s.d(this.m - 100);
      }

      this.u.a();
      flr.a(this.u, this.H());
   }

   @Override
   public wy i() {
      return this.r;
   }
}
