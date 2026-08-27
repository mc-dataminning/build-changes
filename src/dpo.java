import com.google.common.annotations.VisibleForTesting;

public class dpo extends doi implements dvy.b<dpo.a> {
   private final dpo.a a;

   public dpo(io $$0, drd $$1) {
      super(dok.K, $$0, $$1);
      this.a = new dpo.a($$1, new dvs($$0));
   }

   public static void a(daz $$0, io $$1, drd $$2, dpo $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dpo.a b() {
      return this.a;
   }

   public static class a implements dvy {
      public static final int a = 8;
      final dkv b;
      private final drd c;
      private final dwa d;

      public a(drd $$0, dwa $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dkv.a();
      }

      @Override
      public dwa a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dvy.a c() {
         return dvy.a.b;
      }

      @Override
      public boolean a(aqn $$0, ix<dvw> $$1, dvw.a $$2, eum $$3) {
         if ($$1.a(dvw.p) && $$2.a() instanceof bsq $$4) {
            if (!$$4.eI()) {
               int $$5 = $$4.ej();
               if ($$4.eh() && $$5 > 0) {
                  this.b.a(io.a($$3.a(it.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eH();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, io.a($$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dkv d() {
         return this.b;
      }

      private void a(aqn $$0, io $$1, drd $$2, aym $$3) {
         $$0.a($$1, $$2.a(dks.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ky.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, avi.vX, avj.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(daz $$0, bsq $$1) {
         if ($$1.em() instanceof aqo $$3) {
            bqp $$4 = $$1.eC() == null ? $$0.ai().a((cly)$$3) : $$1.eC();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
