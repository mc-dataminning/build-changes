import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqp extends dkr implements dmz {
   public static final MapCodec<dqp> c = b(dqp::new);
   public static final dwl<dwj> d = dkr.b;
   protected static final float e = 6.0F;
   protected static final fal f = dij.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dqp> a() {
      return c;
   }

   public dqp(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return f;
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return $$0.c($$1, $$2, jm.b) && !$$0.a(dil.kJ);
   }

   @Override
   public cwf a(dfi $$0, jh $$1, dvo $$2) {
      return new cwf(dil.bw);
   }

   @Nullable
   @Override
   public dvo a(czw $$0) {
      dvo $$1 = super.a($$0);
      if ($$1 != null) {
         ero $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(axj.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      if ($$0.c(d) == dwj.a) {
         dvo $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dwj.b;
      } else {
         ero $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(axj.a) && $$4.e() == 8;
      }
   }

   @Override
   protected ero b_(dvo $$0) {
      return erp.c.a(false);
   }

   @Override
   public boolean a(@Nullable cor $$0, dek $$1, jh $$2, dvo $$3, ern $$4) {
      return false;
   }

   @Override
   public boolean a(dfg $$0, jh $$1, dvo $$2, ero $$3) {
      return false;
   }
}
