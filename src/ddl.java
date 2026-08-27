import com.mojang.serialization.MapCodec;

public class ddl extends cvf {
   public static final MapCodec<ddl> a = b(ddl::new);
   private static final din b = did.aT;
   private static final int c = 20;
   private static final int d = 8;

   @Override
   public MapCodec<ddl> a() {
      return a;
   }

   public ddl(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(csf $$0, dhn $$1, ejv $$2, cer $$3) {
      int $$4 = a((csg)$$0, $$1, $$2, (bkv)$$3);
      if ($$3.w() instanceof amj $$6) {
         $$6.a(arf.aE);
         al.L.a($$6, $$3, $$2.e(), $$4);
      }
   }

   private static int a(csg $$0, dhn $$1, ejv $$2, bkv $$3) {
      int $$4 = a($$2, $$2.e());
      int $$5 = $$3 instanceof cef ? 20 : 8;
      if (!$$0.M().a($$2.a(), $$1.b())) {
         a($$0, $$1, $$4, $$2.a(), $$5);
      }

      return $$4;
   }

   private static int a(ejv $$0, ejz $$1) {
      ib $$2 = $$0.b();
      double $$3 = Math.abs(atq.e($$1.c) - 0.5);
      double $$4 = Math.abs(atq.e($$1.d) - 0.5);
      double $$5 = Math.abs(atq.e($$1.e) - 0.5);
      ib.a $$6 = $$2.o();
      double $$7;
      if ($$6 == ib.a.b) {
         $$7 = Math.max($$3, $$5);
      } else if ($$6 == ib.a.c) {
         $$7 = Math.max($$3, $$4);
      } else {
         $$7 = Math.max($$4, $$5);
      }

      return Math.max(1, atq.c(15.0 * atq.a((0.5 - $$7) / 0.5, 0.0, 1.0)));
   }

   private static void a(csg $$0, dhn $$1, int $$2, hx $$3, int $$4) {
      $$0.a($$3, $$1.a(b, Integer.valueOf($$2)), 3);
      $$0.a($$3, $$1.b(), $$4);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$0.c(b) != 0) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 3);
      }
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.c(b);
   }

   @Override
   public boolean f_(dhn $$0) {
      return true;
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b);
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$1.y_() && !$$0.a($$3.b())) {
         if ($$0.c(b) > 0 && !$$1.M().a($$2, this)) {
            $$1.a($$2, $$0.a(b, Integer.valueOf(0)), 18);
         }
      }
   }
}
