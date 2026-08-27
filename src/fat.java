import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class fat extends gtb {
   static final wu b = wu.c("mco.warning");
   static final wu c = wu.c("mco.info");
   private final fat.a B;
   private final wu C;
   private final wu D;
   protected final BooleanConsumer a;
   private final boolean E;

   public fat(BooleanConsumer $$0, fat.a $$1, wu $$2, wu $$3, boolean $$4) {
      super(fcw.a);
      this.a = $$0;
      this.B = $$1;
      this.C = $$2;
      this.D = $$3;
      this.E = $$4;
   }

   @Override
   public void aM_() {
      if (this.E) {
         this.c(ffe.a(wt.f, $$0 -> this.a.accept(true)).a(this.n / 2 - 105, g(8), 100, 20).a());
         this.c(ffe.a(wt.g, $$0 -> this.a.accept(false)).a(this.n / 2 + 5, g(8), 100, 20).a());
      } else {
         this.c(ffe.a(wt.h, $$0 -> this.a.accept(true)).a(this.n / 2 - 50, g(8), 100, 20).a());
      }
   }

   @Override
   public wu i() {
      return wt.b(this.B.d, this.C, this.D);
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
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.B.d, this.n / 2, g(2), this.B.c);
      $$0.a(this.p, this.C, this.n / 2, g(4), -1);
      $$0.a(this.p, this.D, this.n / 2, g(6), -1);
   }

   public static enum a {
      a(fat.b, -65536),
      b(fat.c, 8226750);

      public final int c;
      public final wu d;

      private a(wu $$0, int $$1) {
         this.d = $$0;
         this.c = $$1;
      }
   }
}
