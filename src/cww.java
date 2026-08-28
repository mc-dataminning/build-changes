public class cww extends cvq {
   private static final int q = 1;
   private static final int r = 1;
   public static final int m = 1;
   public static final int n = 2;
   public static final int o = 3;
   public static final int p = 100;
   private final buk s;
   private final cwc t;

   public cww(int $$0) {
      this($$0, new buy(1), new cxm(1));
   }

   public cww(int $$0, buk $$1, cwc $$2) {
      super(cwz.r, $$0);
      a($$1, 1);
      a($$2, 1);
      this.s = $$1;
      this.t = $$2;
      this.a(new cxn($$1, 0, 0, 0) {
         @Override
         public void d() {
            super.d();
            cww.this.a(this.c);
         }
      });
      this.a($$2);
   }

   @Override
   public boolean a(crx $$0, int $$1) {
      if ($$1 >= 100) {
         int $$2 = $$1 - 100;
         this.b(0, $$2);
         return true;
      } else {
         switch ($$1) {
            case 1:
               int $$4 = this.t.a(0);
               this.b(0, $$4 - 1);
               return true;
            case 2:
               int $$3 = this.t.a(0);
               this.b(0, $$3 + 1);
               return true;
            case 3:
               if (!$$0.gw()) {
                  return false;
               }

               czy $$5 = this.s.b(0);
               this.s.e();
               if (!$$0.gj().g($$5)) {
                  $$0.a($$5, false);
               }

               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public czy b(crx $$0, int $$1) {
      return czy.k;
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public boolean b(crx $$0) {
      return this.s.a($$0);
   }

   public czy l() {
      return this.s.a(0);
   }

   public int m() {
      return this.t.a(0);
   }
}
