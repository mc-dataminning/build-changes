import javax.annotation.Nullable;

public class eze extends ezd {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final ui c = ui.c("selectWorld.allowCommands");
   private static final ui k = ui.c("selectWorld.gameMode");
   private static final ui l = ui.c("lanServer.otherPlayers");
   private static final ui m = ui.c("lanServer.port");
   private static final ui n = ui.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final ui o = ui.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final ezd q;
   private cqw s = cqw.a;
   private boolean t;
   private int u = asp.a();
   @Nullable
   private ets v;

   public eze(ezd $$0) {
      super(ui.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void aM_() {
      gdz $$0 = this.f.T();
      this.s = $$0.u_();
      this.t = $$0.aT().o();
      this.d(etq.a(cqw::e).a(cqw.a, cqw.d, cqw.b, cqw.c).a(this.s).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.s = $$1x));
      this.d(etq.b(this.t).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.t = $$1x));
      etj $$1 = etj.a(ui.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         ui $$2;
         if ($$0.a(this.s, this.t, this.u)) {
            $$2 = aiu.a(this.u);
         } else {
            $$2 = ui.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.d();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.v = new ets(this.i, this.g / 2 - 75, 160, 150, 20, ui.c("lanServer.port"));
      this.v.b($$1x -> {
         ui $$2 = this.a($$1x);
         this.v.c(ui.b(this.u + "").a(n.i));
         if ($$2 == null) {
            this.v.m(14737632);
            this.v.a(null);
            $$1.i = true;
         } else {
            this.v.m(16733525);
            this.v.a(euu.a($$2));
            $$1.i = false;
         }
      });
      this.v.c(ui.b(this.u + "").a(n.i));
      this.d(this.v);
      this.d($$1);
      this.d(etj.a(uh.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Nullable
   private ui a(String $$0) {
      if ($$0.isBlank()) {
         this.u = asp.a();
         return null;
      } else {
         try {
            this.u = Integer.parseInt($$0);
            if (this.u < 1024 || this.u > 65535) {
               return o;
            } else {
               return !asp.a(this.u) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.u = asp.a();
            return o;
         }
      }
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
   }
}
