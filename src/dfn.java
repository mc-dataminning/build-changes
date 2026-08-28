import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dfn extends dfh implements dfo {
   public static final MapCodec<dfn> a = b(dfn::new);
   public static final dtb b = dta.e;
   private static final int c = 5;

   @Override
   public MapCodec<dfn> a() {
      return a;
   }

   public dfn(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, bsg $$3) {
      dsk $$4 = $$1.a_($$2.c());
      if ($$4.i()) {
         $$3.l($$0.c(b));
         if (!$$1.B) {
            aqm $$5 = (aqm)$$1;

            for (int $$6 = 0; $$6 < 2; $$6++) {
               $$5.a(lj.am, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.0, 0.0, 1.0);
               $$5.a(lj.d, (double)$$2.u() + $$1.z.j(), (double)($$2.v() + 1), (double)$$2.w() + $$1.z.j(), 1, 0.0, 0.01, 0.0, 0.2);
            }
         }
      } else {
         $$3.m($$0.c(b));
      }
   }

   @Override
   protected void a(dsk $$0, aqm $$1, ja $$2, ayo $$3) {
      a($$1, $$2, $$0, $$1.a_($$2.d()));
   }

   @Override
   protected eoh b_(dsk $$0) {
      return eoi.c.a(false);
   }

   public static void b(dcg $$0, ja $$1, dsk $$2) {
      a($$0, $$1, $$0.a_($$1), $$2);
   }

   public static void a(dcg $$0, ja $$1, dsk $$2, dsk $$3) {
      if (m($$2)) {
         dsk $$4 = n($$3);
         $$0.a($$1, $$4, 2);
         ja.a $$5 = $$1.j().c(jf.b);

         while (m($$0.a_($$5))) {
            if (!$$0.a($$5, $$4, 2)) {
               return;
            }

            $$5.c(jf.b);
         }
      }
   }

   private static boolean m(dsk $$0) {
      return $$0.a(dfj.nd) || $$0.a(dfj.G) && $$0.u().e() >= 8 && $$0.u().b();
   }

   private static dsk n(dsk $$0) {
      if ($$0.a(dfj.nd)) {
         return $$0;
      } else if ($$0.a(dfj.dW)) {
         return dfj.nd.o().a(b, Boolean.valueOf(false));
      } else {
         return $$0.a(dfj.kJ) ? dfj.nd.o().a(b, Boolean.valueOf(true)) : dfj.G.o();
      }
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      double $$4 = (double)$$2.u();
      double $$5 = (double)$$2.v();
      double $$6 = (double)$$2.w();
      if ($$0.c(b)) {
         $$1.b(lj.ap, $$4 + 0.5, $$5 + 0.8, $$6, 0.0, 0.0, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avh.da, avi.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      } else {
         $$1.b(lj.aq, $$4 + 0.5, $$5, $$6 + 0.5, 0.0, 0.04, 0.0);
         $$1.b(lj.aq, $$4 + (double)$$3.i(), $$5 + (double)$$3.i(), $$6 + (double)$$3.i(), 0.0, 0.04, 0.0);
         if ($$3.a(200) == 0) {
            $$1.a($$4, $$5, $$6, avh.cY, avi.e, 0.2F + $$3.i() * 0.2F, 0.9F + $$3.i() * 0.15F, false);
         }
      }
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      $$3.a($$4, eoi.c, eoi.c.a($$3));
      if (!$$0.a($$3, $$4) || $$1 == jf.a || $$1 == jf.b && !$$2.a(dfj.nd) && m($$2)) {
         $$3.a($$4, this, 5);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      dsk $$3 = $$1.a_($$2.d());
      return $$3.a(dfj.nd) || $$3.a(dfj.kJ) || $$3.a(dfj.dW);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return ewv.a();
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.a;
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(b);
   }

   @Override
   public cuc a(@Nullable cmk $$0, dcg $$1, ja $$2, dsk $$3) {
      $$1.a($$2, dfj.a.o(), 11);
      return new cuc(cuf.qz);
   }

   @Override
   public Optional<avg> as_() {
      return eoi.c.j();
   }
}
