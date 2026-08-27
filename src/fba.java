import javax.annotation.Nullable;

public class fba extends faz {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final uv c = uv.c("selectWorld.allowCommands");
   private static final uv k = uv.c("selectWorld.gameMode");
   private static final uv l = uv.c("lanServer.otherPlayers");
   private static final uv m = uv.c("lanServer.port");
   private static final uv n = uv.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final uv o = uv.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final faz q;
   private csc r = csc.a;
   private boolean t;
   private int u = ath.a();
   @Nullable
   private evn v;

   public fba(faz $$0) {
      super(uv.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void aQ_() {
      gfy $$0 = this.f.S();
      this.r = $$0.v_();
      this.t = $$0.aY().o();
      this.d(evl.a(csc::e).a(csc.a, csc.d, csc.b, csc.c).a(this.r).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.r = $$1x));
      this.d(evl.b(this.t).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.t = $$1x));
      eve $$1 = eve.a(uv.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         uv $$2;
         if ($$0.a(this.r, this.t, this.u)) {
            $$2 = ajl.a(this.u);
         } else {
            $$2 = uv.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.d();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.v = new evn(this.i, this.g / 2 - 75, 160, 150, 20, uv.c("lanServer.port"));
      this.v.b($$1x -> {
         uv $$2 = this.a($$1x);
         this.v.c(uv.b(this.u + "").a(n.i));
         if ($$2 == null) {
            this.v.m(14737632);
            this.v.a(null);
            $$1.i = true;
         } else {
            this.v.m(16733525);
            this.v.a(ewp.a($$2));
            $$1.i = false;
         }
      });
      this.v.c(uv.b(this.u + "").a(n.i));
      this.d(this.v);
      this.d($$1);
      this.d(eve.a(uu.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Nullable
   private uv a(String $$0) {
      if ($$0.isBlank()) {
         this.u = ath.a();
         return null;
      } else {
         try {
            this.u = Integer.parseInt($$0);
            if (this.u < 1024 || this.u > 65535) {
               return o;
            } else {
               return !ath.a(this.u) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.u = ath.a();
            return o;
         }
      }
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
   }
}
