public class esr extends gkn {
   private static final vf a = vf.c("mco.selectServer.create");
   private static final vf b = vf.c("mco.configure.world.name");
   private static final vf c = vf.c("mco.configure.world.description");
   private static final int v = 10;
   private static final int w = 210;
   private final eqk x;
   private final fao y = new fao(this);
   private exn z;
   private exn A;
   private final Runnable B;

   public esr(eqk $$0, erg $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   public esr(eqk $$0, long $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   @Override
   public void aN_() {
      this.y.a(new eyl(this.e, this.i));
      fas $$0 = this.y.c(fas.d()).a(10);
      exe $$1 = exe.a(ve.j, $$0x -> this.B.run()).a();
      $$1.j = false;
      this.z = new exn(this.i, 210, 20, b);
      this.z.b($$1x -> $$1.j = !ac.b($$1x));
      this.A = new exn(this.i, 210, 20, c);
      $$0.a(fak.a(this.i, this.z, b));
      $$0.a(fak.a(this.i, this.A, c));
      fas $$2 = this.y.b(fas.e().a(10));
      $$2.a($$1);
      $$2.a(exe.a(ve.k, $$0x -> this.aE_()).a());
      this.y.a($$1x -> {
         exc var10000 = this.d($$1x);
      });
      this.c();
      this.c(this.z);
   }

   @Override
   protected void c() {
      this.y.a();
   }

   private void a(erg $$0) {
      euo $$1 = new euo($$0.a, this.z.a(), this.A.a());
      ete $$2 = ete.a(this, $$0, $$1, () -> this.f.execute(() -> {
            eqk.f();
            this.f.a(this.x);
         }));
      this.f.a($$2);
   }

   private void a(long $$0) {
      fcz $$1 = new etd($$1x -> {
         if ($$1x == null) {
            this.f.a(this);
         } else {
            this.f.a(new esw(this, new eud(this.x, $$0, $$1x, this.z.a(), this.A.a())));
         }
      }, a);
      this.f.a($$1);
   }

   @Override
   public void aE_() {
      this.f.a(this.x);
   }
}
