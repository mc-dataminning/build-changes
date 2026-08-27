import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class esx extends gkp {
   static final vf b = vf.c("mco.warning");
   static final vf c = vf.c("mco.info");
   private final esx.a v;
   private final vf w;
   private final vf x;
   protected final BooleanConsumer a;
   private final boolean y;

   public esx(BooleanConsumer $$0, esx.a $$1, vf $$2, vf $$3, boolean $$4) {
      super(eva.a);
      this.a = $$0;
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
      this.y = $$4;
   }

   @Override
   public void aN_() {
      if (this.y) {
         this.d(exg.a(ve.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, g(8), 100, 20).a());
         this.d(exg.a(ve.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, g(8), 100, 20).a());
      } else {
         this.d(exg.a(ve.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, g(8), 100, 20).a());
      }
   }

   @Override
   public vf h() {
      return ve.b(this.v.d, this.w, this.x);
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
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.v.d, this.g / 2, g(2), this.v.c);
      $$0.a(this.i, this.w, this.g / 2, g(4), -1);
      $$0.a(this.i, this.x, this.g / 2, g(6), -1);
   }

   public static enum a {
      a(esx.b, -65536),
      b(esx.c, 8226750);

      public final int c;
      public final vf d;

      private a(vf $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
