import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dka extends djl implements dkn {
   public static final MapCodec<dka> c = b(dka::new);
   protected static final exp g = dfw.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dka> a() {
      return c;
   }

   protected dka(dsz.d $$0) {
      super($$0, ji.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dta $$0) {
      return $$0.a(dfy.G);
   }

   @Override
   protected dfw b() {
      return dfy.md;
   }

   @Override
   protected boolean m(dta $$0) {
      return !$$0.a(dfy.kJ);
   }

   @Override
   public boolean a(@Nullable cmv $$0, dca $$1, jd $$2, dta $$3, eox $$4) {
      return false;
   }

   @Override
   public boolean a(dcv $$0, jd $$1, dta $$2, eoy $$3) {
      return false;
   }

   @Override
   protected int a(ayv $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dta a(cyb $$0) {
      eoy $$1 = $$0.q().b_($$0.a());
      return $$1.a(awj.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eoy b_(dta $$0) {
      return eoz.c.a(false);
   }
}
