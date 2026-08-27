import javax.annotation.Nullable;

public class fku extends fkt {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final ws c = ws.c("selectWorld.allowCommands.new");
   private static final ws d = ws.c("selectWorld.gameMode");
   private static final ws r = ws.c("lanServer.otherPlayers");
   private static final ws s = ws.c("lanServer.port");
   private static final ws u = ws.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final ws v = ws.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int w = 16733525;
   private final fkt x;
   private czr y = czr.a;
   private boolean z;
   private int A = axn.a();
   @Nullable
   private ffd B;

   public fku(fkt $$0) {
      super(ws.c("lanServer.title"));
      this.x = $$0;
   }

   @Override
   protected void aM_() {
      gqs $$0 = this.m.V();
      this.y = $$0.u_();
      this.z = $$0.bc().m();
      this.c(ffb.a(czr::e).a(czr.a, czr.d, czr.b, czr.c).a(this.y).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.y = $$1x));
      this.c(ffb.b(this.z).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.z = $$1x));
      feu $$1 = feu.a(ws.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         ws $$2;
         if ($$0.a(this.y, this.z, this.A)) {
            $$2 = ane.a(this.A);
         } else {
            $$2 = ws.c("commands.publish.failed");
         }

         this.m.l.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.B = new ffd(this.p, this.n / 2 - 75, 160, 150, 20, ws.c("lanServer.port"));
      this.B.b($$1x -> {
         ws $$2 = this.a($$1x);
         this.B.c(ws.b(this.A + "").a(n.i));
         if ($$2 == null) {
            this.B.g(14737632);
            this.B.a(null);
            $$1.j = true;
         } else {
            this.B.g(16733525);
            this.B.a(fgf.a($$2));
            $$1.j = false;
         }
      });
      this.B.c(ws.b(this.A + "").a(n.i));
      this.c(this.B);
      this.c($$1);
      this.c(feu.a(wr.e, $$0x -> this.d()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.m.a(this.x);
   }

   @Nullable
   private ws a(String $$0) {
      if ($$0.isBlank()) {
         this.A = axn.a();
         return null;
      } else {
         try {
            this.A = Integer.parseInt($$0);
            if (this.A < 1024 || this.A > 65535) {
               return v;
            } else {
               return !axn.a(this.A) ? u : null;
            }
         } catch (NumberFormatException var3) {
            this.A = axn.a();
            return v;
         }
      }
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, r, this.n / 2, 82, 16777215);
      $$0.a(this.p, s, this.n / 2, 142, 16777215);
   }
}
