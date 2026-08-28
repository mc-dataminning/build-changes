import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djd extends dio implements djq {
   public static final MapCodec<djd> c = b(djd::new);
   protected static final ewk g = dez.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<djd> a() {
      return c;
   }

   protected djd(dsb.d $$0) {
      super($$0, je.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dsc $$0) {
      return $$0.a(dfb.G);
   }

   @Override
   protected dez b() {
      return dfb.md;
   }

   @Override
   protected boolean m(dsc $$0) {
      return !$$0.a(dfb.kJ);
   }

   @Override
   public boolean a(@Nullable cmx $$0, dbe $$1, iz $$2, dsc $$3, enu $$4) {
      return false;
   }

   @Override
   public boolean a(dbz $$0, iz $$1, dsc $$2, env $$3) {
      return false;
   }

   @Override
   protected int a(azh $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dsc a(cya $$0) {
      env $$1 = $$0.q().b_($$0.a());
      return $$1.a(awv.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected env b_(dsc $$0) {
      return enw.c.a(false);
   }
}
