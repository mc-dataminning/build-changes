import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class det extends den implements des {
   public static final MapCodec<det> a = b(det::new);

   @Override
   public MapCodec<det> a() {
      return a;
   }

   public det(dsd.d $$0) {
      super($$0);
   }

   @Override
   public ctk b() {
      return ctk.a;
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dpe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return a($$2, dpl.o, dpe::a);
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         if ($$1.c_($$2) instanceof dpe $$5) {
            $$3.a($$5);
            $$3.a(awk.ab);
         }

         return bqw.c;
      }
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.c;
   }
}
