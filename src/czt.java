import com.mojang.serialization.MapCodec;

public class czt extends dbn implements dcf {
   public static final MapCodec<czt> b = b(czt::new);
   public static final die c = did.C;
   public static final die d = did.w;
   private static final int k = 8;
   public static final int e = 128;
   private static final int l = 200;

   @Override
   public MapCodec<czt> a() {
      return b;
   }

   public czt(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ib.b).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dhn a(cnw $$0) {
      ecx $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ecy.c;
      return this.o().a(a, $$0.k()).a(c, Boolean.valueOf($$2));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, ecy.c, ecy.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public ecx c_(dhn $$0) {
      return $$0.c(c) ? ecy.c.a(false) : super.c_($$0);
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.c(d) && $$0.c(a) == $$3 ? 15 : 0;
   }

   public void d(dhn $$0, csf $$1, hx $$2) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      this.e($$0, $$1, $$2);
      $$1.a($$2, this, 8);
      $$1.c(3002, $$2, $$0.c(a).o().ordinal());
   }

   private void e(dhn $$0, csf $$1, hx $$2) {
      $$1.a($$2.a($$0.c(a).g()), this);
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, atw $$3) {
      if ($$1.Z() && (long)$$1.z.a(200) <= $$1.W() % 200L && $$2.v() == $$1.a(dmw.a.b, $$2.u(), $$2.w()) - 1) {
         att.a($$0.c(a).o(), $$1, $$2, 0.125, jw.aO, bim.a(1, 2));
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d)) {
            this.e($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if ($$0.c(d) && !$$1.M().a($$2, this)) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 18);
         }
      }
   }

   @Override
   public void a(csf $$0, dhn $$1, ejv $$2, cer $$3) {
      if ($$0.Z() && $$3 instanceof cfd && ((cfd)$$3).K()) {
         hx $$4 = $$2.a();
         if ($$0.g($$4)) {
            blk $$5 = bkz.ai.a($$0);
            if ($$5 != null) {
               $$5.e(ejz.c($$4.c()));
               bkv $$6 = $$3.w();
               $$5.b($$6 instanceof amj ? (amj)$$6 : null);
               $$0.b($$5);
            }

            $$0.a(null, $$4, aqv.yp, aqw.d, 5.0F, 1.0F);
         }
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(a, d, c);
   }

   @Override
   public boolean f_(dhn $$0) {
      return true;
   }
}
