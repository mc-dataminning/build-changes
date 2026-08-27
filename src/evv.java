public class evv extends gob {
   private static final vs a = vs.c("mco.selectServer.create");
   private static final vs b = vs.c("mco.configure.world.name");
   private static final vs c = vs.c("mco.configure.world.description");
   private static final int v = 10;
   private static final int w = 210;
   private final eto x;
   private final fdw y = new fdw(this);
   private fat z;
   private fat A;
   private final Runnable B;

   public evv(eto $$0, euk $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   public evv(eto $$0, long $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   @Override
   public void aP_() {
      this.y.a(new fbr(this.e, this.i));
      fea $$0 = this.y.c(fea.d()).a(10);
      fak $$1 = fak.a(vr.j, $$0x -> this.B.run()).a();
      $$1.j = false;
      this.z = new fat(this.i, 210, 20, b);
      this.z.b($$1x -> $$1.j = !ac.b($$1x));
      this.A = new fat(this.i, 210, 20, c);
      $$0.a(fds.a(this.i, this.z, b));
      $$0.a(fds.a(this.i, this.A, c));
      fea $$2 = this.y.b(fea.e().a(10));
      $$2.a($$1);
      $$2.a(fak.a(vr.k, $$0x -> this.d()).a());
      this.y.a($$1x -> {
         fai var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void aG_() {
      this.b(this.z);
   }

   @Override
   protected void c() {
      this.y.a();
   }

   private void a(euk $$0) {
      exm $$1 = new exm($$0.a, this.z.a(), this.A.a());
      ewi $$2 = ewi.a(this, $$0, $$1, () -> this.f.execute(() -> {
            eto.g();
            this.f.a(this.x);
         }));
      this.f.a($$2);
   }

   private void a(long $$0) {
      fgh $$1 = new ewh($$1x -> {
         if ($$1x == null) {
            this.f.a(this);
         } else {
            this.f.a(new ewa(this, new exh(this.x, $$0, $$1x, this.z.a(), this.A.a())));
         }
      }, a);
      this.f.a($$1);
   }

   @Override
   public void d() {
      this.f.a(this.x);
   }
}
