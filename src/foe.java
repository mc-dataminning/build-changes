import javax.annotation.Nullable;

public class foe extends fod {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final wz c = wz.c("selectWorld.allowCommands.new");
   private static final wz r = wz.c("selectWorld.gameMode");
   private static final wz s = wz.c("lanServer.otherPlayers");
   private static final wz u = wz.c("lanServer.port");
   private static final wz v = wz.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final wz w = wz.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int x = 16733525;
   private final fod y;
   private dct z = dct.a;
   private boolean A;
   private int B = ayf.a();
   @Nullable
   private fiv C;

   public foe(fod $$0) {
      super(wz.c("lanServer.title"));
      this.y = $$0;
   }

   @Override
   protected void aT_() {
      guo $$0 = this.l.V();
      this.z = $$0.u_();
      this.A = $$0.bb().m();
      this.c(fit.a(dct::e).a(dct.a, dct.d, dct.b, dct.c).a(this.z).a(this.m / 2 - 155, 100, 150, 20, r, ($$0x, $$1x) -> this.z = $$1x));
      this.c(fit.b(this.A).a(this.m / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.A = $$1x));
      fim $$1 = fim.a(wz.c("lanServer.start"), $$1x -> {
         this.l.a(null);
         wz $$2;
         if ($$0.a(this.z, this.A, this.B)) {
            $$2 = ans.a(this.B);
         } else {
            $$2 = wz.c("commands.publish.failed");
         }

         this.l.l.d().a($$2);
         this.l.d();
      }).a(this.m / 2 - 155, this.n - 28, 150, 20).a();
      this.C = new fiv(this.o, this.m / 2 - 75, 160, 150, 20, wz.c("lanServer.port"));
      this.C.b($$1x -> {
         wz $$2 = this.a($$1x);
         this.C.c(wz.b(this.B + "").a(n.i));
         if ($$2 == null) {
            this.C.g(14737632);
            this.C.a(null);
            $$1.j = true;
         } else {
            this.C.g(16733525);
            this.C.a(fjx.a($$2));
            $$1.j = false;
         }
      });
      this.C.c(wz.b(this.B + "").a(n.i));
      this.c(this.C);
      this.c($$1);
      this.c(fim.a(wy.e, $$0x -> this.d()).a(this.m / 2 + 5, this.n - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.l.a(this.y);
   }

   @Nullable
   private wz a(String $$0) {
      if ($$0.isBlank()) {
         this.B = ayf.a();
         return null;
      } else {
         try {
            this.B = Integer.parseInt($$0);
            if (this.B < 1024 || this.B > 65535) {
               return w;
            } else {
               return !ayf.a(this.B) ? v : null;
            }
         } catch (NumberFormatException var3) {
            this.B = ayf.a();
            return w;
         }
      }
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 50, 16777215);
      $$0.a(this.o, s, this.m / 2, 82, 16777215);
      $$0.a(this.o, u, this.m / 2, 142, 16777215);
   }
}
