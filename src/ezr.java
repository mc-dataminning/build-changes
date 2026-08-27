import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ezr extends ezs {
   private static final uv k = uv.c("chat.copy");
   private static final uv l = uv.c("chat.link.warning");
   private final String m;
   private final boolean n;

   public ezr(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), uv.b($$1), $$1, $$2 ? uu.e : uu.g, $$2);
   }

   public ezr(BooleanConsumer $$0, uv $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? uu.e : uu.g, $$3);
   }

   public ezr(BooleanConsumer $$0, uv $$1, uv $$2, String $$3, uv $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (uv)($$5 ? uv.c("chat.link.open") : uu.f);
      this.b = $$4;
      this.n = !$$5;
      this.m = $$3;
   }

   protected static vj a(boolean $$0, String $$1) {
      return c($$0).b(uu.u).b(uv.b($$1));
   }

   protected static vj c(boolean $$0) {
      return uv.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.d(eve.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$0, 100, 20).a());
      this.d(eve.a(k, $$0x -> {
         this.k();
         this.c.accept(false);
      }).a(this.g / 2 - 50, $$0, 100, 20).a());
      this.d(eve.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void k() {
      this.f.o.a(this.m);
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.n) {
         $$0.a(this.i, l, this.g / 2, 110, 16764108);
      }
   }

   public static void a(faz $$0, String $$1) {
      eti $$2 = eti.N();
      $$2.a(new ezr($$3 -> {
         if ($$3) {
            ac.i().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static eve.c b(faz $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
