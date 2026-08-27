import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ctw extends ctm {
   public static final MapCodec<ctw> a = b(ctw::new);
   public static final dgv b = cxu.aE;
   public static final dgz<dgp> c = dgr.V;
   public static final dgs d = dgr.w;
   private static final eiy f = cua.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final eiy g = cua.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final eiy h = cua.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final eiy i = cua.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final eiy j = eiv.a(i, h);
   private static final eiy k = eiv.a(j, cua.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final eiy l = eiv.a(j, cua.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eiy m = eiv.a(j, cua.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final eiy n = eiv.a(j, cua.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final eiy o = eiv.a(j, cua.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final eiy F = eiv.a(j, cua.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final eiy G = eiv.a(j, cua.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<ctw> a() {
      return a;
   }

   public ctw(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, dgp.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   public void a(cqz $$0, dgb $$1, eib $$2, cdp $$3) {
      bjt $$4 = $$3.v();
      ccx $$5 = $$4 instanceof ccx ? (ccx)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public bib a(dgb $$0, cqz $$1, ht $$2, ccx $$3, bia $$4, eib $$5) {
      return this.a($$1, $$0, $$5, $$3, true) ? bib.a($$1.B) : bib.d;
   }

   public boolean a(cqz $$0, dgb $$1, eib $$2, @Nullable ccx $$3, boolean $$4) {
      hx $$5 = $$2.b();
      ht $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(aqn.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dgb $$0, hx $$1, double $$2) {
      if ($$1.o() != hx.a.b && !($$2 > 0.8124F)) {
         hx $$3 = $$0.c(b);
         dgp $$4 = $$0.c(c);
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

   public boolean a(cqz $$0, ht $$1, @Nullable hx $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bjt $$0, cqz $$1, ht $$2, @Nullable hx $$3) {
      ddx $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof ddv) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((ddv)$$4).a($$3);
         $$1.a(null, $$2, aqd.bK, aqe.e, 2.0F, 1.0F);
         $$1.a($$0, dkl.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private eiy h(dgb $$0) {
      hx $$1 = $$0.c(b);
      dgp $$2 = $$0.c(c);
      if ($$2 == dgp.a) {
         return $$1 != hx.c && $$1 != hx.d ? g : f;
      } else if ($$2 == dgp.b) {
         return G;
      } else if ($$2 == dgp.d) {
         return $$1 != hx.c && $$1 != hx.d ? l : k;
      } else if ($$1 == hx.c) {
         return o;
      } else if ($$1 == hx.d) {
         return F;
      } else {
         return $$1 == hx.f ? n : m;
      }
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.h($$0);
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.h($$0);
   }

   @Override
   public dae b_(dgb $$0) {
      return dae.c;
   }

   @Nullable
   @Override
   public dgb a(cmr $$0) {
      hx $$1 = $$0.k();
      ht $$2 = $$0.a();
      cqz $$3 = $$0.q();
      hx.a $$4 = $$1.o();
      if ($$4 == hx.a.b) {
         dgb $$5 = this.o().a(c, $$1 == hx.a ? dgp.b : dgp.a).a(b, $$0.g());
         if ($$5.a((crc)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == hx.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), hx.f) && $$3.a_($$2.h()).d($$3, $$2.h(), hx.e)
            || $$4 == hx.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), hx.d) && $$3.a_($$2.f()).d($$3, $$2.f(), hx.c);
         dgb $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dgp.d : dgp.c);
         if ($$7.a((crc)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), hx.b);
         $$7 = $$7.a(c, $$8 ? dgp.a : dgp.b);
         if ($$7.a((crc)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      dgp $$6 = $$0.c(c);
      hx $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dgp.d) {
         return cuc.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dgp.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dgp.c).a(b, $$1.g());
            }

            if ($$6 == dgp.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dgp.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      hx $$3 = n($$0).g();
      return $$3 == hx.b ? cua.a($$1, $$2.c(), hx.a) : cws.b($$1, $$2, $$3);
   }

   private static hx n(dgb $$0) {
      switch ((dgp)$$0.c(c)) {
         case a:
            return hx.b;
         case b:
            return hx.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public ddx a(ht $$0, dgb $$1) {
      return new ddv($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends ddx> ddy<T> a(cqz $$0, dgb $$1, ddz<T> $$2) {
      return a($$2, ddz.E, $$0.B ? ddv::a : ddv::b);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }

   @Override
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
