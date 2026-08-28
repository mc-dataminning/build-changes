import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmh extends dls implements dmu {
   public static final MapCodec<dmh> c = b(dmh::new);
   protected static final fah g = die.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dmh> a() {
      return c;
   }

   protected dmh(dvi.d $$0) {
      super($$0, jm.b, g, true, 0.14);
   }

   @Override
   protected boolean h(dvj $$0) {
      return $$0.a(dig.G);
   }

   @Override
   protected die b() {
      return dig.md;
   }

   @Override
   protected boolean o(dvj $$0) {
      return !$$0.a(dig.kJ);
   }

   @Override
   public boolean a(@Nullable com $$0, deg $$1, jh $$2, dvj $$3, erj $$4) {
      return false;
   }

   @Override
   public boolean a(dfc $$0, jh $$1, dvj $$2, erk $$3) {
      return false;
   }

   @Override
   protected int a(azs $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      return $$1.a(axg.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected erk b_(dvj $$0) {
      return erl.c.a(false);
   }
}
