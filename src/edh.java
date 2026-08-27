import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edh extends eds {
   public static final Codec<edh> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, edh::new));

   private edh(List<eff> $$0) {
      super($$0);
   }

   @Override
   public edu b() {
      return edv.t;
   }

   @Override
   public cix a(cix $$0, ecg $$1) {
      Float $$2 = $$1.c(eer.j);
      if ($$2 != null) {
         aru $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.L();
         int $$6 = 0;

         for (int $$7 = 0; $$7 < $$5; $$7++) {
            if ($$3.i() <= $$4) {
               $$6++;
            }
         }

         $$0.f($$6);
      }

      return $$0;
   }

   public static eds.a<?> c() {
      return a(edh::new);
   }
}
