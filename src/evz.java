import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class evz extends gob {
   static final vs b = vs.c("mco.warning");
   static final vs c = vs.c("mco.info");
   private final evz.a v;
   private final vs w;
   private final vs x;
   protected final BooleanConsumer a;
   private final boolean y;

   public evz(BooleanConsumer $$0, evz.a $$1, vs $$2, vs $$3, boolean $$4) {
      super(eyc.a);
      this.a = $$0;
      this.v = $$1;
      this.w = $$2;
      this.x = $$3;
      this.y = $$4;
   }

   @Override
   public void aP_() {
      if (this.y) {
         this.c(fak.a(vr.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, g(8), 100, 20).a());
         this.c(fak.a(vr.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, g(8), 100, 20).a());
      } else {
         this.c(fak.a(vr.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, g(8), 100, 20).a());
      }
   }

   @Override
   public vs i() {
      return vr.b(this.v.d, this.w, this.x);
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
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.v.d, this.g / 2, g(2), this.v.c);
      $$0.a(this.i, this.w, this.g / 2, g(4), -1);
      $$0.a(this.i, this.x, this.g / 2, g(6), -1);
   }

   public static enum a {
      a(evz.b, -65536),
      b(evz.c, 8226750);

      public final int c;
      public final vs d;

      private a(vs $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
