import javax.annotation.Nullable;

public class frx extends frw {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final xj c = xj.c("selectWorld.allowCommands");
   private static final xj d = xj.c("selectWorld.gameMode");
   private static final xj s = xj.c("lanServer.otherPlayers");
   private static final xj u = xj.c("lanServer.port");
   private static final xj v = xj.a("lanServer.port.unavailable", 1024, 65535);
   private static final xj w = xj.a("lanServer.port.invalid", 1024, 65535);
   private static final int x = 16733525;
   private final frw y;
   private dfj z = dfj.a;
   private boolean A;
   private int B = azd.a();
   @Nullable
   private fmm C;

   public frx(frw $$0) {
      super(xj.c("lanServer.title"));
      this.y = $$0;
   }

   @Override
   protected void aR_() {
      hdp $$0 = this.m.V();
      this.z = $$0.u();
      this.A = $$0.aZ().m();
      this.c(fmk.a(dfj::e).a(dfj.a, dfj.d, dfj.b, dfj.c).a(this.z).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.z = $$1x));
      this.c(fmk.b(this.A).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.A = $$1x));
      fmd $$1 = fmd.a(xj.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         xj $$2;
         if ($$0.a(this.z, this.A, this.B)) {
            $$2 = aol.a(this.B);
         } else {
            $$2 = xj.c("commands.publish.failed");
         }

         this.m.m.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.C = new fmm(this.p, this.n / 2 - 75, 160, 150, 20, xj.c("lanServer.port"));
      this.C.b($$1x -> {
         xj $$2 = this.a($$1x);
         this.C.c(xj.b(this.B + "").a(n.i));
         if ($$2 == null) {
            this.C.g(14737632);
            this.C.a(null);
            $$1.j = true;
         } else {
            this.C.g(16733525);
            this.C.a(fno.a($$2));
            $$1.j = false;
         }
      });
      this.C.c(xj.b(this.B + "").a(n.i));
      this.c(this.C);
      this.c($$1);
      this.c(fmd.a(xi.e, $$0x -> this.aO_()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void aO_() {
      this.m.a(this.y);
   }

   @Nullable
   private xj a(String $$0) {
      if ($$0.isBlank()) {
         this.B = azd.a();
         return null;
      } else {
         try {
            this.B = Integer.parseInt($$0);
            if (this.B < 1024 || this.B > 65535) {
               return w;
            } else {
               return !azd.a(this.B) ? v : null;
            }
         } catch (NumberFormatException var3) {
            this.B = azd.a();
            return w;
         }
      }
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, s, this.n / 2, 82, 16777215);
      $$0.a(this.p, u, this.n / 2, 142, 16777215);
   }
}
