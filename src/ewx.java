import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ewx extends ewy {
   private static final ti k = ti.c("chat.copy");
   private static final ti l = ti.c("chat.link.warning");
   private final String m;
   private final boolean n;

   public ewx(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), ti.b($$1), $$1, $$2 ? th.e : th.g, $$2);
   }

   public ewx(BooleanConsumer $$0, ti $$1, String $$2, boolean $$3) {
      this($$0, $$1, $$2, $$3 ? th.e : th.g, $$3);
   }

   public ewx(BooleanConsumer $$0, ti $$1, String $$2, ti $$3, boolean $$4) {
      this($$0, $$1, a($$4, $$2), $$2, $$3, $$4);
   }

   public ewx(BooleanConsumer $$0, ti $$1, ti $$2, String $$3, ti $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (ti)($$5 ? ti.c("chat.link.open") : th.f);
      this.b = $$4;
      this.n = !$$5;
      this.m = $$3;
   }

   protected static tv a(boolean $$0, String $$1) {
      return c($$0).b(th.u).b(ti.b($$1));
   }

   protected static tv c(boolean $$0) {
      return ti.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.d(esl.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$0, 100, 20).a());
      this.d(esl.a(k, $$0x -> {
         this.k();
         this.c.accept(false);
      }).a(this.g / 2 - 50, $$0, 100, 20).a());
      this.d(esl.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void k() {
      this.f.o.a(this.m);
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.n) {
         $$0.a(this.i, l, this.g / 2, 110, 16764108);
      }
   }

   public static void a(String $$0, eyf $$1, boolean $$2) {
      eqq $$3 = eqq.O();
      $$3.a(new ewx($$3x -> {
         if ($$3x) {
            ac.i().a($$0);
         }

         $$3.a($$1);
      }, $$0, $$2));
   }

   public static esl.c b(String $$0, eyf $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }
}
