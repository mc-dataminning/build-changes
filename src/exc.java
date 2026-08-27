import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class exc extends exd {
   private static final tm k = tm.c("chat.copy");
   private static final tm l = tm.c("chat.link.warning");
   private final String m;
   private final boolean n;

   public exc(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), tm.b($$1), $$1, $$2 ? tl.e : tl.g, $$2);
   }

   public exc(BooleanConsumer $$0, tm $$1, String $$2, boolean $$3) {
      this($$0, $$1, $$2, $$3 ? tl.e : tl.g, $$3);
   }

   public exc(BooleanConsumer $$0, tm $$1, String $$2, tm $$3, boolean $$4) {
      this($$0, $$1, a($$4, $$2), $$2, $$3, $$4);
   }

   public exc(BooleanConsumer $$0, tm $$1, tm $$2, String $$3, tm $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (tm)($$5 ? tm.c("chat.link.open") : tl.f);
      this.b = $$4;
      this.n = !$$5;
      this.m = $$3;
   }

   protected static tz a(boolean $$0, String $$1) {
      return c($$0).b(tl.u).b(tm.b($$1));
   }

   protected static tz c(boolean $$0) {
      return tm.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.d(esq.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$0, 100, 20).a());
      this.d(esq.a(k, $$0x -> {
         this.k();
         this.c.accept(false);
      }).a(this.g / 2 - 50, $$0, 100, 20).a());
      this.d(esq.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void k() {
      this.f.o.a(this.m);
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.n) {
         $$0.a(this.i, l, this.g / 2, 110, 16764108);
      }
   }

   public static void a(String $$0, eyk $$1, boolean $$2) {
      eqv $$3 = eqv.O();
      $$3.a(new exc($$3x -> {
         if ($$3x) {
            ac.i().a($$0);
         }

         $$3.a($$1);
      }, $$0, $$2));
   }

   public static esq.c b(String $$0, eyk $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }
}
