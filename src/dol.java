import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dol extends dnv implements doz {
   public static final MapCodec<dol> c = b(dol::new);
   private static final double g = 0.14;
   private static final fcr h = dke.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dol> a() {
      return c;
   }

   protected dol(dxp.d $$0) {
      super($$0, jn.b, h, true, 0.14);
   }

   @Override
   protected boolean h(dxq $$0) {
      return $$0.a(dkg.J);
   }

   @Override
   protected dke b() {
      return dkg.mF;
   }

   @Override
   protected boolean o(dxq $$0) {
      return !$$0.a(dkg.ll);
   }

   @Override
   public boolean a(@Nullable bvy $$0, dgf $$1, ji $$2, dxq $$3, etv $$4) {
      return false;
   }

   @Override
   public boolean a(dha $$0, ji $$1, dxq $$2, etw $$3) {
      return false;
   }

   @Override
   protected int a(azh $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      etw $$1 = $$0.q().b_($$0.a());
      return $$1.a(awv.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected etw b_(dxq $$0) {
      return etx.c.a(false);
   }
}
