import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fau extends fav {
   private static final vb k = vb.c("chat.copy");
   private static final vb l = vb.c("chat.link.warning");
   private final String m;
   private final boolean n;

   public fau(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), vb.b($$1), $$1, $$2 ? va.e : va.g, $$2);
   }

   public fau(BooleanConsumer $$0, vb $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? va.e : va.g, $$3);
   }

   public fau(BooleanConsumer $$0, vb $$1, vb $$2, String $$3, vb $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (vb)($$5 ? vb.c("chat.link.open") : va.f);
      this.b = $$4;
      this.n = !$$5;
      this.m = $$3;
   }

   protected static vp a(boolean $$0, String $$1) {
      return c($$0).b(va.u).b(vb.b($$1));
   }

   protected static vp c(boolean $$0) {
      return vb.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.d(ewh.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$0, 100, 20).a());
      this.d(ewh.a(k, $$0x -> {
         this.k();
         this.c.accept(false);
      }).a(this.g / 2 - 50, $$0, 100, 20).a());
      this.d(ewh.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void k() {
      this.f.o.a(this.m);
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.n) {
         $$0.a(this.i, l, this.g / 2, 110, 16764108);
      }
   }

   public static void a(fcc $$0, String $$1) {
      euk $$2 = euk.N();
      $$2.a(new fau($$3 -> {
         if ($$3) {
            ac.i().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static ewh.c b(fcc $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
