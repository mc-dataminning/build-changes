import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dry extends dlw implements dog {
   public static final MapCodec<dry> c = b(dry::new);
   public static final dxv<dxt> d = dlw.b;
   protected static final float e = 6.0F;
   protected static final fbv f = djn.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dry> a() {
      return c;
   }

   public dry(dwx.d $$0) {
      super($$0);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return f;
   }

   @Override
   protected boolean b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.c($$1, $$2, jn.b) && !$$0.a(djp.ll);
   }

   @Override
   protected cwq a(dgm $$0, ji $$1, dwy $$2, boolean $$3) {
      return new cwq(djp.bD);
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      dwy $$1 = super.a($$0);
      if ($$1 != null) {
         eta $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(awv.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      if ($$0.c(d) == dxt.a) {
         dwy $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dxt.b;
      } else {
         eta $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(awv.a) && $$4.e() == 8;
      }
   }

   @Override
   protected eta b_(dwy $$0) {
      return etb.c.a(false);
   }

   @Override
   public boolean a(@Nullable coy $$0, dfo $$1, ji $$2, dwy $$3, esz $$4) {
      return false;
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dwy $$2, eta $$3) {
      return false;
   }
}
