public enum drr implements azu {
   a("inactive", drr.a.a) {
      @Override
      protected void a(arf $$0, iz $$1, dro $$2, drq $$3, boolean $$4) {
         $$3.a(cur.l);
         $$0.c(3016, $$1, $$4 ? 1 : 0);
      }
   },
   b("active", drr.a.b) {
      @Override
      protected void a(arf $$0, iz $$1, dro $$2, drq $$3, boolean $$4) {
         if (!$$3.b()) {
            drm.b.a($$0, this, $$2, $$3, $$1);
         }

         $$0.c(3015, $$1, $$4 ? 1 : 0);
      }
   },
   c("unlocking", drr.a.b) {
      @Override
      protected void a(arf $$0, iz $$1, dro $$2, drq $$3, boolean $$4) {
         $$0.a(null, $$1, awa.AF, awb.e);
      }
   },
   d("ejecting", drr.a.b) {
      @Override
      protected void a(arf $$0, iz $$1, dro $$2, drq $$3, boolean $$4) {
         $$0.a(null, $$1, awa.AH, awb.e);
      }

      @Override
      protected void a(arf $$0, iz $$1, dro $$2, drq $$3) {
         $$0.a(null, $$1, awa.AA, awb.e);
      }
   };

   private static final int e = 20;
   private static final int f = 20;
   private static final int g = 20;
   private static final int h = 20;
   private final String i;
   private final drr.a j;

   drr(final String $$0, final drr.a $$1) {
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

   public drr a(arf $$0, iz $$1, dro $$2, drp $$3, drq $$4) {
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

   private static drr a(arf $$0, iz $$1, dro $$2, drp $$3, drq $$4, double $$5) {
      $$4.a($$0, $$1, $$3, $$2, $$5);
      $$3.b($$0.Z() + 20L);
      return $$4.c() ? b : a;
   }

   public void a(arf $$0, iz $$1, drr $$2, dro $$3, drq $$4, boolean $$5) {
      this.a($$0, $$1, $$3, $$4);
      $$2.a($$0, $$1, $$3, $$4, $$5);
   }

   protected void a(arf $$0, iz $$1, dro $$2, drq $$3, boolean $$4) {
   }

   protected void a(arf $$0, iz $$1, dro $$2, drq $$3) {
   }

   private void a(arf $$0, iz $$1, cur $$2, float $$3) {
      ks.a($$0, $$2, 2, je.b, evt.c($$1).a(je.b, 1.2));
      $$0.c(3017, $$1, 0);
      $$0.a(null, $$1, awa.AC, awb.e, 1.0F, 0.8F + 0.4F * $$3);
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
