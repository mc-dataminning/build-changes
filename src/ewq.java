import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewq extends exf {
   public static final MapCodec<ewq> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ewq::new));

   private ewq(List<ezb> $$0) {
      super($$0);
   }

   @Override
   public exh<ewq> b() {
      return exi.z;
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      Float $$2 = $$1.c(eym.j);
      if ($$2 != null) {
         azh $$3 = $$1.b();
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

   public static exf.a<?> c() {
      return a(ewq::new);
   }
}
