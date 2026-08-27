public class cpz extends cov {
   private static final int o = 1;
   private static final int p = 1;
   public static final int k = 1;
   public static final int l = 2;
   public static final int m = 3;
   public static final int n = 100;
   private final bpp q;
   private final cpf r;

   public cpz(int $$0) {
      this($$0, new bqf(1), new cqp(1));
   }

   public cpz(int $$0, bpp $$1, cpf $$2) {
      super(cqc.r, $$0);
      a($$1, 1);
      a($$2, 1);
      this.q = $$1;
      this.r = $$2;
      this.a(new cqq($$1, 0, 0, 0) {
         @Override
         public void b() {
            super.b();
            cpz.this.a(this.c);
         }
      });
      this.a($$2);
   }

   @Override
   public boolean b(cly $$0, int $$1) {
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
               if (!$$0.go()) {
                  return false;
               }

               ctq $$5 = this.q.b(0);
               this.q.e();
               if (!$$0.gc().f($$5)) {
                  $$0.a($$5, false);
               }

               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public ctq a(cly $$0, int $$1) {
      return ctq.i;
   }

   @Override
   public void a(int $$0, int $$1) {
      super.a($$0, $$1);
      this.d();
   }

   @Override
   public boolean a(cly $$0) {
      return this.q.a($$0);
   }

   public ctq l() {
      return this.q.a(0);
   }

   public int m() {
      return this.r.a(0);
   }
}
