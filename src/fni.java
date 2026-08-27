public class fni implements fnk {
   private static final akf a = new akf("container/bundle/background");
   private static final int b = 4;
   private static final int c = 1;
   private static final int d = 18;
   private static final int e = 20;
   private final cuo f;

   public fni(cuo $$0) {
      this.f = $$0;
   }

   @Override
   public int a() {
      return this.c() + 4;
   }

   @Override
   public int a(fef $$0) {
      return this.b();
   }

   private int b() {
      return this.d() * 18 + 2;
   }

   private int c() {
      return this.e() * 20 + 2;
   }

   @Override
   public void a(fef $$0, int $$1, int $$2, feh $$3) {
      int $$4 = this.d();
      int $$5 = this.e();
      $$3.a(a, $$1, $$2, this.b(), this.c());
      boolean $$6 = this.f.c() >= 64;
      int $$7 = 0;

      for (int $$8 = 0; $$8 < $$5; $$8++) {
         for (int $$9 = 0; $$9 < $$4; $$9++) {
            int $$10 = $$1 + $$9 * 18 + 1;
            int $$11 = $$2 + $$8 * 20 + 1;
            this.a($$10, $$11, $$7++, $$6, $$3, $$0);
         }
      }
   }

   private void a(int $$0, int $$1, int $$2, boolean $$3, feh $$4, fef $$5) {
      if ($$2 >= this.f.b()) {
         this.a($$4, $$0, $$1, $$3 ? fni.a.a : fni.a.b);
      } else {
         csd $$6 = this.f.a($$2);
         this.a($$4, $$0, $$1, fni.a.b);
         $$4.a($$6, $$0 + 1, $$1 + 1, $$2);
         $$4.a($$5, $$6, $$0 + 1, $$1 + 1);
         if ($$2 == 0) {
            flr.a($$4, $$0 + 1, $$1 + 1, 0);
         }
      }
   }

   private void a(feh $$0, int $$1, int $$2, fni.a $$3) {
      $$0.a($$3.c, $$1, $$2, 0, $$3.d, $$3.e);
   }

   private int d() {
      return Math.max(2, (int)Math.ceil(Math.sqrt((double)this.f.b() + 1.0)));
   }

   private int e() {
      return (int)Math.ceil(((double)this.f.b() + 1.0) / (double)this.d());
   }

   static enum a {
      a(new akf("container/bundle/blocked_slot"), 18, 20),
      b(new akf("container/bundle/slot"), 18, 20);

      public final akf c;
      public final int d;
      public final int e;

      private a(akf $$0, int $$1, int $$2) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
      }
   }
}
