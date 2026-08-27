import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehq extends eib {
   public static final Codec<ehq> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ehq::new));

   private ehq(List<ejo> $$0) {
      super($$0);
   }

   @Override
   public eid b() {
      return eie.t;
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      Float $$2 = $$1.c(eja.j);
      if ($$2 != null) {
         aup $$3 = $$1.b();
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

   public static eib.a<?> c() {
      return a(ehq::new);
   }
}
