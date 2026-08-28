import com.google.common.annotations.VisibleForTesting;

public class dro extends dqh implements dyb.b<dro.a> {
   private final dro.a a;

   public dro(jd $$0, dtc $$1) {
      super(dqj.K, $$0, $$1);
      this.a = new dro.a($$1, new dxv($$0));
   }

   public static void a(dcw $$0, jd $$1, dtc $$2, dro $$3) {
      $$3.a.d().a($$0, $$1, $$0.E_(), true);
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      this.a.b.a($$0);
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dro.a b() {
      return this.a;
   }

   public static class a implements dyb {
      public static final int a = 8;
      final dmu b;
      private final dtc c;
      private final dyd d;

      public a(dtc $$0, dyd $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dmu.a();
      }

      @Override
      public dyd a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dyb.a c() {
         return dyb.a.b;
      }

      @Override
      public boolean a(aqu $$0, jm<dxz> $$1, dxz.a $$2, exa $$3) {
         if ($$1.a(dxz.p) && $$2.a() instanceof btn $$4) {
            if (!$$4.eE()) {
               brk $$5 = $$4.ez();
               int $$6 = $$4.a($$0, x.a($$5, brk::d));
               if ($$4.ef() && $$6 > 0) {
                  this.b.a(jd.a((jw)$$3.a(ji.b, 0.5)), $$6);
                  this.a($$0, $$4);
               }

               $$4.eD();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, jd.a((jw)$$1x), this.c, $$0.E_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dmu d() {
         return this.b;
      }

      private void a(aqu $$0, jd $$1, dtc $$2, ayw $$3) {
         $$0.a($$1, $$2.a(dmr.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(lm.I, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, avp.wa, avq.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(dcw $$0, btn $$1) {
         if ($$1.ej() instanceof aqv $$3) {
            brk $$4 = $$1.ez() == null ? $$0.aj().a((cmx)$$3) : $$1.ez();
            an.Z.a($$3, $$1, $$4);
         }
      }
   }
}
