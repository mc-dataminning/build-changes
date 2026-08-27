import javax.annotation.Nullable;

public class eyn extends eym {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final tn c = tn.c("selectWorld.allowCommands");
   private static final tn k = tn.c("selectWorld.gameMode");
   private static final tn l = tn.c("lanServer.otherPlayers");
   private static final tn m = tn.c("lanServer.port");
   private static final tn n = tn.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final tn o = tn.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final eym q;
   private cpu s = cpu.a;
   private boolean t;
   private int u = arq.a();
   @Nullable
   private etb v;

   public eyn(eym $$0) {
      super(tn.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void aH_() {
      gdf $$0 = this.f.T();
      this.s = $$0.t_();
      this.t = $$0.aT().o();
      this.d(esz.a(cpu::e).a(cpu.a, cpu.d, cpu.b, cpu.c).a(this.s).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.s = $$1x));
      this.d(esz.b(this.t).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.t = $$1x));
      ess $$1 = ess.a(tn.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         tn $$2;
         if ($$0.a(this.s, this.t, this.u)) {
            $$2 = ahw.a(this.u);
         } else {
            $$2 = tn.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.d();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.v = new etb(this.i, this.g / 2 - 75, 160, 150, 20, tn.c("lanServer.port"));
      this.v.b($$1x -> {
         tn $$2 = this.a($$1x);
         this.v.c(tn.b(this.u + "").a(n.i));
         if ($$2 == null) {
            this.v.m(14737632);
            this.v.a(null);
            $$1.i = true;
         } else {
            this.v.m(16733525);
            this.v.a(euc.a($$2));
            $$1.i = false;
         }
      });
      this.v.c(tn.b(this.u + "").a(n.i));
      this.d(this.v);
      this.d($$1);
      this.d(ess.a(tm.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Nullable
   private tn a(String $$0) {
      if ($$0.isBlank()) {
         this.u = arq.a();
         return null;
      } else {
         try {
            this.u = Integer.parseInt($$0);
            if (this.u < 1024 || this.u > 65535) {
               return o;
            } else {
               return !arq.a(this.u) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.u = arq.a();
            return o;
         }
      }
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
   }
}
