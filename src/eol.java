import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eol extends gfb {
   static final tm b = tm.c("mco.warning");
   static final tm c = tm.c("mco.info");
   private final eol.a y;
   private final tm z;
   private final tm A;
   protected final BooleanConsumer a;
   private final boolean B;

   public eol(BooleanConsumer $$0, eol.a $$1, tm $$2, tm $$3, boolean $$4) {
      super(eqn.a);
      this.a = $$0;
      this.y = $$1;
      this.z = $$2;
      this.A = $$3;
      this.B = $$4;
   }

   @Override
   public void aI_() {
      if (this.B) {
         this.d(esq.a(tl.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(8), 100, 20).a());
         this.d(esq.a(tl.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(8), 100, 20).a());
      } else {
         this.d(esq.a(tl.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, h(8), 100, 20).a());
      }
   }

   @Override
   public tm g() {
      return tl.b(this.y.d, this.z, this.A);
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
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.y.d, this.g / 2, h(2), this.y.c);
      $$0.a(this.i, this.z, this.g / 2, h(4), -1);
      $$0.a(this.i, this.A, this.g / 2, h(6), -1);
   }

   public static enum a {
      a(eol.b, -65536),
      b(eol.c, 8226750);

      public final int c;
      public final tm d;

      private a(tm $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
