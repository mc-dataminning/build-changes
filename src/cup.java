import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cup extends cuf {
   public static final MapCodec<cup> a = b(cup::new);
   public static final dhq b = cyo.aE;
   public static final dhu<dhk> c = dhm.V;
   public static final dhn d = dhm.w;
   private static final ekb f = cut.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final ekb g = cut.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final ekb h = cut.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final ekb i = cut.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final ekb j = ejy.a(i, h);
   private static final ekb k = ejy.a(j, cut.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final ekb l = ejy.a(j, cut.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ekb m = ejy.a(j, cut.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final ekb n = ejy.a(j, cut.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ekb o = ejy.a(j, cut.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final ekb F = ejy.a(j, cut.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final ekb G = ejy.a(j, cut.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<cup> a() {
      return a;
   }

   public cup(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, hx.c).a(c, dhk.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   public void a(crs $$0, dgw $$1, eje $$2, cee $$3) {
      bki $$4 = $$3.v();
      cdm $$5 = $$4 instanceof cdm ? (cdm)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   public biq a(dgw $$0, crs $$1, ht $$2, cdm $$3, bip $$4, eje $$5) {
      return this.a($$1, $$0, $$5, $$3, true) ? biq.a($$1.B) : biq.d;
   }

   public boolean a(crs $$0, dgw $$1, eje $$2, @Nullable cdm $$3, boolean $$4) {
      hx $$5 = $$2.b();
      ht $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(aqx.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dgw $$0, hx $$1, double $$2) {
      if ($$1.o() != hx.a.b && !($$2 > 0.8124F)) {
         hx $$3 = $$0.c(b);
         dhk $$4 = $$0.c(c);
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

   public boolean a(crs $$0, ht $$1, @Nullable hx $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bki $$0, crs $$1, ht $$2, @Nullable hx $$3) {
      der $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dep) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dep)$$4).a($$3);
         $$1.a(null, $$2, aqn.bK, aqo.e, 2.0F, 1.0F);
         $$1.a($$0, dlg.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ekb h(dgw $$0) {
      hx $$1 = $$0.c(b);
      dhk $$2 = $$0.c(c);
      if ($$2 == dhk.a) {
         return $$1 != hx.c && $$1 != hx.d ? g : f;
      } else if ($$2 == dhk.b) {
         return G;
      } else if ($$2 == dhk.d) {
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
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return this.h($$0);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return this.h($$0);
   }

   @Override
   public day b_(dgw $$0) {
      return day.c;
   }

   @Nullable
   @Override
   public dgw a(cnj $$0) {
      hx $$1 = $$0.k();
      ht $$2 = $$0.a();
      crs $$3 = $$0.q();
      hx.a $$4 = $$1.o();
      if ($$4 == hx.a.b) {
         dgw $$5 = this.o().a(c, $$1 == hx.a ? dhk.b : dhk.a).a(b, $$0.g());
         if ($$5.a((crv)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == hx.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), hx.f) && $$3.a_($$2.h()).d($$3, $$2.h(), hx.e)
            || $$4 == hx.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), hx.d) && $$3.a_($$2.f()).d($$3, $$2.f(), hx.c);
         dgw $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dhk.d : dhk.c);
         if ($$7.a((crv)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), hx.b);
         $$7 = $$7.a(c, $$8 ? dhk.a : dhk.b);
         if ($$7.a((crv)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      dhk $$6 = $$0.c(c);
      hx $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dhk.d) {
         return cuv.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dhk.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dhk.c).a(b, $$1.g());
            }

            if ($$6 == dhk.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dhk.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      hx $$3 = n($$0).g();
      return $$3 == hx.b ? cut.a($$1, $$2.c(), hx.a) : cxm.b($$1, $$2, $$3);
   }

   private static hx n(dgw $$0) {
      switch ((dhk)$$0.c(c)) {
         case a:
            return hx.b;
         case b:
            return hx.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public der a(ht $$0, dgw $$1) {
      return new dep($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends der> des<T> a(crs $$0, dgw $$1, det<T> $$2) {
      return a($$2, det.E, $$0.B ? dep::a : dep::b);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   @Override
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
