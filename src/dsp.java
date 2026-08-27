public enum dsp implements azg {
   a("inactive", dsp.a.a) {
      @Override
      protected void a(aqt $$0, ir $$1, dsm $$2, dso $$3) {
         $$3.a(cuh.i);
         $$0.c(3016, $$1, 0);
      }
   },
   b("active", dsp.a.b) {
      @Override
      protected void a(aqt $$0, ir $$1, dsm $$2, dso $$3) {
         if (!$$3.b()) {
            dsk.b.a($$0, this, $$2, $$3, $$1);
         }

         $$0.c(3015, $$1, 0);
      }
   },
   c("unlocking", dsp.a.b) {
      @Override
      protected void a(aqt $$0, ir $$1, dsm $$2, dso $$3) {
         $$0.a(null, $$1, avo.Bd, avq.e);
      }
   },
   d("ejecting", dsp.a.b) {
      @Override
      protected void a(aqt $$0, ir $$1, dsm $$2, dso $$3) {
         $$0.a(null, $$1, avo.Bf, avq.e);
      }

      @Override
      protected void b(aqt $$0, ir $$1, dsm $$2, dso $$3) {
         $$0.a(null, $$1, avo.AY, avq.e);
      }
   };

   private static final int e = 20;
   private static final int f = 20;
   private static final int g = 20;
   private static final int h = 20;
   private final String i;
   private final dsp.a j;

   dsp(String $$0, dsp.a $$1) {
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

   public dsp a(aqt $$0, ir $$1, dsm $$2, dsn $$3, dso $$4) {
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

   private static dsp a(aqt $$0, ir $$1, dsm $$2, dsn $$3, dso $$4, double $$5) {
      $$4.a($$0, $$1, $$3, $$2, $$5);
      $$3.b($$0.Z() + 20L);
      return $$4.c() ? b : a;
   }

   public void a(aqt $$0, ir $$1, dsp $$2, dsm $$3, dso $$4) {
      this.b($$0, $$1, $$3, $$4);
      $$2.a($$0, $$1, $$3, $$4);
   }

   protected void a(aqt $$0, ir $$1, dsm $$2, dso $$3) {
   }

   protected void b(aqt $$0, ir $$1, dsm $$2, dso $$3) {
   }

   private void a(aqt $$0, ir $$1, cuh $$2, float $$3) {
      kl.a($$0, $$2, 2, iw.b, ewu.c($$1).a(iw.b, 1.2));
      $$0.c(3017, $$1, 0);
      $$0.a(null, $$1, avo.Ba, avq.e, 1.0F, 0.8F + 0.4F * $$3);
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
