import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqi extends dps implements dqw {
   public static final MapCodec<dqi> c = b(dqi::new);
   private static final double g = 0.14;
   private static final ffc h = dma.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dqi> a() {
      return c;
   }

   protected dqi(dzy.d $$0) {
      super($$0, ja.b, h, true, 0.14);
   }

   @Override
   protected boolean h(dzz $$0) {
      return $$0.a(dmc.J);
   }

   @Override
   protected dma b() {
      return dmc.mG;
   }

   @Override
   protected boolean o(dzz $$0) {
      return !$$0.a(dmc.lm);
   }

   @Override
   public boolean a(@Nullable bxc $$0, dib $$1, iu $$2, dzz $$3, ewf $$4) {
      return false;
   }

   @Override
   public boolean a(diw $$0, iu $$1, dzz $$2, ewg $$3) {
      return false;
   }

   @Override
   protected int a(azv $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      ewg $$1 = $$0.q().b_($$0.a());
      return $$1.a(axh.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected ewg b_(dzz $$0) {
      return ewh.c.a(false);
   }
}
