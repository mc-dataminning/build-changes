import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmt extends dme implements dng {
   public static final MapCodec<dmt> c = b(dmt::new);
   protected static final fas g = diq.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dmt> a() {
      return c;
   }

   protected dmt(dvu.d $$0) {
      super($$0, jm.b, g, true, 0.14);
   }

   @Override
   protected boolean h(dvv $$0) {
      return $$0.a(dis.G);
   }

   @Override
   protected diq b() {
      return dis.md;
   }

   @Override
   protected boolean o(dvv $$0) {
      return !$$0.a(dis.kJ);
   }

   @Override
   public boolean a(@Nullable cou $$0, der $$1, jh $$2, dvv $$3, eru $$4) {
      return false;
   }

   @Override
   public boolean a(dfn $$0, jh $$1, dvv $$2, erv $$3) {
      return false;
   }

   @Override
   protected int a(azu $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dvv a(dad $$0) {
      erv $$1 = $$0.q().b_($$0.a());
      return $$1.a(axi.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected erv b_(dvv $$0) {
      return erw.c.a(false);
   }
}
