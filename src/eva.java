import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eva extends evp {
   public static final MapCodec<eva> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eva::new));

   private eva(List<exn> $$0) {
      super($$0);
   }

   @Override
   public evr<eva> b() {
      return evs.z;
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      Float $$2 = $$1.c(ewy.j);
      if ($$2 != null) {
         azs $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.L();
         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            if ($$3.i() <= $$4) {
               $$6++;
            }
         }

         $$0.e($$6);
      }

      return $$0;
   }

   public static evp.a<?> c() {
      return a(eva::new);
   }
}
