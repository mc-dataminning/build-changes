import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;

public class fmy extends fmz {
   private static final wz r = wz.c("chat.copy");
   private static final wz s = wz.c("chat.link.warning");
   private final String u;
   private final boolean v;

   public fmy(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), wz.b($$1), $$1, $$2 ? wy.e : wy.g, $$2);
   }

   public fmy(BooleanConsumer $$0, wz $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? wy.e : wy.g, $$3);
   }

   public fmy(BooleanConsumer $$0, wz $$1, URI $$2, boolean $$3) {
      this($$0, $$1, $$2.toString(), $$3);
   }

   public fmy(BooleanConsumer $$0, wz $$1, wz $$2, URI $$3, wz $$4, boolean $$5) {
      this($$0, $$1, $$2, $$3.toString(), $$4, true);
   }

   public fmy(BooleanConsumer $$0, wz $$1, wz $$2, String $$3, wz $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (wz)($$5 ? wz.c("chat.link.open") : wy.f);
      this.b = $$4;
      this.v = !$$5;
      this.u = $$3;
   }

   protected static xn a(boolean $$0, String $$1) {
      return c($$0).b(wy.v).b(wz.b($$1));
   }

   protected static xn c(boolean $$0) {
      return wz.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fik.a(this.a, $$0x -> this.c.accept(true)).a(this.m / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fik.a(r, $$0x -> {
         this.l();
         this.c.accept(false);
      }).a(this.m / 2 - 50, $$0, 100, 20).a());
      this.c(fik.a(this.b, $$0x -> this.c.accept(false)).a(this.m / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void l() {
      this.l.o.a(this.u);
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.v) {
         $$0.a(this.o, s, this.m / 2, 110, 16764108);
      }
   }

   public static void a(fob $$0, String $$1, boolean $$2) {
      fgm $$3 = fgm.Q();
      $$3.a(new fmy($$3x -> {
         if ($$3x) {
            ad.k().a($$1);
         }

         $$3.a($$0);
      }, $$1, $$2));
   }

   public static void a(fob $$0, URI $$1, boolean $$2) {
      fgm $$3 = fgm.Q();
      $$3.a(new fmy($$3x -> {
         if ($$3x) {
            ad.k().a($$1);
         }

         $$3.a($$0);
      }, $$1.toString(), $$2));
   }

   public static void a(fob $$0, URI $$1) {
      a($$0, $$1, true);
   }

   public static void a(fob $$0, String $$1) {
      a($$0, $$1, true);
   }

   public static fik.c b(fob $$0, String $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fik.c b(fob $$0, URI $$1, boolean $$2) {
      return $$3 -> a($$0, $$1, $$2);
   }

   public static fik.c b(fob $$0, String $$1) {
      return b($$0, $$1, true);
   }

   public static fik.c b(fob $$0, URI $$1) {
      return b($$0, $$1, true);
   }
}
