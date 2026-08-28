import com.mojang.serialization.MapCodec;

public class djp extends dfw implements dmy {
   public static final MapCodec<djp> a = b(djp::new);
   private static final exp b = dfw.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public djp(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(dtq.C, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(dtq.C);
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      if ($$0.c(dtq.C)) {
         $$3.a($$4, eoz.c, eoz.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoy b_(dta $$0) {
      return $$0.c(dtq.C) ? eoz.c.a(false) : super.b_($$0);
   }

   @Override
   public dta a(cyb $$0) {
      eoy $$1 = $$0.q().b_($$0.a());
      return this.o().a(dtq.C, Boolean.valueOf($$1.b(eoz.c)));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return b;
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
