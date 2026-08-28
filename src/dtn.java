public enum dtn implements azy {
   a("inactive", dtn.a.a) {
      @Override
      protected void a(arg $$0, je $$1, dtk $$2, dtm $$3, boolean $$4) {
         $$3.a(cvl.k);
         $$0.c(3016, $$1, $$4 ? 1 : 0);
      }
   },
   b("active", dtn.a.b) {
      @Override
      protected void a(arg $$0, je $$1, dtk $$2, dtm $$3, boolean $$4) {
         if (!$$3.b()) {
            dti.b.a($$0, this, $$2, $$3, $$1);
         }

         $$0.c(3015, $$1, $$4 ? 1 : 0);
      }
   },
   c("unlocking", dtn.a.b) {
      @Override
      protected void a(arg $$0, je $$1, dtk $$2, dtm $$3, boolean $$4) {
         $$0.a(null, $$1, awd.AP, awe.e);
      }
   },
   d("ejecting", dtn.a.b) {
      @Override
      protected void a(arg $$0, je $$1, dtk $$2, dtm $$3, boolean $$4) {
         $$0.a(null, $$1, awd.AR, awe.e);
      }

      @Override
      protected void a(arg $$0, je $$1, dtk $$2, dtm $$3) {
         $$0.a(null, $$1, awd.AJ, awe.e);
      }
   };

   private static final int e = 20;
   private static final int f = 20;
   private static final int g = 20;
   private static final int h = 20;
   private final String i;
   private final dtn.a j;

   dtn(final String $$0, final dtn.a $$1) {
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

   public dtn a(arg $$0, je $$1, dtk $$2, dtl $$3, dtm $$4) {
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

   private static dtn a(arg $$0, je $$1, dtk $$2, dtl $$3, dtm $$4, double $$5) {
      $$4.a($$0, $$1, $$3, $$2, $$5);
      $$3.b($$0.aa() + 20L);
      return $$4.c() ? b : a;
   }

   public void a(arg $$0, je $$1, dtn $$2, dtk $$3, dtm $$4, boolean $$5) {
      this.a($$0, $$1, $$3, $$4);
      $$2.a($$0, $$1, $$3, $$4, $$5);
   }

   protected void a(arg $$0, je $$1, dtk $$2, dtm $$3, boolean $$4) {
   }

   protected void a(arg $$0, je $$1, dtk $$2, dtm $$3) {
   }

   private void a(arg $$0, je $$1, cvl $$2, float $$3) {
      kx.a($$0, $$2, 2, jj.b, eye.c($$1).a(jj.b, 1.2));
      $$0.c(3017, $$1, 0);
      $$0.a(null, $$1, awd.AL, awe.e, 1.0F, 0.8F + 0.4F * $$3);
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
