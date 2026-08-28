import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dem extends deg implements del {
   public static final MapCodec<dem> a = b(dem::new);

   @Override
   public MapCodec<dem> a() {
      return a;
   }

   public dem(drw.d $$0) {
      super($$0);
   }

   @Override
   public ctd b() {
      return ctd.a;
   }

   @Override
   public dpc a(iz $$0, drx $$1) {
      return new dox($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpc> dpd<T> a(dbt $$0, drx $$1, dpe<T> $$2) {
      return a($$2, dpe.o, dox::a);
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         if ($$1.c_($$2) instanceof dox $$5) {
            $$3.a($$5);
            $$3.a(awg.ab);
         }

         return bqp.c;
      }
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.c;
   }
}
