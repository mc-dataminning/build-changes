import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class faf extends fau {
   public static final MapCodec<faf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, faf::new));

   private faf(List<fcq> $$0) {
      super($$0);
   }

   @Override
   public faw<faf> b() {
      return fax.z;
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      Float $$2 = $$1.c(fcb.j);
      if ($$2 != null) {
         azv $$3 = $$1.b();
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

   public static fau.a<?> c() {
      return a(faf::new);
   }
}
