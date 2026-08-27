import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dac extends czo implements dap {
   public static final MapCodec<dac> c = b(dac::new);
   protected static final elu g = cvz.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dac> a() {
      return c;
   }

   protected dac(dio.d $$0) {
      super($$0, ia.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dip $$0) {
      return $$0.a(cwb.G);
   }

   @Override
   protected cvz b() {
      return cwb.md;
   }

   @Override
   protected boolean h(dip $$0) {
      return !$$0.a(cwb.kJ);
   }

   @Override
   public boolean a(@Nullable cer $$0, cse $$1, hv $$2, dip $$3, edy $$4) {
      return false;
   }

   @Override
   public boolean a(csz $$0, hv $$1, dip $$2, edz $$3) {
      return false;
   }

   @Override
   protected int a(auf $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dip a(coq $$0) {
      edz $$1 = $$0.q().b_($$0.a());
      return $$1.a(arw.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public edz c_(dip $$0) {
      return eea.c.a(false);
   }
}
