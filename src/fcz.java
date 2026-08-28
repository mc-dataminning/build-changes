public class fcz extends gvm {
   private static final wu a = wu.c("mco.selectServer.create");
   private static final wu b = wu.c("mco.configure.world.name");
   private static final wu c = wu.c("mco.configure.world.description");
   private static final int A = 10;
   private static final int B = 210;
   private final far C;
   private final fkz D = new fkz(this);
   private fhv E;
   private fhv F;
   private final Runnable G;

   public fcz(far $$0, fbn $$1) {
      super(a);
      this.C = $$0;
      this.G = () -> this.a($$1);
   }

   public fcz(far $$0, long $$1) {
      super(a);
      this.C = $$0;
      this.G = () -> this.a($$1);
   }

   @Override
   public void aO_() {
      this.D.a(this.k, this.o);
      fld $$0 = this.D.c(fld.d()).a(10);
      fhm $$1 = fhm.a(wt.j, $$0x -> this.G.run()).a();
      $$1.j = false;
      this.E = new fhv(this.o, 210, 20, b);
      this.E.b($$1x -> $$1.j = !aza.h($$1x));
      this.F = new fhv(this.o, 210, 20, c);
      $$0.a(fkv.a(this.o, this.E, b));
      $$0.a(fkv.a(this.o, this.F, c));
      fld $$2 = this.D.b(fld.e().a(10));
      $$2.a($$1);
      $$2.a(fhm.a(wt.k, $$0x -> this.d()).a());
      this.D.a($$1x -> {
         fhk var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aD_() {
      this.b(this.E);
   }

   @Override
   protected void c() {
      this.D.a();
   }

   private void a(fbn $$0) {
      fep $$1 = new fep($$0.a, this.E.a(), this.F.a());
      fdl $$2 = fdl.a(this, $$0, $$1, () -> this.l.execute(() -> {
            far.g();
            this.l.a(this.C);
         }));
      this.l.a($$2);
   }

   private void a(long $$0) {
      fnd $$1 = new fdk($$1x -> {
         if ($$1x == null) {
            this.l.a(this);
         } else {
            this.l.a(new fdd(this, new fek(this.C, $$0, $$1x, this.E.a(), this.F.a())));
         }
      }, a);
      this.l.a($$1);
   }

   @Override
   public void d() {
      this.l.a(this.C);
   }
}
