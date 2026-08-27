import javax.annotation.Nullable;

public class fcd extends fcc {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final vb c = vb.c("selectWorld.allowCommands");
   private static final vb k = vb.c("selectWorld.gameMode");
   private static final vb l = vb.c("lanServer.otherPlayers");
   private static final vb m = vb.c("lanServer.port");
   private static final vb n = vb.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final vb o = vb.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final fcc q;
   private csv r = csv.a;
   private boolean t;
   private int u = atp.a();
   @Nullable
   private ewq v;

   public fcd(fcc $$0) {
      super(vb.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void aP_() {
      ghn $$0 = this.f.S();
      this.r = $$0.v_();
      this.t = $$0.aY().o();
      this.d(ewo.a(csv::e).a(csv.a, csv.d, csv.b, csv.c).a(this.r).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.r = $$1x));
      this.d(ewo.b(this.t).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.t = $$1x));
      ewh $$1 = ewh.a(vb.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         vb $$2;
         if ($$0.a(this.r, this.t, this.u)) {
            $$2 = ajs.a(this.u);
         } else {
            $$2 = vb.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.d();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.v = new ewq(this.i, this.g / 2 - 75, 160, 150, 20, vb.c("lanServer.port"));
      this.v.b($$1x -> {
         vb $$2 = this.a($$1x);
         this.v.c(vb.b(this.u + "").a(n.i));
         if ($$2 == null) {
            this.v.m(14737632);
            this.v.a(null);
            $$1.i = true;
         } else {
            this.v.m(16733525);
            this.v.a(exs.a($$2));
            $$1.i = false;
         }
      });
      this.v.c(vb.b(this.u + "").a(n.i));
      this.d(this.v);
      this.d($$1);
      this.d(ewh.a(va.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Nullable
   private vb a(String $$0) {
      if ($$0.isBlank()) {
         this.u = atp.a();
         return null;
      } else {
         try {
            this.u = Integer.parseInt($$0);
            if (this.u < 1024 || this.u > 65535) {
               return o;
            } else {
               return !atp.a(this.u) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.u = atp.a();
            return o;
         }
      }
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
   }
}
