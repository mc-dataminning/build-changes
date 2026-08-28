import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ewp extends exe {
   public static final MapCodec<ewp> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ewp::new));

   private ewp(List<eza> $$0) {
      super($$0);
   }

   @Override
   public exg<ewp> b() {
      return exh.z;
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      Float $$2 = $$1.c(eyl.j);
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

   public static exe.a<?> c() {
      return a(ewp::new);
   }
}
