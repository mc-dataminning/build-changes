import javax.annotation.Nullable;

public class eyg extends eyf {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final ti c = ti.c("selectWorld.allowCommands");
   private static final ti k = ti.c("selectWorld.gameMode");
   private static final ti l = ti.c("lanServer.otherPlayers");
   private static final ti m = ti.c("lanServer.port");
   private static final ti n = ti.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final ti o = ti.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final eyf q;
   private cpn s = cpn.a;
   private boolean t;
   private int u = ark.a();
   @Nullable
   private esu v;

   public eyg(eyf $$0) {
      super(ti.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void aD_() {
      gcy $$0 = this.f.T();
      this.s = $$0.o_();
      this.t = $$0.aT().o();
      this.d(ess.a(cpn::e).a(cpn.a, cpn.d, cpn.b, cpn.c).a(this.s).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.s = $$1x));
      this.d(ess.b(this.t).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.t = $$1x));
      esl $$1 = esl.a(ti.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         ti $$2;
         if ($$0.a(this.s, this.t, this.u)) {
            $$2 = ahs.a(this.u);
         } else {
            $$2 = ti.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.d();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.v = new esu(this.i, this.g / 2 - 75, 160, 150, 20, ti.c("lanServer.port"));
      this.v.b($$1x -> {
         ti $$2 = this.a($$1x);
         this.v.c(ti.b(this.u + "").a(n.i));
         if ($$2 == null) {
            this.v.m(14737632);
            this.v.a(null);
            $$1.i = true;
         } else {
            this.v.m(16733525);
            this.v.a(etv.a($$2));
            $$1.i = false;
         }
      });
      this.v.c(ti.b(this.u + "").a(n.i));
      this.d(this.v);
      this.d($$1);
      this.d(esl.a(th.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Nullable
   private ti a(String $$0) {
      if ($$0.isBlank()) {
         this.u = ark.a();
         return null;
      } else {
         try {
            this.u = Integer.parseInt($$0);
            if (this.u < 1024 || this.u > 65535) {
               return o;
            } else {
               return !ark.a(this.u) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.u = ark.a();
            return o;
         }
      }
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
   }
}
