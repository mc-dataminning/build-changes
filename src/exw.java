import javax.annotation.Nullable;

public class exw extends exv {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final te c = te.c("selectWorld.allowCommands");
   private static final te k = te.c("selectWorld.gameMode");
   private static final te l = te.c("lanServer.otherPlayers");
   private static final te m = te.c("lanServer.port");
   private static final te n = te.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final te o = te.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final exv q;
   private cph s = cph.a;
   private boolean t;
   private int u = arg.a();
   @Nullable
   private esr v;

   public exw(exv $$0) {
      super(te.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void aE_() {
      gcf $$0 = this.f.S();
      this.s = $$0.o_();
      this.t = $$0.aU().o();
      this.d(esp.a(cph::e).a(cph.a, cph.d, cph.b, cph.c).a(this.s).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.s = $$1x));
      this.d(esp.b(this.t).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.t = $$1x));
      esi $$1 = esi.a(te.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         te $$2;
         if ($$0.a(this.s, this.t, this.u)) {
            $$2 = ahn.a(this.u);
         } else {
            $$2 = te.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.c();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.v = new esr(this.i, this.g / 2 - 75, 160, 150, 20, te.c("lanServer.port"));
      this.v.b($$1x -> {
         te $$2 = this.a($$1x);
         this.v.c(te.b(this.u + "").a(n.i));
         if ($$2 == null) {
            this.v.l(14737632);
            this.v.a(null);
            $$1.i = true;
         } else {
            this.v.l(16733525);
            this.v.a(etr.a($$2));
            $$1.i = false;
         }
      });
      this.v.c(te.b(this.u + "").a(n.i));
      this.d(this.v);
      this.d($$1);
      this.d(esi.a(td.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Nullable
   private te a(String $$0) {
      if ($$0.isBlank()) {
         this.u = arg.a();
         return null;
      } else {
         try {
            this.u = Integer.parseInt($$0);
            if (this.u < 1024 || this.u > 65535) {
               return o;
            } else {
               return !arg.a(this.u) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.u = arg.a();
            return o;
         }
      }
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
   }
}
