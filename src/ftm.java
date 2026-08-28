import javax.annotation.Nullable;

public abstract class ftm extends fqs {
   private static final int b = 100;
   private final xh c;
   @Nullable
   private final xh d;
   private final xh s;
   @Nullable
   protected flb a;
   @Nullable
   private flk u;
   private final fol v;

   protected ftm(xh $$0, xh $$1, xh $$2) {
      this($$0, $$1, null, $$2);
   }

   protected ftm(xh $$0, xh $$1, @Nullable xh $$2, xh $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new fol(0, 0, this.n, this.o);
   }

   protected abstract foo m();

   @Override
   protected void aS_() {
      fos $$0 = this.v.a(fos.d().a(8));
      $$0.c().b();
      $$0.a(new fmg(this.n(), this.p));
      this.u = $$0.a(new flk(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fos $$1 = $$0.a(fos.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(flb.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         fkx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      fol.a(this.v, this.H());
   }

   @Override
   public xh i() {
      return this.s;
   }
}
