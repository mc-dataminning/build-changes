import com.google.common.annotations.VisibleForTesting;

public class dug extends dsy implements eat.b<dug.a> {
   private final dug.a a;

   public dug(jh $$0, dvv $$1) {
      super(dta.K, $$0, $$1);
      this.a = new dug.a($$1, new ean($$0));
   }

   public static void a(dfm $$0, jh $$1, dvv $$2, dug $$3) {
      $$3.a.d().a($$0, $$1, $$0.G_(), true);
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dug.a b() {
      return this.a;
   }

   public static class a implements eat {
      public static final int a = 8;
      final dpl b;
      private final dvv c;
      private final eav d;

      public a(dvv $$0, eav $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dpl.a();
      }

      @Override
      public eav a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public eat.a c() {
         return eat.a.b;
      }

      @Override
      public boolean a(arp $$0, jq<ear> $$1, ear.a $$2, ezy $$3) {
         if ($$1.a(ear.p) && $$2.a() instanceof bvh $$4) {
            if (!$$4.eI()) {
               btb $$5 = $$4.eF();
               int $$6 = $$4.a($$0, x.a($$5, btb::d));
               if ($$4.em() && $$6 > 0) {
                  this.b.a(jh.a((ka)$$3.a(jm.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eH();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, jh.a((ka)$$1x), this.c, $$0.G_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dpl d() {
         return this.b;
      }

      private void a(arp $$0, jh $$1, dvv $$2, azu $$3) {
         $$0.a($$1, $$2.b(dpi.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ls.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awn.vZ, awo.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dfm $$0, bvh $$1) {
         if ($$1.ep() instanceof arq $$3) {
            btb $$4 = $$1.eF() == null ? $$0.ai().a((cou)$$3) : $$1.eF();
            ao.Z.a($$3, $$1, $$4);
         }
      }
   }
}
