import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgp extends dje implements dfl {
   public static final MapCodec<dgp> a = b(dgp::new);
   public static final int b = 2;
   public static final dtl c = dtb.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final exa[] m = new exa[]{
      dfi.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), dfi.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), dfi.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final exa[] n = new exa[]{
      dfi.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), dfi.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), dfi.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final exa[] o = new exa[]{
      dfi.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), dfi.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), dfi.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final exa[] F = new exa[]{
      dfi.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), dfi.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), dfi.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dgp> a() {
      return a;
   }

   public dgp(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, jf.c).a(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean d_(dsl $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      dsl $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(avw.z);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      int $$4 = $$0.c(c);
      switch ((jf)$$0.c(aE)) {
         case d:
            return F[$$4];
         case c:
         default:
            return o[$$4];
         case e:
            return n[$$4];
         case f:
            return m[$$4];
      }
   }

   @Nullable
   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = this.o();
      dcj $$2 = $$0.q();
      ja $$3 = $$0.a();

      for (jf $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.a(aE, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(aE, c);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
