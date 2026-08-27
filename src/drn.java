import com.google.common.annotations.VisibleForTesting;

public class drn extends dqc implements dxx.b<drn.a> {
   private final drn.a a;

   public drn(ir $$0, dtc $$1) {
      super(dqe.L, $$0, $$1);
      this.a = new drn.a($$1, new dxr($$0));
   }

   public static void a(dca $$0, ir $$1, dtc $$2, drn $$3) {
      $$3.a.d().a($$0, $$1, $$0.F_(), true);
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public drn.a b() {
      return this.a;
   }

   public static class a implements dxx {
      public static final int a = 8;
      final dml b;
      private final dtc c;
      private final dxz d;

      public a(dtc $$0, dxz $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dml.a();
      }

      @Override
      public dxz a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dxx.a c() {
         return dxx.a.b;
      }

      @Override
      public boolean a(aqt $$0, ja<dxv> $$1, dxv.a $$2, ewu $$3) {
         if ($$1.a(dxv.p) && $$2.a() instanceof bso $$4) {
            if (!$$4.eP()) {
               int $$5 = $$4.er();
               if ($$4.ep() && $$5 > 0) {
                  this.b.a(ir.a($$3.a(iw.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eO();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, ir.a($$1x), this.c, $$0.F_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dml d() {
         return this.b;
      }

      private void a(aqt $$0, ir $$1, dtc $$2, ayt $$3) {
         $$0.a($$1, $$2.a(dmi.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lb.G, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, avo.wv, avq.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dca $$0, bso $$1) {
         if ($$1.eu() instanceof aqu $$3) {
            bqt $$4 = $$1.eK() == null ? $$0.aj().a((cly)$$3) : $$1.eK();
            an.Z.a($$3, $$1, $$4);
         }
      }
   }
}
