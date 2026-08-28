import javax.annotation.Nullable;

public class frb extends fra {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final xi c = xi.c("selectWorld.allowCommands");
   private static final xi d = xi.c("selectWorld.gameMode");
   private static final xi s = xi.c("lanServer.otherPlayers");
   private static final xi u = xi.c("lanServer.port");
   private static final xi v = xi.a("lanServer.port.unavailable", 1024, 65535);
   private static final xi w = xi.a("lanServer.port.invalid", 1024, 65535);
   private static final int x = 16733525;
   private final fra y;
   private dey z = dey.a;
   private boolean A;
   private int B = azb.a();
   @Nullable
   private flq C;

   public frb(fra $$0) {
      super(xi.c("lanServer.title"));
      this.y = $$0;
   }

   @Override
   protected void aR_() {
      hco $$0 = this.m.V();
      this.z = $$0.u();
      this.A = $$0.aZ().m();
      this.c(flo.a(dey::e).a(dey.a, dey.d, dey.b, dey.c).a(this.z).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.z = $$1x));
      this.c(flo.b(this.A).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.A = $$1x));
      flh $$1 = flh.a(xi.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         xi $$2;
         if ($$0.a(this.z, this.A, this.B)) {
            $$2 = aok.a(this.B);
         } else {
            $$2 = xi.c("commands.publish.failed");
         }

         this.m.m.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.C = new flq(this.p, this.n / 2 - 75, 160, 150, 20, xi.c("lanServer.port"));
      this.C.b($$1x -> {
         xi $$2 = this.a($$1x);
         this.C.c(xi.b(this.B + "").a(n.i));
         if ($$2 == null) {
            this.C.g(14737632);
            this.C.a(null);
            $$1.j = true;
         } else {
            this.C.g(16733525);
            this.C.a(fms.a($$2));
            $$1.j = false;
         }
      });
      this.C.c(xi.b(this.B + "").a(n.i));
      this.c(this.C);
      this.c($$1);
      this.c(flh.a(xh.e, $$0x -> this.d()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.m.a(this.y);
   }

   @Nullable
   private xi a(String $$0) {
      if ($$0.isBlank()) {
         this.B = azb.a();
         return null;
      } else {
         try {
            this.B = Integer.parseInt($$0);
            if (this.B < 1024 || this.B > 65535) {
               return w;
            } else {
               return !azb.a(this.B) ? v : null;
            }
         } catch (NumberFormatException var3) {
            this.B = azb.a();
            return w;
         }
      }
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, s, this.n / 2, 82, 16777215);
      $$0.a(this.p, u, this.n / 2, 142, 16777215);
   }
}
