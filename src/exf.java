import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exf extends exu {
   public static final MapCodec<exf> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, exf::new));

   private exf(List<ezs> $$0) {
      super($$0);
   }

   @Override
   public exw<exf> b() {
      return exx.z;
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      Float $$2 = $$1.c(ezd.j);
      if ($$2 != null) {
         bam $$3 = $$1.b();
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

   public static exu.a<?> c() {
      return a(exf::new);
   }
}
