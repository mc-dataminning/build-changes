import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fbt extends fbu {
   private static final vf k = vf.c("chat.copy");
   private static final vf l = vf.c("chat.link.warning");
   private final String m;
   private final boolean n;

   public fbt(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), vf.b($$1), $$1, $$2 ? ve.e : ve.g, $$2);
   }

   public fbt(BooleanConsumer $$0, vf $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? ve.e : ve.g, $$3);
   }

   public fbt(BooleanConsumer $$0, vf $$1, vf $$2, String $$3, vf $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (vf)($$5 ? vf.c("chat.link.open") : ve.f);
      this.b = $$4;
      this.n = !$$5;
      this.m = $$3;
   }

   protected static vt a(boolean $$0, String $$1) {
      return c($$0).b(ve.u).b(vf.b($$1));
   }

   protected static vt c(boolean $$0) {
      return vf.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.d(exg.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$0, 100, 20).a());
      this.d(exg.a(k, $$0x -> {
         this.m();
         this.c.accept(false);
      }).a(this.g / 2 - 50, $$0, 100, 20).a());
      this.d(exg.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void m() {
      this.f.o.a(this.m);
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.n) {
         $$0.a(this.i, l, this.g / 2, 110, 16764108);
      }
   }

   public static void a(fdb $$0, String $$1) {
      evi $$2 = evi.O();
      $$2.a(new fbt($$3 -> {
         if ($$3) {
            ac.j().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static exg.c b(fdb $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
