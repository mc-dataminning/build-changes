import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhi extends dgt implements dhv {
   public static final MapCodec<dhi> c = b(dhi::new);
   protected static final eui g = dde.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dhi> a() {
      return c;
   }

   protected dhi(dqg.d $$0) {
      super($$0, is.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dqh $$0) {
      return $$0.a(ddg.G);
   }

   @Override
   protected dde b() {
      return ddg.md;
   }

   @Override
   protected boolean m(dqh $$0) {
      return !$$0.a(ddg.kJ);
   }

   @Override
   public boolean a(@Nullable clh $$0, czj $$1, in $$2, dqh $$3, elz $$4) {
      return false;
   }

   @Override
   public boolean a(dae $$0, in $$1, dqh $$2, ema $$3) {
      return false;
   }

   @Override
   protected int a(ayg $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());
      return $$1.a(avw.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected ema b_(dqh $$0) {
      return emb.c.a(false);
   }
}
