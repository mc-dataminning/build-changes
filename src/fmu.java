import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fmu extends fmv {
   private static final wy q = wy.c("chat.copy");
   private static final wy r = wy.c("chat.link.warning");
   private final String s;
   private final boolean u;

   public fmu(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), wy.b($$1), $$1, $$2 ? wx.e : wx.g, $$2);
   }

   public fmu(BooleanConsumer $$0, wy $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? wx.e : wx.g, $$3);
   }

   public fmu(BooleanConsumer $$0, wy $$1, wy $$2, String $$3, wy $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (wy)($$5 ? wy.c("chat.link.open") : wx.f);
      this.b = $$4;
      this.u = !$$5;
      this.s = $$3;
   }

   protected static xm a(boolean $$0, String $$1) {
      return c($$0).b(wx.v).b(wy.b($$1));
   }

   protected static xm c(boolean $$0) {
      return wy.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fig.a(this.a, $$0x -> this.c.accept(true)).a(this.m / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fig.a(q, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.m / 2 - 50, $$0, 100, 20).a());
      this.c(fig.a(this.b, $$0x -> this.c.accept(false)).a(this.m / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.l.o.a(this.s);
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.u) {
         $$0.a(this.o, r, this.m / 2, 110, 16764108);
      }
   }

   public static void a(fnx $$0, String $$1, boolean $$2) {
      fgi $$3 = fgi.Q();
      $$3.a(new fmu($$3x -> {
         if ($$3x) {
            ad.k().a($$1);
         }

         $$3.a($$0);
      }, $$1, $$2));
   }

   public static void a(fnx $$0, String $$1) {
      a($$0, $$1, true);
   }

   public static fig.c b(fnx $$0, String $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fig.c b(fnx $$0, String $$1) {
      return b($$0, $$1, true);
   }
}
