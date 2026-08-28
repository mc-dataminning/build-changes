import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class fpe extends fpf {
   private static final xe d = xe.c("chat.copy");
   private static final xe s = xe.c("chat.link.warning");
   private final String u;
   private final boolean v;

   public fpe(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), xe.b($$1), $$1, $$2 ? xd.e : xd.g, $$2);
   }

   public fpe(BooleanConsumer $$0, xe $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? xd.e : xd.g, $$3);
   }

   public fpe(BooleanConsumer $$0, xe $$1, URI $$2, boolean $$3) {
      this($$0, $$1, $$2.toString(), $$3);
   }

   public fpe(BooleanConsumer $$0, xe $$1, xe $$2, URI $$3, xe $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3.toString(), $$4, true);
   }

   public fpe(BooleanConsumer $$0, xe $$1, xe $$2, String $$3, xe $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (xe)($$5 ? xe.c("chat.link.open") : xd.f);
      this.b = $$4;
      this.v = !$$5;
      this.u = $$3;
   }

   protected static xs a(boolean $$0, String $$1) {
      return c($$0).b(xd.v).b(xe.b($$1));
   }

   protected static xs c(boolean $$0) {
      return xe.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fko.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fko.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(fko.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.m.p.a(this.u);
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.v) {
         $$0.a(this.p, s, this.n / 2, 110, 16764108);
      }
   }

   public static void a(fqh $$0, String $$1, boolean $$2) {
      fip $$3 = fip.Q();
      $$3.a(new fpe($$3x -> {
         if ($$3x) {
            ad.m().a($$1);
         }

         $$3.a($$0);
      }, $$1, $$2));
   }

   public static void a(fqh $$0, URI $$1, boolean $$2) {
      fip $$3 = fip.Q();
      $$3.a(new fpe($$3x -> {
         if ($$3x) {
            ad.m().a($$1);
         }

         $$3.a($$0);
      }, $$1.toString(), $$2));
   }

   public static void a(fqh $$0, URI $$1) {
      a($$0, $$1, true);
   }

   public static void a(fqh $$0, String $$1) {
      a($$0, $$1, true);
   }

   public static fko.c b(fqh $$0, String $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fko.c b(fqh $$0, URI $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fko.c b(fqh $$0, String $$1) {
      return b($$0, $$1, true);
   }

   public static fko.c b(fqh $$0, URI $$1) {
      return b($$0, $$1, true);
   }
}
