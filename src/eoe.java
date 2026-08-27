import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eoe extends ged {
   static final te b = te.c("mco.warning");
   static final te c = te.c("mco.info");
   private final eoe.a y;
   private final te z;
   private final te A;
   protected final BooleanConsumer a;
   private final boolean B;

   public eoe(BooleanConsumer $$0, eoe.a $$1, te $$2, te $$3, boolean $$4) {
      super(eqf.a);
      this.a = $$0;
      this.y = $$1;
      this.z = $$2;
      this.A = $$3;
      this.B = $$4;
   }

   @Override
   public void aE_() {
      if (this.B) {
         this.d(esi.a(td.f, $$0 -> this.a.accept(true)).a(this.g / 2 - 105, h(8), 100, 20).a());
         this.d(esi.a(td.g, $$0 -> this.a.accept(false)).a(this.g / 2 + 5, h(8), 100, 20).a());
      } else {
         this.d(esi.a(td.h, $$0 -> this.a.accept(true)).a(this.g / 2 - 50, h(8), 100, 20).a());
      }
   }

   @Override
   public te e() {
      return td.b(this.y.d, this.z, this.A);
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
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.y.d, this.g / 2, h(2), this.y.c);
      $$0.a(this.i, this.z, this.g / 2, h(4), -1);
      $$0.a(this.i, this.A, this.g / 2, h(6), -1);
   }

   public static enum a {
      a(eoe.b, -65536),
      b(eoe.c, 8226750);

      public final int c;
      public final te d;

      private a(te $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
