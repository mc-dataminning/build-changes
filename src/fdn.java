import javax.annotation.Nullable;

public class fdn extends fdm {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final vg c = vg.c("selectWorld.allowCommands");
   private static final vg k = vg.c("selectWorld.gameMode");
   private static final vg l = vg.c("lanServer.otherPlayers");
   private static final vg m = vg.c("lanServer.port");
   private static final vg n = vg.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final vg o = vg.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final fdm q;
   private ctu r = ctu.a;
   private boolean t;
   private int u = aug.a();
   @Nullable
   private eya v;

   public fdn(fdm $$0) {
      super(vg.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void aP_() {
      gjf $$0 = this.f.T();
      this.r = $$0.v_();
      this.t = $$0.aY().o();
      this.d(exy.a(ctu::e).a(ctu.a, ctu.d, ctu.b, ctu.c).a(this.r).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.r = $$1x));
      this.d(exy.b(this.t).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.t = $$1x));
      exr $$1 = exr.a(vg.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         vg $$2;
         if ($$0.a(this.r, this.t, this.u)) {
            $$2 = akg.a(this.u);
         } else {
            $$2 = vg.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.d();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.v = new eya(this.i, this.g / 2 - 75, 160, 150, 20, vg.c("lanServer.port"));
      this.v.b($$1x -> {
         vg $$2 = this.a($$1x);
         this.v.c(vg.b(this.u + "").a(n.i));
         if ($$2 == null) {
            this.v.g(14737632);
            this.v.a(null);
            $$1.j = true;
         } else {
            this.v.g(16733525);
            this.v.a(ezc.a($$2));
            $$1.j = false;
         }
      });
      this.v.c(vg.b(this.u + "").a(n.i));
      this.d(this.v);
      this.d($$1);
      this.d(exr.a(vf.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Nullable
   private vg a(String $$0) {
      if ($$0.isBlank()) {
         this.u = aug.a();
         return null;
      } else {
         try {
            this.u = Integer.parseInt($$0);
            if (this.u < 1024 || this.u > 65535) {
               return o;
            } else {
               return !aug.a(this.u) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.u = aug.a();
            return o;
         }
      }
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
   }
}
