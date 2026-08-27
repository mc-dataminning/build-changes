import javax.annotation.Nullable;

public class fdb extends fda {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final vf c = vf.c("selectWorld.allowCommands");
   private static final vf k = vf.c("selectWorld.gameMode");
   private static final vf l = vf.c("lanServer.otherPlayers");
   private static final vf m = vf.c("lanServer.port");
   private static final vf n = vf.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final vf o = vf.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final fda q;
   private ctl r = ctl.a;
   private boolean t;
   private int u = aue.a();
   @Nullable
   private exo v;

   public fdb(fda $$0) {
      super(vf.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void aN_() {
      giq $$0 = this.f.T();
      this.r = $$0.v_();
      this.t = $$0.aY().o();
      this.d(exm.a(ctl::e).a(ctl.a, ctl.d, ctl.b, ctl.c).a(this.r).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.r = $$1x));
      this.d(exm.b(this.t).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.t = $$1x));
      exf $$1 = exf.a(vf.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         vf $$2;
         if ($$0.a(this.r, this.t, this.u)) {
            $$2 = akf.a(this.u);
         } else {
            $$2 = vf.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.d();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.v = new exo(this.i, this.g / 2 - 75, 160, 150, 20, vf.c("lanServer.port"));
      this.v.b($$1x -> {
         vf $$2 = this.a($$1x);
         this.v.c(vf.b(this.u + "").a(n.i));
         if ($$2 == null) {
            this.v.g(14737632);
            this.v.a(null);
            $$1.j = true;
         } else {
            this.v.g(16733525);
            this.v.a(eyq.a($$2));
            $$1.j = false;
         }
      });
      this.v.c(vf.b(this.u + "").a(n.i));
      this.d(this.v);
      this.d($$1);
      this.d(exf.a(ve.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Nullable
   private vf a(String $$0) {
      if ($$0.isBlank()) {
         this.u = aue.a();
         return null;
      } else {
         try {
            this.u = Integer.parseInt($$0);
            if (this.u < 1024 || this.u > 65535) {
               return o;
            } else {
               return !aue.a(this.u) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.u = aue.a();
            return o;
         }
      }
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
   }
}
