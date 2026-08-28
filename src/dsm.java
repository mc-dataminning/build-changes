import com.google.common.annotations.VisibleForTesting;

public class dsm extends dre implements dyz.b<dsm.a> {
   private final dsm.a a;

   public dsm(je $$0, dua $$1) {
      super(drg.K, $$0, $$1);
      this.a = new dsm.a($$1, new dyt($$0));
   }

   public static void a(dds $$0, je $$1, dua $$2, dsm $$3) {
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

   public dsm.a b() {
      return this.a;
   }

   public static class a implements dyz {
      public static final int a = 8;
      final dnr b;
      private final dua c;
      private final dzb d;

      public a(dua $$0, dzb $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dnr.a();
      }

      @Override
      public dzb a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dyz.a c() {
         return dyz.a.b;
      }

      @Override
      public boolean a(arg $$0, jn<dyx> $$1, dyx.a $$2, eye $$3) {
         if ($$1.a(dyx.p) && $$2.a() instanceof buf $$4) {
            if (!$$4.eH()) {
               bsb $$5 = $$4.eC();
               int $$6 = $$4.a($$0, x.a($$5, bsb::d));
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
      public dnr d() {
         return this.b;
      }

      private void a(arg $$0, je $$1, dua $$2, azk $$3) {
         $$0.a($$1, $$2.b(dno.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ln.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awd.wb, awe.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dds $$0, buf $$1) {
         if ($$1.em() instanceof arh $$3) {
            bsb $$4 = $$1.eC() == null ? $$0.ak().a((cnp)$$3) : $$1.eC();
            an.Z.a($$3, $$1, $$4);
         }
      }
   }
}
