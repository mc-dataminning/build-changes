import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcv extends dch implements ddi {
   public static final MapCodec<dcv> c = b(dcv::new);
   protected static final eos g = cys.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<dcv> a() {
      return c;
   }

   protected dcv(dli.d $$0) {
      super($$0, ie.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dlj $$0) {
      return $$0.a(cyu.G);
   }

   @Override
   protected cys b() {
      return cyu.md;
   }

   @Override
   protected boolean m(dlj $$0) {
      return !$$0.a(cyu.kJ);
   }

   @Override
   public boolean a(@Nullable chl $$0, cux $$1, hz $$2, dlj $$3, egv $$4) {
      return false;
   }

   @Override
   public boolean a(cvs $$0, hz $$1, dlj $$2, egw $$3) {
      return false;
   }

   @Override
   protected int a(awp $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dlj a(crk $$0) {
      egw $$1 = $$0.q().b_($$0.a());
      return $$1.a(auf.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected egw c_(dlj $$0) {
      return egx.c.a(false);
   }
}
