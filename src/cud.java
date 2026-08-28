public class cud extends csx {
   private static final int q = 1;
   private static final int r = 1;
   public static final int m = 1;
   public static final int n = 2;
   public static final int o = 3;
   public static final int p = 100;
   private final bsx s;
   private final ctj t;

   public cud(int $$0) {
      this($$0, new btl(1), new cut(1));
   }

   public cud(int $$0, bsx $$1, ctj $$2) {
      super(cug.r, $$0);
      a($$1, 1);
      a($$2, 1);
      this.s = $$1;
      this.t = $$2;
      this.a(new cuu($$1, 0, 0, 0) {
         @Override
         public void c() {
            super.c();
            cud.this.a(this.c);
         }
      });
      this.a($$2);
   }

   @Override
   public boolean a(cps $$0, int $$1) {
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
               if (!$$0.gt()) {
                  return false;
               }

               cxk $$5 = this.s.b(0);
               this.s.e();
               if (!$$0.gg().f($$5)) {
                  $$0.a($$5, false);
               }

               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public cxk b(cps $$0, int $$1) {
      return cxk.k;
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public boolean b(cps $$0) {
      return this.s.a($$0);
   }

   public cxk l() {
      return this.s.a(0);
   }

   public int m() {
      return this.t.a(0);
   }
}
