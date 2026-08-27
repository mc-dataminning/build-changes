import javax.annotation.Nullable;

public class fgi extends fgh {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final vs c = vs.c("selectWorld.allowCommands.new");
   private static final vs k = vs.c("selectWorld.gameMode");
   private static final vs l = vs.c("lanServer.otherPlayers");
   private static final vs m = vs.c("lanServer.port");
   private static final vs n = vs.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final vs o = vs.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final fgh q;
   private cwb r = cwb.a;
   private boolean t;
   private int u = awd.a();
   @Nullable
   private fat v;

   public fgi(fgh $$0) {
      super(vs.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void aP_() {
      gmd $$0 = this.f.U();
      this.r = $$0.v_();
      this.t = $$0.bc().m();
      this.c(far.a(cwb::e).a(cwb.a, cwb.d, cwb.b, cwb.c).a(this.r).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.r = $$1x));
      this.c(far.b(this.t).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.t = $$1x));
      fak $$1 = fak.a(vs.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         vs $$2;
         if ($$0.a(this.r, this.t, this.u)) {
            $$2 = amb.a(this.u);
         } else {
            $$2 = vs.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.d();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.v = new fat(this.i, this.g / 2 - 75, 160, 150, 20, vs.c("lanServer.port"));
      this.v.b($$1x -> {
         vs $$2 = this.a($$1x);
         this.v.c(vs.b(this.u + "").a(n.i));
         if ($$2 == null) {
            this.v.g(14737632);
            this.v.a(null);
            $$1.j = true;
         } else {
            this.v.g(16733525);
            this.v.a(fbv.a($$2));
            $$1.j = false;
         }
      });
      this.v.c(vs.b(this.u + "").a(n.i));
      this.c(this.v);
      this.c($$1);
      this.c(fak.a(vr.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Nullable
   private vs a(String $$0) {
      if ($$0.isBlank()) {
         this.u = awd.a();
         return null;
      } else {
         try {
            this.u = Integer.parseInt($$0);
            if (this.u < 1024 || this.u > 65535) {
               return o;
            } else {
               return !awd.a(this.u) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.u = awd.a();
            return o;
         }
      }
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
   }
}
