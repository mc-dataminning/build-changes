import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqe extends dkg implements dmo {
   public static final MapCodec<dqe> c = b(dqe::new);
   public static final dwb<dvz> d = dkg.b;
   protected static final float e = 6.0F;
   protected static final fab f = dhy.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dqe> a() {
      return c;
   }

   public dqe(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return f;
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return $$0.c($$1, $$2, jl.b) && !$$0.a(dia.kJ);
   }

   @Override
   public cvx a(dey $$0, jg $$1, dvd $$2) {
      return new cvx(dia.bw);
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dvd $$1 = super.a($$0);
      if ($$1 != null) {
         ere $$2 = $$0.q().b_($$0.a().d());
         if ($$2.a(axf.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      if ($$0.c(d) == dvz.a) {
         dvd $$3 = $$1.a_($$2.e());
         return $$3.a(this) && $$3.c(d) == dvz.b;
      } else {
         ere $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(axf.a) && $$4.e() == 8;
      }
   }

   @Override
   protected ere b_(dvd $$0) {
      return erf.c.a(false);
   }

   @Override
   public boolean a(@Nullable coh $$0, dea $$1, jg $$2, dvd $$3, erd $$4) {
      return false;
   }

   @Override
   public boolean a(dew $$0, jg $$1, dvd $$2, ere $$3) {
      return false;
   }
}
