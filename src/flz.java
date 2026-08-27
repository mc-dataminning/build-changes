import javax.annotation.Nullable;

public class flz extends fly {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final wx c = wx.c("selectWorld.allowCommands.new");
   private static final wx d = wx.c("selectWorld.gameMode");
   private static final wx r = wx.c("lanServer.otherPlayers");
   private static final wx s = wx.c("lanServer.port");
   private static final wx u = wx.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final wx v = wx.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int w = 16733525;
   private final fly x;
   private dau y = dau.a;
   private boolean z;
   private int A = axv.a();
   @Nullable
   private fgi B;

   public flz(fly $$0) {
      super(wx.c("lanServer.title"));
      this.x = $$0;
   }

   @Override
   protected void aM_() {
      gsa $$0 = this.m.V();
      this.y = $$0.u_();
      this.z = $$0.bb().m();
      this.c(fgg.a(dau::e).a(dau.a, dau.d, dau.b, dau.c).a(this.y).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.y = $$1x));
      this.c(fgg.b(this.z).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.z = $$1x));
      ffz $$1 = ffz.a(wx.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         wx $$2;
         if ($$0.a(this.y, this.z, this.A)) {
            $$2 = anm.a(this.A);
         } else {
            $$2 = wx.c("commands.publish.failed");
         }

         this.m.l.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.B = new fgi(this.p, this.n / 2 - 75, 160, 150, 20, wx.c("lanServer.port"));
      this.B.b($$1x -> {
         wx $$2 = this.a($$1x);
         this.B.c(wx.b(this.A + "").a(n.i));
         if ($$2 == null) {
            this.B.g(14737632);
            this.B.a(null);
            $$1.j = true;
         } else {
            this.B.g(16733525);
            this.B.a(fhk.a($$2));
            $$1.j = false;
         }
      });
      this.B.c(wx.b(this.A + "").a(n.i));
      this.c(this.B);
      this.c($$1);
      this.c(ffz.a(ww.e, $$0x -> this.d()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.m.a(this.x);
   }

   @Nullable
   private wx a(String $$0) {
      if ($$0.isBlank()) {
         this.A = axv.a();
         return null;
      } else {
         try {
            this.A = Integer.parseInt($$0);
            if (this.A < 1024 || this.A > 65535) {
               return v;
            } else {
               return !axv.a(this.A) ? u : null;
            }
         } catch (NumberFormatException var3) {
            this.A = axv.a();
            return v;
         }
      }
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, r, this.n / 2, 82, 16777215);
      $$0.a(this.p, s, this.n / 2, 142, 16777215);
   }
}
