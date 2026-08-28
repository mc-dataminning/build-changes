import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhd extends djs implements dfz {
   public static final MapCodec<dhd> a = b(dhd::new);
   public static final int b = 2;
   public static final dua c = dtq.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final exp[] m = new exp[]{
      dfw.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), dfw.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), dfw.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final exp[] n = new exp[]{
      dfw.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), dfw.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), dfw.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final exp[] o = new exp[]{
      dfw.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), dfw.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), dfw.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final exp[] F = new exp[]{
      dfw.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), dfw.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), dfw.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<dhd> a() {
      return a;
   }

   public dhd(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ji.c).a(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean d_(dta $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      dta $$3 = $$1.a_($$2.a($$0.c(aE)));
      return $$3.a(awd.z);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
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
   public dta a(cyb $$0) {
      dta $$1 = this.o();
      dcx $$2 = $$0.q();
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
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1 == $$0.c(aE) && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      $$0.a($$2, $$3.a(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(aE, c);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
