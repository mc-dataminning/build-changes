import com.mojang.serialization.MapCodec;

public class drb extends djm {
   public static final MapCodec<drb> b = b(drb::new);
   public static final dxo c = dxn.F;

   @Override
   protected MapCodec<? extends drb> a() {
      return b;
   }

   protected drb(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      return $$4 == jn.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dwx a(dag $$0) {
      dwx $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   protected static boolean o(dwx $$0) {
      return $$0.a(awp.bB);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(c);
   }
}
