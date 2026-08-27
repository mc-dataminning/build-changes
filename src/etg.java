import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class etg extends gld {
   static final vg b = vg.c("mco.warning");
   static final vg c = vg.c("mco.info");
   private final etg.a v;
   private final vg w;
   private final vg x;
   protected final BooleanConsumer a;
   private final boolean y;

   public etg(BooleanConsumer $$0, etg.a $$1, vg $$2, vg $$3, boolean $$4) {
      super(evj.a);
      this.a = $$0;
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
      this.y = $$4;
   }

   @Override
   public void aP_() {
      if (this.y) {
         this.d(exr.a(vf.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, g(8), 100, 20).a());
         this.d(exr.a(vf.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, g(8), 100, 20).a());
      } else {
         this.d(exr.a(vf.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, g(8), 100, 20).a());
      }
   }

   @Override
   public vg i() {
      return vf.b(this.v.d, this.w, this.x);
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
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.v.d, this.g / 2, g(2), this.v.c);
      $$0.a(this.i, this.w, this.g / 2, g(4), -1);
      $$0.a(this.i, this.x, this.g / 2, g(6), -1);
   }

   public static enum a {
      a(etg.b, -65536),
      b(etg.c, 8226750);

      public final int c;
      public final vg d;

      private a(vg $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
