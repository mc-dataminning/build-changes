import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class eze extends grl {
   static final wg b = wg.c("mco.warning");
   static final wg c = wg.c("mco.info");
   private final eze.a y;
   private final wg z;
   private final wg A;
   protected final BooleanConsumer a;
   private final boolean B;

   public eze(BooleanConsumer $$0, eze.a $$1, wg $$2, wg $$3, boolean $$4) {
      super(fbh.a);
      this.a = $$0;
      this.y = $$1;
      this.z = $$2;
      this.A = $$3;
      this.B = $$4;
   }

   @Override
   public void aN_() {
      if (this.B) {
         this.c(fdp.a(wf.f, $$0 -> this.a.accept(true)).a(this.k / 2 - 105, g(8), 100, 20).a());
         this.c(fdp.a(wf.g, $$0 -> this.a.accept(false)).a(this.k / 2 + 5, g(8), 100, 20).a());
      } else {
         this.c(fdp.a(wf.h, $$0 -> this.a.accept(true)).a(this.k / 2 - 50, g(8), 100, 20).a());
      }
   }

   @Override
   public wg i() {
      return wf.b(this.y.d, this.z, this.A);
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
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.y.d, this.k / 2, g(2), this.y.c);
      $$0.a(this.m, this.z, this.k / 2, g(4), -1);
      $$0.a(this.m, this.A, this.k / 2, g(6), -1);
   }

   public static enum a {
      a(eze.b, -65536),
      b(eze.c, 8226750);

      public final int c;
      public final wg d;

      private a(wg $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
