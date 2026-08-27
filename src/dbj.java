import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbj extends ddx implements daf {
   public static final MapCodec<dbj> a = b(dbj::new);
   public static final int b = 2;
   public static final dob c = dnr.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final eqm[] m = new eqm[]{
      dac.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), dac.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), dac.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final eqm[] n = new eqm[]{
      dac.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), dac.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), dac.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final eqm[] o = new eqm[]{
      dac.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), dac.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), dac.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final eqm[] F = new eqm[]{
      dac.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), dac.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), dac.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dbj> a() {
      return a;
   }

   public dbj(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ih.c).a(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean e_(dnb $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      dnb $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(aun.z);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
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
   public dnb a(csu $$0) {
      dnb $$1 = this.o();
      cxe $$2 = $$0.q();
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
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? dae.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(cxe $$0, ib $$1, dnb $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(cxb $$0, axd $$1, ib $$2, dnb $$3) {
      return true;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dnb $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(aE, c);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
