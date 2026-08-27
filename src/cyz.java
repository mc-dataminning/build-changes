import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyz extends cur {
   public static final MapCodec<cyz> a = b(cyz::new);
   public static final dih b = did.Q;
   public static final die c = did.f;
   private static final eks d = cvf.a(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
   private static final eks e = cvf.a(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
   private static final eks f = ekp.a(e, d);
   private static final eks g = ekp.a(f, dgg.x_, ekd.e);
   private static final eks h = ekp.a(g, cvf.a(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
   private static final eks i = ekp.a(g, cvf.a(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
   private static final eks j = ekp.a(g, cvf.a(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
   private static final eks k = ekp.a(g, cvf.a(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
   private static final eks l = ekp.a(g, cvf.a(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
   private static final eks m = dgg.x_;
   private static final eks n = ekp.a(dgg.x_, cvf.a(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
   private static final eks o = ekp.a(dgg.x_, cvf.a(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
   private static final eks F = ekp.a(dgg.x_, cvf.a(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
   private static final eks G = ekp.a(dgg.x_, cvf.a(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

   @Override
   public MapCodec<cyz> a() {
      return a;
   }

   public cyz(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ib.a).a(c, Boolean.valueOf(true)));
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      switch ((ib)$$0.c(b)) {
         case a:
            return h;
         case c:
            return j;
         case d:
            return k;
         case e:
            return l;
         case f:
            return i;
         default:
            return g;
      }
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2) {
      switch ((ib)$$0.c(b)) {
         case a:
            return m;
         case c:
            return o;
         case d:
            return F;
         case e:
            return G;
         case f:
            return n;
         default:
            return dgg.x_;
      }
   }

   @Override
   public dhn a(cnw $$0) {
      ib $$1 = $$0.k().g();
      return this.o().a(b, $$1.o() == ib.a.b ? ib.a : $$1).a(c, Boolean.valueOf(true));
   }

   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dgh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return $$0.B ? null : a($$2, dfk.r, dgh::a);
   }

   @Override
   public void a(csf $$0, hx $$1, dhn $$2, bll $$3, clo $$4) {
      if ($$4.A()) {
         dfi $$5 = $$0.c_($$1);
         if ($$5 instanceof dgh) {
            ((dgh)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2, $$0);
      }
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      if ($$1.B) {
         return bjb.a;
      } else {
         dfi $$6 = $$1.c_($$2);
         if ($$6 instanceof dgh) {
            $$3.a((dgh)$$6);
            $$3.a(arf.ad);
         }

         return bjb.b;
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      this.a($$1, $$2, $$0);
   }

   private void a(csf $$0, hx $$1, dhn $$2) {
      boolean $$3 = !$$0.B($$1);
      if ($$3 != $$2.c(c)) {
         $$0.a($$1, $$2.a(c, Boolean.valueOf($$3)), 2);
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      bix.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Override
   public boolean d_(dhn $$0) {
      return true;
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return cgr.a($$1.c_($$2));
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c);
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      dfi $$4 = $$1.c_($$2);
      if ($$4 instanceof dgh) {
         dgh.a($$1, $$2, $$0, $$3, (dgh)$$4);
      }
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
