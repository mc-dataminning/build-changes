import javax.annotation.Nullable;

public class fnc extends fnb {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final xo c = xo.c("selectWorld.allowCommands.new");
   private static final xo d = xo.c("selectWorld.gameMode");
   private static final xo r = xo.c("lanServer.otherPlayers");
   private static final xo s = xo.c("lanServer.port");
   private static final xo u = xo.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final xo v = xo.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int w = 16733525;
   private final fnb x;
   private dbt y = dbt.a;
   private boolean z;
   private int A = ayo.a();
   @Nullable
   private fhl B;

   public fnc(fnb $$0) {
      super(xo.c("lanServer.title"));
      this.x = $$0;
   }

   @Override
   protected void aM_() {
      gtc $$0 = this.m.V();
      this.y = $$0.u_();
      this.z = $$0.bb().m();
      this.c(fhj.a(dbt::e).a(dbt.a, dbt.d, dbt.b, dbt.c).a(this.y).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.y = $$1x));
      this.c(fhj.b(this.z).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.z = $$1x));
      fhc $$1 = fhc.a(xo.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         xo $$2;
         if ($$0.a(this.y, this.z, this.A)) {
            $$2 = aoe.a(this.A);
         } else {
            $$2 = xo.c("commands.publish.failed");
         }

         this.m.l.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.B = new fhl(this.p, this.n / 2 - 75, 160, 150, 20, xo.c("lanServer.port"));
      this.B.b($$1x -> {
         xo $$2 = this.a($$1x);
         this.B.c(xo.b(this.A + "").a(n.i));
         if ($$2 == null) {
            this.B.g(14737632);
            this.B.a(null);
            $$1.j = true;
         } else {
            this.B.g(16733525);
            this.B.a(fin.a($$2));
            $$1.j = false;
         }
      });
      this.B.c(xo.b(this.A + "").a(n.i));
      this.c(this.B);
      this.c($$1);
      this.c(fhc.a(xn.e, $$0x -> this.d()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.m.a(this.x);
   }

   @Nullable
   private xo a(String $$0) {
      if ($$0.isBlank()) {
         this.A = ayo.a();
         return null;
      } else {
         try {
            this.A = Integer.parseInt($$0);
            if (this.A < 1024 || this.A > 65535) {
               return v;
            } else {
               return !ayo.a(this.A) ? u : null;
            }
         } catch (NumberFormatException var3) {
            this.A = ayo.a();
            return v;
         }
      }
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, r, this.n / 2, 82, 16777215);
      $$0.a(this.p, s, this.n / 2, 142, 16777215);
   }
}
