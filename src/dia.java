import com.google.common.annotations.VisibleForTesting;

public class dia extends dgv implements dnt.b<dia.a> {
   private final dia.a a;

   public dia(hx $$0, djh $$1) {
      super(dgx.K, $$0, $$1);
      this.a = new dia.a($$1, new dnn($$0));
   }

   public static void a(ctp $$0, hx $$1, djh $$2, dia $$3) {
      $$3.a.d().a($$0, $$1, $$0.F_(), true);
   }

   @Override
   public void a(sn $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(sn $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public dia.a c() {
      return this.a;
   }

   public static class a implements dnt {
      public static final int a = 8;
      final ddk b;
      private final djh c;
      private final dnv d;

      public a(djh $$0, dnv $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = ddk.a();
      }

      @Override
      public dnv a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dnt.a c() {
         return dnt.a.b;
      }

      @Override
      public boolean a(and $$0, dnr $$1, dnr.a $$2, elt $$3) {
         if ($$1 == dnr.p && $$2.a() instanceof bml $$4) {
            if (!$$4.eD()) {
               int $$5 = $$4.ee();
               if ($$4.ec() && $$5 > 0) {
                  this.b.a(hx.a($$3.a(ic.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eC();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, hx.a($$1x), this.c, $$0.F_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public ddk d() {
         return this.b;
      }

      private void a(and $$0, hx $$1, djh $$2, auv $$3) {
         $$0.a($$1, $$2.a(ddh.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(jx.G, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, ars.vd, art.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(ctp $$0, bml $$1) {
         if ($$1.eh() instanceof ane $$3) {
            bkt $$4 = $$1.ex() == null ? $$0.ai().a((cfi)$$3) : $$1.ex();
            am.X.a($$3, $$1, $$4);
         }
      }
   }
}
