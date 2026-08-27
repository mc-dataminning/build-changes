public class cvn extends cwh {
   public static final int a = 3;
   public static final dga b = dfq.as;
   private static final int c = 4;
   private static final int d = 2;

   public cvn(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.z($$2) > 11 - $$0.c(b) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         gu.a $$4 = new gu.a();

         for (ha $$5 : ha.values()) {
            $$4.a($$2, $$5);
            dfa $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, arp.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, arp.a($$3, 20, 40));
      }
   }

   private boolean e(dfa $$0, cpm $$1, gu $$2) {
      int $$3 = $$0.c(b);
      if ($$3 < 3) {
         $$1.a($$2, $$0.a(b, Integer.valueOf($$3 + 1)), 2);
         return false;
      } else {
         this.d($$0, $$1, $$2);
         return true;
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      if ($$3.n().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cos $$0, gu $$1, int $$2) {
      int $$3 = 0;
      gu.a $$4 = new gu.a();

      for (ha $$5 : ha.values()) {
         $$4.a($$1, $$5);
         if ($$0.a_($$4).a(this)) {
            if (++$$3 >= $$2) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(b);
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return ciy.b;
   }
}
