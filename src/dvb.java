public enum dvb implements baj {
   a("inactive", dvb.a.a) {
      @Override
      protected void a(arq $$0, jh $$1, duy $$2, dva $$3, boolean $$4) {
         $$3.a(cwf.k);
         $$0.c(3016, $$1, $$4 ? 1 : 0);
      }
   },
   b("active", dvb.a.b) {
      @Override
      protected void a(arq $$0, jh $$1, duy $$2, dva $$3, boolean $$4) {
         if (!$$3.b()) {
            duw.b.a($$0, this, $$2, $$3, $$1);
         }

         $$0.c(3015, $$1, $$4 ? 1 : 0);
      }
   },
   c("unlocking", dvb.a.b) {
      @Override
      protected void a(arq $$0, jh $$1, duy $$2, dva $$3, boolean $$4) {
         $$0.a(null, $$1, awo.AN, awp.e);
      }
   },
   d("ejecting", dvb.a.b) {
      @Override
      protected void a(arq $$0, jh $$1, duy $$2, dva $$3, boolean $$4) {
         $$0.a(null, $$1, awo.AP, awp.e);
      }

      @Override
      protected void a(arq $$0, jh $$1, duy $$2, dva $$3) {
         $$0.a(null, $$1, awo.AH, awp.e);
      }
   };

   private static final int e = 20;
   private static final int f = 20;
   private static final int g = 20;
   private static final int h = 20;
   private final String i;
   private final dvb.a j;

   dvb(final String $$0, final dvb.a $$1) {
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

   public dvb a(arq $$0, jh $$1, duy $$2, duz $$3, dva $$4) {
      return switch (this) {
         case a -> a($$0, $$1, $$2, $$3, $$4, $$2.c());
         case b -> a($$0, $$1, $$2, $$3, $$4, $$2.d());
         case c -> {
            $$3.b($$0.aa() + 20L);
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
               $$3.b($$0.aa() + (long)$$7);
               yield d;
            }
         }
      };
   }

   private static dvb a(arq $$0, jh $$1, duy $$2, duz $$3, dva $$4, double $$5) {
      $$4.a($$0, $$1, $$3, $$2, $$5);
      $$3.b($$0.aa() + 20L);
      return $$4.c() ? b : a;
   }

   public void a(arq $$0, jh $$1, dvb $$2, duy $$3, dva $$4, boolean $$5) {
      this.a($$0, $$1, $$3, $$4);
      $$2.a($$0, $$1, $$3, $$4, $$5);
   }

   protected void a(arq $$0, jh $$1, duy $$2, dva $$3, boolean $$4) {
   }

   protected void a(arq $$0, jh $$1, duy $$2, dva $$3) {
   }

   private void a(arq $$0, jh $$1, cwf $$2, float $$3) {
      la.a($$0, $$2, 2, jm.b, ezr.c($$1).a(jm.b, 1.2));
      $$0.c(3017, $$1, 0);
      $$0.a(null, $$1, awo.AJ, awp.e, 1.0F, 0.8F + 0.4F * $$3);
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
