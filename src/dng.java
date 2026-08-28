import com.mojang.serialization.MapCodec;

public class dng extends djl implements dqr {
   public static final MapCodec<dng> a = b(dng::new);
   private static final fbt c = djl.a(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);
   public static final dxn b = dxm.J;

   public dng(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, esz.c, esz.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(b) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   public dww a(daf $$0) {
      esy $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(esz.c)));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return c;
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
