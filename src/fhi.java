import javax.annotation.Nullable;

public class fhi extends fhh {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final vu c = vu.c("selectWorld.allowCommands.new");
   private static final vu k = vu.c("selectWorld.gameMode");
   private static final vu l = vu.c("lanServer.otherPlayers");
   private static final vu m = vu.c("lanServer.port");
   private static final vu n = vu.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final vu o = vu.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final fhh q;
   private cwy r = cwy.a;
   private boolean t;
   private int u = awn.a();
   @Nullable
   private fbr v;

   public fhi(fhh $$0) {
      super(vu.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void aO_() {
      gng $$0 = this.f.V();
      this.r = $$0.u_();
      this.t = $$0.bc().m();
      this.c(fbp.a(cwy::e).a(cwy.a, cwy.d, cwy.b, cwy.c).a(this.r).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.r = $$1x));
      this.c(fbp.b(this.t).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.t = $$1x));
      fbi $$1 = fbi.a(vu.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         vu $$2;
         if ($$0.a(this.r, this.t, this.u)) {
            $$2 = amg.a(this.u);
         } else {
            $$2 = vu.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.d();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.v = new fbr(this.i, this.g / 2 - 75, 160, 150, 20, vu.c("lanServer.port"));
      this.v.b($$1x -> {
         vu $$2 = this.a($$1x);
         this.v.c(vu.b(this.u + "").a(n.i));
         if ($$2 == null) {
            this.v.g(14737632);
            this.v.a(null);
            $$1.j = true;
         } else {
            this.v.g(16733525);
            this.v.a(fct.a($$2));
            $$1.j = false;
         }
      });
      this.v.c(vu.b(this.u + "").a(n.i));
      this.c(this.v);
      this.c($$1);
      this.c(fbi.a(vt.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Nullable
   private vu a(String $$0) {
      if ($$0.isBlank()) {
         this.u = awn.a();
         return null;
      } else {
         try {
            this.u = Integer.parseInt($$0);
            if (this.u < 1024 || this.u > 65535) {
               return o;
            } else {
               return !awn.a(this.u) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.u = awn.a();
            return o;
         }
      }
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
   }
}
