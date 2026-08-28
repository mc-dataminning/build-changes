public enum dru implements ayz {
   a("inactive", dru.a.a) {
      @Override
      protected void a(aqk $$0, ja $$1, drr $$2, drt $$3, boolean $$4) {
         $$3.a(cua.l);
         $$0.c(3016, $$1, $$4 ? 1 : 0);
      }
   },
   b("active", dru.a.b) {
      @Override
      protected void a(aqk $$0, ja $$1, drr $$2, drt $$3, boolean $$4) {
         if (!$$3.b()) {
            drp.b.a($$0, this, $$2, $$3, $$1);
         }

         $$0.c(3015, $$1, $$4 ? 1 : 0);
      }
   },
   c("unlocking", dru.a.b) {
      @Override
      protected void a(aqk $$0, ja $$1, drr $$2, drt $$3, boolean $$4) {
         $$0.a(null, $$1, avf.AI, avg.e);
      }
   },
   d("ejecting", dru.a.b) {
      @Override
      protected void a(aqk $$0, ja $$1, drr $$2, drt $$3, boolean $$4) {
         $$0.a(null, $$1, avf.AK, avg.e);
      }

      @Override
      protected void a(aqk $$0, ja $$1, drr $$2, drt $$3) {
         $$0.a(null, $$1, avf.AD, avg.e);
      }
   };

   private static final int e = 20;
   private static final int f = 20;
   private static final int g = 20;
   private static final int h = 20;
   private final String i;
   private final dru.a j;

   dru(final String $$0, final dru.a $$1) {
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

   public dru a(aqk $$0, ja $$1, drr $$2, drs $$3, drt $$4) {
      return switch (this) {
         case a -> a($$0, $$1, $$2, $$3, $$4, $$2.c());
         case b -> a($$0, $$1, $$2, $$3, $$4, $$2.d());
         case c -> {
            $$3.b($$0.Z() + 20L);
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
               $$3.b($$0.Z() + (long)$$7);
               yield d;
            }
         }
      };
   }

   private static dru a(aqk $$0, ja $$1, drr $$2, drs $$3, drt $$4, double $$5) {
      $$4.a($$0, $$1, $$3, $$2, $$5);
      $$3.b($$0.Z() + 20L);
      return $$4.c() ? b : a;
   }

   public void a(aqk $$0, ja $$1, dru $$2, drr $$3, drt $$4, boolean $$5) {
      this.a($$0, $$1, $$3, $$4);
      $$2.a($$0, $$1, $$3, $$4, $$5);
   }

   protected void a(aqk $$0, ja $$1, drr $$2, drt $$3, boolean $$4) {
   }

   protected void a(aqk $$0, ja $$1, drr $$2, drt $$3) {
   }

   private void a(aqk $$0, ja $$1, cua $$2, float $$3) {
      kt.a($$0, $$2, 2, jf.b, evz.c($$1).a(jf.b, 1.2));
      $$0.c(3017, $$1, 0);
      $$0.a(null, $$1, avf.AF, avg.e, 1.0F, 0.8F + 0.4F * $$3);
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
