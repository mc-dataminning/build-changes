import javax.annotation.Nullable;

public class fmz extends fmy {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final xl c = xl.c("selectWorld.allowCommands.new");
   private static final xl d = xl.c("selectWorld.gameMode");
   private static final xl r = xl.c("lanServer.otherPlayers");
   private static final xl s = xl.c("lanServer.port");
   private static final xl u = xl.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final xl v = xl.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int w = 16733525;
   private final fmy x;
   private dbq y = dbq.a;
   private boolean z;
   private int A = ayl.a();
   @Nullable
   private fhi B;

   public fmz(fmy $$0) {
      super(xl.c("lanServer.title"));
      this.x = $$0;
   }

   @Override
   protected void aN_() {
      gsz $$0 = this.m.V();
      this.y = $$0.u_();
      this.z = $$0.bb().m();
      this.c(fhg.a(dbq::e).a(dbq.a, dbq.d, dbq.b, dbq.c).a(this.y).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.y = $$1x));
      this.c(fhg.b(this.z).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.z = $$1x));
      fgz $$1 = fgz.a(xl.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         xl $$2;
         if ($$0.a(this.y, this.z, this.A)) {
            $$2 = aob.a(this.A);
         } else {
            $$2 = xl.c("commands.publish.failed");
         }

         this.m.l.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.B = new fhi(this.p, this.n / 2 - 75, 160, 150, 20, xl.c("lanServer.port"));
      this.B.b($$1x -> {
         xl $$2 = this.a($$1x);
         this.B.c(xl.b(this.A + "").a(n.i));
         if ($$2 == null) {
            this.B.g(14737632);
            this.B.a(null);
            $$1.j = true;
         } else {
            this.B.g(16733525);
            this.B.a(fik.a($$2));
            $$1.j = false;
         }
      });
      this.B.c(xl.b(this.A + "").a(n.i));
      this.c(this.B);
      this.c($$1);
      this.c(fgz.a(xk.e, $$0x -> this.d()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.m.a(this.x);
   }

   @Nullable
   private xl a(String $$0) {
      if ($$0.isBlank()) {
         this.A = ayl.a();
         return null;
      } else {
         try {
            this.A = Integer.parseInt($$0);
            if (this.A < 1024 || this.A > 65535) {
               return v;
            } else {
               return !ayl.a(this.A) ? u : null;
            }
         } catch (NumberFormatException var3) {
            this.A = ayl.a();
            return v;
         }
      }
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, r, this.n / 2, 82, 16777215);
      $$0.a(this.p, s, this.n / 2, 142, 16777215);
   }
}
