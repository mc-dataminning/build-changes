import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fbl extends fbm {
   private static final vd k = vd.c("chat.copy");
   private static final vd l = vd.c("chat.link.warning");
   private final String m;
   private final boolean n;

   public fbl(BooleanConsumer $$0, String $$1, boolean $$2) {
      this($$0, c($$2), vd.b($$1), $$1, $$2 ? vc.e : vc.g, $$2);
   }

   public fbl(BooleanConsumer $$0, vd $$1, String $$2, boolean $$3) {
      this($$0, $$1, a($$3, $$2), $$2, $$3 ? vc.e : vc.g, $$3);
   }

   public fbl(BooleanConsumer $$0, vd $$1, vd $$2, String $$3, vd $$4, boolean $$5) {
      super($$0, $$1, $$2);
      this.a = (vd)($$5 ? vd.c("chat.link.open") : vc.f);
      this.b = $$4;
      this.n = !$$5;
      this.m = $$3;
   }

   protected static vr a(boolean $$0, String $$1) {
      return c($$0).b(vc.u).b(vd.b($$1));
   }

   protected static vr c(boolean $$0) {
      return vd.c($$0 ? "chat.link.confirmTrusted" : "chat.link.confirm");
   }

   @Override
   protected void a(int $$0) {
      this.d(ewy.a(this.a, $$0x -> this.c.accept(true)).a(this.g / 2 - 50 - 105, $$0, 100, 20).a());
      this.d(ewy.a(k, $$0x -> {
         this.m();
         this.c.accept(false);
      }).a(this.g / 2 - 50, $$0, 100, 20).a());
      this.d(ewy.a(this.b, $$0x -> this.c.accept(false)).a(this.g / 2 - 50 + 105, $$0, 100, 20).a());
   }

   public void m() {
      this.f.o.a(this.m);
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.n) {
         $$0.a(this.i, l, this.g / 2, 110, 16764108);
      }
   }

   public static void a(fct $$0, String $$1) {
      eva $$2 = eva.N();
      $$2.a(new fbl($$3 -> {
         if ($$3) {
            ac.i().a($$1);
         }

         $$2.a($$0);
      }, $$1, true));
   }

   public static ewy.c b(fct $$0, String $$1) {
      return $$2 -> a($$0, $$1);
   }
}
