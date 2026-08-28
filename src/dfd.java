import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dfd extends det {
   public static final MapCodec<dfd> a = b(dfd::new);
   public static final dte b = djd.aE;
   public static final dti<dsy> c = dta.V;
   public static final dtb d = dta.w;
   private static final ewy f = dfh.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final ewy g = dfh.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final ewy h = dfh.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final ewy i = dfh.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final ewy j = ewv.a(i, h);
   private static final ewy k = ewv.a(j, dfh.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final ewy l = ewv.a(j, dfh.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ewy m = ewv.a(j, dfh.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final ewy n = ewv.a(j, dfh.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ewy o = ewv.a(j, dfh.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final ewy F = ewv.a(j, dfh.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final ewy G = ewv.a(j, dfh.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dfd> a() {
      return a;
   }

   public dfd(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, jf.c).a(c, dsy.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(dcf $$0, dsk $$1, ewb $$2, cnc $$3) {
      bsg $$4 = $$3.s();
      cmk $$5 = $$4 instanceof cmk ? (cmk)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? bqg.a($$1.B) : bqg.e;
   }

   public boolean a(dcf $$0, dsk $$1, ewb $$2, @Nullable cmk $$3, boolean $$4) {
      jf $$5 = $$2.b();
      ja $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(avr.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dsk $$0, jf $$1, double $$2) {
      if ($$1.o() != jf.a.b && !($$2 > 0.8124F)) {
         jf $$3 = $$0.c(b);
         dsy $$4 = $$0.c(c);
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

   public boolean a(dcf $$0, ja $$1, @Nullable jf $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bsg $$0, dcf $$1, ja $$2, @Nullable jf $$3) {
      dpp $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dpn) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dpn)$$4).a($$3);
         $$1.a(null, $$2, avh.bZ, avi.e, 2.0F, 1.0F);
         $$1.a($$0, dxg.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ewy m(dsk $$0) {
      jf $$1 = $$0.c(b);
      dsy $$2 = $$0.c(c);
      if ($$2 == dsy.a) {
         return $$1 != jf.c && $$1 != jf.d ? g : f;
      } else if ($$2 == dsy.b) {
         return G;
      } else if ($$2 == dsy.d) {
         return $$1 != jf.c && $$1 != jf.d ? l : k;
      } else if ($$1 == jf.c) {
         return o;
      } else if ($$1 == jf.d) {
         return F;
      } else {
         return $$1 == jf.f ? n : m;
      }
   }

   @Override
   protected ewy b(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.m($$0);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return this.m($$0);
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.c;
   }

   @Nullable
   @Override
   public dsk a(cxm $$0) {
      jf $$1 = $$0.k();
      ja $$2 = $$0.a();
      dcf $$3 = $$0.q();
      jf.a $$4 = $$1.o();
      if ($$4 == jf.a.b) {
         dsk $$5 = this.o().a(c, $$1 == jf.a ? dsy.b : dsy.a).a(b, $$0.g());
         if ($$5.a((dci)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jf.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), jf.f) && $$3.a_($$2.h()).d($$3, $$2.h(), jf.e)
            || $$4 == jf.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), jf.d) && $$3.a_($$2.f()).d($$3, $$2.f(), jf.c);
         dsk $$7 = this.o().a(b, $$1.g()).a(c, $$6 ? dsy.d : dsy.c);
         if ($$7.a((dci)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), jf.b);
         $$7 = $$7.a(c, $$8 ? dsy.a : dsy.b);
         if ($$7.a((dci)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dbx $$3, BiConsumer<cuc, ja> $$4) {
      if ($$3.n()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      dsy $$6 = $$0.c(c);
      jf $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dsy.d) {
         return dfj.a.o();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dsy.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dsy.c).a(b, $$1.g());
            }

            if ($$6 == dsy.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dsy.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      jf $$3 = n($$0).g();
      return $$3 == jf.b ? dfh.a($$1, $$2.c(), jf.a) : dib.b($$1, $$2, $$3);
   }

   private static jf n(dsk $$0) {
      switch ((dsy)$$0.c(c)) {
         case a:
            return jf.b;
         case b:
            return jf.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dpp a(ja $$0, dsk $$1) {
      return new dpn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpp> dpq<T> a(dcf $$0, dsk $$1, dpr<T> $$2) {
      return a($$2, dpr.E, $$0.B ? dpn::a : dpn::b);
   }

   @Override
   protected boolean a(dsk $$0, eow $$1) {
      return false;
   }

   @Override
   public dsk a(dsk $$0, dlu $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dsk a(dsk $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
