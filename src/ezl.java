import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ezl extends faa {
   public static final MapCodec<ezl> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, ezl::new));

   private ezl(List<fbw> $$0) {
      super($$0);
   }

   @Override
   public fac<ezl> b() {
      return fad.z;
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      Float $$2 = $$1.c(fbh.j);
      if ($$2 != null) {
         azt $$3 = $$1.b();
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

   public static faa.a<?> c() {
      return a(ezl::new);
   }
}
