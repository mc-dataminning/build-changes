import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djn extends dfw implements dmy {
   public static final MapCodec<djn> a = b(djn::new);
   private static final dtr c = dtq.C;
   protected static final exp b = dfw.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<djn> a() {
      return a;
   }

   protected djn(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(c) ? eoz.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      dta $$1 = super.a($$0);
      if ($$1 != null) {
         eoy $$2 = $$0.q().b_($$0.a());
         return $$1.a(c, Boolean.valueOf($$2.a() == eoz.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      jd $$3 = $$2.c();
      dta $$4 = $$1.a_($$3);
      return $$4.d($$1, $$3, ji.a);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$1 == ji.b && !this.a($$0, $$3, $$4)) {
         return dfy.a.o();
      } else {
         if ($$0.c(c)) {
            $$3.a($$4, eoz.c, eoz.c.a($$3));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }
}
