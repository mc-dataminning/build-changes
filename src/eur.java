import javax.annotation.Nullable;

public class eur extends euq {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final sw c = sw.c("selectWorld.allowCommands");
   private static final sw k = sw.c("selectWorld.gameMode");
   private static final sw l = sw.c("lanServer.otherPlayers");
   private static final sw m = sw.c("lanServer.port");
   private static final sw n = sw.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final sw o = sw.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final euq q;
   private cmj r = cmj.a;
   private boolean s;
   private int t = aos.a();
   @Nullable
   private epr u;

   public eur(euq $$0) {
      super(sw.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void b() {
      fyp $$0 = this.f.S();
      this.r = $$0.o_();
      this.s = $$0.aU().o();
      this.d(epp.a(cmj::e).a(cmj.a, cmj.d, cmj.b, cmj.c).a(this.r).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.r = $$1x));
      this.d(epp.b(this.s).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.s = $$1x));
      epi $$1 = epi.a(sw.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         sw $$2;
         if ($$0.a(this.r, this.s, this.t)) {
            $$2 = afm.a(this.t);
         } else {
            $$2 = sw.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.c();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.u = new epr(this.i, this.g / 2 - 75, 160, 150, 20, sw.c("lanServer.port"));
      this.u.b($$1x -> {
         sw $$2 = this.a($$1x);
         this.u.c(sw.b(this.t + "").a(n.i));
         if ($$2 == null) {
            this.u.n(14737632);
            this.u.a(null);
            $$1.r = true;
         } else {
            this.u.n(16733525);
            this.u.a(eqp.a($$2));
            $$1.r = false;
         }
      });
      this.u.c(sw.b(this.t + "").a(n.i));
      this.d(this.u);
      this.d($$1);
      this.d(epi.a(sv.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Override
   public void f() {
      super.f();
      if (this.u != null) {
         this.u.a();
      }
   }

   @Nullable
   private sw a(String $$0) {
      if ($$0.isBlank()) {
         this.t = aos.a();
         return null;
      } else {
         try {
            this.t = Integer.parseInt($$0);
            if (this.t < 1024 || this.t > 65535) {
               return o;
            } else {
               return !aos.a(this.t) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.t = aos.a();
            return o;
         }
      }
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
      super.a($$0, $$1, $$2, $$3);
   }
}
