import com.mojang.serialization.MapCodec;

public class drs extends djr {
   public static final MapCodec<drs> c = b(drs::new);

   @Override
   public MapCodec<drs> a() {
      return c;
   }

   public drs(dxm.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dkg.a.m();
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dxn $$0) {
      return $$0.a(axu.aV);
   }

   @Override
   protected boolean g(dxn $$0) {
      return true;
   }
}
