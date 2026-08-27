public enum dlr implements axg {
   a("inactive", dlr.a.a) {
      @Override
      protected void a(apa $$0, ib $$1, dlo $$2, dlq $$3) {
         $$3.a(cpq.h);
         $$0.c(3016, $$1, 0);
      }
   },
   b("active", dlr.a.b) {
      @Override
      protected void a(apa $$0, ib $$1, dlo $$2, dlq $$3) {
         if (!$$3.b()) {
            dlm.b.a($$0, this, $$2, $$3, $$1);
         }

         $$0.c(3015, $$1, 0);
      }
   },
   c("unlocking", dlr.a.b) {
      @Override
      protected void a(apa $$0, ib $$1, dlo $$2, dlq $$3) {
         $$0.a(null, $$1, atp.Ab, atq.e);
      }
   },
   d("ejecting", dlr.a.b) {
      @Override
      protected void a(apa $$0, ib $$1, dlo $$2, dlq $$3) {
         $$0.a(null, $$1, atp.Ad, atq.e);
      }

      @Override
      protected void b(apa $$0, ib $$1, dlo $$2, dlq $$3) {
         $$0.a(null, $$1, atp.zW, atq.e);
      }
   };

   private static final int e = 20;
   private static final int f = 20;
   private static final int g = 20;
   private static final int h = 20;
   private final String i;
   private final dlr.a j;

   dlr(String $$0, dlr.a $$1) {
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

   public dlr a(apa $$0, ib $$1, dlo $$2, dlp $$3, dlq $$4) {
      return switch (this) {
         case a -> a($$0, $$1, $$2, $$3, $$4, $$2.c());
         case b -> a($$0, $$1, $$2, $$3, $$4, $$2.d());
         case c -> {
            $$3.b($$0.X() + 20L);
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
               $$3.b($$0.X() + (long)$$7);
               yield d;
            }
         }
      };
   }

   private static dlr a(apa $$0, ib $$1, dlo $$2, dlp $$3, dlq $$4, double $$5) {
      $$4.a($$0, $$1, $$3, $$2, $$5);
      $$3.b($$0.X() + 20L);
      return $$4.c() ? b : a;
   }

   public void a(apa $$0, ib $$1, dlr $$2, dlo $$3, dlq $$4) {
      this.b($$0, $$1, $$3, $$4);
      $$2.a($$0, $$1, $$3, $$4);
   }

   protected void a(apa $$0, ib $$1, dlo $$2, dlq $$3) {
   }

   protected void b(apa $$0, ib $$1, dlo $$2, dlq $$3) {
   }

   private void a(apa $$0, ib $$1, cpq $$2, float $$3) {
      jm.a($$0, $$2, 2, ih.b, eov.c($$1).a(ih.b, 1.2));
      $$0.c(3017, $$1, 0);
      $$0.a(null, $$1, atp.zY, atq.e, 1.0F, 0.8F + 0.4F * $$3);
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
