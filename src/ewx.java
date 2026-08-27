import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ewx extends gpe {
   static final vu b = vu.c("mco.warning");
   static final vu c = vu.c("mco.info");
   private final ewx.a v;
   private final vu w;
   private final vu x;
   protected final BooleanConsumer a;
   private final boolean y;

   public ewx(BooleanConsumer $$0, ewx.a $$1, vu $$2, vu $$3, boolean $$4) {
      super(eza.a);
      this.a = $$0;
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
      this.y = $$4;
   }

   @Override
   public void aO_() {
      if (this.y) {
         this.c(fbi.a(vt.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, g(8), 100, 20).a());
         this.c(fbi.a(vt.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, g(8), 100, 20).a());
      } else {
         this.c(fbi.a(vt.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, g(8), 100, 20).a());
      }
   }

   @Override
   public vu i() {
      return vt.b(this.v.d, this.w, this.x);
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
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.v.d, this.g / 2, g(2), this.v.c);
      $$0.a(this.i, this.w, this.g / 2, g(4), -1);
      $$0.a(this.i, this.x, this.g / 2, g(6), -1);
   }

   public static enum a {
      a(ewx.b, -65536),
      b(ewx.c, 8226750);

      public final int c;
      public final vu d;

      private a(vu $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
