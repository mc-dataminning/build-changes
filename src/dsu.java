import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsu extends dmv implements dpe {
   public static final MapCodec<dsu> c = b(dsu::new);
   public static final dyr<dyp> d = dmv.b;
   protected static final float e = 6.0F;
   protected static final fcr f = dkl.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dsu> a() {
      return c;
   }

   public dsu(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return f;
   }

   @Override
   protected boolean b(dxu $$0, dgm $$1, jh $$2) {
      return $$0.c($$1, $$2, jm.b) && !$$0.a(dkn.le);
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return new cxo(dkn.bD);
   }

   @Nullable
   @Override
   public dxu a(dbf $$0) {
      dxu $$1 = super.a($$0);
      if ($$1 != null) {
         etw $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(aya.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dxu $$0, dhk $$1, jh $$2) {
      if ($$0.c(d) == dyp.a) {
         dxu $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dyp.b;
      } else {
         etw $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(aya.a) && $$4.e() == 8;
      }
   }

   @Override
   protected etw b_(dxu $$0) {
      return etx.c.a(false);
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
