import javax.annotation.Nullable;

public class fqt extends fqs {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final xh c = xh.c("selectWorld.allowCommands");
   private static final xh d = xh.c("selectWorld.gameMode");
   private static final xh s = xh.c("lanServer.otherPlayers");
   private static final xh u = xh.c("lanServer.port");
   private static final xh v = xh.a("lanServer.port.unavailable", 1024, 65535);
   private static final xh w = xh.a("lanServer.port.invalid", 1024, 65535);
   private static final int x = 16733525;
   private final fqs y;
   private des z = des.a;
   private boolean A;
   private int B = aza.a();
   @Nullable
   private fli C;

   public fqt(fqs $$0) {
      super(xh.c("lanServer.title"));
      this.y = $$0;
   }

   @Override
   protected void aS_() {
      hcd $$0 = this.m.V();
      this.z = $$0.u_();
      this.A = $$0.ba().m();
      this.c(flg.a(des::e).a(des.a, des.d, des.b, des.c).a(this.z).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.z = $$1x));
      this.c(flg.b(this.A).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.A = $$1x));
      fkz $$1 = fkz.a(xh.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         xh $$2;
         if ($$0.a(this.z, this.A, this.B)) {
            $$2 = aoj.a(this.B);
         } else {
            $$2 = xh.c("commands.publish.failed");
         }

         this.m.m.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.C = new fli(this.p, this.n / 2 - 75, 160, 150, 20, xh.c("lanServer.port"));
      this.C.b($$1x -> {
         xh $$2 = this.a($$1x);
         this.C.c(xh.b(this.B + "").a(n.i));
         if ($$2 == null) {
            this.C.g(14737632);
            this.C.a(null);
            $$1.j = true;
         } else {
            this.C.g(16733525);
            this.C.a(fmk.a($$2));
            $$1.j = false;
         }
      });
      this.C.c(xh.b(this.B + "").a(n.i));
      this.c(this.C);
      this.c($$1);
      this.c(fkz.a(xg.e, $$0x -> this.d()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.m.a(this.y);
   }

   @Nullable
   private xh a(String $$0) {
      if ($$0.isBlank()) {
         this.B = aza.a();
         return null;
      } else {
         try {
            this.B = Integer.parseInt($$0);
            if (this.B < 1024 || this.B > 65535) {
               return w;
            } else {
               return !aza.a(this.B) ? v : null;
            }
         } catch (NumberFormatException var3) {
            this.B = aza.a();
            return w;
         }
      }
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, s, this.n / 2, 82, 16777215);
      $$0.a(this.p, u, this.n / 2, 142, 16777215);
   }
}
