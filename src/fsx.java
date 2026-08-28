import javax.annotation.Nullable;

public abstract class fsx extends fqd {
   private static final int b = 100;
   private final xd c;
   @Nullable
   private final xd d;
   private final xd s;
   @Nullable
   protected fkm a;
   @Nullable
   private fkv u;
   private final fnw v;

   protected fsx(xd $$0, xd $$1, xd $$2) {
      this($$0, $$1, null, $$2);
   }

   protected fsx(xd $$0, xd $$1, @Nullable xd $$2, xd $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new fnw(0, 0, this.n, this.o);
   }

   protected abstract fnz m();

   @Override
   protected void aR_() {
      foc $$0 = this.v.a(foc.d().a(8));
      $$0.c().b();
      $$0.a(new flr(this.n(), this.p));
      this.u = $$0.a(new fkv(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      foc $$1 = $$0.a(foc.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fkm.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         fki var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      fnw.a(this.v, this.H());
   }

   @Override
   public xd i() {
      return this.s;
   }
}
