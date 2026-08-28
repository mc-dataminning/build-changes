import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class fqm extends fqn {
   private static final xl d = xl.c("chat.copy");
   private static final xl s = xl.c("chat.link.warning");
   private final String u;
   private final boolean v;

   public fqm(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), xl.b($$1), $$1, $$2 ? xk.e : xk.g, $$2);
   }

   public fqm(BooleanConsumer $$0, xl $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? xk.e : xk.g, $$3);
   }

   public fqm(BooleanConsumer $$0, xl $$1, URI $$2, boolean $$3) {
      this($$0, $$1, $$2.toString(), $$3);
   }

   public fqm(BooleanConsumer $$0, xl $$1, xl $$2, URI $$3, xl $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3.toString(), $$4, true);
   }

   public fqm(BooleanConsumer $$0, xl $$1, xl $$2, String $$3, xl $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (xl)($$5 ? xl.c("chat.link.open") : xk.f);
      this.b = $$4;
      this.v = !$$5;
      this.u = $$3;
   }

   protected static xz a(boolean $$0, String $$1) {
      return c($$0).b(xk.v).b(xl.b($$1));
   }

   protected static xz c(boolean $$0) {
      return xl.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(flw.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(flw.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(flw.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.m.p.a(this.u);
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.v) {
         $$0.a(this.p, s, this.n / 2, 110, 16764108);
      }
   }

   public static void a(frp $$0, String $$1, boolean $$2) {
      fjx $$3 = fjx.Q();
      $$3.a(new fqm($$3x -> {
         if ($$3x) {
            ae.m().a($$1);
         }

         $$3.a($$0);
      }, $$1, $$2));
   }

   public static void a(frp $$0, URI $$1, boolean $$2) {
      fjx $$3 = fjx.Q();
      $$3.a(new fqm($$3x -> {
         if ($$3x) {
            ae.m().a($$1);
         }

         $$3.a($$0);
      }, $$1.toString(), $$2));
   }

   public static void a(frp $$0, URI $$1) {
      a($$0, $$1, true);
   }

   public static void a(frp $$0, String $$1) {
      a($$0, $$1, true);
   }

   public static flw.c b(frp $$0, String $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static flw.c b(frp $$0, URI $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static flw.c b(frp $$0, String $$1) {
      return b($$0, $$1, true);
   }

   public static flw.c b(frp $$0, URI $$1) {
      return b($$0, $$1, true);
   }
}
