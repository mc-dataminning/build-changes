import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgk extends dfw implements dgx {
   public static final MapCodec<dgk> c = b(dgk::new);
   protected static final etc g = dch.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dgk> a() {
      return c;
   }

   protected dgk(dph.d $$0) {
      super($$0, ij.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dpi $$0) {
      return $$0.a(dcj.G);
   }

   @Override
   protected dch b() {
      return dcj.md;
   }

   @Override
   protected boolean m(dpi $$0) {
      return !$$0.a(dcj.kJ);
   }

   @Override
   public boolean a(@Nullable cka $$0, cym $$1, id $$2, dpi $$3, ela $$4) {
      return false;
   }

   @Override
   public boolean a(czh $$0, id $$1, dpi $$2, elb $$3) {
      return false;
   }

   @Override
   protected int a(axt $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());
      return $$1.a(avj.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected elb c_(dpi $$0) {
      return elc.c.a(false);
   }
}
