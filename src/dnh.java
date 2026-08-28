import com.mojang.serialization.MapCodec;

public class dnh extends dfw {
   public static final MapCodec<dnh> b = b(dnh::new);
   public static final dtr c = dtq.z;

   @Override
   protected MapCodec<? extends dnh> a() {
      return b;
   }

   protected dnh(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1 == ji.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dta a(cyb $$0) {
      dta $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dta $$0) {
      return $$0.a(awd.bz);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(c);
   }
}
