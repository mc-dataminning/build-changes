import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dju extends dib {
   public static final MapCodec<dju> a = b(dju::new);
   public static final dtb b = dta.w;
   protected static final int c = 6;
   protected static final int d = 6;
   protected static final int e = 8;
   protected static final ewy f = dfh.a(5.0, 4.0, 10.0, 11.0, 12.0, 16.0);
   protected static final ewy g = dfh.a(5.0, 4.0, 0.0, 11.0, 12.0, 6.0);
   protected static final ewy h = dfh.a(10.0, 4.0, 5.0, 16.0, 12.0, 11.0);
   protected static final ewy i = dfh.a(0.0, 4.0, 5.0, 6.0, 12.0, 11.0);
   protected static final ewy j = dfh.a(5.0, 0.0, 4.0, 11.0, 6.0, 12.0);
   protected static final ewy k = dfh.a(4.0, 0.0, 5.0, 12.0, 6.0, 11.0);
   protected static final ewy l = dfh.a(5.0, 10.0, 4.0, 11.0, 16.0, 12.0);
   protected static final ewy m = dfh.a(4.0, 10.0, 5.0, 12.0, 16.0, 11.0);

   @Override
   public MapCodec<dju> a() {
      return a;
   }

   protected dju(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, jf.c).a(b, Boolean.valueOf(false)).a(K, dsv.b));
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      switch ((dsv)$$0.c(K)) {
         case a:
            switch ($$0.c(aE).o()) {
               case a:
                  return k;
               case c:
               default:
                  return j;
            }
         case b:
            switch ((jf)$$0.c(aE)) {
               case f:
                  return i;
               case e:
                  return h;
               case d:
                  return g;
               case c:
               default:
                  return f;
            }
         case c:
         default:
            switch ($$0.c(aE).o()) {
               case a:
                  return m;
               case c:
               default:
                  return l;
            }
      }
   }

   @Override
   protected bqg a(dsk $$0, dcf $$1, ja $$2, cmk $$3, ewb $$4) {
      if ($$1.B) {
         dsk $$5 = $$0.a(b);
         if ($$5.c(b)) {
            a($$5, $$1, $$2, 1.0F);
         }

         return bqg.a;
      } else {
         this.b($$0, $$1, $$2, null);
         return bqg.c;
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dbx $$3, BiConsumer<cuc, ja> $$4) {
      if ($$3.n()) {
         this.b($$0, $$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public void b(dsk $$0, dcf $$1, ja $$2, @Nullable cmk $$3) {
      $$0 = $$0.a(b);
      $$1.a($$2, $$0, 3);
      this.d($$0, $$1, $$2);
      a($$3, $$1, $$2, $$0);
      $$1.a($$3, $$0.c(b) ? dxg.a : dxg.e, $$2);
   }

   protected static void a(@Nullable cmk $$0, dcg $$1, ja $$2, dsk $$3) {
      float $$4 = $$3.c(b) ? 0.6F : 0.5F;
      $$1.a($$0, $$2, avh.nU, avi.e, 0.3F, $$4);
   }

   private static void a(dsk $$0, dcg $$1, ja $$2, float $$3) {
      jf $$4 = $$0.c(aE).g();
      jf $$5 = m($$0).g();
      double $$6 = (double)$$2.u() + 0.5 + 0.1 * (double)$$4.j() + 0.2 * (double)$$5.j();
      double $$7 = (double)$$2.v() + 0.5 + 0.1 * (double)$$4.k() + 0.2 * (double)$$5.k();
      double $$8 = (double)$$2.w() + 0.5 + 0.1 * (double)$$4.l() + 0.2 * (double)$$5.l();
      $$1.a(new le(le.a, $$3), $$6, $$7, $$8, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(dsk $$0, dcf $$1, ja $$2, ayo $$3) {
      if ($$0.c(b) && $$3.i() < 0.25F) {
         a($$0, $$1, $$2, 0.5F);
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$4 && !$$0.a($$3.b())) {
         if ($$0.c(b)) {
            this.d($$0, $$1, $$2);
         }

         super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected int a(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$0.c(b) ? 15 : 0;
   }

   @Override
   protected int b(dsk $$0, dbl $$1, ja $$2, jf $$3) {
      return $$0.c(b) && m($$0) == $$3 ? 15 : 0;
   }

   @Override
   protected boolean e_(dsk $$0) {
      return true;
   }

   private void d(dsk $$0, dcf $$1, ja $$2) {
      $$1.a($$2, this);
      $$1.a($$2.a(m($$0).g()), this);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(K, aE, b);
   }
}
