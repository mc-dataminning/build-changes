import com.mojang.serialization.MapCodec;

public class dqz extends djk {
   public static final MapCodec<dqz> b = b(dqz::new);
   public static final dxm c = dxl.F;

   @Override
   protected MapCodec<? extends dqz> a() {
      return b;
   }

   protected dqz(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      return $$4 == jn.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dwv a(dae $$0) {
      dwv $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   protected static boolean o(dwv $$0) {
      return $$0.a(awo.bB);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(c);
   }
}
