import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class ezn extends gru {
   static final wi b = wi.c("mco.warning");
   static final wi c = wi.c("mco.info");
   private final ezn.a y;
   private final wi z;
   private final wi A;
   protected final BooleanConsumer a;
   private final boolean B;

   public ezn(BooleanConsumer $$0, ezn.a $$1, wi $$2, wi $$3, boolean $$4) {
      super(fbq.a);
      this.a = $$0;
      this.y = $$1;
      this.z = $$2;
      this.A = $$3;
      this.B = $$4;
   }

   @Override
   public void aM_() {
      if (this.B) {
         this.c(fdy.a(wh.f, $$0 -> this.a.accept(true)).a(this.k / 2 - 105, g(8), 100, 20).a());
         this.c(fdy.a(wh.g, $$0 -> this.a.accept(false)).a(this.k / 2 + 5, g(8), 100, 20).a());
      } else {
         this.c(fdy.a(wh.h, $$0 -> this.a.accept(true)).a(this.k / 2 - 50, g(8), 100, 20).a());
      }
   }

   @Override
   public wi i() {
      return wh.b(this.y.d, this.z, this.A);
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
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.y.d, this.k / 2, g(2), this.y.c);
      $$0.a(this.m, this.z, this.k / 2, g(4), -1);
      $$0.a(this.m, this.A, this.k / 2, g(6), -1);
   }

   public static enum a {
      a(ezn.b, -65536),
      b(ezn.c, 8226750);

      public final int c;
      public final wi d;

      private a(wi $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
