import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class edr extends eec {
   public static final Codec<edr> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, edr::new));

   private edr(List<efp> $$0) {
      super($$0);
   }

   @Override
   public eee b() {
      return eef.t;
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      Float $$2 = $$1.c(efb.j);
      if ($$2 != null) {
         asc $$3 = $$1.b();
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

   public static eec.a<?> c() {
      return a(edr::new);
   }
}
