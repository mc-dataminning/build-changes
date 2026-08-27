import com.google.common.annotations.VisibleForTesting;

public class dkq extends djl implements dqt.b<dkq.a> {
   private final dkq.a a;

   public dkq(ib $$0, dme $$1) {
      super(djn.K, $$0, $$1);
      this.a = new dkq.a($$1, new dqn($$0));
   }

   public static void a(cwe $$0, ib $$1, dme $$2, dkq $$3) {
      $$3.a.d().a($$0, $$1, $$0.F_(), true);
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      this.a.b.a($$0);
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      this.a.b.b($$0);
      super.b($$0, $$1);
   }

   public dkq.a b() {
      return this.a;
   }

   public static class a implements dqt {
      public static final int a = 8;
      final dfz b;
      private final dme c;
      private final dqv d;

      public a(dme $$0, dqv $$1) {
         this.c = $$0;
         this.d = $$1;
         this.b = dfz.a();
      }

      @Override
      public dqv a() {
         return this.d;
      }

      @Override
      public int b() {
         return 8;
      }

      @Override
      public dqt.a c() {
         return dqt.a.b;
      }

      @Override
      public boolean a(apa $$0, il<dqr> $$1, dqr.a $$2, eov $$3) {
         if ($$1.a(dqr.p) && $$2.a() instanceof box $$4) {
            if (!$$4.eC()) {
               int $$5 = $$4.ed();
               if ($$4.eb() && $$5 > 0) {
                  this.b.a(ib.a($$3.a(ih.b, 0.5)), $$5);
                  this.a($$0, $$4);
               }

               $$4.eB();
               this.d.a($$0).ifPresent($$1x -> this.a($$0, ib.a($$1x), this.c, $$0.F_()));
            }

            return true;
         } else {
            return false;
         }
      }

      @VisibleForTesting
      public dfz d() {
         return this.b;
      }

      private void a(apa $$0, ib $$1, dme $$2, awt $$3) {
         $$0.a($$1, $$2.a(dfw.b, Boolean.valueOf(true)), 3);
         $$0.a($$1, $$2.b(), 8);
         $$0.a(kb.G, (double)$$1.u() + 0.5, (double)$$1.v() + 1.15, (double)$$1.w() + 0.5, 2, 0.2, 0.0, 0.2, 0.0);
         $$0.a(null, $$1, atp.vt, atq.e, 2.0F, 0.6F + $$3.i() * 0.4F);
      }

      private void a(cwe $$0, box $$1) {
         if ($$1.eg() instanceof apb $$3) {
            bne $$4 = $$1.ew() == null ? $$0.ah().a((cia)$$3) : $$1.ew();
            am.Z.a($$3, $$1, $$4);
         }
      }
   }
}
