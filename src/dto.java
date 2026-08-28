import com.google.common.annotations.VisibleForTesting;

public class dto extends dsg implements eac.b<dto.a> {
   private final dto.a a;

   public dto(jg $$0, dvd $$1) {
      super(dsi.K, $$0, $$1);
      this.a = new dto.a($$1, new dzw($$0));
   }

   public static void a(dev $$0, jg $$1, dvd $$2, dto $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dto.a b() {
      return this.a;
   }

   public static class a implements eac {
      public static final int a = 8;
      final dot b;
      private final dvd c;
      private final eae d;

      public a(dvd $$0, eae $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dot.a();
      }

      @Override
      public eae a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public eac.a c() {
         return eac.a.b;
      }

      @Override
      public boolean a(arm $$0, jp<eaa> $$1, eaa.a $$2, ezh $$3) {
         if ($$1.a(eaa.p) && $$2.a() instanceof buv $$4) {
            if (!$$4.eM()) {
               bsp $$5 = $$4.eI();
               int $$6 = $$4.a($$0, x.a($$5, bsp::d));
               if ($$4.eo() && $$6 > 0) {
                  this.b.a(jg.a((jz)$$3.a(jl.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eL();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, jg.a((jz)$$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dot d() {
         return this.b;
      }

      private void a(arm $$0, jg $$1, dvd $$2, azr $$3) {
         $$0.a($$1, $$2.b(doq.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lq.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awk.vZ, awl.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dev $$0, buv $$1) {
         if ($$1.es() instanceof arn $$3) {
            bsp $$4 = $$1.eI() == null ? $$0.ak().a((coh)$$3) : $$1.eI();
            an.Z.a($$3, $$1, $$4);
         }
      }
   }
}
