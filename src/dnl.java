import com.google.common.annotations.VisibleForTesting;

public class dnl extends dmf implements dtu.b<dnl.a> {
   private final dnl.a a;

   public dnl(ib $$0, doz $$1) {
      super(dmh.K, $$0, $$1);
      this.a = new dnl.a($$1, new dto($$0));
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dnl $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dnl.a b() {
      return this.a;
   }

   public static class a implements dtu {
      public static final int a = 8;
      final dis b;
      private final doz c;
      private final dtw d;

      public a(doz $$0, dtw $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dis.a();
      }

      @Override
      public dtw a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dtu.a c() {
         return dtu.a.b;
      }

      @Override
      public boolean a(aps $$0, il<dts> $$1, dts.a $$2, esa $$3) {
         if ($$1.a(dts.p) && $$2.a() instanceof bqo $$4) {
            if (!$$4.eF()) {
               int $$5 = $$4.eg();
               if ($$4.ee() && $$5 > 0) {
                  this.b.a(ib.a($$3.a(ih.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eE();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, ib.a($$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dis d() {
         return this.b;
      }

      private void a(aps $$0, ib $$1, doz $$2, axr $$3) {
         $$0.a($$1, $$2.a(dip.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(kl.H, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, aum.vE, aun.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cyx $$0, bqo $$1) {
         if ($$1.ej() instanceof apt $$3) {
            bot $$4 = $$1.ez() == null ? $$0.ai().a((cjt)$$3) : $$1.ez();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
