import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsn extends dmo implements dox {
   public static final MapCodec<dsn> c = b(dsn::new);
   public static final dyk<dyi> d = dmo.b;
   protected static final float e = 6.0F;
   protected static final fcm f = dke.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dsn> a() {
      return c;
   }

   public dsn(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      return f;
   }

   @Override
   protected boolean b(dxn $$0, dgf $$1, jh $$2) {
      return $$0.c($$1, $$2, jm.b) && !$$0.a(dkg.le);
   }

   @Override
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return new cxk(dkg.bD);
   }

   @Nullable
   @Override
   public dxn a(dbb $$0) {
      dxn $$1 = super.a($$0);
      if ($$1 != null) {
         etp $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(aya.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dxn $$0, dhd $$1, jh $$2) {
      if ($$0.c(d) == dyi.a) {
         dxn $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dyi.b;
      } else {
         etp $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(aya.a) && $$4.e() == 8;
      }
   }

   @Override
   protected etp b_(dxn $$0) {
      return etq.c.a(false);
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
