import com.mojang.serialization.MapCodec;

public class dra extends djl {
   public static final MapCodec<dra> b = b(dra::new);
   public static final dxn c = dxm.F;

   @Override
   protected MapCodec<? extends dra> a() {
      return b;
   }

   protected dra(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return $$4 == jn.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dww a(daf $$0) {
      dww $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   protected static boolean o(dww $$0) {
      return $$0.a(awp.bB);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(c);
   }
}
