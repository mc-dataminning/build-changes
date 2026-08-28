import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class fst extends fsu {
   private static final xv d = xv.c("chat.copy");
   private static final xv s = xv.c("chat.link.warning");
   private final String u;
   private final boolean v;

   public fst(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), xv.b($$1), $$1, $$2 ? xu.e : xu.g, $$2);
   }

   public fst(BooleanConsumer $$0, xv $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? xu.e : xu.g, $$3);
   }

   public fst(BooleanConsumer $$0, xv $$1, URI $$2, boolean $$3) {
      this($$0, $$1, $$2.toString(), $$3);
   }

   public fst(BooleanConsumer $$0, xv $$1, xv $$2, URI $$3, xv $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3.toString(), $$4, true);
   }

   public fst(BooleanConsumer $$0, xv $$1, xv $$2, String $$3, xv $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (xv)($$5 ? xv.c("chat.link.open") : xu.f);
      this.b = $$4;
      this.v = !$$5;
      this.u = $$3;
   }

   protected static yj a(boolean $$0, String $$1) {
      return c($$0).b(xu.v).b(xv.b($$1));
   }

   protected static yj c(boolean $$0) {
      return xv.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fod.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fod.a(d, $$0x -> {
         this.k();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(fod.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void k() {
      this.m.p.a(this.u);
   }

   @Override
   public void a(fnq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.v) {
         $$0.a(this.p, s, this.n / 2, 110, 16764108);
      }
   }

   public static void a(ftw $$0, String $$1, boolean $$2) {
      fme $$3 = fme.Q();
      $$3.a(new fst($$3x -> {
         if ($$3x) {
            ae.m().a($$1);
         }

         $$3.a($$0);
      }, $$1, $$2));
   }

   public static void a(ftw $$0, URI $$1, boolean $$2) {
      fme $$3 = fme.Q();
      $$3.a(new fst($$3x -> {
         if ($$3x) {
            ae.m().a($$1);
         }

         $$3.a($$0);
      }, $$1.toString(), $$2));
   }

   public static void a(ftw $$0, URI $$1) {
      a($$0, $$1, true);
   }

   public static void a(ftw $$0, String $$1) {
      a($$0, $$1, true);
   }

   public static fod.c b(ftw $$0, String $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fod.c b(ftw $$0, URI $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fod.c b(ftw $$0, String $$1) {
      return b($$0, $$1, true);
   }

   public static fod.c b(ftw $$0, URI $$1) {
      return b($$0, $$1, true);
   }
}
