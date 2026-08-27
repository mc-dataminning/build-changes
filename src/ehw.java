import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ehw extends eih {
   public static final Codec<ehw> a = RecordCodecBuilder.create($$0 -> a($$0).apply($$0, ehw::new));

   private ehw(List<eju> $$0) {
      super($$0);
   }

   @Override
   public eij b() {
      return eik.t;
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      Float $$2 = $$1.c(ejg.j);
      if ($$2 != null) {
         auu $$3 = $$1.b();
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

   public static eih.a<?> c() {
      return a(ehw::new);
   }
}
