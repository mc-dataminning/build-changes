import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eod extends gei {
   static final tf b = tf.c("mco.warning");
   static final tf c = tf.c("mco.info");
   private final eod.a y;
   private final tf z;
   private final tf A;
   protected final BooleanConsumer a;
   private final boolean B;

   public eod(BooleanConsumer $$0, eod.a $$1, tf $$2, tf $$3, boolean $$4) {
      super(eqe.a);
      this.a = $$0;
      this.y = $$1;
      this.z = $$2;
      this.A = $$3;
      this.B = $$4;
   }

   @Override
   public void aE_() {
      if (this.B) {
         this.d(esh.a(te.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(8), 100, 20).a());
         this.d(esh.a(te.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(8), 100, 20).a());
      } else {
         this.d(esh.a(te.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, h(8), 100, 20).a());
      }
   }

   @Override
   public tf e() {
      return te.b(this.y.d, this.z, this.A);
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
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.y.d, this.g / 2, h(2), this.y.c);
      $$0.a(this.i, this.z, this.g / 2, h(4), -1);
      $$0.a(this.i, this.A, this.g / 2, h(6), -1);
   }

   public static enum a {
      a(eod.b, -65536),
      b(eod.c, 8226750);

      public final int c;
      public final tf d;

      private a(tf $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
