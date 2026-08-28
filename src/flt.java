import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class flt extends flu {
   private static final xo d = xo.c("chat.copy");
   private static final xo r = xo.c("chat.link.warning");
   private final String s;
   private final boolean u;

   public flt(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), xo.b($$1), $$1, $$2 ? xn.e : xn.g, $$2);
   }

   public flt(BooleanConsumer $$0, xo $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? xn.e : xn.g, $$3);
   }

   public flt(BooleanConsumer $$0, xo $$1, xo $$2, String $$3, xo $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (xo)($$5 ? xo.c("chat.link.open") : xn.f);
      this.b = $$4;
      this.u = !$$5;
      this.s = $$3;
   }

   protected static yc a(boolean $$0, String $$1) {
      return c($$0).b(xn.v).b(xo.b($$1));
   }

   protected static yc c(boolean $$0) {
      return xo.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fhd.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fhd.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(fhd.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.m.o.a(this.s);
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.u) {
         $$0.a(this.p, r, this.n / 2, 110, 16764108);
      }
   }

   public static void a(fnc $$0, String $$1) {
      ffe $$2 = ffe.Q();
      $$2.a(new flt($$3 -> {
         if ($$3) {
            ac.k().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static fhd.c b(fnc $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
