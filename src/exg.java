import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class exg extends exv {
   public static final MapCodec<exg> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, exg::new));

   private exg(List<ezr> $$0) {
      super($$0);
   }

   @Override
   public exx<exg> b() {
      return exy.z;
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      Float $$2 = $$1.c(ezc.j);
      if ($$2 != null) {
         bac $$3 = $$1.b();
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

   public static exv.a<?> c() {
      return a(exg::new);
   }
}
