import com.google.common.annotations.VisibleForTesting;

public class dii extends dhd implements dob.b<dii.a> {
   private final dii.a a;

   public dii(hx $$0, djp $$1) {
      super(dhf.K, $$0, $$1);
      this.a = new dii.a($$1, new dnv($$0));
   }

   public static void a(ctx $$0, hx $$1, djp $$2, dii $$3) {
      $$3.a.d().a($$0, $$1, $$0.F_(), true);
   }

   @Override
   public void a(so $$0) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(so $$0) {
      this.a.b.b($$0);
      super.b($$0);
   }

   public dii.a c() {
      return this.a;
   }

   public static class a implements dob {
      public static final int a = 8;
      final dds b;
      private final djp c;
      private final dod d;

      public a(djp $$0, dod $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dds.a();
      }

      @Override
      public dod a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dob.a c() {
         return dob.a.b;
      }

      @Override
      public boolean a(ane $$0, ih<dnz> $$1, dnz.a $$2, emc $$3) {
         if ($$1.a(dnz.p) && $$2.a() instanceof bmo $$4) {
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
      public dds d() {
         return this.b;
      }

      private void a(ane $$0, hx $$1, djp $$2, auw $$3) {
         $$0.a($$1, $$2.a(ddp.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(jx.G, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, art.vs, aru.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(ctx $$0, bmo $$1) {
         if ($$1.eh() instanceof anf $$3) {
            bkv $$4 = $$1.ex() == null ? $$0.ai().a((cfq)$$3) : $$1.ex();
            am.X.a($$3, $$1, $$4);
         }
      }
   }
}
