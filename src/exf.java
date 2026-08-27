public class exf implements exh {
   public static final acq a = new acq("textures/gui/container/bundle.png");
   private static final int b = 4;
   private static final int c = 1;
   private static final int d = 128;
   private static final int e = 18;
   private static final int f = 20;
   private final hn<cfz> g;
   private final int h;

   public exf(cde $$0) {
      this.g = $$0.a();
      this.h = $$0.b();
   }

   @Override
   public int a() {
      return this.c() * 20 + 2 + 4;
   }

   @Override
   public int a(eov $$0) {
      return this.b() * 18 + 2;
   }

   @Override
   public void a(eov $$0, int $$1, int $$2, eox $$3) {
      int $$4 = this.b();
      int $$5 = this.c();
      boolean $$6 = this.h >= 64;
      int $$7 = 0;

      for (int $$8 = 0; $$8 < $$5; $$8++) {
         for (int $$9 = 0; $$9 < $$4; $$9++) {
            int $$10 = $$1 + $$9 * 18 + 1;
            int $$11 = $$2 + $$8 * 20 + 1;
            this.a($$10, $$11, $$7++, $$6, $$3, $$0);
         }
      }

      this.a($$1, $$2, $$4, $$5, $$3);
   }

   private void a(int $$0, int $$1, int $$2, boolean $$3, eox $$4, eov $$5) {
      if ($$2 >= this.g.size()) {
         this.a($$4, $$0, $$1, $$3 ? exf.a.b : exf.a.a);
      } else {
         cfz $$6 = this.g.get($$2);
         this.a($$4, $$0, $$1, exf.a.a);
         $$4.a($$6, $$0 + 1, $$1 + 1, $$2);
         $$4.a($$5, $$6, $$0 + 1, $$1 + 1);
         if ($$2 == 0) {
            evp.a($$4, $$0 + 1, $$1 + 1, 0);
         }
      }
   }

   private void a(int $$0, int $$1, int $$2, int $$3, eox $$4) {
      this.a($$4, $$0, $$1, exf.a.f);
      this.a($$4, $$0 + $$2 * 18 + 1, $$1, exf.a.f);

      for (int $$5 = 0; $$5 < $$2; $$5++) {
         this.a($$4, $$0 + 1 + $$5 * 18, $$1, exf.a.d);
         this.a($$4, $$0 + 1 + $$5 * 18, $$1 + $$3 * 20, exf.a.e);
      }

      for (int $$6 = 0; $$6 < $$3; $$6++) {
         this.a($$4, $$0, $$1 + $$6 * 20 + 1, exf.a.c);
         this.a($$4, $$0 + $$2 * 18 + 1, $$1 + $$6 * 20 + 1, exf.a.c);
      }

      this.a($$4, $$0, $$1 + $$3 * 20, exf.a.g);
      this.a($$4, $$0 + $$2 * 18 + 1, $$1 + $$3 * 20, exf.a.g);
   }

   private void a(eox $$0, int $$1, int $$2, exf.a $$3) {
      $$0.a(a, $$1, $$2, 0, (float)$$3.h, (float)$$3.i, $$3.j, $$3.k, 128, 128);
   }

   private int b() {
      return Math.max(2, (int)Math.ceil(Math.sqrt((double)this.g.size() + 1.0)));
   }

   private int c() {
      return (int)Math.ceil(((double)this.g.size() + 1.0) / (double)this.b());
   }

   static enum a {
      a(0, 0, 18, 20),
      b(0, 40, 18, 20),
      c(0, 18, 1, 20),
      d(0, 20, 18, 1),
      e(0, 60, 18, 1),
      f(0, 20, 1, 1),
      g(0, 60, 1, 1);

      public final int h;
      public final int i;
      public final int j;
      public final int k;

      private a(int $$0, int $$1, int $$2, int $$3) {
         this.h = $$0;
         this.i = $$1;
         this.j = $$2;
         this.k = $$3;
      }
   }
}
