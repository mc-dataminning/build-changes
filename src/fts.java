import javax.annotation.Nullable;

public class fts extends ftr {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final xv c = xv.c("selectWorld.allowCommands");
   private static final xv d = xv.c("selectWorld.gameMode");
   private static final xv s = xv.c("lanServer.otherPlayers");
   private static final xv u = xv.c("lanServer.port");
   private static final xv v = xv.a("lanServer.port.unavailable", 1024, 65535);
   private static final xv w = xv.a("lanServer.port.invalid", 1024, 65535);
   private static final int x = 16733525;
   private final ftr y;
   private dgx z = dgx.a;
   private boolean A;
   private int B = azv.a();
   @Nullable
   private foh C;

   public fts(ftr $$0) {
      super(xv.c("lanServer.title"));
      this.y = $$0;
   }

   @Override
   protected void aT_() {
      hfp $$0 = this.m.V();
      this.z = $$0.u();
      this.A = $$0.aZ().m();
      this.c(fof.a(dgx::e).a(dgx.a, dgx.d, dgx.b, dgx.c).a(this.z).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.z = $$1x));
      this.c(fof.b(this.A).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.A = $$1x));
      fny $$1 = fny.a(xv.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         xv $$2;
         if ($$0.a(this.z, this.A, this.B)) {
            $$2 = apc.a(this.B);
         } else {
            $$2 = xv.c("commands.publish.failed");
         }

         this.m.m.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.C = new foh(this.p, this.n / 2 - 75, 160, 150, 20, xv.c("lanServer.port"));
      this.C.b($$1x -> {
         xv $$2 = this.a($$1x);
         this.C.c(xv.b(this.B + "").a(n.i));
         if ($$2 == null) {
            this.C.g(14737632);
            this.C.a(null);
            $$1.j = true;
         } else {
            this.C.g(16733525);
            this.C.a(fpk.a($$2));
            $$1.j = false;
         }
      });
      this.C.c(xv.b(this.B + "").a(n.i));
      this.c(this.C);
      this.c($$1);
      this.c(fny.a(xu.e, $$0x -> this.aP_()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void aP_() {
      this.m.a(this.y);
   }

   @Nullable
   private xv a(String $$0) {
      if ($$0.isBlank()) {
         this.B = azv.a();
         return null;
      } else {
         try {
            this.B = Integer.parseInt($$0);
            if (this.B < 1024 || this.B > 65535) {
               return w;
            } else {
               return !azv.a(this.B) ? v : null;
            }
         } catch (NumberFormatException var3) {
            this.B = azv.a();
            return w;
         }
      }
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, s, this.n / 2, 82, 16777215);
      $$0.a(this.p, u, this.n / 2, 142, 16777215);
   }
}
