import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ffy extends ffz {
   private static final vu k = vu.c("chat.copy");
   private static final vu l = vu.c("chat.link.warning");
   private final String m;
   private final boolean n;

   public ffy(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), vu.b($$1), $$1, $$2 ? vt.e : vt.g, $$2);
   }

   public ffy(BooleanConsumer $$0, vu $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? vt.e : vt.g, $$3);
   }

   public ffy(BooleanConsumer $$0, vu $$1, vu $$2, String $$3, vu $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (vu)($$5 ? vu.c("chat.link.open") : vt.f);
      this.b = $$4;
      this.n = !$$5;
      this.m = $$3;
   }

   protected static wi a(boolean $$0, String $$1) {
      return c($$0).b(vt.v).b(vu.b($$1));
   }

   protected static wi c(boolean $$0) {
      return vu.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.c(fbi.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$0, 100, 20).a());
      this.c(fbi.a(k, $$0x -> {
         this.n();
         this.c.accept(false);
      }).a(this.g / 2 - 50, $$0, 100, 20).a());
      this.c(fbi.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void n() {
      this.f.o.a(this.m);
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.n) {
         $$0.a(this.i, l, this.g / 2, 110, 16764108);
      }
   }

   public static void a(fhh $$0, String $$1) {
      ezi $$2 = ezi.Q();
      $$2.a(new ffy($$3 -> {
         if ($$3) {
            ac.j().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static fbi.c b(fhh $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
