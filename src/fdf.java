public class fdf extends gvs {
   private static final wu a = wu.c("mco.selectServer.create");
   private static final wu b = wu.c("mco.configure.world.name");
   private static final wu c = wu.c("mco.configure.world.description");
   private static final int A = 10;
   private static final int B = 210;
   private final fax C;
   private final flf D = new flf(this);
   private fib E;
   private fib F;
   private final Runnable G;

   public fdf(fax $$0, fbt $$1) {
      super(a);
      this.C = $$0;
      this.G = () -> this.a($$1);
   }

   public fdf(fax $$0, long $$1) {
      super(a);
      this.C = $$0;
      this.G = () -> this.a($$1);
   }

   @Override
   public void aP_() {
      this.D.a(this.k, this.o);
      flj $$0 = this.D.c(flj.d()).a(10);
      fhs $$1 = fhs.a(wt.j, $$0x -> this.G.run()).a();
      $$1.j = false;
      this.E = new fib(this.o, 210, 20, b);
      this.E.b($$1x -> $$1.j = !azd.h($$1x));
      this.F = new fib(this.o, 210, 20, c);
      $$0.a(flb.a(this.o, this.E, b));
      $$0.a(flb.a(this.o, this.F, c));
      flj $$2 = this.D.b(flj.e().a(10));
      $$2.a($$1);
      $$2.a(fhs.a(wt.k, $$0x -> this.d()).a());
      this.D.a($$1x -> {
         fhq var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aE_() {
      this.b(this.E);
   }

   @Override
   protected void c() {
      this.D.a();
   }

   private void a(fbt $$0) {
      fev $$1 = new fev($$0.a, this.E.a(), this.F.a());
      fdr $$2 = fdr.a(this, $$0, $$1, () -> this.l.execute(() -> {
            fax.g();
            this.l.a(this.C);
         }));
      this.l.a($$2);
   }

   private void a(long $$0) {
      fnj $$1 = new fdq($$1x -> {
         if ($$1x == null) {
            this.l.a(this);
         } else {
            this.l.a(new fdj(this, new feq(this.C, $$0, $$1x, this.E.a(), this.F.a())));
         }
      }, a);
      this.l.a($$1);
   }

   @Override
   public void d() {
      this.l.a(this.C);
   }
}
