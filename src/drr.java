import com.mojang.serialization.MapCodec;

public class drr extends dke {
   public static final MapCodec<drr> b = b(drr::new);
   public static final dye c = dyd.A;

   @Override
   protected MapCodec<? extends drr> a() {
      return b;
   }

   protected drr(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return $$4 == jm.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   private static boolean o(dxn $$0) {
      return $$0.a(axu.bB);
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(c);
   }
}
