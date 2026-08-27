import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class evd extends gnd {
   static final vq b = vq.c("mco.warning");
   static final vq c = vq.c("mco.info");
   private final evd.a v;
   private final vq w;
   private final vq x;
   protected final BooleanConsumer a;
   private final boolean y;

   public evd(BooleanConsumer $$0, evd.a $$1, vq $$2, vq $$3, boolean $$4) {
      super(exg.a);
      this.a = $$0;
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
      this.y = $$4;
   }

   @Override
   public void aQ_() {
      if (this.y) {
         this.c(ezo.a(vp.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, g(8), 100, 20).a());
         this.c(ezo.a(vp.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, g(8), 100, 20).a());
      } else {
         this.c(ezo.a(vp.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, g(8), 100, 20).a());
      }
   }

   @Override
   public vq i() {
      return vp.b(this.v.d, this.w, this.x);
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
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.v.d, this.g / 2, g(2), this.v.c);
      $$0.a(this.i, this.w, this.g / 2, g(4), -1);
      $$0.a(this.i, this.x, this.g / 2, g(6), -1);
   }

   public static enum a {
      a(evd.b, -65536),
      b(evd.c, 8226750);

      public final int c;
      public final vq d;

      private a(vq $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
