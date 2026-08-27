import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fio extends fip {
   private static final wi d = wi.c("chat.copy");
   private static final wi o = wi.c("chat.link.warning");
   private final String p;
   private final boolean q;

   public fio(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), wi.b($$1), $$1, $$2 ? wh.e : wh.g, $$2);
   }

   public fio(BooleanConsumer $$0, wi $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? wh.e : wh.g, $$3);
   }

   public fio(BooleanConsumer $$0, wi $$1, wi $$2, String $$3, wi $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (wi)($$5 ? wi.c("chat.link.open") : wh.f);
      this.b = $$4;
      this.q = !$$5;
      this.p = $$3;
   }

   protected static ww a(boolean $$0, String $$1) {
      return c($$0).b(wh.v).b(wi.b($$1));
   }

   protected static ww c(boolean $$0) {
      return wi.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fdy.a(this.a, $$0x -> this.c.accept(true)).a(this.k / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fdy.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.k / 2 - 50, $$0, 100, 20).a());
      this.c(fdy.a(this.b, $$0x -> this.c.accept(false)).a(this.k / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.j.o.a(this.p);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.q) {
         $$0.a(this.m, o, this.k / 2, 110, 16764108);
      }
   }

   public static void a(fjx $$0, String $$1) {
      fby $$2 = fby.Q();
      $$2.a(new fio($$3 -> {
         if ($$3) {
            ac.j().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static fdy.c b(fjx $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
