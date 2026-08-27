import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class erz extends gjl {
   static final vb b = vb.c("mco.warning");
   static final vb c = vb.c("mco.info");
   private final erz.a v;
   private final vb w;
   private final vb x;
   protected final BooleanConsumer a;
   private final boolean y;

   public erz(BooleanConsumer $$0, erz.a $$1, vb $$2, vb $$3, boolean $$4) {
      super(euc.a);
      this.a = $$0;
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
      this.y = $$4;
   }

   @Override
   public void aP_() {
      if (this.y) {
         this.d(ewh.a(va.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(8), 100, 20).a());
         this.d(ewh.a(va.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(8), 100, 20).a());
      } else {
         this.d(ewh.a(va.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, h(8), 100, 20).a());
      }
   }

   @Override
   public vb h() {
      return va.b(this.v.d, this.w, this.x);
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
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.v.d, this.g / 2, h(2), this.v.c);
      $$0.a(this.i, this.w, this.g / 2, h(4), -1);
      $$0.a(this.i, this.x, this.g / 2, h(6), -1);
   }

   public static enum a {
      a(erz.b, -65536),
      b(erz.c, 8226750);

      public final int c;
      public final vb d;

      private a(vb $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
