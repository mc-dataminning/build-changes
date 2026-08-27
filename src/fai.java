import javax.annotation.Nullable;

public class fai extends fah {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final ur c = ur.c("selectWorld.allowCommands");
   private static final ur k = ur.c("selectWorld.gameMode");
   private static final ur l = ur.c("lanServer.otherPlayers");
   private static final ur m = ur.c("lanServer.port");
   private static final ur n = ur.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final ur o = ur.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final fah q;
   private crp r = crp.a;
   private boolean t;
   private int u = asz.a();
   @Nullable
   private euv v;

   public fai(fah $$0) {
      super(ur.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void aO_() {
      gfg $$0 = this.f.S();
      this.r = $$0.u_();
      this.t = $$0.aT().o();
      this.d(eut.a(crp::e).a(crp.a, crp.d, crp.b, crp.c).a(this.r).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.r = $$1x));
      this.d(eut.b(this.t).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.t = $$1x));
      eum $$1 = eum.a(ur.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         ur $$2;
         if ($$0.a(this.r, this.t, this.u)) {
            $$2 = aje.a(this.u);
         } else {
            $$2 = ur.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.d();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.v = new euv(this.i, this.g / 2 - 75, 160, 150, 20, ur.c("lanServer.port"));
      this.v.b($$1x -> {
         ur $$2 = this.a($$1x);
         this.v.c(ur.b(this.u + "").a(n.i));
         if ($$2 == null) {
            this.v.m(14737632);
            this.v.a(null);
            $$1.i = true;
         } else {
            this.v.m(16733525);
            this.v.a(evx.a($$2));
            $$1.i = false;
         }
      });
      this.v.c(ur.b(this.u + "").a(n.i));
      this.d(this.v);
      this.d($$1);
      this.d(eum.a(uq.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Nullable
   private ur a(String $$0) {
      if ($$0.isBlank()) {
         this.u = asz.a();
         return null;
      } else {
         try {
            this.u = Integer.parseInt($$0);
            if (this.u < 1024 || this.u > 65535) {
               return o;
            } else {
               return !asz.a(this.u) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.u = asz.a();
            return o;
         }
      }
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
   }
}
