import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epb extends epo {
   public static final Codec<epb> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, epb::new));

   private epb(List<erh> $$0) {
      super($$0);
   }

   @Override
   public epq b() {
      return epr.u;
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      Float $$2 = $$1.c(eqt.j);
      if ($$2 != null) {
         ayd $$3 = $$1.b();
         float $$4 = 1.0F / $$2;
         int $$5 = $$0.G();
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

   public static epo.a<?> c() {
      return a(epb::new);
   }
}
