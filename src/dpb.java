import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpb extends dol implements dpp {
   public static final MapCodec<dpb> c = b(dpb::new);
   private static final double g = 0.14;
   private static final fdo h = dku.b(16.0, 0.0, 9.0);

   @Override
   public MapCodec<dpb> a() {
      return c;
   }

   protected dpb(dyl.d $$0) {
      super($$0, jo.b, h, true, 0.14);
   }

   @Override
   protected boolean h(dym $$0) {
      return $$0.a(dkw.J);
   }

   @Override
   protected dku b() {
      return dkw.mF;
   }

   @Override
   protected boolean o(dym $$0) {
      return !$$0.a(dkw.ll);
   }

   @Override
   public boolean a(@Nullable bwr $$0, dgv $$1, jj $$2, dym $$3, eus $$4) {
      return false;
   }

   @Override
   public boolean a(dhq $$0, jj $$1, dym $$2, eut $$3) {
      return false;
   }

   @Override
   protected int a(azs $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      eut $$1 = $$0.q().b_($$0.a());
      return $$1.a(axf.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eut b_(dym $$0) {
      return euu.c.a(false);
   }
}
