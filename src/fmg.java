import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fmg extends fmh {
   private static final wu q = wu.c("chat.copy");
   private static final wu r = wu.c("chat.link.warning");
   private final String s;
   private final boolean u;

   public fmg(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), wu.b($$1), $$1, $$2 ? wt.e : wt.g, $$2);
   }

   public fmg(BooleanConsumer $$0, wu $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? wt.e : wt.g, $$3);
   }

   public fmg(BooleanConsumer $$0, wu $$1, wu $$2, String $$3, wu $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (wu)($$5 ? wu.c("chat.link.open") : wt.f);
      this.b = $$4;
      this.u = !$$5;
      this.s = $$3;
   }

   protected static xi a(boolean $$0, String $$1) {
      return c($$0).b(wt.v).b(wu.b($$1));
   }

   protected static xi c(boolean $$0) {
      return wu.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fhs.a(this.a, $$0x -> this.c.accept(true)).a(this.m / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fhs.a(q, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.m / 2 - 50, $$0, 100, 20).a());
      this.c(fhs.a(this.b, $$0x -> this.c.accept(false)).a(this.m / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.l.o.a(this.s);
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.u) {
         $$0.a(this.o, r, this.m / 2, 110, 16764108);
      }
   }

   public static void a(fnj $$0, String $$1) {
      fft $$2 = fft.Q();
      $$2.a(new fmg($$3 -> {
         if ($$3) {
            ac.k().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static fhs.c b(fnj $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
