import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmb extends dlm implements dmo {
   public static final MapCodec<dmb> c = b(dmb::new);
   protected static final fab g = dhy.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dmb> a() {
      return c;
   }

   protected dmb(dvc.d $$0) {
      super($$0, jl.b, g, true, 0.14);
   }

   @Override
   protected boolean h(dvd $$0) {
      return $$0.a(dia.G);
   }

   @Override
   protected dhy b() {
      return dia.md;
   }

   @Override
   protected boolean o(dvd $$0) {
      return !$$0.a(dia.kJ);
   }

   @Override
   public boolean a(@Nullable coh $$0, dea $$1, jg $$2, dvd $$3, erd $$4) {
      return false;
   }

   @Override
   public boolean a(dew $$0, jg $$1, dvd $$2, ere $$3) {
      return false;
   }

   @Override
   protected int a(azr $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      ere $$1 = $$0.q().b_($$0.a());
      return $$1.a(axf.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected ere b_(dvd $$0) {
      return erf.c.a(false);
   }
}
