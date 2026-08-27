import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eon extends gfd {
   static final tn b = tn.c("mco.warning");
   static final tn c = tn.c("mco.info");
   private final eon.a y;
   private final tn z;
   private final tn A;
   protected final BooleanConsumer a;
   private final boolean B;

   public eon(BooleanConsumer $$0, eon.a $$1, tn $$2, tn $$3, boolean $$4) {
      super(eqp.a);
      this.a = $$0;
      this.y = $$1;
      this.z = $$2;
      this.A = $$3;
      this.B = $$4;
   }

   @Override
   public void aH_() {
      if (this.B) {
         this.d(ess.a(tm.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(8), 100, 20).a());
         this.d(ess.a(tm.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(8), 100, 20).a());
      } else {
         this.d(ess.a(tm.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, h(8), 100, 20).a());
      }
   }

   @Override
   public tn g() {
      return tm.b(this.y.d, this.z, this.A);
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
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.y.d, this.g / 2, h(2), this.y.c);
      $$0.a(this.i, this.z, this.g / 2, h(4), -1);
      $$0.a(this.i, this.A, this.g / 2, h(6), -1);
   }

   public static enum a {
      a(eon.b, -65536),
      b(eon.c, 8226750);

      public final int c;
      public final tn d;

      private a(tn $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
