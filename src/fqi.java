import javax.annotation.Nullable;

public class fqi extends fqh {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final xe c = xe.c("selectWorld.allowCommands");
   private static final xe d = xe.c("selectWorld.gameMode");
   private static final xe s = xe.c("lanServer.otherPlayers");
   private static final xe u = xe.c("lanServer.port");
   private static final xe v = xe.a("lanServer.port.unavailable", 1024, 65535);
   private static final xe w = xe.a("lanServer.port.invalid", 1024, 65535);
   private static final int x = 16733525;
   private final fqh y;
   private deg z = deg.a;
   private boolean A;
   private int B = ayw.a();
   @Nullable
   private fkx C;

   public fqi(fqh $$0) {
      super(xe.c("lanServer.title"));
      this.y = $$0;
   }

   @Override
   protected void aS_() {
      hbo $$0 = this.m.V();
      this.z = $$0.u_();
      this.A = $$0.ba().m();
      this.c(fkv.a(deg::e).a(deg.a, deg.d, deg.b, deg.c).a(this.z).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.z = $$1x));
      this.c(fkv.b(this.A).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.A = $$1x));
      fko $$1 = fko.a(xe.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         xe $$2;
         if ($$0.a(this.z, this.A, this.B)) {
            $$2 = aog.a(this.B);
         } else {
            $$2 = xe.c("commands.publish.failed");
         }

         this.m.m.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.C = new fkx(this.p, this.n / 2 - 75, 160, 150, 20, xe.c("lanServer.port"));
      this.C.b($$1x -> {
         xe $$2 = this.a($$1x);
         this.C.c(xe.b(this.B + "").a(n.i));
         if ($$2 == null) {
            this.C.g(14737632);
            this.C.a(null);
            $$1.j = true;
         } else {
            this.C.g(16733525);
            this.C.a(flz.a($$2));
            $$1.j = false;
         }
      });
      this.C.c(xe.b(this.B + "").a(n.i));
      this.c(this.C);
      this.c($$1);
      this.c(fko.a(xd.e, $$0x -> this.d()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.m.a(this.y);
   }

   @Nullable
   private xe a(String $$0) {
      if ($$0.isBlank()) {
         this.B = ayw.a();
         return null;
      } else {
         try {
            this.B = Integer.parseInt($$0);
            if (this.B < 1024 || this.B > 65535) {
               return w;
            } else {
               return !ayw.a(this.B) ? v : null;
            }
         } catch (NumberFormatException var3) {
            this.B = ayw.a();
            return w;
         }
      }
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, s, this.n / 2, 82, 16777215);
      $$0.a(this.p, u, this.n / 2, 142, 16777215);
   }
}
