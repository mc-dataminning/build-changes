import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fbr extends fcg {
   public static final MapCodec<fbr> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, fbr::new));

   private fbr(List<fec> $$0) {
      super($$0);
   }

   @Override
   public fci<fbr> b() {
      return fcj.z;
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      Float $$2 = $$1.c(fdn.j);
      if ($$2 != null) {
         bai $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.M();
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

   public static fcg.a<?> c() {
      return a(fbr::new);
   }
}
