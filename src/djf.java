import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djf extends dio implements djr {
   public static final MapCodec<djf> c = b(djf::new);

   @Override
   public MapCodec<djf> a() {
      return c;
   }

   protected djf(dsc.d $$0) {
      super($$0, je.b, ewi.b(), true);
   }

   @Override
   protected dip c() {
      return (dip)dfc.mc;
   }

   @Override
   protected enw b_(dsd $$0) {
      return enx.c.a(false);
   }

   @Override
   protected boolean m(dsd $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cmy $$0, dbf $$1, iz $$2, dsd $$3, env $$4) {
      return false;
   }

   @Override
   public boolean a(dca $$0, iz $$1, dsd $$2, enw $$3) {
      return false;
   }
}
