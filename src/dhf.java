import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhf extends dju implements dgb {
   public static final MapCodec<dhf> a = b(dhf::new);
   public static final int b = 2;
   public static final duc c = dts.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final ext[] m = new ext[]{
      dfy.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), dfy.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), dfy.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final ext[] n = new ext[]{
      dfy.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), dfy.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), dfy.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final ext[] o = new ext[]{
      dfy.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), dfy.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), dfy.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final ext[] F = new ext[]{
      dfy.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), dfy.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), dfy.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dhf> a() {
      return a;
   }

   public dhf(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ji.c).a(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean d_(dtc $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      dtc $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(awe.z);
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      int $$4 = $$0.c(c);
      switch ((ji)$$0.c(aE)) {
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
   public dtc a(cyd $$0) {
      dtc $$1 = this.o();
      dcz $$2 = $$0.q();
      jd $$3 = $$0.a();

      for (ji $$4 : $$0.f()) {
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
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(aE, c);
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }
}
