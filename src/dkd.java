import com.mojang.serialization.MapCodec;

public class dkd extends djl {
   public static final MapCodec<dkd> a = b(dkd::new);
   protected static final fbt b = djl.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dkd> a() {
      return a;
   }

   public dkd(dwv.d $$0) {
      super($$0);
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return b;
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return !$$0.a($$1, $$3) ? djn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return !$$1.u($$2.e());
   }
}
