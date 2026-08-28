import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eyj extends eyy {
   public static final MapCodec<eyj> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, eyj::new));

   private eyj(List<fau> $$0) {
      super($$0);
   }

   @Override
   public eza<eyj> b() {
      return ezb.z;
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      Float $$2 = $$1.c(faf.j);
      if ($$2 != null) {
         azs $$3 = $$1.b();
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

   public static eyy.a<?> c() {
      return a(eyj::new);
   }
}
