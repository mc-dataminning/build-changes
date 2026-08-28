import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dos extends doa implements dpe {
   public static final MapCodec<dos> c = b(dos::new);

   @Override
   public MapCodec<dos> a() {
      return c;
   }

   protected dos(dxt.d $$0) {
      super($$0, jm.b, fco.b(), true);
   }

   @Override
   protected dob c() {
      return (dob)dkn.mx;
   }

   @Override
   protected etw b_(dxu $$0) {
      return etx.c.a(false);
   }

   @Override
   protected boolean o(dxu $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable cpw $$0, dgm $$1, jh $$2, dxu $$3, etv $$4) {
      return false;
   }

   @Override
   public boolean a(dhi $$0, jh $$1, dxu $$2, etw $$3) {
      return false;
   }
}
