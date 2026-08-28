import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class fth extends fti {
   private static final wo d = wo.c("chat.copy");
   private static final wo s = wo.c("chat.link.warning");
   private final String u;
   private final boolean v;

   public fth(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), wo.b($$1), $$1, $$2 ? wn.e : wn.g, $$2);
   }

   public fth(BooleanConsumer $$0, wo $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? wn.e : wn.g, $$3);
   }

   public fth(BooleanConsumer $$0, wo $$1, URI $$2, boolean $$3) {
      this($$0, $$1, $$2.toString(), $$3);
   }

   public fth(BooleanConsumer $$0, wo $$1, wo $$2, URI $$3, wo $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3.toString(), $$4, true);
   }

   public fth(BooleanConsumer $$0, wo $$1, wo $$2, String $$3, wo $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (wo)($$5 ? wo.c("chat.link.open") : wn.f);
      this.b = $$4;
      this.v = !$$5;
      this.u = $$3;
   }

   protected static xc a(boolean $$0, String $$1) {
      return c($$0).b(wn.v).b(wo.b($$1));
   }

   protected static xc c(boolean $$0) {
      return wo.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fos.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fos.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(fos.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.m.p.a(this.u);
   }

   @Override
   public void a(fod $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.v) {
         $$0.a(this.p, s, this.n / 2, 110, 16764108);
      }
   }

   public static void a(fuk $$0, String $$1, boolean $$2) {
      flj $$3 = flj.Q();
      $$3.a(new fth($$3x -> {
         if ($$3x) {
            af.m().a($$1);
         }

         $$3.a($$0);
      }, $$1, $$2));
   }

   public static void a(fuk $$0, URI $$1, boolean $$2) {
      flj $$3 = flj.Q();
      $$3.a(new fth($$3x -> {
         if ($$3x) {
            af.m().a($$1);
         }

         $$3.a($$0);
      }, $$1.toString(), $$2));
   }

   public static void a(fuk $$0, URI $$1) {
      a($$0, $$1, true);
   }

   public static void a(fuk $$0, String $$1) {
      a($$0, $$1, true);
   }

   public static fos.c b(fuk $$0, String $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fos.c b(fuk $$0, URI $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fos.c b(fuk $$0, String $$1) {
      return b($$0, $$1, true);
   }

   public static fos.c b(fuk $$0, URI $$1) {
      return b($$0, $$1, true);
   }
}
