public class eoz extends gfx {
   private static final ui a = ui.c("mco.selectServer.create");
   private static final ui b = ui.c("mco.configure.world.name");
   private static final ui c = ui.c("mco.configure.world.description");
   private static final int y = 10;
   private static final int z = 210;
   private final ems A;
   private final ewt B = new ewt(this);
   private ets C;
   private ets D;
   private final Runnable E;

   public eoz(ems $$0, eno $$1) {
      super(a);
      this.A = $$0;
      this.E = () -> this.a($$1);
   }

   public eoz(ems $$0, long $$1) {
      super(a);
      this.A = $$0;
      this.E = () -> this.a($$1);
   }

   @Override
   public void aM_() {
      this.B.a(new euq(this.e, this.i));
      ewx $$0 = this.B.c(ewx.d()).a(10);
      etj $$1 = etj.a(uh.j, $$0x -> this.E.run()).a();
      $$1.i = false;
      this.C = new ets(this.i, 210, 20, b);
      this.C.b($$1x -> $$1.i = !ac.b($$1x));
      this.D = new ets(this.i, 210, 20, c);
      $$0.a(ewp.a(this.i, this.C, b));
      $$0.a(ewp.a(this.i, this.D, c));
      ewx $$2 = this.B.b(ewx.e().a(10));
      $$2.a($$1);
      $$2.a(etj.a(uh.k, $$0x -> this.aC_()).a());
      this.B.a($$1x -> {
         eth var10000 = this.d($$1x);
      });
      this.c();
      this.c(this.C);
   }

   @Override
   protected void c() {
      this.B.a();
   }

   private void a(eno $$0) {
      eqw $$1 = new eqw($$0.a, this.C.a(), this.D.a());
      epm $$2 = epm.a(this, $$0, $$1, () -> this.f.execute(() -> {
            ems.f();
            this.f.a(this.A);
         }));
      this.f.a($$2);
   }

   private void a(long $$0) {
      ezd $$1 = new epl($$1x -> {
         if ($$1x == null) {
            this.f.a(this);
         } else {
            this.f.a(new epe(this, new eql(this.A, $$0, $$1x, this.C.a(), this.D.a())));
         }
      }, a);
      this.f.a($$1);
   }

   @Override
   public void aC_() {
      this.f.a(this.A);
   }
}
