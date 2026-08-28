import com.mojang.serialization.MapCodec;

public class drs extends dkd {
   public static final MapCodec<drs> b = b(drs::new);
   public static final dyf c = dye.F;

   @Override
   protected MapCodec<? extends drs> a() {
      return b;
   }

   protected drs(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      return $$4 == jm.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dxo a(dax $$0) {
      dxo $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   protected static boolean o(dxo $$0) {
      return $$0.a(axk.bB);
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c);
   }
}
