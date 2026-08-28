import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dje extends dip implements djr {
   public static final MapCodec<dje> c = b(dje::new);
   protected static final ewl g = dfa.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dje> a() {
      return c;
   }

   protected dje(dsc.d $$0) {
      super($$0, je.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dsd $$0) {
      return $$0.a(dfc.G);
   }

   @Override
   protected dfa b() {
      return dfc.md;
   }

   @Override
   protected boolean m(dsd $$0) {
      return !$$0.a(dfc.kJ);
   }

   @Override
   public boolean a(@Nullable cmy $$0, dbf $$1, iz $$2, dsd $$3, env $$4) {
      return false;
   }

   @Override
   public boolean a(dca $$0, iz $$1, dsd $$2, enw $$3) {
      return false;
   }

   @Override
   protected int a(azh $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      enw $$1 = $$0.q().b_($$0.a());
      return $$1.a(awv.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected enw b_(dsd $$0) {
      return enx.c.a(false);
   }
}
