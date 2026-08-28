public class cqx extends cps {
   private static final int o = 1;
   private static final int p = 1;
   public static final int k = 1;
   public static final int l = 2;
   public static final int m = 3;
   public static final int n = 100;
   private final bqj q;
   private final cqd r;

   public cqx(int $$0) {
      this($$0, new bqz(1), new crn(1));
   }

   public cqx(int $$0, bqj $$1, cqd $$2) {
      super(cra.r, $$0);
      a($$1, 1);
      a($$2, 1);
      this.q = $$1;
      this.r = $$2;
      this.a(new cro($$1, 0, 0, 0) {
         @Override
         public void c() {
            super.c();
            cqx.this.a(this.c);
         }
      });
      this.a($$2);
   }

   @Override
   public boolean a(cmv $$0, int $$1) {
      if ($$1 >= 100) {
         int $$2 = $$1 - 100;
         this.a(0, $$2);
         return true;
      } else {
         switch ($$1) {
            case 1:
               int $$4 = this.r.a(0);
               this.a(0, $$4 - 1);
               return true;
            case 2:
               int $$3 = this.r.a(0);
               this.a(0, $$3 + 1);
               return true;
            case 3:
               if (!$$0.gl()) {
                  return false;
               }

               cuo $$5 = this.q.b(0);
               this.q.e();
               if (!$$0.fZ().f($$5)) {
                  $$0.a($$5, false);
               }

               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public cuo b(cmv $$0, int $$1) {
      return cuo.l;
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public boolean b(cmv $$0) {
      return this.q.a($$0);
   }

   public cuo l() {
      return this.q.a(0);
   }

   public int m() {
      return this.r.a(0);
   }
}
