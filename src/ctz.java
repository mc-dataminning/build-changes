public class ctz extends cst {
   private static final int q = 1;
   private static final int r = 1;
   public static final int m = 1;
   public static final int n = 2;
   public static final int o = 3;
   public static final int p = 100;
   private final bst s;
   private final ctf t;

   public ctz(int $$0) {
      this($$0, new bth(1), new cup(1));
   }

   public ctz(int $$0, bst $$1, ctf $$2) {
      super(cuc.r, $$0);
      a($$1, 1);
      a($$2, 1);
      this.s = $$1;
      this.t = $$2;
      this.a(new cuq($$1, 0, 0, 0) {
         @Override
         public void c() {
            super.c();
            ctz.this.a(this.c);
         }
      });
      this.a($$2);
   }

   @Override
   public boolean a(cpo $$0, int $$1) {
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
               if (!$$0.gv()) {
                  return false;
               }

               cxg $$5 = this.s.b(0);
               this.s.e();
               if (!$$0.gi().f($$5)) {
                  $$0.a($$5, false);
               }

               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public cxg b(cpo $$0, int $$1) {
      return cxg.j;
   }

   @Override
   public void b(int $$0, int $$1) {
      super.b($$0, $$1);
      this.d();
   }

   @Override
   public boolean b(cpo $$0) {
      return this.s.a($$0);
   }

   public cxg l() {
      return this.s.a(0);
   }

   public int m() {
      return this.t.a(0);
   }
}
