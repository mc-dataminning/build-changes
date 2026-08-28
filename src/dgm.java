import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgm extends djb implements dfi {
   public static final MapCodec<dgm> a = b(dgm::new);
   public static final int b = 2;
   public static final dth c = dsx.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final ews[] m = new ews[]{
      dff.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), dff.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), dff.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final ews[] n = new ews[]{
      dff.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), dff.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), dff.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final ews[] o = new ews[]{
      dff.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), dff.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), dff.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final ews[] F = new ews[]{
      dff.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), dff.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), dff.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   public dgm(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, jf.c).a(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean d_(dsh $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      dsh $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(avu.z);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
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
   public dsh a(cxk $$0) {
      dsh $$1 = this.o();
      dcg $$2 = $$0.q();
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
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? dfh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(aE, c);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
