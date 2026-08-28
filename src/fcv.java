import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fcv extends gvh {
   static final xp b = xp.c("mco.warning");
   static final xp c = xp.c("mco.info");
   private final fcv.a B;
   private final xp C;
   private final xp D;
   protected final BooleanConsumer a;
   private final boolean E;

   public fcv(BooleanConsumer $$0, fcv.a $$1, xp $$2, xp $$3, boolean $$4) {
      super(fey.a);
      this.a = $$0;
      this.B = $$1;
      this.C = $$2;
      this.D = $$3;
      this.E = $$4;
   }

   @Override
   public void aM_() {
      if (this.E) {
         this.c(fhf.a(xo.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(8), 100, 20).a());
         this.c(fhf.a(xo.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(8), 100, 20).a());
      } else {
         this.c(fhf.a(xo.h, $$0 -> this.a.accept(true)).a(this.n / 2 - 50, g(8), 100, 20).a());
      }
   }

   @Override
   public xp i() {
      return xo.b(this.B.d, this.C, this.D);
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
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.B.d, this.n / 2, g(2), this.B.c);
      $$0.a(this.p, this.C, this.n / 2, g(4), -1);
      $$0.a(this.p, this.D, this.n / 2, g(6), -1);
   }

   public static enum a {
      a(fcv.b, -65536),
      b(fcv.c, 8226750);

      public final int c;
      public final xp d;

      private a(final xp $$0, final int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
