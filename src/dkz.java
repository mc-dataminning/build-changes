import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkz extends dkk implements dlm {
   public static final MapCodec<dkz> c = b(dkz::new);
   protected static final eyx g = dgv.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dkz> a() {
      return c;
   }

   protected dkz(dtz.d $$0) {
      super($$0, jj.b, g, true, 0.14);
   }

   @Override
   protected boolean h(dua $$0) {
      return $$0.a(dgx.G);
   }

   @Override
   protected dgv b() {
      return dgx.md;
   }

   @Override
   protected boolean o(dua $$0) {
      return !$$0.a(dgx.kJ);
   }

   @Override
   public boolean a(@Nullable cnp $$0, dcx $$1, je $$2, dua $$3, eqa $$4) {
      return false;
   }

   @Override
   public boolean a(ddt $$0, je $$1, dua $$2, eqb $$3) {
      return false;
   }

   @Override
   protected int a(azk $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      return $$1.a(awy.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected eqb b_(dua $$0) {
      return eqc.c.a(false);
   }
}
