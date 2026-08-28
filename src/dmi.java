import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmi extends dlr implements dmu {
   public static final MapCodec<dmi> c = b(dmi::new);

   @Override
   public MapCodec<dmi> a() {
      return c;
   }

   protected dmi(dvi.d $$0) {
      super($$0, jm.b, fae.b(), true);
   }

   @Override
   protected dls c() {
      return (dls)dig.mc;
   }

   @Override
   protected erk b_(dvj $$0) {
      return erl.c.a(false);
   }

   @Override
   protected boolean o(dvj $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable com $$0, deg $$1, jh $$2, dvj $$3, erj $$4) {
      return false;
   }

   @Override
   public boolean a(dfc $$0, jh $$1, dvj $$2, erk $$3) {
      return false;
   }
}
