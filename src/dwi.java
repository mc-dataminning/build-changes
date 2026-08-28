public enum dwi implements azu {
   a("inactive", dwi.a.a) {
      @Override
      protected void a(arc $$0, ji $$1, dwf $$2, dwh $$3, boolean $$4) {
         $$3.a(cwn.j);
         $$0.c(3016, $$1, $$4 ? 1 : 0);
      }
   },
   b("active", dwi.a.b) {
      @Override
      protected void a(arc $$0, ji $$1, dwf $$2, dwh $$3, boolean $$4) {
         if (!$$3.b()) {
            dwd.b.a($$0, this, $$2, $$3, $$1);
         }

         $$0.c(3015, $$1, $$4 ? 1 : 0);
      }
   },
   c("unlocking", dwi.a.b) {
      @Override
      protected void a(arc $$0, ji $$1, dwf $$2, dwh $$3, boolean $$4) {
         $$0.a(null, $$1, avz.Bx, awa.e);
      }
   },
   d("ejecting", dwi.a.b) {
      @Override
      protected void a(arc $$0, ji $$1, dwf $$2, dwh $$3, boolean $$4) {
         $$0.a(null, $$1, avz.Bz, awa.e);
      }

      @Override
      protected void a(arc $$0, ji $$1, dwf $$2, dwh $$3) {
         $$0.a(null, $$1, avz.Br, awa.e);
      }
   };

   private static final int e = 20;
   private static final int f = 20;
   private static final int g = 20;
   private static final int h = 20;
   private final String i;
   private final dwi.a j;

   dwi(final String $$0, final dwi.a $$1) {
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

   public dwi a(arc $$0, ji $$1, dwf $$2, dwg $$3, dwh $$4) {
      return switch (this) {
         case a -> a($$0, $$1, $$2, $$3, $$4, $$2.c());
         case b -> a($$0, $$1, $$2, $$3, $$4, $$2.d());
         case c -> {
            $$3.b($$0.ad() + 20L);
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
               $$3.b($$0.ad() + (long)$$7);
               yield d;
            }
         }
      };
   }

   private static dwi a(arc $$0, ji $$1, dwf $$2, dwg $$3, dwh $$4, double $$5) {
      $$4.a($$0, $$1, $$3, $$2, $$5);
      $$3.b($$0.ad() + 20L);
      return $$4.c() ? b : a;
   }

   public void a(arc $$0, ji $$1, dwi $$2, dwf $$3, dwh $$4, boolean $$5) {
      this.a($$0, $$1, $$3, $$4);
      $$2.a($$0, $$1, $$3, $$4, $$5);
   }

   protected void a(arc $$0, ji $$1, dwf $$2, dwh $$3, boolean $$4) {
   }

   protected void a(arc $$0, ji $$1, dwf $$2, dwh $$3) {
   }

   private void a(arc $$0, ji $$1, cwn $$2, float $$3) {
      lb.a($$0, $$2, 2, jn.b, fay.c($$1).a(jn.b, 1.2));
      $$0.c(3017, $$1, 0);
      $$0.a(null, $$1, avz.Bt, awa.e, 1.0F, 0.8F + 0.4F * $$3);
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
