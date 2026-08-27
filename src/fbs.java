public class fbs implements fbu {
   private static final afw a = new afw("container/bundle/background");
   private static final int b = 4;
   private static final int c = 1;
   private static final int d = 18;
   private static final int e = 20;
   private final il<ckj> f;
   private final int g;

   public fbs(cho $$0) {
      this.f = $$0.a();
      this.g = $$0.b();
   }

   @Override
   public int a() {
      return this.c() + 4;
   }

   @Override
   public int a(esw $$0) {
      return this.b();
   }

   private int b() {
      return this.d() * 18 + 2;
   }

   private int c() {
      return this.e() * 20 + 2;
   }

   @Override
   public void a(esw $$0, int $$1, int $$2, esy $$3) {
      int $$4 = this.d();
      int $$5 = this.e();
      $$3.a(a, $$1, $$2, this.b(), this.c());
      boolean $$6 = this.g >= 64;
      int $$7 = 0;

      for (int $$8 = 0; $$8 < $$5; $$8++) {
         for (int $$9 = 0; $$9 < $$4; $$9++) {
            int $$10 = $$1 + $$9 * 18 + 1;
            int $$11 = $$2 + $$8 * 20 + 1;
            this.a($$10, $$11, $$7++, $$6, $$3, $$0);
         }
      }
   }

   private void a(int $$0, int $$1, int $$2, boolean $$3, esy $$4, esw $$5) {
      if ($$2 >= this.f.size()) {
         this.a($$4, $$0, $$1, $$3 ? fbs.a.a : fbs.a.b);
      } else {
         ckj $$6 = this.f.get($$2);
         this.a($$4, $$0, $$1, fbs.a.b);
         $$4.a($$6, $$0 + 1, $$1 + 1, $$2);
         $$4.a($$5, $$6, $$0 + 1, $$1 + 1);
         if ($$2 == 0) {
            fac.a($$4, $$0 + 1, $$1 + 1, 0);
         }
      }
   }

   private void a(esy $$0, int $$1, int $$2, fbs.a $$3) {
      $$0.a($$3.c, $$1, $$2, 0, $$3.d, $$3.e);
   }

   private int d() {
      return Math.max(2, (int)Math.ceil(Math.sqrt((double)this.f.size() + 1.0)));
   }

   private int e() {
      return (int)Math.ceil(((double)this.f.size() + 1.0) / (double)this.d());
   }

   static enum a {
      a(new afw("container/bundle/blocked_slot"), 18, 20),
      b(new afw("container/bundle/slot"), 18, 20);

      public final afw c;
      public final int d;
      public final int e;

      private a(afw $$0, int $$1, int $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }
   }
}
