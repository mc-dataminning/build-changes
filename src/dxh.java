public enum dxh implements bba {
   a("inactive", dxh.a.a) {
      @Override
      protected void a(ash $$0, jh $$1, dxe $$2, dxg $$3, boolean $$4) {
         $$3.a(cxo.j);
         $$0.c(3016, $$1, $$4 ? 1 : 0);
      }
   },
   b("active", dxh.a.b) {
      @Override
      protected void a(ash $$0, jh $$1, dxe $$2, dxg $$3, boolean $$4) {
         if (!$$3.b()) {
            dxc.b.a($$0, this, $$2, $$3, $$1);
         }

         $$0.c(3015, $$1, $$4 ? 1 : 0);
      }
   },
   c("unlocking", dxh.a.b) {
      @Override
      protected void a(ash $$0, jh $$1, dxe $$2, dxg $$3, boolean $$4) {
         $$0.a(null, $$1, axf.Bi, axg.e);
      }
   },
   d("ejecting", dxh.a.b) {
      @Override
      protected void a(ash $$0, jh $$1, dxe $$2, dxg $$3, boolean $$4) {
         $$0.a(null, $$1, axf.Bk, axg.e);
      }

      @Override
      protected void a(ash $$0, jh $$1, dxe $$2, dxg $$3) {
         $$0.a(null, $$1, axf.Bc, axg.e);
      }
   };

   private static final int e = 20;
   private static final int f = 20;
   private static final int g = 20;
   private static final int h = 20;
   private final String i;
   private final dxh.a j;

   dxh(final String $$0, final dxh.a $$1) {
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

   public dxh a(ash $$0, jh $$1, dxe $$2, dxf $$3, dxg $$4) {
      return switch (this) {
         case a -> a($$0, $$1, $$2, $$3, $$4, $$2.c());
         case b -> a($$0, $$1, $$2, $$3, $$4, $$2.d());
         case c -> {
            $$3.b($$0.ac() + 20L);
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
               $$3.b($$0.ac() + (long)$$7);
               yield d;
            }
         }
      };
   }

   private static dxh a(ash $$0, jh $$1, dxe $$2, dxf $$3, dxg $$4, double $$5) {
      $$4.a($$0, $$1, $$3, $$2, $$5);
      $$3.b($$0.ac() + 20L);
      return $$4.c() ? b : a;
   }

   public void a(ash $$0, jh $$1, dxh $$2, dxe $$3, dxg $$4, boolean $$5) {
      this.a($$0, $$1, $$3, $$4);
      $$2.a($$0, $$1, $$3, $$4, $$5);
   }

   protected void a(ash $$0, jh $$1, dxe $$2, dxg $$3, boolean $$4) {
   }

   protected void a(ash $$0, jh $$1, dxe $$2, dxg $$3) {
   }

   private void a(ash $$0, jh $$1, cxo $$2, float $$3) {
      la.a($$0, $$2, 2, jm.b, fbx.c($$1).a(jm.b, 1.2));
      $$0.c(3017, $$1, 0);
      $$0.a(null, $$1, axf.Be, axg.e, 1.0F, 0.8F + 0.4F * $$3);
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
