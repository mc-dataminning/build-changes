import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djf extends diq implements djs {
   public static final MapCodec<djf> c = b(djf::new);
   protected static final ewm g = dfb.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double h = 0.14;

   @Override
   public MapCodec<djf> a() {
      return c;
   }

   protected djf(dsd.d $$0) {
      super($$0, je.b, g, true, 0.14);
   }

   @Override
   protected boolean g(dse $$0) {
      return $$0.a(dfd.G);
   }

   @Override
   protected dfb b() {
      return dfd.md;
   }

   @Override
   protected boolean m(dse $$0) {
      return !$$0.a(dfd.kJ);
   }

   @Override
   public boolean a(@Nullable cmz $$0, dbg $$1, iz $$2, dse $$3, enw $$4) {
      return false;
   }

   @Override
   public boolean a(dcb $$0, iz $$1, dse $$2, enx $$3) {
      return false;
   }

   @Override
   protected int a(azh $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      return $$1.a(awv.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   protected enx b_(dse $$0) {
      return eny.c.a(false);
   }
}
