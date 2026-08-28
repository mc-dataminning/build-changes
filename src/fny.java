import javax.annotation.Nullable;

public class fny extends fnx {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final wy c = wy.c("selectWorld.allowCommands.new");
   private static final wy q = wy.c("selectWorld.gameMode");
   private static final wy r = wy.c("lanServer.otherPlayers");
   private static final wy s = wy.c("lanServer.port");
   private static final wy u = wy.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final wy v = wy.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int w = 16733525;
   private final fnx x;
   private dcr y = dcr.a;
   private boolean z;
   private int A = aye.a();
   @Nullable
   private fip B;

   public fny(fnx $$0) {
      super(wy.c("lanServer.title"));
      this.x = $$0;
   }

   @Override
   protected void aP_() {
      guh $$0 = this.l.V();
      this.y = $$0.u_();
      this.z = $$0.bb().m();
      this.c(fin.a(dcr::e).a(dcr.a, dcr.d, dcr.b, dcr.c).a(this.y).a(this.m / 2 - 155, 100, 150, 20, q, ($$0x, $$1x) -> this.y = $$1x));
      this.c(fin.b(this.z).a(this.m / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.z = $$1x));
      fig $$1 = fig.a(wy.c("lanServer.start"), $$1x -> {
         this.l.a(null);
         wy $$2;
         if ($$0.a(this.y, this.z, this.A)) {
            $$2 = anr.a(this.A);
         } else {
            $$2 = wy.c("commands.publish.failed");
         }

         this.l.l.d().a($$2);
         this.l.d();
      }).a(this.m / 2 - 155, this.n - 28, 150, 20).a();
      this.B = new fip(this.o, this.m / 2 - 75, 160, 150, 20, wy.c("lanServer.port"));
      this.B.b($$1x -> {
         wy $$2 = this.a($$1x);
         this.B.c(wy.b(this.A + "").a(n.i));
         if ($$2 == null) {
            this.B.g(14737632);
            this.B.a(null);
            $$1.j = true;
         } else {
            this.B.g(16733525);
            this.B.a(fjr.a($$2));
            $$1.j = false;
         }
      });
      this.B.c(wy.b(this.A + "").a(n.i));
      this.c(this.B);
      this.c($$1);
      this.c(fig.a(wx.e, $$0x -> this.d()).a(this.m / 2 + 5, this.n - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.l.a(this.x);
   }

   @Nullable
   private wy a(String $$0) {
      if ($$0.isBlank()) {
         this.A = aye.a();
         return null;
      } else {
         try {
            this.A = Integer.parseInt($$0);
            if (this.A < 1024 || this.A > 65535) {
               return v;
            } else {
               return !aye.a(this.A) ? u : null;
            }
         } catch (NumberFormatException var3) {
            this.A = aye.a();
            return v;
         }
      }
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 50, 16777215);
      $$0.a(this.o, r, this.m / 2, 82, 16777215);
      $$0.a(this.o, s, this.m / 2, 142, 16777215);
   }
}
