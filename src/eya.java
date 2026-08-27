import javax.annotation.Nullable;

public class eya extends exz {
   private static final int a = 1024;
   private static final int b = 65535;
   private static final tf c = tf.c("selectWorld.allowCommands");
   private static final tf k = tf.c("selectWorld.gameMode");
   private static final tf l = tf.c("lanServer.otherPlayers");
   private static final tf m = tf.c("lanServer.port");
   private static final tf n = tf.a("lanServer.port.unavailable.new", 1024, 65535);
   private static final tf o = tf.a("lanServer.port.invalid.new", 1024, 65535);
   private static final int p = 16733525;
   private final exz q;
   private cpj s = cpj.a;
   private boolean t;
   private int u = arh.a();
   @Nullable
   private esq v;

   public eya(exz $$0) {
      super(tf.c("lanServer.title"));
      this.q = $$0;
   }

   @Override
   protected void aE_() {
      gck $$0 = this.f.T();
      this.s = $$0.o_();
      this.t = $$0.aU().o();
      this.d(eso.a(cpj::e).a(cpj.a, cpj.d, cpj.b, cpj.c).a(this.s).a(this.g / 2 - 155, 100, 150, 20, k, ($$0x, $$1x) -> this.s = $$1x));
      this.d(eso.b(this.t).a(this.g / 2 + 5, 100, 150, 20, c, ($$0x, $$1x) -> this.t = $$1x));
      esh $$1 = esh.a(tf.c("lanServer.start"), $$1x -> {
         this.f.a(null);
         tf $$2;
         if ($$0.a(this.s, this.t, this.u)) {
            $$2 = ahp.a(this.u);
         } else {
            $$2 = tf.c("commands.publish.failed");
         }

         this.f.l.d().a($$2);
         this.f.d();
      }).a(this.g / 2 - 155, this.h - 28, 150, 20).a();
      this.v = new esq(this.i, this.g / 2 - 75, 160, 150, 20, tf.c("lanServer.port"));
      this.v.b($$1x -> {
         tf $$2 = this.a($$1x);
         this.v.c(tf.b(this.u + "").a(n.i));
         if ($$2 == null) {
            this.v.l(14737632);
            this.v.a(null);
            $$1.i = true;
         } else {
            this.v.l(16733525);
            this.v.a(etq.a($$2));
            $$1.i = false;
         }
      });
      this.v.c(tf.b(this.u + "").a(n.i));
      this.d(this.v);
      this.d($$1);
      this.d(esh.a(te.e, $$0x -> this.f.a(this.q)).a(this.g / 2 + 5, this.h - 28, 150, 20).a());
   }

   @Nullable
   private tf a(String $$0) {
      if ($$0.isBlank()) {
         this.u = arh.a();
         return null;
      } else {
         try {
            this.u = Integer.parseInt($$0);
            if (this.u < 1024 || this.u > 65535) {
               return o;
            } else {
               return !arh.a(this.u) ? n : null;
            }
         } catch (NumberFormatException var3) {
            this.u = arh.a();
            return o;
         }
      }
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 50, 16777215);
      $$0.a(this.i, l, this.g / 2, 82, 16777215);
      $$0.a(this.i, m, this.g / 2, 142, 16777215);
   }
}
