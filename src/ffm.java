import javax.annotation.Nullable;

public class ffm extends ffl {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final vq c = vq.c("selectWorld.allowCommands.new");
   private static final vq k = vq.c("selectWorld.gameMode");
   private static final vq l = vq.c("lanServer.otherPlayers");
   private static final vq m = vq.c("lanServer.port");
   private static final vq n = vq.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final vq o = vq.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final ffl q;
   private cvo r = cvo.a;
   private boolean t;
   private int u = avz.a();
   @Nullable
   private ezx v;

   public ffm(ffl $$0) {
      super(vq.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void aQ_() {
      glf $$0 = this.f.U();
      this.r = $$0.v_();
      this.t = $$0.ba().m();
      this.c(ezv.a(cvo::e).a(cvo.a, cvo.d, cvo.b, cvo.c).a(this.r).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.r = $$1x));
      this.c(ezv.b(this.t).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.t = $$1x));
      ezo $$1 = ezo.a(vq.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         vq $$2;
         if ($$0.a(this.r, this.t, this.u)) {
            $$2 = alx.a(this.u);
         } else {
            $$2 = vq.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.d();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.v = new ezx(this.i, this.g / 2 - 75, 160, 150, 20, vq.c("lanServer.port"));
      this.v.b($$1x -> {
         vq $$2 = this.a($$1x);
         this.v.c(vq.b(this.u + "").a(n.i));
         if ($$2 == null) {
            this.v.g(14737632);
            this.v.a(null);
            $$1.j = true;
         } else {
            this.v.g(16733525);
            this.v.a(faz.a($$2));
            $$1.j = false;
         }
      });
      this.v.c(vq.b(this.u + "").a(n.i));
      this.c(this.v);
      this.c($$1);
      this.c(ezo.a(vp.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Nullable
   private vq a(String $$0) {
      if ($$0.isBlank()) {
         this.u = avz.a();
         return null;
      } else {
         try {
            this.u = Integer.parseInt($$0);
            if (this.u < 1024 || this.u > 65535) {
               return o;
            } else {
               return !avz.a(this.u) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.u = avz.a();
            return o;
         }
      }
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
   }
}
