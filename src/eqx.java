import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eqx extends ghw {
   static final uv b = uv.c("mco.warning");
   static final uv c = uv.c("mco.info");
   private final eqx.a v;
   private final uv w;
   private final uv x;
   protected final BooleanConsumer a;
   private final boolean y;

   public eqx(BooleanConsumer $$0, eqx.a $$1, uv $$2, uv $$3, boolean $$4) {
      super(eta.a);
      this.a = $$0;
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
      this.y = $$4;
   }

   @Override
   public void aQ_() {
      if (this.y) {
         this.d(eve.a(uu.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(8), 100, 20).a());
         this.d(eve.a(uu.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(8), 100, 20).a());
      } else {
         this.d(eve.a(uu.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, h(8), 100, 20).a());
      }
   }

   @Override
   public uv h() {
      return uu.b(this.v.d, this.w, this.x);
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
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.v.d, this.g / 2, h(2), this.v.c);
      $$0.a(this.i, this.w, this.g / 2, h(4), -1);
      $$0.a(this.i, this.x, this.g / 2, h(6), -1);
   }

   public static enum a {
      a(eqx.b, -65536),
      b(eqx.c, 8226750);

      public final int c;
      public final uv d;

      private a(uv $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
