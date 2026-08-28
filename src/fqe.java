import javax.annotation.Nullable;

public class fqe extends fqd {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final xd c = xd.c("selectWorld.allowCommands");
   private static final xd d = xd.c("selectWorld.gameMode");
   private static final xd s = xd.c("lanServer.otherPlayers");
   private static final xd u = xd.c("lanServer.port");
   private static final xd v = xd.a("lanServer.port.unavailable", 1024, 65535);
   private static final xd w = xd.a("lanServer.port.invalid", 1024, 65535);
   private static final int x = 16733525;
   private final fqd y;
   private ded z = ded.a;
   private boolean A;
   private int B = ayu.a();
   @Nullable
   private fkt C;

   public fqe(fqd $$0) {
      super(xd.c("lanServer.title"));
      this.y = $$0;
   }

   @Override
   protected void aR_() {
      hbj $$0 = this.m.V();
      this.z = $$0.t_();
      this.A = $$0.ba().m();
      this.c(fkr.a(ded::e).a(ded.a, ded.d, ded.b, ded.c).a(this.z).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.z = $$1x));
      this.c(fkr.b(this.A).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.A = $$1x));
      fkk $$1 = fkk.a(xd.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         xd $$2;
         if ($$0.a(this.z, this.A, this.B)) {
            $$2 = aoe.a(this.B);
         } else {
            $$2 = xd.c("commands.publish.failed");
         }

         this.m.m.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.C = new fkt(this.p, this.n / 2 - 75, 160, 150, 20, xd.c("lanServer.port"));
      this.C.b($$1x -> {
         xd $$2 = this.a($$1x);
         this.C.c(xd.b(this.B + "").a(n.i));
         if ($$2 == null) {
            this.C.g(14737632);
            this.C.a(null);
            $$1.j = true;
         } else {
            this.C.g(16733525);
            this.C.a(flv.a($$2));
            $$1.j = false;
         }
      });
      this.C.c(xd.b(this.B + "").a(n.i));
      this.c(this.C);
      this.c($$1);
      this.c(fkk.a(xc.e, $$0x -> this.d()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.m.a(this.y);
   }

   @Nullable
   private xd a(String $$0) {
      if ($$0.isBlank()) {
         this.B = ayu.a();
         return null;
      } else {
         try {
            this.B = Integer.parseInt($$0);
            if (this.B < 1024 || this.B > 65535) {
               return w;
            } else {
               return !ayu.a(this.B) ? v : null;
            }
         } catch (NumberFormatException var3) {
            this.B = ayu.a();
            return w;
         }
      }
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, s, this.n / 2, 82, 16777215);
      $$0.a(this.p, u, this.n / 2, 142, 16777215);
   }
}
