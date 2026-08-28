import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmm extends dlx implements dmz {
   public static final MapCodec<dmm> c = b(dmm::new);
   protected static final fal g = dij.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dmm> a() {
      return c;
   }

   protected dmm(dvn.d $$0) {
      super($$0, jm.b, g, true, 0.14);
   }

   @Override
   protected boolean h(dvo $$0) {
      return $$0.a(dil.G);
   }

   @Override
   protected dij b() {
      return dil.md;
   }

   @Override
   protected boolean o(dvo $$0) {
      return !$$0.a(dil.kJ);
   }

   @Override
   public boolean a(@Nullable cor $$0, dek $$1, jh $$2, dvo $$3, ern $$4) {
      return false;
   }

   @Override
   public boolean a(dfg $$0, jh $$1, dvo $$2, ero $$3) {
      return false;
   }

   @Override
   protected int a(azv $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());
      return $$1.a(axj.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected ero b_(dvo $$0) {
      return erp.c.a(false);
   }
}
