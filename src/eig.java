import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eig extends eir {
   public static final Codec<eig> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, eig::new));

   private eig(List<eke> $$0) {
      super($$0);
   }

   @Override
   public eit b() {
      return eiu.t;
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      Float $$2 = $$1.c(ejq.j);
      if ($$2 != null) {
         auw $$3 = $$1.b();
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

   public static eir.a<?> c() {
      return a(eig::new);
   }
}
