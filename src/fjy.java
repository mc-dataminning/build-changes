import javax.annotation.Nullable;

public class fjy extends fjx {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final wi c = wi.c("selectWorld.allowCommands.new");
   private static final wi d = wi.c("selectWorld.gameMode");
   private static final wi o = wi.c("lanServer.otherPlayers");
   private static final wi p = wi.c("lanServer.port");
   private static final wi q = wi.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final wi r = wi.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int s = 16733525;
   private final fjx u;
   private czd v = czd.a;
   private boolean w;
   private int x = axd.a();
   @Nullable
   private feh y;

   public fjy(fjx $$0) {
      super(wi.c("lanServer.title"));
      this.u = $$0;
   }

   @Override
   protected void aM_() {
      gpw $$0 = this.j.V();
      this.v = $$0.u_();
      this.w = $$0.bc().m();
      this.c(fef.a(czd::e).a(czd.a, czd.d, czd.b, czd.c).a(this.v).a(this.k / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.v = $$1x));
      this.c(fef.b(this.w).a(this.k / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.w = $$1x));
      fdy $$1 = fdy.a(wi.c("lanServer.start"), $$1x -> {
         this.j.a(null);
         wi $$2;
         if ($$0.a(this.v, this.w, this.x)) {
            $$2 = amu.a(this.x);
         } else {
            $$2 = wi.c("commands.publish.failed");
         }

         this.j.l.d().a($$2);
         this.j.d();
      }).a(this.k / 2 - 155, this.l - 28, 150, 20).a();
      this.y = new feh(this.m, this.k / 2 - 75, 160, 150, 20, wi.c("lanServer.port"));
      this.y.b($$1x -> {
         wi $$2 = this.a($$1x);
         this.y.c(wi.b(this.x + "").a(n.i));
         if ($$2 == null) {
            this.y.g(14737632);
            this.y.a(null);
            $$1.j = true;
         } else {
            this.y.g(16733525);
            this.y.a(ffj.a($$2));
            $$1.j = false;
         }
      });
      this.y.c(wi.b(this.x + "").a(n.i));
      this.c(this.y);
      this.c($$1);
      this.c(fdy.a(wh.e, $$0x -> this.d()).a(this.k / 2 + 5, this.l - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.j.a(this.u);
   }

   @Nullable
   private wi a(String $$0) {
      if ($$0.isBlank()) {
         this.x = axd.a();
         return null;
      } else {
         try {
            this.x = Integer.parseInt($$0);
            if (this.x < 1024 || this.x > 65535) {
               return r;
            } else {
               return !axd.a(this.x) ? q : null;
            }
         } catch (NumberFormatException var3) {
            this.x = axd.a();
            return r;
         }
      }
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 50, 16777215);
      $$0.a(this.m, o, this.k / 2, 82, 16777215);
      $$0.a(this.m, p, this.k / 2, 142, 16777215);
   }
}
