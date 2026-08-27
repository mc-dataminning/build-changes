public class esl extends gkc {
   private static final vd a = vd.c("mco.selectServer.create");
   private static final vd b = vd.c("mco.configure.world.name");
   private static final vd c = vd.c("mco.configure.world.description");
   private static final int v = 10;
   private static final int w = 210;
   private final eqe x;
   private final fai y = new fai(this);
   private exh z;
   private exh A;
   private final Runnable B;

   public esl(eqe $$0, era $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   public esl(eqe $$0, long $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   @Override
   public void aN_() {
      this.y.a(new eyf(this.e, this.i));
      fam $$0 = this.y.c(fam.d()).a(10);
      ewy $$1 = ewy.a(vc.j, $$0x -> this.B.run()).a();
      $$1.j = false;
      this.z = new exh(this.i, 210, 20, b);
      this.z.b($$1x -> $$1.j = !ac.b($$1x));
      this.A = new exh(this.i, 210, 20, c);
      $$0.a(fae.a(this.i, this.z, b));
      $$0.a(fae.a(this.i, this.A, c));
      fam $$2 = this.y.b(fam.e().a(10));
      $$2.a($$1);
      $$2.a(ewy.a(vc.k, $$0x -> this.aE_()).a());
      this.y.a($$1x -> {
         eww var10000 = this.d($$1x);
      });
      this.c();
      this.c(this.z);
   }

   @Override
   protected void c() {
      this.y.a();
   }

   private void a(era $$0) {
      eui $$1 = new eui($$0.a, this.z.a(), this.A.a());
      esy $$2 = esy.a(this, $$0, $$1, () -> this.f.execute(() -> {
            eqe.f();
            this.f.a(this.x);
         }));
      this.f.a($$2);
   }

   private void a(long $$0) {
      fct $$1 = new esx($$1x -> {
         if ($$1x == null) {
            this.f.a(this);
         } else {
            this.f.a(new esq(this, new etx(this.x, $$0, $$1x, this.z.a(), this.A.a())));
         }
      }, a);
      this.f.a($$1);
   }

   @Override
   public void aE_() {
      this.f.a(this.x);
   }
}
