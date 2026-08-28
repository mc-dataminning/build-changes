import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class fqt extends fqu {
   private static final xj d = xj.c("chat.copy");
   private static final xj s = xj.c("chat.link.warning");
   private final String u;
   private final boolean v;

   public fqt(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), xj.b($$1), $$1, $$2 ? xi.e : xi.g, $$2);
   }

   public fqt(BooleanConsumer $$0, xj $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? xi.e : xi.g, $$3);
   }

   public fqt(BooleanConsumer $$0, xj $$1, URI $$2, boolean $$3) {
      this($$0, $$1, $$2.toString(), $$3);
   }

   public fqt(BooleanConsumer $$0, xj $$1, xj $$2, URI $$3, xj $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3.toString(), $$4, true);
   }

   public fqt(BooleanConsumer $$0, xj $$1, xj $$2, String $$3, xj $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (xj)($$5 ? xj.c("chat.link.open") : xi.f);
      this.b = $$4;
      this.v = !$$5;
      this.u = $$3;
   }

   protected static xx a(boolean $$0, String $$1) {
      return c($$0).b(xi.v).b(xj.b($$1));
   }

   protected static xx c(boolean $$0) {
      return xj.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fmd.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fmd.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(fmd.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.m.p.a(this.u);
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.v) {
         $$0.a(this.p, s, this.n / 2, 110, 16764108);
      }
   }

   public static void a(frw $$0, String $$1, boolean $$2) {
      fke $$3 = fke.Q();
      $$3.a(new fqt($$3x -> {
         if ($$3x) {
            ae.m().a($$1);
         }

         $$3.a($$0);
      }, $$1, $$2));
   }

   public static void a(frw $$0, URI $$1, boolean $$2) {
      fke $$3 = fke.Q();
      $$3.a(new fqt($$3x -> {
         if ($$3x) {
            ae.m().a($$1);
         }

         $$3.a($$0);
      }, $$1.toString(), $$2));
   }

   public static void a(frw $$0, URI $$1) {
      a($$0, $$1, true);
   }

   public static void a(frw $$0, String $$1) {
      a($$0, $$1, true);
   }

   public static fmd.c b(frw $$0, String $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fmd.c b(frw $$0, URI $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fmd.c b(frw $$0, String $$1) {
      return b($$0, $$1, true);
   }

   public static fmd.c b(frw $$0, URI $$1) {
      return b($$0, $$1, true);
   }
}
