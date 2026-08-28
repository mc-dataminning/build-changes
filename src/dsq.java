import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsq extends dmn implements doz {
   public static final MapCodec<dsq> c = b(dsq::new);
   public static final dyo<dym> d = dmn.b;
   private static final fcr e = dke.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dsq> a() {
      return c;
   }

   public dsq(dxp.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return e;
   }

   @Override
   protected boolean b(dxq $$0, dgf $$1, ji $$2) {
      return $$0.c($$1, $$2, jn.b) && !$$0.a(dkg.ll);
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return new cxh(dkg.bD);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dxq $$1 = super.a($$0);
      if ($$1 != null) {
         etw $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(awv.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      if ($$0.c(d) == dym.a) {
         dxq $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dym.b;
      } else {
         etw $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awv.a) && $$4.e() == 8;
      }
   }

   @Override
   protected etw b_(dxq $$0) {
      return etx.c.a(false);
   }

   @Override
   public boolean a(@Nullable bvy $$0, dgf $$1, ji $$2, dxq $$3, etv $$4) {
      return false;
   }

   @Override
   public boolean a(dha $$0, ji $$1, dxq $$2, etw $$3) {
      return false;
   }
}
