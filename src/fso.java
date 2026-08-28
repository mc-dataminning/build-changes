import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class fso extends fsp {
   private static final xk d = xk.c("chat.copy");
   private static final xk s = xk.c("chat.link.warning");
   private final String u;
   private final boolean v;

   public fso(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), xk.b($$1), $$1, $$2 ? xj.e : xj.g, $$2);
   }

   public fso(BooleanConsumer $$0, xk $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? xj.e : xj.g, $$3);
   }

   public fso(BooleanConsumer $$0, xk $$1, URI $$2, boolean $$3) {
      this($$0, $$1, $$2.toString(), $$3);
   }

   public fso(BooleanConsumer $$0, xk $$1, xk $$2, URI $$3, xk $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3.toString(), $$4, true);
   }

   public fso(BooleanConsumer $$0, xk $$1, xk $$2, String $$3, xk $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (xk)($$5 ? xk.c("chat.link.open") : xj.f);
      this.b = $$4;
      this.v = !$$5;
      this.u = $$3;
   }

   protected static xy a(boolean $$0, String $$1) {
      return c($$0).b(xj.v).b(xk.b($$1));
   }

   protected static xy c(boolean $$0) {
      return xk.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fny.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fny.a(d, $$0x -> {
         this.k();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(fny.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void k() {
      this.m.p.a(this.u);
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.v) {
         $$0.a(this.p, s, this.n / 2, 110, 16764108);
      }
   }

   public static void a(ftr $$0, String $$1, boolean $$2) {
      flz $$3 = flz.Q();
      $$3.a(new fso($$3x -> {
         if ($$3x) {
            ae.m().a($$1);
         }

         $$3.a($$0);
      }, $$1, $$2));
   }

   public static void a(ftr $$0, URI $$1, boolean $$2) {
      flz $$3 = flz.Q();
      $$3.a(new fso($$3x -> {
         if ($$3x) {
            ae.m().a($$1);
         }

         $$3.a($$0);
      }, $$1.toString(), $$2));
   }

   public static void a(ftr $$0, URI $$1) {
      a($$0, $$1, true);
   }

   public static void a(ftr $$0, String $$1) {
      a($$0, $$1, true);
   }

   public static fny.c b(ftr $$0, String $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fny.c b(ftr $$0, URI $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fny.c b(ftr $$0, String $$1) {
      return b($$0, $$1, true);
   }

   public static fny.c b(ftr $$0, URI $$1) {
      return b($$0, $$1, true);
   }
}
