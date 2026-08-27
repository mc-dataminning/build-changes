import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fce extends fcf {
   private static final vg k = vg.c("chat.copy");
   private static final vg l = vg.c("chat.link.warning");
   private final String m;
   private final boolean n;

   public fce(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), vg.b($$1), $$1, $$2 ? vf.e : vf.g, $$2);
   }

   public fce(BooleanConsumer $$0, vg $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? vf.e : vf.g, $$3);
   }

   public fce(BooleanConsumer $$0, vg $$1, vg $$2, String $$3, vg $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (vg)($$5 ? vg.c("chat.link.open") : vf.f);
      this.b = $$4;
      this.n = !$$5;
      this.m = $$3;
   }

   protected static vu a(boolean $$0, String $$1) {
      return c($$0).b(vf.u).b(vg.b($$1));
   }

   protected static vu c(boolean $$0) {
      return vg.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.d(exr.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$0, 100, 20).a());
      this.d(exr.a(k, $$0x -> {
         this.n();
         this.c.accept(false);
      }).a(this.g / 2 - 50, $$0, 100, 20).a());
      this.d(exr.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void n() {
      this.f.o.a(this.m);
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.n) {
         $$0.a(this.i, l, this.g / 2, 110, 16764108);
      }
   }

   public static void a(fdm $$0, String $$1) {
      evr $$2 = evr.O();
      $$2.a(new fce($$3 -> {
         if ($$3) {
            ac.j().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static exr.c b(fdm $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
