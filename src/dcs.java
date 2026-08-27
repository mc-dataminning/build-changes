import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcs extends dcc implements dde {
   public static final MapCodec<dcs> c = b(dcs::new);

   @Override
   public MapCodec<dcs> a() {
      return c;
   }

   protected dcs(dle.d $$0) {
      super($$0, ie.b, eoi.b(), true);
   }

   @Override
   protected dcd c() {
      return (dcd)cyq.mc;
   }

   @Override
   protected egp c_(dlf $$0) {
      return egq.c.a(false);
   }

   @Override
   protected boolean m(dlf $$0) {
      return this.c().m($$0);
   }

   @Override
   public boolean a(@Nullable chh $$0, cut $$1, hz $$2, dlf $$3, ego $$4) {
      return false;
   }

   @Override
   public boolean a(cvo $$0, hz $$1, dlf $$2, egp $$3) {
      return false;
   }
}
