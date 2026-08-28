import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djg extends dip implements djs {
   public static final MapCodec<djg> c = b(djg::new);

   @Override
   public MapCodec<djg> a() {
      return c;
   }

   protected djg(dsd.d $$0) {
      super($$0, je.b, ewj.b(), true);
   }

   @Override
   protected diq c() {
      return (diq)dfd.mc;
   }

   @Override
   protected enx b_(dse $$0) {
      return eny.c.a(false);
   }

   @Override
   protected boolean m(dse $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable cmz $$0, dbg $$1, iz $$2, dse $$3, enw $$4) {
      return false;
   }

   @Override
   public boolean a(dcb $$0, iz $$1, dse $$2, enx $$3) {
      return false;
   }
}
