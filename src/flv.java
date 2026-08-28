import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class flv extends flw {
   private static final xp d = xp.c("chat.copy");
   private static final xp r = xp.c("chat.link.warning");
   private final String s;
   private final boolean u;

   public flv(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), xp.b($$1), $$1, $$2 ? xo.e : xo.g, $$2);
   }

   public flv(BooleanConsumer $$0, xp $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? xo.e : xo.g, $$3);
   }

   public flv(BooleanConsumer $$0, xp $$1, xp $$2, String $$3, xp $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (xp)($$5 ? xp.c("chat.link.open") : xo.f);
      this.b = $$4;
      this.u = !$$5;
      this.s = $$3;
   }

   protected static yd a(boolean $$0, String $$1) {
      return c($$0).b(xo.v).b(xp.b($$1));
   }

   protected static yd c(boolean $$0) {
      return xp.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fhf.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fhf.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(fhf.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.m.o.a(this.s);
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.u) {
         $$0.a(this.p, r, this.n / 2, 110, 16764108);
      }
   }

   public static void a(fne $$0, String $$1) {
      ffg $$2 = ffg.Q();
      $$2.a(new flv($$3 -> {
         if ($$3) {
            ac.k().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static fhf.c b(fne $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
