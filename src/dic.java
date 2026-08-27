import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dic extends dhn implements dip {
   public static final MapCodec<dic> c = b(dic::new);
   protected static final evd g = ddy.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dic> a() {
      return c;
   }

   protected dic(dra.d $$0) {
      super($$0, it.b, g, true, 0.14);
   }

   @Override
   protected boolean g(drb $$0) {
      return $$0.a(dea.G);
   }

   @Override
   protected ddy b() {
      return dea.md;
   }

   @Override
   protected boolean m(drb $$0) {
      return !$$0.a(dea.kJ);
   }

   @Override
   public boolean a(@Nullable clw $$0, dad $$1, io $$2, drb $$3, emt $$4) {
      return false;
   }

   @Override
   public boolean a(day $$0, io $$1, drb $$2, emu $$3) {
      return false;
   }

   @Override
   protected int a(ayk $$0) {
      return 1;
   }

   @Nullable
   @Override
   public drb a(cwz $$0) {
      emu $$1 = $$0.q().b_($$0.a());
      return $$1.a(awb.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected emu b_(drb $$0) {
      return emv.c.a(false);
   }
}
