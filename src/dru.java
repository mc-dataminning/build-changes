import com.mojang.serialization.MapCodec;

public class dru extends dke {
   public static final MapCodec<dru> b = b(dru::new);
   public static final dyh c = dyg.E;

   @Override
   protected MapCodec<? extends dru> a() {
      return b;
   }

   protected dru(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      return $$4 == jn.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dxq a(dax $$0) {
      dxq $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   protected static boolean o(dxq $$0) {
      return $$0.a(awp.bB);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(c);
   }
}
