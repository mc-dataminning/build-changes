import javax.annotation.Nullable;

public class fle extends fld {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final wu c = wu.c("selectWorld.allowCommands.new");
   private static final wu d = wu.c("selectWorld.gameMode");
   private static final wu r = wu.c("lanServer.otherPlayers");
   private static final wu s = wu.c("lanServer.port");
   private static final wu u = wu.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final wu v = wu.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int w = 16733525;
   private final fld x;
   private daa y = daa.a;
   private boolean z;
   private int A = axq.a();
   @Nullable
   private ffn B;

   public fle(fld $$0) {
      super(wu.c("lanServer.title"));
      this.x = $$0;
   }

   @Override
   protected void aM_() {
      grd $$0 = this.m.V();
      this.y = $$0.u_();
      this.z = $$0.bb().m();
      this.c(ffl.a(daa::e).a(daa.a, daa.d, daa.b, daa.c).a(this.y).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.y = $$1x));
      this.c(ffl.b(this.z).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.z = $$1x));
      ffe $$1 = ffe.a(wu.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         wu $$2;
         if ($$0.a(this.y, this.z, this.A)) {
            $$2 = anh.a(this.A);
         } else {
            $$2 = wu.c("commands.publish.failed");
         }

         this.m.l.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.B = new ffn(this.p, this.n / 2 - 75, 160, 150, 20, wu.c("lanServer.port"));
      this.B.b($$1x -> {
         wu $$2 = this.a($$1x);
         this.B.c(wu.b(this.A + "").a(n.i));
         if ($$2 == null) {
            this.B.g(14737632);
            this.B.a(null);
            $$1.j = true;
         } else {
            this.B.g(16733525);
            this.B.a(fgp.a($$2));
            $$1.j = false;
         }
      });
      this.B.c(wu.b(this.A + "").a(n.i));
      this.c(this.B);
      this.c($$1);
      this.c(ffe.a(wt.e, $$0x -> this.d()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.m.a(this.x);
   }

   @Nullable
   private wu a(String $$0) {
      if ($$0.isBlank()) {
         this.A = axq.a();
         return null;
      } else {
         try {
            this.A = Integer.parseInt($$0);
            if (this.A < 1024 || this.A > 65535) {
               return v;
            } else {
               return !axq.a(this.A) ? u : null;
            }
         } catch (NumberFormatException var3) {
            this.A = axq.a();
            return v;
         }
      }
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, r, this.n / 2, 82, 16777215);
      $$0.a(this.p, s, this.n / 2, 142, 16777215);
   }
}
