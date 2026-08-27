import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ewx extends ewy {
   private static final tl k = tl.c("chat.copy");
   private static final tl l = tl.c("chat.link.warning");
   private final String m;
   private final boolean n;

   public ewx(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), tl.b($$1), $$1, $$2 ? tk.e : tk.g, $$2);
   }

   public ewx(BooleanConsumer $$0, tl $$1, String $$2, boolean $$3) {
      this($$0, $$1, $$2, $$3 ? tk.e : tk.g, $$3);
   }

   public ewx(BooleanConsumer $$0, tl $$1, String $$2, tl $$3, boolean $$4) {
      this($$0, $$1, a($$4, $$2), $$2, $$3, $$4);
   }

   public ewx(BooleanConsumer $$0, tl $$1, tl $$2, String $$3, tl $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (tl)($$5 ? tl.c("chat.link.open") : tk.f);
      this.b = $$4;
      this.n = !$$5;
      this.m = $$3;
   }

   protected static tz a(boolean $$0, String $$1) {
      return c($$0).b(tk.u).b(tl.b($$1));
   }

   protected static tz c(boolean $$0) {
      return tl.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.d(esk.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$0, 100, 20).a());
      this.d(esk.a(k, $$0x -> {
         this.k();
         this.c.accept(false);
      }).a(this.g / 2 - 50, $$0, 100, 20).a());
      this.d(esk.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void k() {
      this.f.o.a(this.m);
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.n) {
         $$0.a(this.i, l, this.g / 2, 110, 16764108);
      }
   }

   public static void a(String $$0, eye $$1, boolean $$2) {
      eqp $$3 = eqp.O();
      $$3.a(new ewx($$3x -> {
         if ($$3x) {
            ac.i().a($$0);
         }

         $$3.a($$1);
      }, $$0, $$2));
   }

   public static esk.c b(String $$0, eye $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }
}
