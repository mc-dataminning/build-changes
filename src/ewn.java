import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ewn extends ewo {
   private static final te k = te.c("chat.copy");
   private static final te l = te.c("chat.link.warning");
   private final String m;
   private final boolean n;

   public ewn(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), te.b($$1), $$1, $$2 ? td.e : td.g, $$2);
   }

   public ewn(BooleanConsumer $$0, te $$1, String $$2, boolean $$3) {
      this($$0, $$1, $$2, $$3 ? td.e : td.g, $$3);
   }

   public ewn(BooleanConsumer $$0, te $$1, String $$2, te $$3, boolean $$4) {
      this($$0, $$1, a($$4, $$2), $$2, $$3, $$4);
   }

   public ewn(BooleanConsumer $$0, te $$1, te $$2, String $$3, te $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (te)($$5 ? te.c("chat.link.open") : td.f);
      this.b = $$4;
      this.n = !$$5;
      this.m = $$3;
   }

   protected static tr a(boolean $$0, String $$1) {
      return c($$0).b(td.u).b(te.b($$1));
   }

   protected static tr c(boolean $$0) {
      return te.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.d(esi.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$0, 100, 20).a());
      this.d(esi.a(k, $$0x -> {
         this.k();
         this.c.accept(false);
      }).a(this.g / 2 - 50, $$0, 100, 20).a());
      this.d(esi.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void k() {
      this.f.o.a(this.m);
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.n) {
         $$0.a(this.i, l, this.g / 2, 110, 16764108);
      }
   }

   public static void a(String $$0, exv $$1, boolean $$2) {
      eqn $$3 = eqn.N();
      $$3.a(new ewn($$3x -> {
         if ($$3x) {
            ac.i().a($$0);
         }

         $$3.a($$1);
      }, $$0, $$2));
   }

   public static esi.c b(String $$0, exv $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }
}
