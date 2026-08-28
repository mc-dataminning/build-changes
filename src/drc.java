import com.mojang.serialization.MapCodec;

public class drc extends djn {
   public static final MapCodec<drc> b = b(drc::new);
   public static final dxp c = dxo.F;

   @Override
   protected MapCodec<? extends drc> a() {
      return b;
   }

   protected drc(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      return $$4 == jn.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dwy a(dah $$0) {
      dwy $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   protected static boolean o(dwy $$0) {
      return $$0.a(awp.bB);
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(c);
   }
}
