public class fdh extends gvu {
   private static final wu a = wu.c("mco.selectServer.create");
   private static final wu b = wu.c("mco.configure.world.name");
   private static final wu c = wu.c("mco.configure.world.description");
   private static final int A = 10;
   private static final int B = 210;
   private final faz C;
   private final flh D = new flh(this);
   private fid E;
   private fid F;
   private final Runnable G;

   public fdh(faz $$0, fbv $$1) {
      super(a);
      this.C = $$0;
      this.G = () -> this.a($$1);
   }

   public fdh(faz $$0, long $$1) {
      super(a);
      this.C = $$0;
      this.G = () -> this.a($$1);
   }

   @Override
   public void aP_() {
      this.D.a(this.k, this.o);
      fll $$0 = this.D.c(fll.d()).a(10);
      fhu $$1 = fhu.a(wt.j, $$0x -> this.G.run()).a();
      $$1.j = false;
      this.E = new fid(this.o, 210, 20, b);
      this.E.b($$1x -> $$1.j = !azd.h($$1x));
      this.F = new fid(this.o, 210, 20, c);
      $$0.a(fld.a(this.o, this.E, b));
      $$0.a(fld.a(this.o, this.F, c));
      fll $$2 = this.D.b(fll.e().a(10));
      $$2.a($$1);
      $$2.a(fhu.a(wt.k, $$0x -> this.d()).a());
      this.D.a($$1x -> {
         fhs var10000 = this.c($$1x);
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

   private void a(fbv $$0) {
      fex $$1 = new fex($$0.a, this.E.a(), this.F.a());
      fdt $$2 = fdt.a(this, $$0, $$1, () -> this.l.execute(() -> {
            faz.g();
            this.l.a(this.C);
         }));
      this.l.a($$2);
   }

   private void a(long $$0) {
      fnl $$1 = new fds($$1x -> {
         if ($$1x == null) {
            this.l.a(this);
         } else {
            this.l.a(new fdl(this, new fes(this.C, $$0, $$1x, this.E.a(), this.F.a())));
         }
      }, a);
      this.l.a($$1);
   }

   @Override
   public void d() {
      this.l.a(this.C);
   }
}
