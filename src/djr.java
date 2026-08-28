import com.mojang.serialization.MapCodec;

public class djr extends dfy implements dna {
   public static final MapCodec<djr> a = b(djr::new);
   private static final exv b = dfy.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

   public djr(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(dts.C, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<djr> a() {
      return a;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(dts.C);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(dts.C)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(dts.C) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      return this.o().a(dts.C, Boolean.valueOf($$1.b(epf.c)));
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      return b;
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
