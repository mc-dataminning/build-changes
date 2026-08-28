import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class esj extends esy {
   public static final MapCodec<esj> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, esj::new));

   private esj(List<euw> $$0) {
      super($$0);
   }

   @Override
   public eta<esj> b() {
      return etb.z;
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      Float $$2 = $$1.c(euh.j);
      if ($$2 != null) {
         ayv $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.H();
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

   public static esy.a<?> c() {
      return a(esj::new);
   }
}
