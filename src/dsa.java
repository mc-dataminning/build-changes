import com.mojang.serialization.MapCodec;

public class dsa extends djz {
   public static final MapCodec<dsa> c = b(dsa::new);

   @Override
   public MapCodec<dsa> a() {
      return c;
   }

   public dsa(dxu.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dko.a.m();
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dxv $$0) {
      return $$0.a(axu.aV);
   }

   @Override
   protected boolean g(dxv $$0) {
      return true;
   }
}
