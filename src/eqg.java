import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eqg extends ghe {
   static final ur b = ur.c("mco.warning");
   static final ur c = ur.c("mco.info");
   private final eqg.a v;
   private final ur w;
   private final ur x;
   protected final BooleanConsumer a;
   private final boolean y;

   public eqg(BooleanConsumer $$0, eqg.a $$1, ur $$2, ur $$3, boolean $$4) {
      super(esj.a);
      this.a = $$0;
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
      this.y = $$4;
   }

   @Override
   public void aO_() {
      if (this.y) {
         this.d(eum.a(uq.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(8), 100, 20).a());
         this.d(eum.a(uq.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(8), 100, 20).a());
      } else {
         this.d(eum.a(uq.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, h(8), 100, 20).a());
      }
   }

   @Override
   public ur h() {
      return uq.b(this.v.d, this.w, this.x);
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
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.v.d, this.g / 2, h(2), this.v.c);
      $$0.a(this.i, this.w, this.g / 2, h(4), -1);
      $$0.a(this.i, this.x, this.g / 2, h(6), -1);
   }

   public static enum a {
      a(eqg.b, -65536),
      b(eqg.c, 8226750);

      public final int c;
      public final ur d;

      private a(ur $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
