import com.mojang.serialization.MapCodec;

public class drb extends diy {
   public static final MapCodec<drb> c = b(drb::new);

   @Override
   public MapCodec<drb> a() {
      return c;
   }

   public drb(dwv.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : djn.a.m();
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dww $$0) {
      return $$0.a(awp.aV);
   }

   @Override
   protected boolean g(dww $$0) {
      return true;
   }
}
