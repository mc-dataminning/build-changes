public class ewr extends gpb {
   private static final vu a = vu.c("mco.selectServer.create");
   private static final vu b = vu.c("mco.configure.world.name");
   private static final vu c = vu.c("mco.configure.world.description");
   private static final int v = 10;
   private static final int w = 210;
   private final euk x;
   private final fet y = new fet(this);
   private fbp z;
   private fbp A;
   private final Runnable B;

   public ewr(euk $$0, evg $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   public ewr(euk $$0, long $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   @Override
   public void aO_() {
      this.y.a(new fcn(this.e, this.i));
      fex $$0 = this.y.c(fex.d()).a(10);
      fbg $$1 = fbg.a(vt.j, $$0x -> this.B.run()).a();
      $$1.j = false;
      this.z = new fbp(this.i, 210, 20, b);
      this.z.b($$1x -> $$1.j = !ac.b($$1x));
      this.A = new fbp(this.i, 210, 20, c);
      $$0.a(fep.a(this.i, this.z, b));
      $$0.a(fep.a(this.i, this.A, c));
      fex $$2 = this.y.b(fex.e().a(10));
      $$2.a($$1);
      $$2.a(fbg.a(vt.k, $$0x -> this.d()).a());
      this.y.a($$1x -> {
         fbe var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aF_() {
      this.b(this.z);
   }

   @Override
   protected void c() {
      this.y.a();
   }

   private void a(evg $$0) {
      eyi $$1 = new eyi($$0.a, this.z.a(), this.A.a());
      exe $$2 = exe.a(this, $$0, $$1, () -> this.f.execute(() -> {
            euk.g();
            this.f.a(this.x);
         }));
      this.f.a($$2);
   }

   private void a(long $$0) {
      fhf $$1 = new exd($$1x -> {
         if ($$1x == null) {
            this.f.a(this);
         } else {
            this.f.a(new eww(this, new eyd(this.x, $$0, $$1x, this.z.a(), this.A.a())));
         }
      }, a);
      this.f.a($$1);
   }

   @Override
   public void d() {
      this.f.a(this.x);
   }
}
