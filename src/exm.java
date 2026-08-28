import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exm extends eyb {
   public static final MapCodec<exm> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, exm::new));

   private exm(List<ezx> $$0) {
      super($$0);
   }

   @Override
   public eyd<exm> b() {
      return eye.z;
   }

   @Override
   public cxh a(cxh $$0, ewo $$1) {
      Float $$2 = $$1.c(ezi.j);
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

   public static eyb.a<?> c() {
      return a(exm::new);
   }
}
