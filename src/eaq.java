public enum eaq implements bam {
   a("inactive", eaq.a.a) {
      @Override
      protected void a(ars $$0, iv $$1, ean $$2, eap $$3, boolean $$4) {
         $$3.a(czy.k);
         $$0.c(3016, $$1, $$4 ? 1 : 0);
      }
   },
   b("active", eaq.a.b) {
      @Override
      protected void a(ars $$0, iv $$1, ean $$2, eap $$3, boolean $$4) {
         if (!$$3.b()) {
            eal.b.a($$0, this, $$2, $$3, $$1);
         }

         $$0.c(3015, $$1, $$4 ? 1 : 0);
      }
   },
   c("unlocking", eaq.a.b) {
      @Override
      protected void a(ars $$0, iv $$1, ean $$2, eap $$3, boolean $$4) {
         $$0.a(null, $$1, awp.BN, awq.e);
      }
   },
   d("ejecting", eaq.a.b) {
      @Override
      protected void a(ars $$0, iv $$1, ean $$2, eap $$3, boolean $$4) {
         $$0.a(null, $$1, awp.BP, awq.e);
      }

      @Override
      protected void a(ars $$0, iv $$1, ean $$2, eap $$3) {
         $$0.a(null, $$1, awp.BH, awq.e);
      }
   };

   private static final int e = 20;
   private static final int f = 20;
   private static final int g = 20;
   private static final int h = 20;
   private final String i;
   private final eaq.a j;

   eaq(final String $$0, final eaq.a $$1) {
      this.i = $$0;
      this.j = $$1;
   }

   @Override
   public String c() {
      return this.i;
   }

   public int a() {
      return this.j.c;
   }

   public eaq a(ars $$0, iv $$1, ean $$2, eao $$3, eap $$4) {
      return switch (this) {
         case a -> a($$0, $$1, $$2, $$3, $$4, $$2.c());
         case b -> a($$0, $$1, $$2, $$3, $$4, $$2.d());
         case c -> {
            $$3.b($$0.ae() + 20L);
            yield d;
         }
         case d -> {
            if ($$3.d().isEmpty()) {
               $$3.e();
               yield a($$0, $$1, $$2, $$3, $$4, $$2.d());
            } else {
               float $$5 = $$3.h();
               this.a($$0, $$1, $$3.g(), $$5);
               $$4.a($$3.f());
               boolean $$6 = $$3.d().isEmpty();
               int $$7 = $$6 ? 20 : 20;
               $$3.b($$0.ae() + (long)$$7);
               yield d;
            }
         }
      };
   }

   private static eaq a(ars $$0, iv $$1, ean $$2, eao $$3, eap $$4, double $$5) {
      $$4.a($$0, $$1, $$3, $$2, $$5);
      $$3.b($$0.ae() + 20L);
      return $$4.c() ? b : a;
   }

   public void a(ars $$0, iv $$1, eaq $$2, ean $$3, eap $$4, boolean $$5) {
      this.a($$0, $$1, $$3, $$4);
      $$2.a($$0, $$1, $$3, $$4, $$5);
   }

   protected void a(ars $$0, iv $$1, ean $$2, eap $$3, boolean $$4) {
   }

   protected void a(ars $$0, iv $$1, ean $$2, eap $$3) {
   }

   private void a(ars $$0, iv $$1, czy $$2, float $$3) {
      lg.a($$0, $$2, 2, jb.b, ffq.c($$1).a(jb.b, 1.2));
      $$0.c(3017, $$1, 0);
      $$0.a(null, $$1, awp.BJ, awq.e, 1.0F, 0.8F + 0.4F * $$3);
   }

   static enum a {
      a(6),
      b(12);

      final int c;

      private a(final int $$0) {
         this.c = $$0;
      }
   }
}
