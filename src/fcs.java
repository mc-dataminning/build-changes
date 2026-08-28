import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fcs extends gve {
   static final xo b = xo.c("mco.warning");
   static final xo c = xo.c("mco.info");
   private final fcs.a B;
   private final xo C;
   private final xo D;
   protected final BooleanConsumer a;
   private final boolean E;

   public fcs(BooleanConsumer $$0, fcs.a $$1, xo $$2, xo $$3, boolean $$4) {
      super(fev.a);
      this.a = $$0;
      this.B = $$1;
      this.C = $$2;
      this.D = $$3;
      this.E = $$4;
   }

   @Override
   public void aM_() {
      if (this.E) {
         this.c(fhc.a(xn.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(8), 100, 20).a());
         this.c(fhc.a(xn.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(8), 100, 20).a());
      } else {
         this.c(fhc.a(xn.h, $$0 -> this.a.accept(true)).a(this.n / 2 - 50, g(8), 100, 20).a());
      }
   }

   @Override
   public xo i() {
      return xn.b(this.B.d, this.C, this.D);
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
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.B.d, this.n / 2, g(2), this.B.c);
      $$0.a(this.p, this.C, this.n / 2, g(4), -1);
      $$0.a(this.p, this.D, this.n / 2, g(6), -1);
   }

   public static enum a {
      a(fcs.b, -65536),
      b(fcs.c, 8226750);

      public final int c;
      public final xo d;

      private a(final xo $$0, final int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
