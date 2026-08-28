import com.mojang.serialization.MapCodec;

public class doq extends dku implements dsb {
   public static final MapCodec<doq> a = b(doq::new);
   public static final dzd b = dzc.I;
   private static final fdo c = dku.b(8.0, 0.0, 8.0);

   public doq(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<doq> a() {
      return a;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, euu.c, euu.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(b) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(euu.c)));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return c;
   }

   @Override
   protected boolean a(dym $$0, evi $$1) {
      return false;
   }
}
