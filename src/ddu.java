import com.google.common.annotations.VisibleForTesting;

public class ddu extends dcq implements djq.b<ddu.a> {
   private final ddu.a a;

   public ddu(gw $$0, dfe $$1) {
      super(dcs.K, $$0, $$1);
      this.a = new ddu.a($$1, new djk($$0));
   }

   public static void a(cpq $$0, gw $$1, dfe $$2, ddu $$3) {
      $$3.a.d().a($$0, $$1, $$0.y_(), true);
   }

   @Override
   public void a(qu $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(qu $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public ddu.a c() {
      return this.a;
   }

   public static class a implements djq {
      public static final int a = 8;
      final czl b;
      private final dfe c;
      private final djs d;

      public a(dfe $$0, djs $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = czl.a();
      }

      @Override
      public djs a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public djq.a c() {
         return djq.a.b;
      }

      @Override
      public boolean a(akn $$0, djo $$1, djo.a $$2, ehi $$3) {
         if ($$1 == djo.p && $$2.a() instanceof bjb $$4) {
            if (!$$4.eB()) {
               int $$5 = $$4.ec();
               if ($$4.ea() && $$5 > 0) {
                  this.b.a(gw.a($$3.a(hc.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eA();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, gw.a($$1x), this.c, $$0.y_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public czl d() {
         return this.b;
      }

      private void a(akn $$0, gw $$1, dfe $$2, arx $$3) {
         $$0.a($$1, $$2.a(czi.a, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(ix.E, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, aoz.un, apa.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cpq $$0, bjb $$1) {
         if ($$1.ef() instanceof ako $$3) {
            bhj $$4 = $$1.ev() == null ? $$0.ag().a((cbp)$$3) : $$1.ev();
            al.W.a($$3, $$1, $$4);
         }
      }
   }
}
