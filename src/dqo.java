import com.google.common.annotations.VisibleForTesting;

public class dqo extends dpi implements dwy.b<dqo.a> {
   private final dqo.a a;

   public dqo(iz $$0, dsd $$1) {
      super(dpk.K, $$0, $$1);
      this.a = new dqo.a($$1, new dws($$0));
   }

   public static void a(dbz $$0, iz $$1, dsd $$2, dqo $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dqo.a b() {
      return this.a;
   }

   public static class a implements dwy {
      public static final int a = 8;
      final dlv b;
      private final dsd c;
      private final dxa d;

      public a(dsd $$0, dxa $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dlv.a();
      }

      @Override
      public dxa a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dwy.a c() {
         return dwy.a.b;
      }

      @Override
      public boolean a(arf $$0, ji<dww> $$1, dww.a $$2, evs $$3) {
         if ($$1.a(dww.p) && $$2.a() instanceof btq $$4) {
            if (!$$4.eI()) {
               int $$5 = $$4.ej();
               if ($$4.eh() && $$5 > 0) {
                  this.b.a(iz.a($$3.a(je.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eH();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, iz.a($$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dlv d() {
         return this.b;
      }

      private void a(arf $$0, iz $$1, dsd $$2, azh $$3) {
         $$0.a($$1, $$2.a(dls.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(li.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, awa.vX, awb.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dbz $$0, btq $$1) {
         if ($$1.em() instanceof arg $$3) {
            bro $$4 = $$1.eC() == null ? $$0.aj().a((cmy)$$3) : $$1.eC();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
