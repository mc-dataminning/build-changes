import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fez extends ffa {
   private static final vs k = vs.c("chat.copy");
   private static final vs l = vs.c("chat.link.warning");
   private final String m;
   private final boolean n;

   public fez(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), vs.b($$1), $$1, $$2 ? vr.e : vr.g, $$2);
   }

   public fez(BooleanConsumer $$0, vs $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? vr.e : vr.g, $$3);
   }

   public fez(BooleanConsumer $$0, vs $$1, vs $$2, String $$3, vs $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (vs)($$5 ? vs.c("chat.link.open") : vr.f);
      this.b = $$4;
      this.n = !$$5;
      this.m = $$3;
   }

   protected static wg a(boolean $$0, String $$1) {
      return c($$0).b(vr.v).b(vs.b($$1));
   }

   protected static wg c(boolean $$0) {
      return vs.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fak.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fak.a(k, $$0x -> {
         this.n();
         this.c.accept(false);
      }).a(this.g / 2 - 50, $$0, 100, 20).a());
      this.c(fak.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void n() {
      this.f.o.a(this.m);
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.n) {
         $$0.a(this.i, l, this.g / 2, 110, 16764108);
      }
   }

   public static void a(fgh $$0, String $$1) {
      eyk $$2 = eyk.P();
      $$2.a(new fez($$3 -> {
         if ($$3) {
            ac.j().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static fak.c b(fgh $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
