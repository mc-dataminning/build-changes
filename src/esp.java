import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class esp extends gkc {
   static final vd b = vd.c("mco.warning");
   static final vd c = vd.c("mco.info");
   private final esp.a v;
   private final vd w;
   private final vd x;
   protected final BooleanConsumer a;
   private final boolean y;

   public esp(BooleanConsumer $$0, esp.a $$1, vd $$2, vd $$3, boolean $$4) {
      super(eus.a);
      this.a = $$0;
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
      this.y = $$4;
   }

   @Override
   public void aN_() {
      if (this.y) {
         this.d(ewy.a(vc.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, g(8), 100, 20).a());
         this.d(ewy.a(vc.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, g(8), 100, 20).a());
      } else {
         this.d(ewy.a(vc.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, g(8), 100, 20).a());
      }
   }

   @Override
   public vd h() {
      return vc.b(this.v.d, this.w, this.x);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.a.accept(false);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.v.d, this.g / 2, g(2), this.v.c);
      $$0.a(this.i, this.w, this.g / 2, g(4), -1);
      $$0.a(this.i, this.x, this.g / 2, g(6), -1);
   }

   public static enum a {
      a(esp.b, -65536),
      b(esp.c, 8226750);

      public final int c;
      public final vd d;

      private a(vd $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
