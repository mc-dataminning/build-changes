import javax.annotation.Nullable;

public abstract class ftu extends fra {
   private static final int b = 100;
   private final xi c;
   @Nullable
   private final xi d;
   private final xi s;
   @Nullable
   protected flj a;
   @Nullable
   private fls u;
   private final fou v;

   protected ftu(xi $$0, xi $$1, xi $$2) {
      this($$0, $$1, null, $$2);
   }

   protected ftu(xi $$0, xi $$1, @Nullable xi $$2, xi $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new fou(0, 0, this.n, this.o);
   }

   protected abstract fox m();

   @Override
   protected void aR_() {
      fpa $$0 = this.v.a(fpa.d().a(8));
      $$0.c().b();
      $$0.a(new fmo(this.n(), this.p));
      this.u = $$0.a(new fls(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fpa $$1 = $$0.a(fpa.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(flj.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         flf var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      fou.a(this.v, this.H());
   }

   @Override
   public xi i() {
      return this.s;
   }
}
