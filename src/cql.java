public class cql extends cpg {
   private static final int o = 1;
   private static final int p = 1;
   public static final int k = 1;
   public static final int l = 2;
   public static final int m = 3;
   public static final int n = 100;
   private final bpt q;
   private final cpq r;

   public cql(int $$0) {
      this($$0, new bqj(1), new crd(1));
   }

   public cql(int $$0, bpt $$1, cpq $$2) {
      super(cqo.s, $$0);
      a($$1, 1);
      a($$2, 1);
      this.q = $$1;
      this.r = $$2;
      this.a(new cre($$1, 0, 0, 0) {
         @Override
         public void b() {
            super.b();
            cql.this.a(this.d);
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
               if (!$$0.gz()) {
                  return false;
               }

               cuh $$5 = this.q.b(0);
               this.q.e();
               if (!$$0.gl().f($$5)) {
                  $$0.a($$5, false);
               }

               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public cuh a(cly $$0, int $$1) {
      return cuh.i;
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

   public cuh l() {
      return this.q.a(0);
   }

   public int m() {
      return this.r.a(0);
   }
}
