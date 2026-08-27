import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class exe extends exf {
   private static final tn k = tn.c("chat.copy");
   private static final tn l = tn.c("chat.link.warning");
   private final String m;
   private final boolean n;

   public exe(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), tn.b($$1), $$1, $$2 ? tm.e : tm.g, $$2);
   }

   public exe(BooleanConsumer $$0, tn $$1, String $$2, boolean $$3) {
      this($$0, $$1, $$2, $$3 ? tm.e : tm.g, $$3);
   }

   public exe(BooleanConsumer $$0, tn $$1, String $$2, tn $$3, boolean $$4) {
      this($$0, $$1, a($$4, $$2), $$2, $$3, $$4);
   }

   public exe(BooleanConsumer $$0, tn $$1, tn $$2, String $$3, tn $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (tn)($$5 ? tn.c("chat.link.open") : tm.f);
      this.b = $$4;
      this.n = !$$5;
      this.m = $$3;
   }

   protected static ua a(boolean $$0, String $$1) {
      return c($$0).b(tm.u).b(tn.b($$1));
   }

   protected static ua c(boolean $$0) {
      return tn.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.d(ess.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$0, 100, 20).a());
      this.d(ess.a(k, $$0x -> {
         this.k();
         this.c.accept(false);
      }).a(this.g / 2 - 50, $$0, 100, 20).a());
      this.d(ess.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void k() {
      this.f.o.a(this.m);
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.n) {
         $$0.a(this.i, l, this.g / 2, 110, 16764108);
      }
   }

   public static void a(String $$0, eym $$1, boolean $$2) {
      eqx $$3 = eqx.O();
      $$3.a(new exe($$3x -> {
         if ($$3x) {
            ac.i().a($$0);
         }

         $$3.a($$1);
      }, $$0, $$2));
   }

   public static ess.c b(String $$0, eym $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }
}
