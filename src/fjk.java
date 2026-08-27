import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fjk extends fjl {
   private static final ws d = ws.c("chat.copy");
   private static final ws r = ws.c("chat.link.warning");
   private final String s;
   private final boolean u;

   public fjk(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), ws.b($$1), $$1, $$2 ? wr.e : wr.g, $$2);
   }

   public fjk(BooleanConsumer $$0, ws $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? wr.e : wr.g, $$3);
   }

   public fjk(BooleanConsumer $$0, ws $$1, ws $$2, String $$3, ws $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (ws)($$5 ? ws.c("chat.link.open") : wr.f);
      this.b = $$4;
      this.u = !$$5;
      this.s = $$3;
   }

   protected static xg a(boolean $$0, String $$1) {
      return c($$0).b(wr.v).b(ws.b($$1));
   }

   protected static xg c(boolean $$0) {
      return ws.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(feu.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(feu.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(feu.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.m.o.a(this.s);
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.u) {
         $$0.a(this.p, r, this.n / 2, 110, 16764108);
      }
   }

   public static void a(fkt $$0, String $$1) {
      fcu $$2 = fcu.Q();
      $$2.a(new fjk($$3 -> {
         if ($$3) {
            ac.j().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static feu.c b(fkt $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
