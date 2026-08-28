import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhj extends dfi implements dmy {
   public static final MapCodec<dhj> a = b(dhj::new);
   public static final dtr b = dtq.C;
   private static final int d = 3;
   protected static final exp c = dfw.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   public dhj(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dqr($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqf> dqg<T> a(dcu $$0, dta $$1, dqh<T> $$2) {
      return a($$2, dqh.z, $$0.B ? dqr::a : dqr::b);
   }

   @Override
   protected dmd a_(dta $$0) {
      return dmd.b;
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(b) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return c;
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      eoy $$1 = $$0.q().b_($$0.a());
      return this.o().a(b, Boolean.valueOf($$1.a(awj.a) && $$1.e() == 8));
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
