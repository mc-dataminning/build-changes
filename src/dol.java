import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dol extends dnt implements dox {
   public static final MapCodec<dol> c = b(dol::new);

   @Override
   public MapCodec<dol> a() {
      return c;
   }

   protected dol(dxm.d $$0) {
      super($$0, jm.b, fcj.b(), true);
   }

   @Override
   protected dnu c() {
      return (dnu)dkg.mx;
   }

   @Override
   protected etp b_(dxn $$0) {
      return etq.c.a(false);
   }

   @Override
   protected boolean o(dxn $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable cps $$0, dgf $$1, jh $$2, dxn $$3, eto $$4) {
      return false;
   }

   @Override
   public boolean a(dhb $$0, jh $$1, dxn $$2, etp $$3) {
      return false;
   }
}
