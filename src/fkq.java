import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fkq extends fkr {
   private static final wx d = wx.c("chat.copy");
   private static final wx r = wx.c("chat.link.warning");
   private final String s;
   private final boolean u;

   public fkq(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), wx.b($$1), $$1, $$2 ? ww.e : ww.g, $$2);
   }

   public fkq(BooleanConsumer $$0, wx $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? ww.e : ww.g, $$3);
   }

   public fkq(BooleanConsumer $$0, wx $$1, wx $$2, String $$3, wx $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (wx)($$5 ? wx.c("chat.link.open") : ww.f);
      this.b = $$4;
      this.u = !$$5;
      this.s = $$3;
   }

   protected static xl a(boolean $$0, String $$1) {
      return c($$0).b(ww.v).b(wx.b($$1));
   }

   protected static xl c(boolean $$0) {
      return wx.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fga.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fga.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(fga.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.m.o.a(this.s);
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.u) {
         $$0.a(this.p, r, this.n / 2, 110, 16764108);
      }
   }

   public static void a(flz $$0, String $$1) {
      feb $$2 = feb.Q();
      $$2.a(new fkq($$3 -> {
         if ($$3) {
            ac.k().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static fga.c b(flz $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
