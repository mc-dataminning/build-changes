import com.mojang.serialization.MapCodec;

public class dsk extends dku {
   public static final MapCodec<dsk> b = b(dsk::new);
   public static final dzd c = dzc.E;

   @Override
   protected MapCodec<? extends dsk> a() {
      return b;
   }

   protected dsk(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      return $$4 == jo.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dym a(dbn $$0) {
      dym $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   protected static boolean o(dym $$0) {
      return $$0.a(awz.bB);
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(c);
   }
}
