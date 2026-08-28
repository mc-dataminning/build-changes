import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpc extends dok implements dpp {
   public static final MapCodec<dpc> c = b(dpc::new);

   @Override
   public MapCodec<dpc> a() {
      return c;
   }

   protected dpc(dyl.d $$0) {
      super($$0, jo.b, fdl.b(), true);
   }

   @Override
   protected dol c() {
      return (dol)dkw.mE;
   }

   @Override
   protected eut b_(dym $$0) {
      return euu.c.a(false);
   }

   @Override
   protected boolean o(dym $$0) {
      return this.c().o($$0);
   }

   @Override
   public boolean a(@Nullable bwr $$0, dgv $$1, jj $$2, dym $$3, eus $$4) {
      return false;
   }

   @Override
   public boolean a(dhq $$0, jj $$1, dym $$2, eut $$3) {
      return false;
   }
}
