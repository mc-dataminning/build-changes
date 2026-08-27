public enum dpl implements ayq {
   a("inactive", dpl.a.a) {
      @Override
      protected void a(aqe $$0, im $$1, dpi $$2, dpk $$3) {
         $$3.a(csd.i);
         $$0.c(3016, $$1, 0);
      }
   },
   b("active", dpl.a.b) {
      @Override
      protected void a(aqe $$0, im $$1, dpi $$2, dpk $$3) {
         if (!$$3.b()) {
            dpg.b.a($$0, this, $$2, $$3, $$1);
         }

         $$0.c(3015, $$1, 0);
      }
   },
   c("unlocking", dpl.a.b) {
      @Override
      protected void a(aqe $$0, im $$1, dpi $$2, dpk $$3) {
         $$0.a(null, $$1, auz.At, ava.e);
      }
   },
   d("ejecting", dpl.a.b) {
      @Override
      protected void a(aqe $$0, im $$1, dpi $$2, dpk $$3) {
         $$0.a(null, $$1, auz.Av, ava.e);
      }

      @Override
      protected void b(aqe $$0, im $$1, dpi $$2, dpk $$3) {
         $$0.a(null, $$1, auz.Ao, ava.e);
      }
   };

   private static final int e = 20;
   private static final int f = 20;
   private static final int g = 20;
   private static final int h = 20;
   private final String i;
   private final dpl.a j;

   dpl(String $$0, dpl.a $$1) {
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

   public dpl a(aqe $$0, im $$1, dpi $$2, dpj $$3, dpk $$4) {
      return switch (this) {
         case a -> a($$0, $$1, $$2, $$3, $$4, $$2.c());
         case b -> a($$0, $$1, $$2, $$3, $$4, $$2.d());
         case c -> {
            $$3.b($$0.Y() + 20L);
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
               $$3.b($$0.Y() + (long)$$7);
               yield d;
            }
         }
      };
   }

   private static dpl a(aqe $$0, im $$1, dpi $$2, dpj $$3, dpk $$4, double $$5) {
      $$4.a($$0, $$1, $$3, $$2, $$5);
      $$3.b($$0.Y() + 20L);
      return $$4.c() ? b : a;
   }

   public void a(aqe $$0, im $$1, dpl $$2, dpi $$3, dpk $$4) {
      this.b($$0, $$1, $$3, $$4);
      $$2.a($$0, $$1, $$3, $$4);
   }

   protected void a(aqe $$0, im $$1, dpi $$2, dpk $$3) {
   }

   protected void b(aqe $$0, im $$1, dpi $$2, dpk $$3) {
   }

   private void a(aqe $$0, im $$1, csd $$2, float $$3) {
      kg.a($$0, $$2, 2, ir.b, etf.c($$1).a(ir.b, 1.2));
      $$0.c(3017, $$1, 0);
      $$0.a(null, $$1, auz.Aq, ava.e, 1.0F, 0.8F + 0.4F * $$3);
   }

   static enum a {
      a(6),
      b(12);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }
}
