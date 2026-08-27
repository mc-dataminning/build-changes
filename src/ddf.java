import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddf extends cxi implements czq {
   public static final MapCodec<ddf> c = b(ddf::new);
   public static final dig<die> d = cxi.b;
   protected static final float e = 6.0F;
   protected static final ekn f = cva.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<ddf> a() {
      return c;
   }

   public ddf(dhh.d $$0) {
      super($$0);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return f;
   }

   @Override
   protected boolean b(dhi $$0, crg $$1, ht $$2) {
      return $$0.d($$1, $$2, hx.b) && !$$0.a(cvc.kJ);
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      return new clj(cvc.bw);
   }

   @Nullable
   @Override
   public dhi a(cnr $$0) {
      dhi $$1 = super.a($$0);
      if ($$1 != null) {
         ecs $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(arl.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      if ($$0.c(d) == die.a) {
         dhi $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(d) == die.b;
      } else {
         ecs $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(arl.a) && $$4.e() == 8;
      }
   }

   @Override
   public ecs c_(dhi $$0) {
      return ect.c.a(false);
   }

   @Override
   public boolean a(@Nullable cdu $$0, crg $$1, ht $$2, dhi $$3, ecr $$4) {
      return false;
   }

   @Override
   public boolean a(csb $$0, ht $$1, dhi $$2, ecs $$3) {
      return false;
   }
}
