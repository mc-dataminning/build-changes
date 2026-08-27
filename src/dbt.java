import com.mojang.serialization.MapCodec;

public class dbt extends cvf implements dcf {
   public static final MapCodec<dbt> a = b(dbt::new);
   private static final int f = 1;
   private static final eks g;
   private static final eks h;
   private static final eks i = cvf.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   private static final eks j = ekp.b().a(0.0, -1.0, 0.0);
   public static final int b = 7;
   public static final din c = did.aW;
   public static final die d = did.C;
   public static final die e = did.b;

   @Override
   public MapCodec<dbt> a() {
      return a;
   }

   protected dbt(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(7)).a(d, Boolean.valueOf(false)).a(e, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      if (!$$3.a($$0.b().k())) {
         return $$0.c(e) ? h : g;
      } else {
         return ekp.b();
      }
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2) {
      return ekp.b();
   }

   @Override
   public boolean a(dhn $$0, cnw $$1) {
      return $$1.n().a(this.k());
   }

   @Override
   public dhn a(cnw $$0) {
      hx $$1 = $$0.a();
      csf $$2 = $$0.q();
      int $$3 = a($$2, $$1);
      return this.o().a(d, Boolean.valueOf($$2.b_($$1).a() == ecy.c)).a(c, Integer.valueOf($$3)).a(e, Boolean.valueOf(this.a($$2, $$1, $$3)));
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$1.B) {
         $$1.a($$2, this, 1);
      }
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      if (!$$3.y_()) {
         $$3.a($$4, this, 1);
      }

      return $$0;
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      int $$4 = a($$1, $$2);
      dhn $$5 = $$0.a(c, Integer.valueOf($$4)).a(e, Boolean.valueOf(this.a($$1, $$2, $$4)));
      if ($$5.c(c) == 7) {
         if ($$0.c(c) == 7) {
            car.a($$1, $$2, $$5);
         } else {
            $$1.b($$2, true);
         }
      } else if ($$0 != $$5) {
         $$1.a($$2, $$5, 3);
      }
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      return a($$1, $$2) < 7;
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      if ($$3.a(ekp.b(), $$2, true) && !$$3.b()) {
         return g;
      } else {
         return $$0.c(c) != 0 && $$0.c(e) && $$3.a(j, $$2, true) ? i : ekp.a();
      }
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(d) ? ecy.c.a(false) : super.c_($$0);
   }

   private boolean a(crl $$0, hx $$1, int $$2) {
      return $$2 > 0 && !$$0.a_($$1.d()).a(this);
   }

   public static int a(crl $$0, hx $$1) {
      hx.a $$2 = $$1.j().c(ib.a);
      dhn $$3 = $$0.a_($$2);
      int $$4 = 7;
      if ($$3.a(cvh.nS)) {
         $$4 = $$3.c(c);
      } else if ($$3.d($$0, $$2, ib.b)) {
         return 0;
      }

      for (ib $$5 : ib.c.a) {
         dhn $$6 = $$0.a_($$2.a($$1, $$5));
         if ($$6.a(cvh.nS)) {
            $$4 = Math.min($$4, $$6.c(c) + 1);
            if ($$4 == 1) {
               break;
            }
         }
      }

      return $$4;
   }

   static {
      eks $$0 = cvf.a(0.0, 14.0, 0.0, 16.0, 16.0, 16.0);
      eks $$1 = cvf.a(0.0, 0.0, 0.0, 2.0, 16.0, 2.0);
      eks $$2 = cvf.a(14.0, 0.0, 0.0, 16.0, 16.0, 2.0);
      eks $$3 = cvf.a(0.0, 0.0, 14.0, 2.0, 16.0, 16.0);
      eks $$4 = cvf.a(14.0, 0.0, 14.0, 16.0, 16.0, 16.0);
      g = ekp.a($$0, $$1, $$2, $$3, $$4);
      eks $$5 = cvf.a(0.0, 0.0, 0.0, 2.0, 2.0, 16.0);
      eks $$6 = cvf.a(14.0, 0.0, 0.0, 16.0, 2.0, 16.0);
      eks $$7 = cvf.a(0.0, 0.0, 14.0, 16.0, 2.0, 16.0);
      eks $$8 = cvf.a(0.0, 0.0, 0.0, 16.0, 2.0, 2.0);
      h = ekp.a(dbt.i, g, $$6, $$5, $$8, $$7);
   }
}
