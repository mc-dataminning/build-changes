import javax.annotation.Nullable;

public class fjp extends fjo {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final wg c = wg.c("selectWorld.allowCommands.new");
   private static final wg d = wg.c("selectWorld.gameMode");
   private static final wg o = wg.c("lanServer.otherPlayers");
   private static final wg p = wg.c("lanServer.port");
   private static final wg q = wg.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final wg r = wg.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int s = 16733525;
   private final fjo u;
   private cyu v = cyu.a;
   private boolean w;
   private int x = axb.a();
   @Nullable
   private fdy y;

   public fjp(fjo $$0) {
      super(wg.c("lanServer.title"));
      this.u = $$0;
   }

   @Override
   protected void aN_() {
      gpn $$0 = this.j.V();
      this.v = $$0.u_();
      this.w = $$0.bc().m();
      this.c(fdw.a(cyu::e).a(cyu.a, cyu.d, cyu.b, cyu.c).a(this.v).a(this.k / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.v = $$1x));
      this.c(fdw.b(this.w).a(this.k / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.w = $$1x));
      fdp $$1 = fdp.a(wg.c("lanServer.start"), $$1x -> {
         this.j.a(null);
         wg $$2;
         if ($$0.a(this.v, this.w, this.x)) {
            $$2 = ams.a(this.x);
         } else {
            $$2 = wg.c("commands.publish.failed");
         }

         this.j.l.d().a($$2);
         this.j.d();
      }).a(this.k / 2 - 155, this.l - 28, 150, 20).a();
      this.y = new fdy(this.m, this.k / 2 - 75, 160, 150, 20, wg.c("lanServer.port"));
      this.y.b($$1x -> {
         wg $$2 = this.a($$1x);
         this.y.c(wg.b(this.x + "").a(n.i));
         if ($$2 == null) {
            this.y.g(14737632);
            this.y.a(null);
            $$1.j = true;
         } else {
            this.y.g(16733525);
            this.y.a(ffa.a($$2));
            $$1.j = false;
         }
      });
      this.y.c(wg.b(this.x + "").a(n.i));
      this.c(this.y);
      this.c($$1);
      this.c(fdp.a(wf.e, $$0x -> this.d()).a(this.k / 2 + 5, this.l - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.j.a(this.u);
   }

   @Nullable
   private wg a(String $$0) {
      if ($$0.isBlank()) {
         this.x = axb.a();
         return null;
      } else {
         try {
            this.x = Integer.parseInt($$0);
            if (this.x < 1024 || this.x > 65535) {
               return r;
            } else {
               return !axb.a(this.x) ? q : null;
            }
         } catch (NumberFormatException var3) {
            this.x = axb.a();
            return r;
         }
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 50, 16777215);
      $$0.a(this.m, o, this.k / 2, 82, 16777215);
      $$0.a(this.m, p, this.k / 2, 142, 16777215);
   }
}
