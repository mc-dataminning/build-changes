import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkc extends djn implements dkp {
   public static final MapCodec<dkc> c = b(dkc::new);
   protected static final exv g = dfy.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dkc> a() {
      return c;
   }

   protected dkc(dtb.d $$0) {
      super($$0, ji.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dtc $$0) {
      return $$0.a(dga.G);
   }

   @Override
   protected dfy b() {
      return dga.md;
   }

   @Override
   protected boolean m(dtc $$0) {
      return !$$0.a(dga.kJ);
   }

   @Override
   public boolean a(@Nullable cmx $$0, dcc $$1, jd $$2, dtc $$3, epd $$4) {
      return false;
   }

   @Override
   public boolean a(dcx $$0, jd $$1, dtc $$2, epe $$3) {
      return false;
   }

   @Override
   protected int a(ayw $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      return $$1.a(awk.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected epe b_(dtc $$0) {
      return epf.c.a(false);
   }
}
