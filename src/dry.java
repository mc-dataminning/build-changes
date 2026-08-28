import com.mojang.serialization.MapCodec;

public class dry extends dkl {
   public static final MapCodec<dry> b = b(dry::new);
   public static final dyl c = dyk.A;

   @Override
   protected MapCodec<? extends dry> a() {
      return b;
   }

   protected dry(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      return $$4 == jm.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dxu a(dbf $$0) {
      dxu $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   private static boolean o(dxu $$0) {
      return $$0.a(axu.bB);
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(c);
   }
}
