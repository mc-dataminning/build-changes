import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqb extends dpl implements dqp {
   public static final MapCodec<dqb> c = b(dqb::new);
   private static final double g = 0.14;
   private static final feq h = dlu.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dqb> a() {
      return c;
   }

   protected dqb(dzn.d $$0) {
      super($$0, ja.b, h, true, 0.14);
   }

   @Override
   protected boolean h(dzo $$0) {
      return $$0.a(dlw.J);
   }

   @Override
   protected dlu b() {
      return dlw.mF;
   }

   @Override
   protected boolean o(dzo $$0) {
      return !$$0.a(dlw.ll);
   }

   @Override
   public boolean a(@Nullable bwz $$0, dhv $$1, iu $$2, dzo $$3, evu $$4) {
      return false;
   }

   @Override
   public boolean a(diq $$0, iu $$1, dzo $$2, evv $$3) {
      return false;
   }

   @Override
   protected int a(azt $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      evv $$1 = $$0.q().b_($$0.a());
      return $$1.a(axf.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected evv b_(dzo $$0) {
      return evw.c.a(false);
   }
}
