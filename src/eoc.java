import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eoc extends eoo {
   public static final Codec<eoc> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eoc::new));

   private eoc(List<eqc> $$0) {
      super($$0);
   }

   @Override
   public eoq b() {
      return eor.u;
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      Float $$2 = $$1.c(epo.j);
      if ($$2 != null) {
         axr $$3 = $$1.b();
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

   public static eoo.a<?> c() {
      return a(eoc::new);
   }
}
