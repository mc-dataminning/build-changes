import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fdy extends gxb {
   static final xe b = xe.c("mco.warning");
   static final xe c = xe.c("mco.info");
   private final fdy.a B;
   private final xe C;
   private final xe D;
   protected final BooleanConsumer a;
   private final boolean E;

   public fdy(BooleanConsumer $$0, fdy.a $$1, xe $$2, xe $$3, boolean $$4) {
      super(fgb.a);
      this.a = $$0;
      this.B = $$1;
      this.C = $$2;
      this.D = $$3;
      this.E = $$4;
   }

   @Override
   public void aN_() {
      if (this.E) {
         this.c(fin.a(xd.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(8), 100, 20).a());
         this.c(fin.a(xd.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(8), 100, 20).a());
      } else {
         this.c(fin.a(xd.h, $$0 -> this.a.accept(true)).a(this.n / 2 - 50, g(8), 100, 20).a());
      }
   }

   @Override
   public xe i() {
      return xd.b(this.B.d, this.C, this.D);
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
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.B.d, this.n / 2, g(2), this.B.c);
      $$0.a(this.p, this.C, this.n / 2, g(4), -1);
      $$0.a(this.p, this.D, this.n / 2, g(6), -1);
   }

   public static enum a {
      a(fdy.b, -65536),
      b(fdy.c, 8226750);

      public final int c;
      public final xe d;

      private a(xe $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
