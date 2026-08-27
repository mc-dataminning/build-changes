import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbh extends ddv implements dad {
   public static final MapCodec<dbh> a = b(dbh::new);
   public static final int b = 2;
   public static final dnz c = dnp.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final eqk[] m = new eqk[]{
      daa.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), daa.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), daa.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final eqk[] n = new eqk[]{
      daa.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), daa.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), daa.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final eqk[] o = new eqk[]{
      daa.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), daa.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), daa.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final eqk[] F = new eqk[]{
      daa.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), daa.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), daa.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dbh> a() {
      return a;
   }

   public dbh(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ih.c).a(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean e_(dmz $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      dmz $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(aun.z);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      int $$4 = $$0.c(c);
      switch ((ih)$$0.c(aE)) {
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
   public dmz a(css $$0) {
      dmz $$1 = this.o();
      cxc $$2 = $$0.q();
      ib $$3 = $$0.a();

      for (ih $$4 : $$0.f()) {
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
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(aE, c);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
