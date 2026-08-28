import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drv extends dlt implements dod {
   public static final MapCodec<drv> c = b(drv::new);
   public static final dxs<dxq> d = dlt.b;
   protected static final float e = 6.0F;
   protected static final fbs f = djk.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<drv> a() {
      return c;
   }

   public drv(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return f;
   }

   @Override
   protected boolean b(dwv $$0, dfl $$1, ji $$2) {
      return $$0.c($$1, $$2, jn.b) && !$$0.a(djm.ll);
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return new cwn(djm.bD);
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      dwv $$1 = super.a($$0);
      if ($$1 != null) {
         esx $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(awu.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      if ($$0.c(d) == dxq.a) {
         dwv $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dxq.b;
      } else {
         esx $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awu.a) && $$4.e() == 8;
      }
   }

   @Override
   protected esx b_(dwv $$0) {
      return esy.c.a(false);
   }

   @Override
   public boolean a(@Nullable cov $$0, dfl $$1, ji $$2, dwv $$3, esw $$4) {
      return false;
   }

   @Override
   public boolean a(dgh $$0, ji $$1, dwv $$2, esx $$3) {
      return false;
   }
}
