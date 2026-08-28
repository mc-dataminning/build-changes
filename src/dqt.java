import com.google.common.annotations.VisibleForTesting;

public class dqt extends dpn implements dxc.b<dqt.a> {
   private final dqt.a a;

   public dqt(ja $$0, dsh $$1) {
      super(dpp.K, $$0, $$1);
      this.a = new dqt.a($$1, new dww($$0));
   }

   public static void a(dcd $$0, ja $$1, dsh $$2, dqt $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dqt.a b() {
      return this.a;
   }

   public static class a implements dxc {
      public static final int a = 8;
      final dma b;
      private final dsh c;
      private final dxe d;

      public a(dsh $$0, dxe $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dma.a();
      }

      @Override
      public dxe a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dxc.a c() {
         return dxc.a.b;
      }

      @Override
      public boolean a(aqk $$0, jj<dxa> $$1, dxa.a $$2, evz $$3) {
         if ($$1.a(dxa.p) && $$2.a() instanceof bsy $$4) {
            if (!$$4.eD()) {
               bqw $$5 = $$4.ey();
               int $$6 = $$4.a($$0, x.a($$5, bqw::d));
               if ($$4.ee() && $$6 > 0) {
                  this.b.a(ja.a($$3.a(jf.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eC();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, ja.a($$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dma d() {
         return this.b;
      }

      private void a(aqk $$0, ja $$1, dsh $$2, aym $$3) {
         $$0.a($$1, $$2.a(dlx.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lj.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, avf.wa, avg.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dcd $$0, bsy $$1) {
         if ($$1.ei() instanceof aql $$3) {
            bqw $$4 = $$1.ey() == null ? $$0.aj().a((cmh)$$3) : $$1.ey();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
