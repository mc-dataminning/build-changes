import javax.annotation.Nullable;

public class eyl extends eyk {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final tl c = tl.c("selectWorld.allowCommands");
   private static final tl k = tl.c("selectWorld.gameMode");
   private static final tl l = tl.c("lanServer.otherPlayers");
   private static final tl m = tl.c("lanServer.port");
   private static final tl n = tl.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final tl o = tl.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final eyk q;
   private cps s = cps.a;
   private boolean t;
   private int u = arp.a();
   @Nullable
   private esz v;

   public eyl(eyk $$0) {
      super(tl.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void aI_() {
      gdd $$0 = this.f.T();
      this.s = $$0.t_();
      this.t = $$0.aT().o();
      this.d(esx.a(cps::e).a(cps.a, cps.d, cps.b, cps.c).a(this.s).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.s = $$1x));
      this.d(esx.b(this.t).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.t = $$1x));
      esq $$1 = esq.a(tl.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         tl $$2;
         if ($$0.a(this.s, this.t, this.u)) {
            $$2 = ahv.a(this.u);
         } else {
            $$2 = tl.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.d();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.v = new esz(this.i, this.g / 2 - 75, 160, 150, 20, tl.c("lanServer.port"));
      this.v.b($$1x -> {
         tl $$2 = this.a($$1x);
         this.v.c(tl.b(this.u + "").a(n.i));
         if ($$2 == null) {
            this.v.m(14737632);
            this.v.a(null);
            $$1.i = true;
         } else {
            this.v.m(16733525);
            this.v.a(eua.a($$2));
            $$1.i = false;
         }
      });
      this.v.c(tl.b(this.u + "").a(n.i));
      this.d(this.v);
      this.d($$1);
      this.d(esq.a(tk.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Nullable
   private tl a(String $$0) {
      if ($$0.isBlank()) {
         this.u = arp.a();
         return null;
      } else {
         try {
            this.u = Integer.parseInt($$0);
            if (this.u < 1024 || this.u > 65535) {
               return o;
            } else {
               return !arp.a(this.u) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.u = arp.a();
            return o;
         }
      }
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
   }
}
