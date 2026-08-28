import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class fop extends foq {
   private static final xd d = xd.c("chat.copy");
   private static final xd s = xd.c("chat.link.warning");
   private final String u;
   private final boolean v;

   public fop(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), xd.b($$1), $$1, $$2 ? xc.e : xc.g, $$2);
   }

   public fop(BooleanConsumer $$0, xd $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? xc.e : xc.g, $$3);
   }

   public fop(BooleanConsumer $$0, xd $$1, URI $$2, boolean $$3) {
      this($$0, $$1, $$2.toString(), $$3);
   }

   public fop(BooleanConsumer $$0, xd $$1, xd $$2, URI $$3, xd $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3.toString(), $$4, true);
   }

   public fop(BooleanConsumer $$0, xd $$1, xd $$2, String $$3, xd $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (xd)($$5 ? xd.c("chat.link.open") : xc.f);
      this.b = $$4;
      this.v = !$$5;
      this.u = $$3;
   }

   protected static xr a(boolean $$0, String $$1) {
      return c($$0).b(xc.v).b(xd.b($$1));
   }

   protected static xr c(boolean $$0) {
      return xd.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fka.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fka.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(fka.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.m.p.a(this.u);
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.v) {
         $$0.a(this.p, s, this.n / 2, 110, 16764108);
      }
   }

   public static void a(fpt $$0, String $$1, boolean $$2) {
      fib $$3 = fib.Q();
      $$3.a(new fop($$3x -> {
         if ($$3x) {
            ad.m().a($$1);
         }

         $$3.a($$0);
      }, $$1, $$2));
   }

   public static void a(fpt $$0, URI $$1, boolean $$2) {
      fib $$3 = fib.Q();
      $$3.a(new fop($$3x -> {
         if ($$3x) {
            ad.m().a($$1);
         }

         $$3.a($$0);
      }, $$1.toString(), $$2));
   }

   public static void a(fpt $$0, URI $$1) {
      a($$0, $$1, true);
   }

   public static void a(fpt $$0, String $$1) {
      a($$0, $$1, true);
   }

   public static fka.c b(fpt $$0, String $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fka.c b(fpt $$0, URI $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fka.c b(fpt $$0, String $$1) {
      return b($$0, $$1, true);
   }

   public static fka.c b(fpt $$0, URI $$1) {
      return b($$0, $$1, true);
   }
}
