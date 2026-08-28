import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkd extends dfw implements dmy {
   public static final MapCodec<dkd> a = b(dkd::new);
   public static final dtr b = dtq.j;
   public static final dtr c = dtq.C;
   protected static final exp d = exm.a(dfw.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), dfw.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final exp e = exm.a(dfw.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), dfw.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dkd> a() {
      return a;
   }

   public dkd(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      eoy $$1 = $$0.q().b_($$0.a());

      for (ji $$2 : $$0.f()) {
         if ($$2.o() == ji.a.b) {
            dta $$3 = this.o().a(b, Boolean.valueOf($$2 == ji.b));
            if ($$3.a((dcx)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == eoz.c));
            }
         }
      }

      return null;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      ji $$3 = m($$0).g();
      return dfw.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ji m(dta $$0) {
      return $$0.c(b) ? ji.a : ji.b;
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return m($$0).g() == $$1 && !$$0.a($$3, $$4) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(c) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
