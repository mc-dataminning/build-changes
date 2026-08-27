import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edm extends edx {
   public static final Codec<edm> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, edm::new));

   private edm(List<efk> $$0) {
      super($$0);
   }

   @Override
   public edz b() {
      return eea.t;
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      Float $$2 = $$1.c(eew.j);
      if ($$2 != null) {
         arx $$3 = $$1.b();
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

   public static edx.a<?> c() {
      return a(edm::new);
   }
}
