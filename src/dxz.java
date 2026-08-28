public enum dxz implements bag {
   a("inactive", dxz.a.a) {
      @Override
      protected void a(arn $$0, jj $$1, dxw $$2, dxy $$3, boolean $$4) {
         $$3.a(cxy.k);
         $$0.c(3016, $$1, $$4 ? 1 : 0);
      }
   },
   b("active", dxz.a.b) {
      @Override
      protected void a(arn $$0, jj $$1, dxw $$2, dxy $$3, boolean $$4) {
         if (!$$3.b()) {
            dxu.b.a($$0, this, $$2, $$3, $$1);
         }

         $$0.c(3015, $$1, $$4 ? 1 : 0);
      }
   },
   c("unlocking", dxz.a.b) {
      @Override
      protected void a(arn $$0, jj $$1, dxw $$2, dxy $$3, boolean $$4) {
         $$0.a(null, $$1, awk.BH, awl.e);
      }
   },
   d("ejecting", dxz.a.b) {
      @Override
      protected void a(arn $$0, jj $$1, dxw $$2, dxy $$3, boolean $$4) {
         $$0.a(null, $$1, awk.BJ, awl.e);
      }

      @Override
      protected void a(arn $$0, jj $$1, dxw $$2, dxy $$3) {
         $$0.a(null, $$1, awk.BB, awl.e);
      }
   };

   private static final int e = 20;
   private static final int f = 20;
   private static final int g = 20;
   private static final int h = 20;
   private final String i;
   private final dxz.a j;

   dxz(final String $$0, final dxz.a $$1) {
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

   public dxz a(arn $$0, jj $$1, dxw $$2, dxx $$3, dxy $$4) {
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

   private static dxz a(arn $$0, jj $$1, dxw $$2, dxx $$3, dxy $$4, double $$5) {
      $$4.a($$0, $$1, $$3, $$2, $$5);
      $$3.b($$0.ae() + 20L);
      return $$4.c() ? b : a;
   }

   public void a(arn $$0, jj $$1, dxz $$2, dxw $$3, dxy $$4, boolean $$5) {
      this.a($$0, $$1, $$3, $$4);
      $$2.a($$0, $$1, $$3, $$4, $$5);
   }

   protected void a(arn $$0, jj $$1, dxw $$2, dxy $$3, boolean $$4) {
   }

   protected void a(arn $$0, jj $$1, dxw $$2, dxy $$3) {
   }

   private void a(arn $$0, jj $$1, cxy $$2, float $$3) {
      ld.a($$0, $$2, 2, jo.b, fcu.c($$1).a(jo.b, 1.2));
      $$0.c(3017, $$1, 0);
      $$0.a(null, $$1, awk.BD, awl.e, 1.0F, 0.8F + 0.4F * $$3);
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
