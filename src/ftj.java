import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class ftj extends ftk {
   private static final wp d = wp.c("chat.copy");
   private static final wp s = wp.c("chat.link.warning");
   private final String u;
   private final boolean v;

   public ftj(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), wp.b($$1), $$1, $$2 ? wo.e : wo.g, $$2);
   }

   public ftj(BooleanConsumer $$0, wp $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? wo.e : wo.g, $$3);
   }

   public ftj(BooleanConsumer $$0, wp $$1, URI $$2, boolean $$3) {
      this($$0, $$1, $$2.toString(), $$3);
   }

   public ftj(BooleanConsumer $$0, wp $$1, wp $$2, URI $$3, wp $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3.toString(), $$4, true);
   }

   public ftj(BooleanConsumer $$0, wp $$1, wp $$2, String $$3, wp $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (wp)($$5 ? wp.c("chat.link.open") : wo.f);
      this.b = $$4;
      this.v = !$$5;
      this.u = $$3;
   }

   protected static xd a(boolean $$0, String $$1) {
      return c($$0).b(wo.v).b(wp.b($$1));
   }

   protected static xd c(boolean $$0) {
      return wp.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fou.a(this.a, $$0x -> this.c.accept(true)).a(this.n / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fou.a(d, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.n / 2 - 50, $$0, 100, 20).a());
      this.c(fou.a(this.b, $$0x -> this.c.accept(false)).a(this.n / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.m.p.a(this.u);
   }

   @Override
   public void a(fof $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.v) {
         $$0.a(this.p, s, this.n / 2, 110, 16764108);
      }
   }

   public static void a(fum $$0, String $$1, boolean $$2) {
      flk $$3 = flk.Q();
      $$3.a(new ftj($$3x -> {
         if ($$3x) {
            af.n().a($$1);
         }

         $$3.a($$0);
      }, $$1, $$2));
   }

   public static void a(fum $$0, URI $$1, boolean $$2) {
      flk $$3 = flk.Q();
      $$3.a(new ftj($$3x -> {
         if ($$3x) {
            af.n().a($$1);
         }

         $$3.a($$0);
      }, $$1.toString(), $$2));
   }

   public static void a(fum $$0, URI $$1) {
      a($$0, $$1, true);
   }

   public static void a(fum $$0, String $$1) {
      a($$0, $$1, true);
   }

   public static fou.c b(fum $$0, String $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fou.c b(fum $$0, URI $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fou.c b(fum $$0, String $$1) {
      return b($$0, $$1, true);
   }

   public static fou.c b(fum $$0, URI $$1) {
      return b($$0, $$1, true);
   }
}
