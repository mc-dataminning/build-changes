import javax.annotation.Nullable;

public class fne extends fnd {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final wu c = wu.c("selectWorld.allowCommands.new");
   private static final wu q = wu.c("selectWorld.gameMode");
   private static final wu r = wu.c("lanServer.otherPlayers");
   private static final wu s = wu.c("lanServer.port");
   private static final wu u = wu.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final wu v = wu.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int w = 16733525;
   private final fnd x;
   private dca y = dca.a;
   private boolean z;
   private int A = axv.a();
   @Nullable
   private fhv B;

   public fne(fnd $$0) {
      super(wu.c("lanServer.title"));
      this.x = $$0;
   }

   @Override
   protected void aO_() {
      gtk $$0 = this.l.V();
      this.y = $$0.u_();
      this.z = $$0.bb().m();
      this.c(fht.a(dca::e).a(dca.a, dca.d, dca.b, dca.c).a(this.y).a(this.m / 2 - 155, 100, 150, 20, q, ($$0x, $$1x) -> this.y = $$1x));
      this.c(fht.b(this.z).a(this.m / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.z = $$1x));
      fhm $$1 = fhm.a(wu.c("lanServer.start"), $$1x -> {
         this.l.a(null);
         wu $$2;
         if ($$0.a(this.y, this.z, this.A)) {
            $$2 = ank.a(this.A);
         } else {
            $$2 = wu.c("commands.publish.failed");
         }

         this.l.l.d().a($$2);
         this.l.d();
      }).a(this.m / 2 - 155, this.n - 28, 150, 20).a();
      this.B = new fhv(this.o, this.m / 2 - 75, 160, 150, 20, wu.c("lanServer.port"));
      this.B.b($$1x -> {
         wu $$2 = this.a($$1x);
         this.B.c(wu.b(this.A + "").a(n.i));
         if ($$2 == null) {
            this.B.g(14737632);
            this.B.a(null);
            $$1.j = true;
         } else {
            this.B.g(16733525);
            this.B.a(fix.a($$2));
            $$1.j = false;
         }
      });
      this.B.c(wu.b(this.A + "").a(n.i));
      this.c(this.B);
      this.c($$1);
      this.c(fhm.a(wt.e, $$0x -> this.d()).a(this.m / 2 + 5, this.n - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.l.a(this.x);
   }

   @Nullable
   private wu a(String $$0) {
      if ($$0.isBlank()) {
         this.A = axv.a();
         return null;
      } else {
         try {
            this.A = Integer.parseInt($$0);
            if (this.A < 1024 || this.A > 65535) {
               return v;
            } else {
               return !axv.a(this.A) ? u : null;
            }
         } catch (NumberFormatException var3) {
            this.A = axv.a();
            return v;
         }
      }
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 50, 16777215);
      $$0.a(this.o, r, this.m / 2, 82, 16777215);
      $$0.a(this.o, s, this.m / 2, 142, 16777215);
   }
}
