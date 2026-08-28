import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fcp extends gvb {
   static final xl b = xl.c("mco.warning");
   static final xl c = xl.c("mco.info");
   private final fcp.a B;
   private final xl C;
   private final xl D;
   protected final BooleanConsumer a;
   private final boolean E;

   public fcp(BooleanConsumer $$0, fcp.a $$1, xl $$2, xl $$3, boolean $$4) {
      super(fes.a);
      this.a = $$0;
      this.B = $$1;
      this.C = $$2;
      this.D = $$3;
      this.E = $$4;
   }

   @Override
   public void aN_() {
      if (this.E) {
         this.c(fgz.a(xk.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(8), 100, 20).a());
         this.c(fgz.a(xk.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(8), 100, 20).a());
      } else {
         this.c(fgz.a(xk.h, $$0 -> this.a.accept(true)).a(this.n / 2 - 50, g(8), 100, 20).a());
      }
   }

   @Override
   public xl i() {
      return xk.b(this.B.d, this.C, this.D);
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
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.B.d, this.n / 2, g(2), this.B.c);
      $$0.a(this.p, this.C, this.n / 2, g(4), -1);
      $$0.a(this.p, this.D, this.n / 2, g(6), -1);
   }

   public static enum a {
      a(fcp.b, -65536),
      b(fcp.c, 8226750);

      public final int c;
      public final xl d;

      private a(final xl $$0, final int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
