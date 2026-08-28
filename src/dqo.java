import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqo extends dpy implements drc {
   public static final MapCodec<dqo> c = b(dqo::new);
   private static final double g = 0.14;
   private static final ffk h = dmf.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dqo> a() {
      return c;
   }

   protected dqo(eag.d $$0) {
      super($$0, ja.b, h, true, 0.14);
   }

   @Override
   protected boolean h(eah $$0) {
      return $$0.a(dmh.J);
   }

   @Override
   protected dmf b() {
      return dmh.mJ;
   }

   @Override
   protected boolean o(eah $$0) {
      return !$$0.a(dmh.lp);
   }

   @Override
   public boolean a(@Nullable bxe $$0, dig $$1, iu $$2, eah $$3, ewn $$4) {
      return false;
   }

   @Override
   public boolean a(djb $$0, iu $$1, eah $$2, ewo $$3) {
      return false;
   }

   @Override
   protected int a(azv $$0) {
      return 1;
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      ewo $$1 = $$0.q().b_($$0.a());
      return $$1.a(axh.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected ewo b_(eah $$0) {
      return ewp.c.a(false);
   }
}
