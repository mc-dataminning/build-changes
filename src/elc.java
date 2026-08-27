public class elc extends gan {
   private static final sw a = sw.c("mco.configure.world.name");
   private static final sw b = sw.c("mco.configure.world.description");
   private final ejq c;
   private final eiu G;
   private epr H;
   private epr I;
   private epi J;

   public elc(ejq $$0, eiu $$1) {
      super(sw.c("mco.selectServer.create"));
      this.c = $$0;
      this.G = $$1;
   }

   @Override
   public void f() {
      if (this.H != null) {
         this.H.a();
      }

      if (this.I != null) {
         this.I.a();
      }
   }

   @Override
   public void b() {
      this.J = this.d(epi.a(sw.c("mco.create.world"), $$0 -> this.B()).a(this.g / 2 - 100, this.h / 4 + 120 + 17, 97, 20).a());
      this.d(epi.a(sv.e, $$0 -> this.f.a(this.G)).a(this.g / 2 + 5, this.h / 4 + 120 + 17, 95, 20).a());
      this.J.r = false;
      this.H = new epr(this.f.h, this.g / 2 - 100, 65, 200, 20, null, sw.c("mco.configure.world.name"));
      this.e(this.H);
      this.c(this.H);
      this.I = new epr(this.f.h, this.g / 2 - 100, 115, 200, 20, null, sw.c("mco.configure.world.description"));
      this.e(this.I);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      boolean $$2 = super.a($$0, $$1);
      this.J.r = this.C();
      return $$2;
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.G);
         return true;
      } else {
         boolean $$3 = super.a($$0, $$1, $$2);
         this.J.r = this.C();
         return $$3;
      }
   }

   private void B() {
      if (this.C()) {
         eln $$0 = new eln(
            this.G,
            this.c,
            sw.c("mco.selectServer.create"),
            sw.c("mco.create.world.subtitle"),
            10526880,
            sw.c("mco.create.world.skip"),
            () -> this.f.execute(() -> this.f.a(this.G.h())),
            () -> this.f.a(this.G.h())
         );
         $$0.a(sw.c("mco.create.world.reset.title"));
         this.f.a(new elh(this.G, new emw(this.c.a, this.H.b(), this.I.b(), $$0)));
      }
   }

   private boolean C() {
      return !this.H.b().trim().isEmpty();
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, this.e, this.g / 2, 11, 16777215);
      $$0.a(this.i, a, this.g / 2 - 100, 52, 10526880, false);
      $$0.a(this.i, b, this.g / 2 - 100, 102, 10526880, false);
      if (this.H != null) {
         this.H.a($$0, $$1, $$2, $$3);
      }

      if (this.I != null) {
         this.I.a($$0, $$1, $$2, $$3);
      }

      super.a($$0, $$1, $$2, $$3);
   }
}
