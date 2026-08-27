import javax.annotation.Nullable;

public class fcu extends fct {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final vd c = vd.c("selectWorld.allowCommands");
   private static final vd k = vd.c("selectWorld.gameMode");
   private static final vd l = vd.c("lanServer.otherPlayers");
   private static final vd m = vd.c("lanServer.port");
   private static final vd n = vd.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final vd o = vd.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final fct q;
   private ctf r = ctf.a;
   private boolean t;
   private int u = atz.a();
   @Nullable
   private exh v;

   public fcu(fct $$0) {
      super(vd.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void aN_() {
      gie $$0 = this.f.S();
      this.r = $$0.v_();
      this.t = $$0.aY().o();
      this.d(exf.a(ctf::e).a(ctf.a, ctf.d, ctf.b, ctf.c).a(this.r).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.r = $$1x));
      this.d(exf.b(this.t).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.t = $$1x));
      ewy $$1 = ewy.a(vd.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         vd $$2;
         if ($$0.a(this.r, this.t, this.u)) {
            $$2 = akc.a(this.u);
         } else {
            $$2 = vd.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.d();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.v = new exh(this.i, this.g / 2 - 75, 160, 150, 20, vd.c("lanServer.port"));
      this.v.b($$1x -> {
         vd $$2 = this.a($$1x);
         this.v.c(vd.b(this.u + "").a(n.i));
         if ($$2 == null) {
            this.v.f(14737632);
            this.v.a(null);
            $$1.j = true;
         } else {
            this.v.f(16733525);
            this.v.a(eyj.a($$2));
            $$1.j = false;
         }
      });
      this.v.c(vd.b(this.u + "").a(n.i));
      this.d(this.v);
      this.d($$1);
      this.d(ewy.a(vc.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Nullable
   private vd a(String $$0) {
      if ($$0.isBlank()) {
         this.u = atz.a();
         return null;
      } else {
         try {
            this.u = Integer.parseInt($$0);
            if (this.u < 1024 || this.u > 65535) {
               return o;
            } else {
               return !atz.a(this.u) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.u = atz.a();
            return o;
         }
      }
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
   }
}
