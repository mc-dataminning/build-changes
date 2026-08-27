public class eqc extends ghe {
   private static final ur a = ur.c("mco.selectServer.create");
   private static final ur b = ur.c("mco.configure.world.name");
   private static final ur c = ur.c("mco.configure.world.description");
   private static final int v = 10;
   private static final int w = 210;
   private final env x;
   private final exw y = new exw(this);
   private euv z;
   private euv A;
   private final Runnable B;

   public eqc(env $$0, eor $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   public eqc(env $$0, long $$1) {
      super(a);
      this.x = $$0;
      this.B = () -> this.a($$1);
   }

   @Override
   public void aO_() {
      this.y.a(new evt(this.e, this.i));
      eya $$0 = this.y.c(eya.d()).a(10);
      eum $$1 = eum.a(uq.j, $$0x -> this.B.run()).a();
      $$1.i = false;
      this.z = new euv(this.i, 210, 20, b);
      this.z.b($$1x -> $$1.i = !ac.b($$1x));
      this.A = new euv(this.i, 210, 20, c);
      $$0.a(exs.a(this.i, this.z, b));
      $$0.a(exs.a(this.i, this.A, c));
      eya $$2 = this.y.b(eya.e().a(10));
      $$2.a($$1);
      $$2.a(eum.a(uq.k, $$0x -> this.aE_()).a());
      this.y.a($$1x -> {
         euk var10000 = this.d($$1x);
      });
      this.c();
      this.c(this.z);
   }

   @Override
   protected void c() {
      this.y.a();
   }

   private void a(eor $$0) {
      erz $$1 = new erz($$0.a, this.z.a(), this.A.a());
      eqp $$2 = eqp.a(this, $$0, $$1, () -> this.f.execute(() -> {
            env.f();
            this.f.a(this.x);
         }));
      this.f.a($$2);
   }

   private void a(long $$0) {
      fah $$1 = new eqo($$1x -> {
         if ($$1x == null) {
            this.f.a(this);
         } else {
            this.f.a(new eqh(this, new ero(this.x, $$0, $$1x, this.z.a(), this.A.a())));
         }
      }, a);
      this.f.a($$1);
   }

   @Override
   public void aE_() {
      this.f.a(this.x);
   }
}
