import javax.annotation.Nullable;

public class foo extends fon {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final xe c = xe.c("selectWorld.allowCommands.new");
   private static final xe d = xe.c("selectWorld.gameMode");
   private static final xe r = xe.c("lanServer.otherPlayers");
   private static final xe s = xe.c("lanServer.port");
   private static final xe u = xe.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final xe v = xe.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int w = 16733525;
   private final fon x;
   private dbx y = dbx.a;
   private boolean z;
   private int A = ayd.a();
   @Nullable
   private fiw B;

   public foo(fon $$0) {
      super(xe.c("lanServer.title"));
      this.x = $$0;
   }

   @Override
   protected void aN_() {
      gvd $$0 = this.m.V();
      this.y = $$0.u_();
      this.z = $$0.bb().m();
      this.c(fiu.a(dbx::e).a(dbx.a, dbx.d, dbx.b, dbx.c).a(this.y).a(this.n / 2 - 155, 100, 150, 20, d, ($$0x, $$1x) -> this.y = $$1x));
      this.c(fiu.b(this.z).a(this.n / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.z = $$1x));
      fin $$1 = fin.a(xe.c("lanServer.start"), $$1x -> {
         this.m.a(null);
         xe $$2;
         if ($$0.a(this.y, this.z, this.A)) {
            $$2 = ant.a(this.A);
         } else {
            $$2 = xe.c("commands.publish.failed");
         }

         this.m.l.d().a($$2);
         this.m.d();
      }).a(this.n / 2 - 155, this.o - 28, 150, 20).a();
      this.B = new fiw(this.p, this.n / 2 - 75, 160, 150, 20, xe.c("lanServer.port"));
      this.B.b($$1x -> {
         xe $$2 = this.a($$1x);
         this.B.c(xe.b(this.A + "").a(n.i));
         if ($$2 == null) {
            this.B.g(14737632);
            this.B.a(null);
            $$1.j = true;
         } else {
            this.B.g(16733525);
            this.B.a(fjy.a($$2));
            $$1.j = false;
         }
      });
      this.B.c(xe.b(this.A + "").a(n.i));
      this.c(this.B);
      this.c($$1);
      this.c(fin.a(xd.e, $$0x -> this.d()).a(this.n / 2 + 5, this.o - 28, 150, 20).a());
   }

   @Override
   public void d() {
      this.m.a(this.x);
   }

   @Nullable
   private xe a(String $$0) {
      if ($$0.isBlank()) {
         this.A = ayd.a();
         return null;
      } else {
         try {
            this.A = Integer.parseInt($$0);
            if (this.A < 1024 || this.A > 65535) {
               return v;
            } else {
               return !ayd.a(this.A) ? u : null;
            }
         } catch (NumberFormatException var3) {
            this.A = ayd.a();
            return v;
         }
      }
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 50, 16777215);
      $$0.a(this.p, r, this.n / 2, 82, 16777215);
      $$0.a(this.p, s, this.n / 2, 142, 16777215);
   }
}
