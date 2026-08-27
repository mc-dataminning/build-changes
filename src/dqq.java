public enum dqq implements ayz {
   a("inactive", dqq.a.a) {
      @Override
      protected void a(aqn $$0, io $$1, dqn $$2, dqp $$3, boolean $$4) {
         $$3.a(ctq.i);
         $$0.c(3016, $$1, $$4 ? 1 : 0);
      }
   },
   b("active", dqq.a.b) {
      @Override
      protected void a(aqn $$0, io $$1, dqn $$2, dqp $$3, boolean $$4) {
         if (!$$3.b()) {
            dql.b.a($$0, this, $$2, $$3, $$1);
         }

         $$0.c(3015, $$1, $$4 ? 1 : 0);
      }
   },
   c("unlocking", dqq.a.b) {
      @Override
      protected void a(aqn $$0, io $$1, dqn $$2, dqp $$3, boolean $$4) {
         $$0.a(null, $$1, avi.AF, avj.e);
      }
   },
   d("ejecting", dqq.a.b) {
      @Override
      protected void a(aqn $$0, io $$1, dqn $$2, dqp $$3, boolean $$4) {
         $$0.a(null, $$1, avi.AH, avj.e);
      }

      @Override
      protected void a(aqn $$0, io $$1, dqn $$2, dqp $$3) {
         $$0.a(null, $$1, avi.AA, avj.e);
      }
   };

   private static final int e = 20;
   private static final int f = 20;
   private static final int g = 20;
   private static final int h = 20;
   private final String i;
   private final dqq.a j;

   dqq(String $$0, dqq.a $$1) {
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

   public dqq a(aqn $$0, io $$1, dqn $$2, dqo $$3, dqp $$4) {
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

   private static dqq a(aqn $$0, io $$1, dqn $$2, dqo $$3, dqp $$4, double $$5) {
      $$4.a($$0, $$1, $$3, $$2, $$5);
      $$3.b($$0.Y() + 20L);
      return $$4.c() ? b : a;
   }

   public void a(aqn $$0, io $$1, dqq $$2, dqn $$3, dqp $$4, boolean $$5) {
      this.a($$0, $$1, $$3, $$4);
      $$2.a($$0, $$1, $$3, $$4, $$5);
   }

   protected void a(aqn $$0, io $$1, dqn $$2, dqp $$3, boolean $$4) {
   }

   protected void a(aqn $$0, io $$1, dqn $$2, dqp $$3) {
   }

   private void a(aqn $$0, io $$1, ctq $$2, float $$3) {
      kh.a($$0, $$2, 2, it.b, eum.c($$1).a(it.b, 1.2));
      $$0.c(3017, $$1, 0);
      $$0.a(null, $$1, avi.AC, avj.e, 1.0F, 0.8F + 0.4F * $$3);
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
