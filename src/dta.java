import com.google.common.annotations.VisibleForTesting;

public class dta extends drs implements dzn.b<dta.a> {
   private final dta.a a;

   public dta(je $$0, duo $$1) {
      super(dru.K, $$0, $$1);
      this.a = new dta.a($$1, new dzh($$0));
   }

   public static void a(deg $$0, je $$1, duo $$2, dta $$3) {
      $$3.a.d().a($$0, $$1, $$0.C_(), true);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dta.a b() {
      return this.a;
   }

   public static class a implements dzn {
      public static final int a = 8;
      final dof b;
      private final duo c;
      private final dzp d;

      public a(duo $$0, dzp $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dof.a();
      }

      @Override
      public dzp a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dzn.a c() {
         return dzn.a.b;
      }

      @Override
      public boolean a(arh $$0, jn<dzl> $$1, dzl.a $$2, eys $$3) {
         if ($$1.a(dzl.p) && $$2.a() instanceof buk $$4) {
            if (!$$4.eH()) {
               bsg $$5 = $$4.eC();
               int $$6 = $$4.a($$0, x.a($$5, bsg::d));
               if ($$4.ei() && $$6 > 0) {
                  this.b.a(je.a((jx)$$3.a(jj.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eG();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, je.a((jx)$$1x), this.c, $$0.C_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dof d() {
         return this.b;
      }

      private void a(arh $$0, je $$1, duo $$2, azl $$3) {
         $$0.a($$1, $$2.b(doc.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ln.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awe.wb, awf.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(deg $$0, buk $$1) {
         if ($$1.em() instanceof ari $$3) {
            bsg $$4 = $$1.eC() == null ? $$0.ak().a((cnu)$$3) : $$1.eC();
            an.Z.a($$3, $$1, $$4);
         }
      }
   }
}
