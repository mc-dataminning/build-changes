import com.mojang.serialization.MapCodec;
import java.util.Optional;

public class dfu extends djs implements dfz, dmy {
   public static final MapCodec<dfu> a = b(dfu::new);
   private static final dtr f = dtq.C;
   private static final int g = 6;
   protected static final exp b = dfw.a(5.0, 0.0, 9.0, 11.0, 16.0, 15.0);
   protected static final exp c = dfw.a(5.0, 0.0, 1.0, 11.0, 16.0, 7.0);
   protected static final exp d = dfw.a(1.0, 0.0, 5.0, 7.0, 16.0, 11.0);
   protected static final exp e = dfw.a(9.0, 0.0, 5.0, 15.0, 16.0, 11.0);

   @Override
   public MapCodec<dfu> a() {
      return a;
   }

   protected dfu(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(f, Boolean.valueOf(false)).a(aE, ji.c));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
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
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(f, aE);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(f) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      jd $$3 = $$2.d();
      dta $$4 = $$1.a_($$3);
      dta $$5 = $$1.a_($$2.c());
      return ($$4.a(this) || $$4.a(awd.by)) && ($$5.a(this) || $$5.a(dfy.sD));
   }

   protected static boolean a(dcv $$0, jd $$1, eoy $$2, ji $$3) {
      dta $$4 = dfy.sE.o().a(f, Boolean.valueOf($$2.a(eoz.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if (($$1 == ji.a || $$1 == ji.b) && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      if ($$0.c(f)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      Optional<jd> $$3 = l.a($$0, $$1, $$2.b(), ji.b, dfy.sD);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jd $$4 = $$3.get().c();
         dta $$5 = $$0.a_($$4);
         return dft.a($$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      Optional<jd> $$4 = l.a($$0, $$2, $$3.b(), ji.b, dfy.sD);
      if (!$$4.isEmpty()) {
         jd $$5 = $$4.get();
         jd $$6 = $$5.c();
         ji $$7 = $$3.c(aE);
         a($$0, $$5, $$0.b_($$5), $$7);
         dft.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return new cuo(dfy.sD);
   }
}
