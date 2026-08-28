import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dfw extends dju implements dgb, dna {
   public static final MapCodec<dfw> a = b(dfw::new);
   private static final dtt f = dts.C;
   private static final int g = 6;
   protected static final exv b = dfy.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final exv c = dfy.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final exv d = dfy.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final exv e = dfy.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dfw> a() {
      return a;
   }

   protected dfw(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ji.c));
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      switch ((ji)$$0.c(aE)) {
         case d:
            return c;
         case c:
         default:
            return b;
         case e:
            return e;
         case f:
            return d;
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(f) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      jd $$3 = $$2.e();
      dtc $$4 = $$1.a_($$3);
      dtc $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(awe.bz)) && ($$5.a(this) || $$5.a(dga.sD));
   }

   protected static boolean a(dcx $$0, jd $$1, epe $$2, ji $$3) {
      dtc $$4 = dga.sE.o().a(f, Boolean.valueOf($$2.a(epf.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if (($$1 == ji.a || $$1 == ji.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dcz $$0, jd $$1, dtc $$2) {
      Optional<jd> $$3 = l.a($$0, $$1, $$2.b(), ji.b, dga.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jd $$4 = $$3.get().d();
         dtc $$5 = $$0.a_($$4);
         return dfv.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dcw $$0, ayw $$1, jd $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqu $$0, ayw $$1, jd $$2, dtc $$3) {
      Optional<jd> $$4 = l.a($$0, $$2, $$3.b(), ji.b, dga.sD);
      if (!$$4.isEmpty()) {
         jd $$5 = $$4.get();
         jd $$6 = $$5.d();
         ji $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         dfv.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return new cuq(dga.sD);
   }
}
