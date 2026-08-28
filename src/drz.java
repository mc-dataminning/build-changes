import com.mojang.serialization.MapCodec;

public class drz extends dkm {
   public static final MapCodec<drz> b = b(drz::new);
   public static final dym c = dyl.A;

   @Override
   protected MapCodec<? extends drz> a() {
      return b;
   }

   protected drz(dxu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return $$4 == jm.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dxv a(dbg $$0) {
      dxv $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   private static boolean o(dxv $$0) {
      return $$0.a(axu.bB);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(c);
   }
}
