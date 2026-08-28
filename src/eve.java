import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eve extends evt {
   public static final MapCodec<eve> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eve::new));

   private eve(List<exr> $$0) {
      super($$0);
   }

   @Override
   public evv<eve> b() {
      return evw.z;
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      Float $$2 = $$1.c(exc.j);
      if ($$2 != null) {
         azv $$3 = $$1.b();
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

   public static evt.a<?> c() {
      return a(eve::new);
   }
}
