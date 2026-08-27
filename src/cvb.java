import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cvb extends cur {
   public static final MapCodec<cvb> a = b(cvb::new);
   public static final dih b = cza.aE;
   public static final dil<dib> c = did.V;
   public static final die d = did.w;
   private static final eks f = cvf.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final eks g = cvf.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final eks h = cvf.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final eks i = cvf.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final eks j = ekp.a(i, h);
   private static final eks k = ekp.a(j, cvf.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final eks l = ekp.a(j, cvf.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eks m = ekp.a(j, cvf.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final eks n = ekp.a(j, cvf.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eks o = ekp.a(j, cvf.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final eks F = ekp.a(j, cvf.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final eks G = ekp.a(j, cvf.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<cvb> a() {
      return a;
   }

   public cvb(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ib.c).a(c, dib.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, cvf $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   public void a(csf $$0, dhn $$1, ejv $$2, cer $$3) {
      bkv $$4 = $$3.w();
      cdz $$5 = $$4 instanceof cdz ? (cdz)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public bjb a(dhn $$0, csf $$1, hx $$2, cdz $$3, bja $$4, ejv $$5) {
      return this.a($$1, $$0, $$5, $$3, true) ? bjb.a($$1.B) : bjb.d;
   }

   public boolean a(csf $$0, dhn $$1, ejv $$2, @Nullable cdz $$3, boolean $$4) {
      ib $$5 = $$2.b();
      hx $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(arf.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dhn $$0, ib $$1, double $$2) {
      if ($$1.o() != ib.a.b && !($$2 > 0.8124F)) {
         ib $$3 = $$0.c(b);
         dib $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(csf $$0, hx $$1, @Nullable ib $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bkv $$0, csf $$1, hx $$2, @Nullable ib $$3) {
      dfi $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dfg) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dfg)$$4).a($$3);
         $$1.a(null, $$2, aqv.bK, aqw.e, 2.0F, 1.0F);
         $$1.a($$0, dlx.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private eks h(dhn $$0) {
      ib $$1 = $$0.c(b);
      dib $$2 = $$0.c(c);
      if ($$2 == dib.a) {
         return $$1 != ib.c && $$1 != ib.d ? g : f;
      } else if ($$2 == dib.b) {
         return G;
      } else if ($$2 == dib.d) {
         return $$1 != ib.c && $$1 != ib.d ? l : k;
      } else if ($$1 == ib.c) {
         return o;
      } else if ($$1 == ib.d) {
         return F;
      } else {
         return $$1 == ib.f ? n : m;
      }
   }

   @Override
   public eks b(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.h($$0);
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return this.h($$0);
   }

   @Override
   public dbk b_(dhn $$0) {
      return dbk.c;
   }

   @Nullable
   @Override
   public dhn a(cnw $$0) {
      ib $$1 = $$0.k();
      hx $$2 = $$0.a();
      csf $$3 = $$0.q();
      ib.a $$4 = $$1.o();
      if ($$4 == ib.a.b) {
         dhn $$5 = this.o().a(c, $$1 == ib.a ? dib.b : dib.a).a(b, $$0.g());
         if ($$5.a((csi)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ib.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ib.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ib.e)
            || $$4 == ib.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ib.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ib.c);
         dhn $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dib.d : dib.c);
         if ($$7.a((csi)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ib.b);
         $$7 = $$7.a(c, $$8 ? dib.a : dib.b);
         if ($$7.a((csi)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      dib $$6 = $$0.c(c);
      ib $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dib.d) {
         return cvh.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dib.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dib.c).a(b, $$1.g());
            }

            if ($$6 == dib.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dib.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      ib $$3 = n($$0).g();
      return $$3 == ib.b ? cvf.a($$1, $$2.c(), ib.a) : cxz.b($$1, $$2, $$3);
   }

   private static ib n(dhn $$0) {
      switch ((dib)$$0.c(c)) {
         case a:
            return ib.b;
         case b:
            return ib.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dfi a(hx $$0, dhn $$1) {
      return new dfg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dfi> dfj<T> a(csf $$0, dhn $$1, dfk<T> $$2) {
      return a($$2, dfk.E, $$0.B ? dfg::a : dfg::b);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
