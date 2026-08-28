import javax.annotation.Nullable;

public class frq extends frp {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final xl c = xl.c("selectWorld.allowCommands");
   private static final xl d = xl.c("selectWorld.gameMode");
   private static final xl s = xl.c("lanServer.otherPlayers");
   private static final xl u = xl.c("lanServer.port");
   private static final xl v = xl.a("lanServer.port.unavailable", 1024, 65535);
   private static final xl w = xl.a("lanServer.port.invalid", 1024, 65535);
   private static final int x = 16733525;
   private final frp y;
   private dfc z = dfc.a;
   private boolean A;
   private int B = aze.a();
   @Nullable
   private fmf C;

   public frq(frp $$0) {
      super(xl.c("lanServer.title"));
      this.y = $$0;
   }

   @Override
   protected void aS_() {
      hde $$0 = this.m.V();
      this.z = $$0.u();
      this.A = $$0.aZ().m();
      this.c(fmd.a(dfc::e).a(dfc.a, dfc.d, dfc.b, dfc.c).a(this.z).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.z = $$1x));
      this.c(fmd.b(this.A).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.A = $$1x));
      flw $$1 = flw.a(xl.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         xl $$2;
         if ($$0.a(this.z, this.A, this.B)) {
            $$2 = aon.a(this.B);
         } else {
            $$2 = xl.c("commands.publish.failed");
         }

         this.m.m.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.C = new fmf(this.p, this.n / 2 - 75, 160, 150, 20, xl.c("lanServer.port"));
      this.C.b($$1x -> {
         xl $$2 = this.a($$1x);
         this.C.c(xl.b(this.B + "").a(n.i));
         if ($$2 == null) {
            this.C.g(14737632);
            this.C.a(null);
            $$1.j = true;
         } else {
            this.C.g(16733525);
            this.C.a(fnh.a($$2));
            $$1.j = false;
         }
      });
      this.C.c(xl.b(this.B + "").a(n.i));
      this.c(this.C);
      this.c($$1);
      this.c(flw.a(xk.e, $$0x -> this.aP_()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void aP_() {
      this.m.a(this.y);
   }

   @Nullable
   private xl a(String $$0) {
      if ($$0.isBlank()) {
         this.B = aze.a();
         return null;
      } else {
         try {
            this.B = Integer.parseInt($$0);
            if (this.B < 1024 || this.B > 65535) {
               return w;
            } else {
               return !aze.a(this.B) ? v : null;
            }
         } catch (NumberFormatException var3) {
            this.B = aze.a();
            return w;
         }
      }
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, s, this.n / 2, 82, 16777215);
      $$0.a(this.p, u, this.n / 2, 142, 16777215);
   }
}
