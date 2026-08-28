import javax.annotation.Nullable;

public class fne extends fnd {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final xp c = xp.c("selectWorld.allowCommands.new");
   private static final xp d = xp.c("selectWorld.gameMode");
   private static final xp r = xp.c("lanServer.otherPlayers");
   private static final xp s = xp.c("lanServer.port");
   private static final xp u = xp.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final xp v = xp.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int w = 16733525;
   private final fnd x;
   private dbv y = dbv.a;
   private boolean z;
   private int A = ayq.a();
   @Nullable
   private fhn B;

   public fne(fnd $$0) {
      super(xp.c("lanServer.title"));
      this.x = $$0;
   }

   @Override
   protected void aM_() {
      gte $$0 = this.m.V();
      this.y = $$0.u_();
      this.z = $$0.bb().m();
      this.c(fhl.a(dbv::e).a(dbv.a, dbv.d, dbv.b, dbv.c).a(this.y).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.y = $$1x));
      this.c(fhl.b(this.z).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.z = $$1x));
      fhe $$1 = fhe.a(xp.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         xp $$2;
         if ($$0.a(this.y, this.z, this.A)) {
            $$2 = aof.a(this.A);
         } else {
            $$2 = xp.c("commands.publish.failed");
         }

         this.m.l.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.B = new fhn(this.p, this.n / 2 - 75, 160, 150, 20, xp.c("lanServer.port"));
      this.B.b($$1x -> {
         xp $$2 = this.a($$1x);
         this.B.c(xp.b(this.A + "").a(n.i));
         if ($$2 == null) {
            this.B.g(14737632);
            this.B.a(null);
            $$1.j = true;
         } else {
            this.B.g(16733525);
            this.B.a(fip.a($$2));
            $$1.j = false;
         }
      });
      this.B.c(xp.b(this.A + "").a(n.i));
      this.c(this.B);
      this.c($$1);
      this.c(fhe.a(xo.e, $$0x -> this.d()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.m.a(this.x);
   }

   @Nullable
   private xp a(String $$0) {
      if ($$0.isBlank()) {
         this.A = ayq.a();
         return null;
      } else {
         try {
            this.A = Integer.parseInt($$0);
            if (this.A < 1024 || this.A > 65535) {
               return v;
            } else {
               return !ayq.a(this.A) ? u : null;
            }
         } catch (NumberFormatException var3) {
            this.A = ayq.a();
            return v;
         }
      }
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, r, this.n / 2, 82, 16777215);
      $$0.a(this.p, s, this.n / 2, 142, 16777215);
   }
}
